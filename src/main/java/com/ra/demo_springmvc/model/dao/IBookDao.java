package com.ra.demo_springmvc.model.dao;

import com.ra.demo_springmvc.model.entity.Book;

import java.util.List;

public interface IBookDao
{
    List<Book> findAll();
}
