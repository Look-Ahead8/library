package com.tuling.library.controller;

import com.tuling.library.bean.Borrow;
import com.tuling.library.bean.Student;
import com.tuling.library.message.Message;
import com.tuling.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class BorrowController {
    @Autowired
    private BorrowService borrowService;

    @GetMapping("/countborrow")
    public Message countBorrow() {
        List<Map<String, Object>> list = borrowService.countBorrow();
        return Message.success().add("countBorrow", list);
    }

    @PutMapping("/returnborrow")
    public Message returnBorrow(@RequestParam("stuId") Integer stuId, @RequestParam("bookId") Integer bookId) {
        if (borrowService.returnBorrow(stuId, bookId) == 1) {
            return Message.fail().add("errormessage", "没有相应的借书记录");
        } else {
            return Message.success();
        }
    }

    @PostMapping("/borrow")
    public Message saveBorrow(Borrow borrow) {
        if (borrowService.saveBorrow(borrow) == 1) {
            return Message.fail().add("errormessage", "该书已经被借走");
        }
        return Message.success();
    }

    @GetMapping("/studentborrow/{stuId}")
    public Message getStudentBorrow(@PathVariable("stuId") Integer stuId){
        List<Borrow> borrows= borrowService.getStudent(stuId);
        return Message.success().add("borrows",borrows);
    }


    @GetMapping("/bookborrow/{bookId}")
    public Message getBookBorrow(@PathVariable("bookId") Integer bookId){
        List<Borrow> borrows= borrowService.getBook(bookId);
        return Message.success().add("borrows",borrows);
    }
}
