package com.lzy.designpattern.lsp.error;

/**
 * @auther jerry
 * @date 4/2/2025 9:58 AM
 */
public class Penguin extends Bird{

    @Override
    void fly(){
        try {
            throw new Exception("I can't fly~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
