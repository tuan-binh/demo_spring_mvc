package com.ra.demo_springmvc.model.service.impl;

import com.ra.demo_springmvc.model.dao.IBookDao;
import com.ra.demo_springmvc.model.entity.Book;
import com.ra.demo_springmvc.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service_book")
public class BookServiceImpl implements IBookService
{


    private final IBookDao bookDao;

    // design pattern - singleton
    // tiêm dưới dạng constructor
    @Autowired
    public BookServiceImpl(IBookDao bookDao)
    {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> findAll()
    {
        return bookDao.findAll();
    }
}
