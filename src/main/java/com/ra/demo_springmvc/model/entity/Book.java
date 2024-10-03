package com.ra.demo_springmvc.model.entity;

public class Book
{
    private int id;
    private String title;
    private String author;
    private String publisher;
    private boolean status;

    public Book()
    {
    }

    public Book(int id, String title, String author, String publisher, boolean status)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.status = status;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }
}
