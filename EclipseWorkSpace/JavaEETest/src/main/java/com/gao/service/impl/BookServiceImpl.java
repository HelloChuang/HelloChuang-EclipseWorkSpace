package com.gao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.gao.dao.BookDAO;
import com.gao.entity.BookInfo;
import com.gao.service.BookService;
@Service
@Scope("prototype")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bd;
	
	public int insert(BookInfo book) throws Exception {
		return bd.insert(book);
	}

	public int update(BookInfo book) throws Exception {
		return bd.update(book);
	}

	public int delete(BookInfo book) throws Exception {
		return bd.delete(book);
	}

	public int findCount() throws Exception {
		return bd.findCount();
	}

	public BookInfo findBookByID(Integer id) throws Exception {
		return bd.findBookByID(id);
	}

	public List<BookInfo> findBookByPageList(Integer pageIndex, Integer pageSize) throws Exception {
		
		List<BookInfo> list = null;
		if(pageIndex!=null&&pageSize!=null){
			if(pageIndex>0&&pageIndex>0){
				list = bd.findBookByPageList((pageIndex-1)*pageSize, pageSize);
			}
		}
		return list;
	}

	public List<BookInfo> getByIds(Integer[] ids) throws Exception {
		return bd.getByIds(ids);
	}

	

}
