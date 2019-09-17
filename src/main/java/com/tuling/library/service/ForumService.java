package com.tuling.library.service;

import com.tuling.library.bean.Forum;
import com.tuling.library.dao.ForumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ForumService {
    @Autowired
    private ForumMapper forumMapper;

    /**
     * 添加一条帖子
     */
    public boolean  saveForum(Forum forum){
        forumMapper.insertSelective(forum);
        return true;
    }

    /**
     * 返回学生发表的帖子
     * @param stuId
     * @return
     */
    public List<Forum> getForums(Integer stuId) {
        return forumMapper.selectByStuId(stuId);
    }
}
