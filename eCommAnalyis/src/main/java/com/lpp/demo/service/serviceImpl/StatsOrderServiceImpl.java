package com.lpp.demo.service.serviceImpl;

import com.lpp.demo.domain.StatsOrder;
import com.lpp.demo.mapper.StatsOrderMapper;
import com.lpp.demo.service.StatsOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("statsOrderService")
public class StatsOrderServiceImpl implements StatsOrderService {
    @Resource
    private StatsOrderMapper statsOrderMapper;

    @Override
    public List<StatsOrder> getOrderInfo() {
        return statsOrderMapper.getOrderInfo();
    }
}
