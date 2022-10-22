package com.example.myspringboot.service.impl;

import com.example.myspringboot.dao.Registdao;
import com.example.myspringboot.entity.Regist;
import com.example.myspringboot.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistServicelmpl implements RegistService {

    @Autowired
    private Registdao registDao;

    @Override
    public int updateByuserNumber(Regist user) {
        return registDao.updateByuserNumber(user);
    }

    @Override
    public Integer selectByuserNumber(String username) {
        return registDao.selectByuserNumber(username);
    }

    @Override
    public int addnew(Regist register) {
        return registDao.addnew(register);
    }
}
