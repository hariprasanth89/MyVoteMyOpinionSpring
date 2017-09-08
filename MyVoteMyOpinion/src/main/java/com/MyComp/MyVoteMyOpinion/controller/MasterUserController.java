package com.MyComp.MyVoteMyOpinion.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MyComp.MyVoteMyOpinion.bean.MasterUserBean;
import com.MyComp.MyVoteMyOpinion.service.MasterUserService;


@Controller
@RequestMapping("user")

@Transactional


public class MasterUserController {
	
	Logger logger = Logger.getLogger(MasterUserController.class);
	
	@Autowired
	MasterUserService masterUserService;
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	  public @ResponseBody String login(@RequestBody MasterUserBean masterUserBean) {
	    System.out.println("login");
	    return masterUserService.login(masterUserBean);
	  }
	

}
