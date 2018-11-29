package com.gao.service;

import java.util.List;

import com.gao.entity.BookInfo;

public interface BookService {
	public List<BookInfo> getByIds(Integer[] ids)throws Exception;
	public int insert(BookInfo book)throws Exception;
	public int update(BookInfo book)throws Exception;
	public int delete(BookInfo book)throws Exception;
	public int findCount()throws Exception;
	public BookInfo findBookByID(Integer id)throws Exception;
	public List<BookInfo> findBookByPageList(Integer pageIndex,Integer pageSize)throws Exception;
}
