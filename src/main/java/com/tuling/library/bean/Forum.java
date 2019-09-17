package com.tuling.library.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Size;
import java.util.Date;

public class Forum {
    private Integer forumId;

    private Integer stuId;
    @JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss",timezone = "GMT+8")
    private Date forumDate;
    @Size(min=1,max=100,message = "标题字符数要1-100")
    private String forumTitle;
    @Size(min=1,max=255,message = "标题内容数要1-255")
    private String forumContent;

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Date getForumDate() {
        return forumDate;
    }

    public void setForumDate(Date forumDate) {
        this.forumDate = forumDate;
    }

    public String getForumTitle() {
        return forumTitle;
    }

    public void setForumTitle(String forumTitle) {
        this.forumTitle = forumTitle;
    }

    public String getForumContent() {
        return forumContent;
    }

    public void setForumContent(String forumContent) {
        this.forumContent = forumContent;
    }
}