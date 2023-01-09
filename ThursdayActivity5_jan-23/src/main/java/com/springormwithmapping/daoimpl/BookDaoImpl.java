package com.springormwithmapping.daoimpl;

import com.springormwithmapping.Dao.BookDao;
import com.springormwithmapping.entitiy.Book;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


public class BookDaoImpl implements BookDao{
	private HibernateTemplate ht;
	
	

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public int insertBook(Book b) {
		ht.save(b);
		return 1;
	}

	@Transactional
	public int updateBook(Book ubook) {
		ht.update(ubook);
		return 1;
	}
	
	

}
