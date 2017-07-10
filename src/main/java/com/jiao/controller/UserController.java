package com.jiao.controller;

import javax.annotation.Resource;  

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
import com.jiao.domain.User;  
import com.jiao.service.UserService;  
  
/** 
 * ���ܸ�Ҫ��UserController 
 *  
 * @author linbingwen 
 * @since  2015��9��28��  
 */  
@Controller  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    
}  