package com.zy.spring.ioc.bookshop.dao;

public class BookDaoImpl implements BookDao{

    public void insert() {
        System.out.println("向MySql Book表中插入一条数据");
    }
}
