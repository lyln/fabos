package com.lyln.fabos.common.utils;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
class Md5UtilTest {

    public String string;
    @Test
    void test() {
        string = Md5Util.encrypt("admin", "admin123");
        //生成数据库密码
        System.out.println(string);

    }
}