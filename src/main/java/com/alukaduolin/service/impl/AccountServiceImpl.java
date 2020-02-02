package com.alukaduolin.service.impl;

import com.alukaduolin.dao.IAccountDao;
import com.alukaduolin.dao.impl.AccountDaoImpl;
import com.alukaduolin.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao=new AccountDaoImpl();

    public void saveAccount(){
        accountDao.saveAccount();

    }
}
