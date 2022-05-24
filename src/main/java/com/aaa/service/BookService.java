package com.aaa.service;

import com.aaa.dao.BookMapper;
import com.aaa.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    //添加一本书
    int addbook(Books books);
    //删除一本书
    int deletebookbyId(@Param("bookId") Integer id);
    //修改一本书
    int updatebookbyId(Books books);
    //根据id查询一本书
    Books querybookbyId(@Param("bookId")Integer id);
    //查询所有书
    List<Books> querybooks();
    //根据书籍名称查询
    Books querybookname(String bookName);
}
