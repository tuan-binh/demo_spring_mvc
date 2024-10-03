package com.ra.demo_springmvc.model.service;

import com.ra.demo_springmvc.model.entity.Book;

import java.util.List;

public interface IBookService
{
    List<Book> findAll();
}
