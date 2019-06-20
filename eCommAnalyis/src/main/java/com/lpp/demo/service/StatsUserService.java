package com.lpp.demo.service;

import com.lpp.demo.domain.StatsUser;
import com.lpp.demo.mapper.StatsUserMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


public interface StatsUserService {


    public List<StatsUser>  byPlatform(Date date);
    public List<StatsUser> consumerInfo(Date date);
    public List<StatsUser> memberInfo(Date date);
}
