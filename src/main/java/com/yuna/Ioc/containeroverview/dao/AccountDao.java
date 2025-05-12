package com.yuna.Ioc.containeroverview.dao;

public interface AccountDao {
    void saveAccount(String account);
    String getAccount(String accountId);
}
