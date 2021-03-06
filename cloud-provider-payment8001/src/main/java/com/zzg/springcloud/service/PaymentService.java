package com.zzg.springcloud.service;/*
@date 2021/9/12 - 10:53 上午
*/

import com.zzg.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
