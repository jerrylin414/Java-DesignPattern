package com.lzy.designpattern.ocp.error;

/**
 * @auther jerry
 * @date 4/2/2025 9:48 AM
 */
public class AreaCalculator {
    Double caculateArea(Object obj){
        if (obj instanceof Circle){
            return 11.11;
        }else if (obj instanceof  Square){
            return 22.22;
        }
        return null;
    }
}

class Circle{

}

class Square{

}