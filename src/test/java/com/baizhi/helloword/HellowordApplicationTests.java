package com.baizhi.helloword;

import com.baizhi.entity.Admin;
import com.baizhi.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HellowordApplicationTests {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void contextLoads() {
        List<Admin> admins = adminMapper.queryAllAdmin();
        System.out.println(admins);
    }

}
