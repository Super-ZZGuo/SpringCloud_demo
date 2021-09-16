package com.zzg.springcloud.service.imp;/*
@date 2021/9/12 - 10:53 上午
*/

import com.zzg.springcloud.dao.PaymentDao;
import com.zzg.springcloud.entities.Payment;
import com.zzg.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImp implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
