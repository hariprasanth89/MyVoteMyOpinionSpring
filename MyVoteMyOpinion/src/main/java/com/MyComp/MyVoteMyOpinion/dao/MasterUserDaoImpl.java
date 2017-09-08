package com.MyComp.MyVoteMyOpinion.dao;

import javax.jms.Session;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.MyComp.MyVoteMyOpinion.bean.MasterUserBean;

public class MasterUserDaoImpl implements MasterUserDao{

	@Autowired
	  private SessionFactory sessionFactory;
	
	@Override
	public String login(MasterUserBean MasterUserBean) {
		Session session = (Session) sessionFactory.getCurrentSession();
		String SQL_QUERY = "";
	    Query query = null;
	    
	    JSONObject jsonObject = new JSONObject();
	    
//	    if(MasterUserBean)
	    
	    
	    
		return null;
	}

}
