package com.tuling.library.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tuling.library.bean.Answer;
import com.tuling.library.message.Message;
import com.tuling.library.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    /**
     * 增加一条评论
     * @param answer
     * @param result
     * @return
     */
    @PostMapping("answer")
    public Message saveAnswer(@Valid Answer answer, BindingResult result){
        if(result.hasErrors()){
            Map<String,Object> errorsmessage=new HashMap<String,Object>();
            List<FieldError> errors= result.getFieldErrors();
            for(FieldError error:errors){
                errorsmessage.put(error.getField(),error.getDefaultMessage());
            }
            return Message.fail().add("errorsmessage",errorsmessage);
        }
        else {
            answerService.saveAnswer(answer);
            return Message.success();
        }
    }

    /**
     * 返回一条帖子里的全部回复，分页处理
     * @param forumId
     * @return
     */
    @GetMapping("answer/{forumId}")
    public Message getAnswers(@PathVariable("forumId") Integer forumId,@RequestParam(value="pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,10);
        List<Answer> answers=answerService.getAnswers(forumId);
        PageInfo<Answer> pageinfo=new PageInfo<Answer>(answers,5);
        return Message.success().add("pageinfo",pageinfo);
    }
}
