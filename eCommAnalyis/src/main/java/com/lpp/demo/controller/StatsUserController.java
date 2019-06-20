package com.lpp.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lpp.demo.domain.StatsUser;
import com.lpp.demo.service.StatsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller

public class StatsUserController {

    @Resource
    private StatsUserService statsUserService;

    /**
     * 获取用户的信息
     *
     * @return
     */
    @RequestMapping("/")
    public String getConsumerInfo(Model model) {
        Date date = new Date();
        List<StatsUser> statsUsers = statsUserService.byPlatform(date);
        int totalUser = 0;
        int activUser = 0;
        int newUser = 0;
        for (StatsUser suser : statsUsers) {
            totalUser = totalUser + suser.getTotal_install_users();
            activUser = activUser + suser.getActive_users();
            newUser = newUser + suser.getNew_install_users();
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("totalUser",totalUser);
        jsonObject.put("activeUser",activUser);
        jsonObject.put("newUser",newUser);
        model.addAttribute("userInfo",jsonObject);

        return "index";
    }
    @RequestMapping("/member")
    public String  getMemberInfo(Model model){
        Date date=new Date();
        List<StatsUser> statsUsers = statsUserService.memberInfo(date);
        int totalMember = 0;
        int activeMember = 0;
        int newMember = 0;
        for (StatsUser suser : statsUsers) {
            totalMember = totalMember + suser.getTotal_members();
            activeMember = activeMember + suser.getActive_members();
            newMember = newMember + suser.getNew_members();
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("totalMember",totalMember);
        jsonObject.put("activeMember",activeMember);
        jsonObject.put("newMember",newMember);
        model.addAttribute("memberInfo",jsonObject);
        return "samples/memberInfo";
    }


    @RequestMapping(value = "/statsUser/byPlatform")
    @ResponseBody
    public String getByPlatform() throws JsonProcessingException {
        Date date = new Date();
        List<StatsUser> statsUsers = statsUserService.byPlatform(date);
        Map<Integer, Integer> map = new HashMap<>();

        for (StatsUser statsUser : statsUsers) {
            map.put(statsUser.getPlatform_dimension_id(), statsUser.getActive_users());

        }
        ObjectMapper json = new ObjectMapper();
        return json.writeValueAsString(map).toString();
    }
}
