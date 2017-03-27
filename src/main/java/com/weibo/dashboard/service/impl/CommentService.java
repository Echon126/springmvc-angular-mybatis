package com.weibo.dashboard.service.impl;

import com.weibo.dashboard.entity.Comment;

public interface CommentService {
	
	int insert(Comment comment);
	int delete(int id);
}

