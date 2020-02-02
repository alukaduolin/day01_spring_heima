package com.alukaduolin.ui;

import com.alukaduolin.service.IAccountService;
import com.alukaduolin.service.impl.AccountServiceImpl;

/**
 * 模拟一个表现层,用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        IAccountService as=new AccountServiceImpl();
        as.saveAccount();
    }
}
