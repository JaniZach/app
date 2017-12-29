package com.dev.zj.business.service.impl;

import com.dev.zj.business.dao.UserDAO;
import com.dev.zj.business.domain.User;
import com.dev.zj.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2017/12/28 22:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public User getById(Long id) {
        return this.userDAO.getById(id);
    }
}
