package com.lpp.demo.controller;

import com.lpp.demo.domain.User;
import com.lpp.demo.service.UserService;
import com.lpp.demo.utils.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Resource
    private UserService userService;
    /**
     * 登录验证
     * @param user
     * @param session
     * @return
     */
    @RequestMapping(value = "/login",method =RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, HttpSession session) {
        User loginUser = userService.getLoginUser(user.getUsername());
        if(loginUser==null){
            session.setAttribute("msg","用户不存在");
            return "samples/login";
        }else {
            String password = MD5Utils.MD5Encode(user.getPassword(), "utf8");
            if(password.equals(loginUser.getPassword())){
                session.setAttribute("loginUser",user);
                return "redirect:/";
            }else {
                session.setAttribute("msg","密码不正确");
                return "samples/login";
            }
        }
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping(value = "/register",method=RequestMethod.POST)
    public String register(User user,HttpSession session){
        User loginUser = userService.getLoginUser(user.getUsername());
        if(loginUser==null) {
            String password = MD5Utils.MD5Encode(user.getPassword(), "utf8");
            user.setPassword(password);
            int result = userService.registerUser(user);
            if (result > 0) {
                session.setAttribute("regMsg", "");
                return "samples/login";
            } else {
                session.setAttribute("regMsg", "注册失败");
                return "samples/register";
            }
        }else {
            session.setAttribute("regMsg", "用户名已经存在");
            return "samples/register";
        }
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping(value  = "/logout",method=RequestMethod.GET)
    public String register(HttpSession session){
                session.setAttribute("loginUser",null);
                return "samples/login";
    }

}
