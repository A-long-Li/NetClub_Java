package com.example.myspringboot.controller;

import com.example.myspringboot.dto.Registdto;
import com.example.myspringboot.service.RegistService;
import com.example.myspringboot.entity.Regist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.myspringboot.util.ResultUtil;
import com.example.myspringboot.vo.ResponseVo;

@Controller
@RequestMapping("/")
public class welcomeController {
    @Autowired
    private RegistService RegistMapper;

    @GetMapping("/welcome")
    public String hello(){
        return "index";
    }

    @GetMapping("/register")
    public String hello1(){
        return "login";
    }

    @RequestMapping("/register/add")
    @ResponseBody
    public ResponseVo editUser(Regist Form){

        if(RegistMapper.selectByuserNumber(Form.getUserNumber()) != null)
        {
            int a = RegistMapper.updateByuserNumber(Form);
            if (a > 0) {
                return ResultUtil.success("信息修改成功");
            } else {
                return ResultUtil.error("信息修改失败");
            }
        }
        else{
            int a = RegistMapper.addnew(Form);
            if (a > 0) {
                return ResultUtil.success("报名成功！");
            } else {
                return ResultUtil.error("填写信息有误");
            }
        }
    }
}
