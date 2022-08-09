package com.callor.todo.persistance;

import java.util.List;

import com.callor.todo.model.TodoVO;

public interface TodoDao extends  GenericDao<TodoVO, String>{
	public List<TodoVO> findByUsername(String username);

}
