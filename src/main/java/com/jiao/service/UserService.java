package com.jiao.service;

import org.springframework.stereotype.Service;  

import com.jiao.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserService�ӿ��� 
 *  
 * @author linbingwen 
 * @since  2015��9��28��  
 */  
public interface UserService {  
    User selectUserById(Integer userId);  
  
}  
