package com.itheima.service.impl;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
//        SqlSession sqlSession = MyBatisUtils.openSession();
//        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        accountMapper.save(account);
//        sqlSession.commit();
//        sqlSession.close();
    }

    @Override
    public List<Account> findAll() {
//        SqlSession sqlSession = MyBatisUtils.openSession();
//        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        return accountMapper.findAll();
    }
}
