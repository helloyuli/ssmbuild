package com.aaa.controller;

import com.aaa.dao.BookMapper;
import com.aaa.pojo.Books;
import com.aaa.service.BookService;
import com.aaa.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    //Controller 调用Service层。
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询所有图书，将查询到的数据放到model,返回给前台
    @RequestMapping("/allbook")
    public String query(Model model){
        List<Books> querybooks = bookService.querybooks();
        model.addAttribute("list",querybooks);
        return "allBook";
    }
    //新增图书，
    @RequestMapping("/addbook")
    public String addbook(){
        return "addbook";
    }
    //新增图书的请求
    @RequestMapping("/insert")
    public String insert(Books books){
        int addbook = bookService.addbook(books);
        return "redirect:/allbook";
    }
    //修改图书
    @RequestMapping("/update")
    public String update(Integer id,Model model){
        System.out.println(id);
        Books books = bookService.querybookbyId(id);
        model.addAttribute("book",books);
        return "updatebook";
    }
    //修改图书的请求
    @RequestMapping("/updatebook")
    public String updatebook(Books books){
        bookService.updatebookbyId(books);
        return "redirect:/allbook";
    }
    //删除图书
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println(id);
        bookService.deletebookbyId(id);
        return "redirect:/allbook";
    }
    //根据书籍名称查询
    @RequestMapping("/queryname")
    public String querybyname(String bookName,Model model){
        Books books = bookService.querybookname(bookName);
        List<Books> list=new ArrayList<Books>();
        list.add(books);
        model.addAttribute("list",list);
        return "allBook";
    }
}
