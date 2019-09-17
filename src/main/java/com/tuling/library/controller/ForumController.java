package com.tuling.library.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tuling.library.bean.Forum;
import com.tuling.library.message.Message;
import com.tuling.library.service.ForumService;
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
public class ForumController {
    @Autowired
    ForumService forumService;

    /**
     * 添加一条论坛
     */
    @PostMapping("/forum")
    public Message saveForum(@Valid Forum forum, BindingResult result){
        if(result.hasErrors()){
            Map<String,Object> errorsmessage=new HashMap<String,Object>();
            List<FieldError> errors= result.getFieldErrors();
            for(FieldError error:errors){
                errorsmessage.put(error.getField(),error.getDefaultMessage());
            }
            return Message.fail().add("errorsmessage",errorsmessage);
        }
        else{
            forumService.saveForum(forum);
            return  Message.success();
        }
    }

    /**
     * 返回学生的发帖纪录
     * @param stuId
     * @return
     */
    @GetMapping("/forum/{stuId}")
    public Message getForum(@PathVariable("stuId") Integer stuId,@RequestParam(value="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,10);
        List<Forum> forums=forumService.getForums(stuId);
        PageInfo<Forum> pageinfo=new PageInfo<Forum>(forums,5);
        return Message.success().add("pageinfo",pageinfo);
    }
}
