package com.zy.spring.ioc.bookshop.dao;

public class BookDaoOracleImpl implements BookDao{
    @Override
    public void insert() {
        System.out.println("向Oracle Book表中插入一条数据");

    }
}
