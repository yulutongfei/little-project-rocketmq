package com.sunxu.little.project.rocketmq.api.login.service;

import com.sunxu.little.project.rocketmq.api.login.dto.LoginRequestDTO;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/10/11 13:03
 * 登录service组件
 */
public interface LoginService {

    /**
     * 第一次登录分发优惠券
     * @param loginRequestDTO
     */
    void firstLoginDistributeCoupon(LoginRequestDTO loginRequestDTO);

    /**
     * 重置用户的登录状态
     * @param phoneNumber
     */
    void resetFirstLoginStatus(String phoneNumber);
}
