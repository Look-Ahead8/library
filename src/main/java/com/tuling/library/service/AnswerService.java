package com.tuling.library.service;

import com.tuling.library.bean.Answer;
import com.tuling.library.dao.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnswerService {
    @Autowired
    private AnswerMapper answerMapper;

    /**
     * 插入一条回复
     * @param answer
     * @return
     */
    public boolean saveAnswer(Answer answer) {
        answerMapper.insertSelective(answer);
        return true;
    }

    /**
     * 返回一条帖子的全部回复
     * @param forumId
     * @return
     */
    public List<Answer> getAnswers(Integer forumId) {
        return  answerMapper.selectByForumId(forumId);
    }
}
