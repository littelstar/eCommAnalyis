package com.lpp.demo.service.serviceImpl;

import com.lpp.demo.domain.StatsUser;
import com.lpp.demo.mapper.StatsUserMapper;
import com.lpp.demo.service.StatsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("statsService")
public class StatsUserServiceImpl implements StatsUserService {

    @Resource
    private StatsUserMapper statsUserMapper;

    @Override
    public List<StatsUser>  byPlatform(Date date) {
        return statsUserMapper.byPlatform(date);
    }

    @Override
    public List<StatsUser> consumerInfo(Date date) {
        return statsUserMapper.consumerInfo(date);
    }

    @Override
    public List<StatsUser> memberInfo(Date date) {
        return statsUserMapper.memberInfo(date);
    }
}
