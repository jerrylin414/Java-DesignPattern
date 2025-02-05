package com.lzy.designpattern.principle.isp;

/**
 * @auther jerry
 * @date 4/2/2025 10:05 AM
 */

//Interface Segregation Principle, ISP
//------------------Error
public interface Worker {
    void code();
    void test();
    void deploy();
}

//------------------Right
interface Developer{
    void code();
}

interface Test{
    void test();
}

interface DevOps{
    void deploy();
}