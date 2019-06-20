package com.lpp.demo.mapper;

import com.lpp.demo.domain.StatsUser;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StatsUserMapper {
    List<StatsUser> byPlatform(Date date);
    List<StatsUser> consumerInfo(Date date);
    List<StatsUser> memberInfo(Date date);
}
