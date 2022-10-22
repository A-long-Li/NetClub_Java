package com.example.myspringboot.dao;

import com.example.myspringboot.entity.Regist;

public interface Registdao {
    int updateByuserNumber(Regist user);

    Integer selectByuserNumber(String userNumber);

    int addnew(Regist register);

}
