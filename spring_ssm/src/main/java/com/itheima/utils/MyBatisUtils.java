package com.itheima.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @BelongsProject: SpringNew
 * @BelongsPackage: com.itheima.utils
 * @Author: ASUS
 * @CreateTime: 2023-06-30  09:01
 * @Description: TODO
 * @Version: 1.0
 */
public class MyBatisUtils {

    public static SqlSession openSession() {
        //获取核心配置文件
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取session工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获取session回话对象
        SqlSession sqlSession = build.openSession(true);

        return sqlSession;
    }

}
