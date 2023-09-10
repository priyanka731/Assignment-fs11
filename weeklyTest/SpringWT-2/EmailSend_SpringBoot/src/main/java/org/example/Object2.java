package org.example;

import org.springframework.stereotype.Component;

@Component
public class Object2 {
    private String color;
    public Object2(){
        this.color="Red";
    }
    public String getName(){
        return color;
    }

}
