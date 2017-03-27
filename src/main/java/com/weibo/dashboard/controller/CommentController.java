package com.weibo.dashboard.controller;

import com.weibo.dashboard.entity.Comment;
import com.weibo.dashboard.service.impl.CommentService;
import com.weibo.util.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/1/7.
 */
@RestController
@RequestMapping(value="/comment")
public class CommentController {
    @Resource
    CommentService commentService;

    @RequestMapping(value="/new",method= RequestMethod.POST)
    public ResponseData add(@RequestBody Comment comment){
        commentService.insert(comment);
        return new ResponseData(comment);
    }
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        commentService.delete(id);
    }
}

