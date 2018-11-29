package com.gao.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.gao.dao.BookDAO;
import com.gao.entity.BookInfo;
@Repository
@Scope("prototype")
public class BookDAOImpl implements BookDAO {
	@Autowired
	private QueryRunner qr;

	public int insert(BookInfo book) throws Exception {
		String sql = "insert into book_info values(null,?,?,?,?)";
		Object[] params = {book.getBname(),book.getBdate(),book.getBprice(),book.getBa()};
		int count = qr.update(sql,params);
		return count;
	}

	public int update(BookInfo book) throws Exception {
		String sql = "update book_info set b_author=?,b_createdate=?,b_price=?,b_name=? where b_id=?";
		Object[] params = {book.getBname(),book.getBdate(),book.getBprice(),book.getBa(),book.getBid()};
		int count = qr.update(sql,params);
		return count;
	}

	public int delete(BookInfo book) throws Exception {
		String sql = "delete from book_info where b_id=?";
		Object[] params = {book.getBid()};
		int count = qr.update(sql,params);
		return count;
	}

	public int findCount() throws Exception {
		String sql = "select count(*) from v1";
		Number number = qr.query(sql, new ScalarHandler<Number>(1));
		int value = number.intValue();
		return value;
	}

	public BookInfo findBookByID(Integer id) throws Exception {
		String sql = "select * from v1 where bid = ?";
		Object[] params = {id};
		BookInfo user = qr.query(sql, new BeanHandler<BookInfo>(BookInfo.class),params);
		return user;
	}

	public List<BookInfo> findBookByPageList(Integer start, Integer size) throws Exception {
		String sql = "select * from v1 limit ?,?";
		Object[] params = {start,size};
		List<BookInfo> list = qr.query(sql, new BeanListHandler<BookInfo>(BookInfo.class),params);
		return list;
	}

	public List<BookInfo> getByIds(Integer[] ids) throws Exception {
		List<BookInfo> list = new ArrayList<BookInfo>();
		for(int i=0;i<ids.length;i++){
			BookInfo book = findBookByID(ids[i]);
			list.add(book);
		}
		return list;
	}

}
