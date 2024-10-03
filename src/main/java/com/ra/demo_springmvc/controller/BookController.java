package com.ra.demo_springmvc.controller;

import com.ra.demo_springmvc.model.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books") // endpoint -> http://localhost:8080/books
public class BookController
{


    @GetMapping
    public String viewAdd(Model model)
    {
        model.addAttribute("book", new Book());
        return "add_book";
    }

    @PostMapping
    public String add(@ModelAttribute Book book) // data binding
    {
        System.out.println(book);
        return null;
    }

    // edit giống jsp - servlet
    // phương thức gửi lên controller tìm ra đối tượng theo id và gửi sang view form edit để hiển thị lên - GET
    // phương thức sau khi thay đổi dữ liệu ở form gửi lên để update dữ liệu lên database - POST

}
