package com.ql.mvc.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ql.mvc.pojo.User;
import com.ql.mvc.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)     //琛ㄧず缁ф壙浜哠pringJUnit4ClassRunner绫� 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class MVCTest {
	 private static Logger logger = Logger.getLogger(MVCTest.class);  
	//  private ApplicationContext ac = null;  
	   
 	@Resource  
    private IUserService userService = null;  
	  
	//  @Before  
	//  public void before() {  
//	      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//	      userService = (IUserService) ac.getBean("userService");  
	//  }  
	  
    @Test  
    public void test1() { 
    	User user = new User();
    	user.setId(2);
    	user.setAccount("qiuliang");
    	user.setPassword("qiuliang");
    	
        //int a = userService.insterUser(user);
        //System.out.println("鎻掑叆琛屽彿"+a);
        // System.out.println(user.getUserName());  
        // logger.info("鍊硷細"+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
    }  
    @Test
    public void addUser(){
    	User user = new User();
    	user.setAccount("abcd");
    	user.setPassword("abcd");
    	int l = userService.insterUser(user);
    	
    	System.out.println("娣诲姞鐨勪釜鏁�+l);
    }
    
    @Test
    public void queryUser(){
    	User user =new User();
    	user.setAccount("abcd");
    	user.setPassword("abcd");
    	List<User> resultUser = userService.queryOfAccountAndPw(user);
    	
    	System.out.println("鏌ヨ鍒扮殑鐢ㄦ埛="+resultUser.toString());
    }
    
}
