package com.tuling.library.service;

import com.tuling.library.bean.Borrow;
import com.tuling.library.dao.BorrowMapper;
import com.tuling.library.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BorrowService {
    @Autowired
    private BorrowMapper borrowMapper;

    /**
     * 返回借阅图书排行
     * @return
     */
    public List<Map<String, Object>> countBorrow() {
       return borrowMapper.selectcountBorrow();
    }

    /**
     * 还书
     * 0为还书成功
     * 1为并没有借该书
     * @param stuId
     * @param bookId
     * @return
     */
    public int returnBorrow(Integer stuId, Integer bookId) {
        if(borrowMapper.isBorrow(stuId,bookId)==null){
            return 1;
        }
        else{
            return 0;
        }
    }

    /**
     * 添加借阅，首先判断该书是否已经借了
     * @param  borrow
     * @return
     */
    public int saveBorrow(Borrow borrow) {
        if(!(borrowMapper.isBookExists(borrow.getBookId()).isEmpty())){
            return 1;
        }else {
            Calendar calendar = new GregorianCalendar();
            Date date = borrow.getBorrowDate();
            calendar.setTime(date);
            calendar.add(calendar.MONTH, 1);
            borrow.setReturnDate(calendar.getTime());
            borrowMapper.insertSelective(borrow);
            return 0;
        }
    }

    /**
     * 返回学生的借阅情况
     * @param stuId
     * @return
     */
    public List<Borrow> getStudent(Integer stuId) {
        return borrowMapper.selectByStuId(stuId);
    }

    /**
     * 返回图书的借阅情况
     * @param bookId
     * @return
     */
    public List<Borrow> getBook(Integer bookId) {
        return borrowMapper.selectByBookId(bookId);
    }


}
