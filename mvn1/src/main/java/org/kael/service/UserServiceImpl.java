package org.kael.service;

import javax.annotation.Resource;

import org.kael.dao.UserMapper;
import org.kael.pojo.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
    private UserMapper userDao;  
	
    public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId); 
	}
}