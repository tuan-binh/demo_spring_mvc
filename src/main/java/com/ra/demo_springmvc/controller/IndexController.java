package com.ra.demo_springmvc.controller;

import com.ra.demo_springmvc.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController
{

    private final IBookService bookService;

    @Autowired
    public IndexController(@Qualifier("service_book") IBookService bookService)
    {
        this.bookService = bookService;
    }

    @GetMapping
    public ModelAndView home(Model model) {
        // Model vs ModelMap vs ModelAndView
        // khi vào trang chủ thì cần dữ liệu products để hiển thị lên màn hình
        ModelAndView modelAndView = new ModelAndView("home","books",bookService.findAll());
        return modelAndView;
    }

}
