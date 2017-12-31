package com.dev.zj.app.business.service.impl;

import com.dev.zj.app.business.dao.UserDAO;
import com.dev.zj.app.business.domain.User;
import com.dev.zj.app.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean saveAndDelete(User a, Long id) {
        //插入user a
        this.userDAO.insert(a);
        //删除user b
        this.userDAO.deleteById(id);
        return true;
    }
}
