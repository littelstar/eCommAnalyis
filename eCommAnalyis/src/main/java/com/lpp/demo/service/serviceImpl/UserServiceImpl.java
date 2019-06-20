package com.lpp.demo.service.serviceImpl;

import com.lpp.demo.domain.User;
import com.lpp.demo.mapper.UserMapper;
import com.lpp.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public User getLoginUser(String username) {
        User loginUser = userMapper.getLoginUser(username);
        return loginUser;
    }

    @Override
    public int registerUser(User user) {
        return  userMapper.registerUser(user);
    }

    @Override
    public Map<Integer,Integer> getUserSum(String date) {
        Map<String, Integer> userSum = userMapper.getUserSum(date);
        Map<Integer,Integer> userSumofHour=new HashMap<>();
        for (Map.Entry<String,Integer> entry:userSum.entrySet() ) {
            Integer key=Integer.valueOf(entry.getKey().split(" ")[1]);
            Integer realKey=key/2;
            if(userSumofHour.containsKey(realKey)){
                userSumofHour.put(realKey,userSumofHour.get(realKey)+entry.getValue());
            }else {
                userSumofHour.put(realKey,entry.getValue());
            }

        }


        return userSumofHour;
    }
}
