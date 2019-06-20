package com.lpp.demo.controller;

import com.lpp.demo.domain.StatsOrder;
import com.lpp.demo.service.StatsOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {

    @Resource
    private StatsOrderService statsOrderService;


    @RequestMapping("/order")
    public String getOrderInfo(Model model){
       //得到昨天的订单数据
        List<StatsOrder> orderInfo = statsOrderService.getOrderInfo();
        StatsOrder statsOrder = new StatsOrder(0,0,0,0,0,0,0,0);
        for (StatsOrder orderItem: orderInfo) {
            statsOrder.setOrders(statsOrder.getOrders()+orderItem.getOrders());
            statsOrder.setSuccessOrders(statsOrder.getSuccessOrders()+orderItem.getSuccessOrders());
            statsOrder.setRefundOrders(statsOrder.getRefundOrders()+orderItem.getRefundOrders());
            statsOrder.setOrderAmount(statsOrder.getOrderAmount()+orderItem.getOrderAmount());
            statsOrder.setRevenueAmount(statsOrder.getRevenueAmount()+orderItem.getRevenueAmount());
            statsOrder.setRefundAmount(statsOrder.getRefundAmount()+orderItem.getRefundAmount());
            statsOrder.setTotalRevenueAmount(statsOrder.getTotalRevenueAmount()+orderItem.getTotalRevenueAmount());
            statsOrder.setTotalRefundAmount(statsOrder.getTotalRefundAmount()+orderItem.getTotalRefundAmount());
        }
        model.addAttribute("orderInfo",statsOrder);
        return "samples/orderInfo";

    }

}
