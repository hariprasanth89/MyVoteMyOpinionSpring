package com.MyComp.MyVoteMyOpinion.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.MyComp.MyVoteMyOpinion.bean.MasterUserBean;
import com.MyComp.MyVoteMyOpinion.dao.MasterUserDao;

public class MasterUserServiceImpl implements MasterUserService {

	@Autowired
	MasterUserDao masterUserDao; 
	
	
	@Override
	public String login(MasterUserBean masterUserBean) {
		// TODO Auto-generated method stub
		return masterUserDao.login(masterUserBean);
	}

	
	
}
