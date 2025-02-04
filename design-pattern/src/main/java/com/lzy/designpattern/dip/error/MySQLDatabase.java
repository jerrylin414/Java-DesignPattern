package com.lzy.designpattern.dip.error;

/**
 * @auther jerry
 * @date 4/2/2025 10:17 AM
 */
public class MySQLDatabase {
    //origin
//    void saveData(){
//        System.out.println("save");
//    }

    //modify
    void saveData(String name){
        System.out.println("save2" + name);
    }
}
