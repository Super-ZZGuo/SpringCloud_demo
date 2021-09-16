package com.zzg.springcloud.dao;/*
@date 2021/9/12 - 10:42 上午
*/

import com.zzg.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
