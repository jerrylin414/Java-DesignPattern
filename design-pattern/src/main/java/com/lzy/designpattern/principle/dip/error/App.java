package com.lzy.designpattern.principle.dip.error;

/**
 * @auther jerry
 * @date 4/2/2025 10:17 AM
 */

//Dependency Inversion Principle, DIP
public class App {
    private MySQLDatabase db = new MySQLDatabase();

    void run(){
//        db.saveData(); will error
    }
}
