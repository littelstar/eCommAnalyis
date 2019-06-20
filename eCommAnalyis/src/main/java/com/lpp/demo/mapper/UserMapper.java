package com.lpp.demo.mapper;

import com.lpp.demo.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getLoginUser(String username);
    int registerUser(User user);
    Map<String,Integer> getUserSum(String date);
}
