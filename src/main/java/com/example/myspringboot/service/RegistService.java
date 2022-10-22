package com.example.myspringboot.service;


import com.example.myspringboot.entity.Regist;

public interface RegistService {
    int updateByuserNumber(Regist user);

    Integer selectByuserNumber(String username);

    int addnew(Regist userForm);
}
