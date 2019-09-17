package com.tuling.library.dao;

import com.tuling.library.bean.Borrow;
import com.tuling.library.bean.BorrowExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BorrowMapper {
    int countByExample(BorrowExample example);

    int deleteByExample(BorrowExample example);

    int deleteByPrimaryKey(Integer borrowId);

    int insert(Borrow record);

    int insertSelective(Borrow record);

    List<Borrow> selectByExample(BorrowExample example);

    Borrow selectByPrimaryKey(Integer borrowId);

    int updateByExampleSelective(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByExample(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByPrimaryKeySelective(Borrow record);

    int updateByPrimaryKey(Borrow record);

    List<Map<String, Object>> selectcountBorrow();

    Boolean isBorrow(@Param("stuId") Integer stuId, @Param("bookId") Integer bookId);

    List<Borrow> isBookExists(Integer bookId);

    List<Borrow> selectByStuId(Integer stuId);

    List<Borrow> selectByBookId(Integer bookId);
}