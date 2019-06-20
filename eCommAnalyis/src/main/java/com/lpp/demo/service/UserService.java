package com.lpp.demo.service;

import com.lpp.demo.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User getLoginUser(String username);
    public int registerUser(User user);
    public Map<Integer,Integer> getUserSum(String date);
}
