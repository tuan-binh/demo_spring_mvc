package com.ra.demo_springmvc.model.dao.impl;

import com.ra.demo_springmvc.model.dao.IBookDao;
import com.ra.demo_springmvc.model.entity.Book;
import com.ra.demo_springmvc.utils.ConnectionDB;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDaoImpl implements IBookDao
{
    @Override
    public List<Book> findAll()
    {
        List<Book> books = new ArrayList<>();
        try (
                Connection con = ConnectionDB.getConnection();
                CallableStatement callableStatement = con.prepareCall("{call proc_get_all_book()}");
        )
        {
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next())
            {
                Book book = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getBoolean("status")
                );
                books.add(book);
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return books;
    }

}
