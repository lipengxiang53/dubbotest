package com.provider.impl;

import com.service.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Auther Lee53
 * @Date 2019-12-05 21:04
 * 模拟数据库事务实现
 */
@Service(version = "1.0.0",interfaceClass = TestService.class,timeout = 3000)
public class TestServiceImpl implements TestService {
    @Override
    public void ins() {
        System.out.println("insert");
    }

    @Override
    public void del() {
        System.out.println("delete");
    }

    @Override
    public void upd() {
        System.out.println("update");
    }

    @Override
    public void sel() {
        System.out.println("select");
    }
}
