package com.tuling.library.service;

import com.tuling.library.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 登录
     * @param userNumber
     * @param password
     * @return
     */
    public int login(String userNumber,String password){
        if(userNumber.isEmpty()){
            return 1;
        }
        else if(password.isEmpty()){
            return 2;
        }
        else{
            return 0;
        }
    }

    /**
     * 返回密码
     * @return
     */
    public String getPassword(String stuNumber){
        return studentMapper.selectPassword(stuNumber);
    }

}
