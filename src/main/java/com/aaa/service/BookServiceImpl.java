package com.aaa.service;

import com.aaa.dao.BookMapper;
import com.aaa.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
    //注入dao层的mapper接口，设置set，方便spring管理

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addbook(Books books) {
        return bookMapper.addbook(books);
    }

    @Override
    public int deletebookbyId(Integer id) {
        return bookMapper.deletebookbyId(id);
    }

    @Override
    public int updatebookbyId(Books books) {
        return bookMapper.updatebookbyId(books);
    }

    @Override
    public Books querybookbyId(Integer id) {
        return bookMapper.querybookbyId(id);
    }


    @Override
    public List<Books> querybooks() {
        return bookMapper.querybooks();
    }

    @Override
    public Books querybookname(String bookName) {
        return bookMapper.querybookname(bookName);
    }


}
