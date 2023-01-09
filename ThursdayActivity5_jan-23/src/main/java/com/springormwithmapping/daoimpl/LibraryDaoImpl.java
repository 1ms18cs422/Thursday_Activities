package com.springormwithmapping.daoimpl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springormwithmapping.Dao.LibraryDao;
import com.springormwithmapping.entitiy.Library;

public class LibraryDaoImpl implements LibraryDao{

private HibernateTemplate ht1;
	
	

	public HibernateTemplate getHt() {
		return ht1;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht1 = ht1;
	}

	@Transactional
	public int insertLibrary(Library lib) {
		ht1.save(lib);
		return 1;
	}
}
