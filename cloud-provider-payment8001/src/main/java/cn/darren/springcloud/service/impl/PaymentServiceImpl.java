package cn.darren.springcloud.service.impl;

import cn.darren.springcloud.entities.Payment;
import cn.darren.springcloud.mapper.PaymentMapper;
import cn.darren.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    
    @Resource
    private PaymentMapper paymentMapper;
    
    public int create(Payment payment){
        return paymentMapper.create(payment);
    }
    
    public Payment getPaymentById(Long id){
        return paymentMapper.getPaymentById(id);
    }
}
