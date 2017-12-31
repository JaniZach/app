package com.dev.zj.app.business.service;

import com.dev.zj.app.business.domain.User;

/**
 * @author P50
 * @date 2017/12/28 22:27
 */
public interface UserService {

    User getById(Long id);

    boolean saveAndDelete(User a, Long id);
}
