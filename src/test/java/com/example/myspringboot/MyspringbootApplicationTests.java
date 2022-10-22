package com.example.myspringboot;

import com.example.myspringboot.dao.Registdao;
import com.example.myspringboot.entity.Regist;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyspringbootApplicationTests {

    @Resource
    private Registdao testDao;
    @Test
    void contextLoads() {
        Regist regist = new Regist();
        regist.setName("牛牛xx");
        regist.setInitials("电信院");
        regist.setQQ("666666");
        regist.setPurpose1("网络");
        regist.setPurpose2("网络");
        regist.setUserNumber("88888");
        regist.setTop_domains("软工");
        Integer a = testDao.updateByuserNumber(regist);
        if (a != null && a > 0) {
            System.out.println("修改用户成功");
        } else {
            System.out.println("修改用户失败");
        }
    }

}
