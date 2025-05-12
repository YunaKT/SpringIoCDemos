package com.yuna.Ioc.containeroverview.dao;

public interface ItemDao {
    void saveItem(String item);
    String getItem(String itemId);
}