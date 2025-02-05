package com.lzy.designpattern.principle.dip.right;

/**
 * @auther jerry
 * @date 4/2/2025 10:32 AM
 */
public interface Database {
    void saveData();
}

class MySqlDatabase implements Database {

    //TODO ERROR
//    @Override
//    public void saveData(String name){
//        System.out.println("save");
//    }

    @Override
    public void saveData() {
        System.out.println("save");
    }
}

class App {
    private Database db;

    App(Database db) {
        this.db = db;
    }

    void run() {
        db.saveData();
    }
}
