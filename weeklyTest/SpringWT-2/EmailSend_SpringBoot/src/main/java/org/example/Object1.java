package org.example;

import org.springframework.stereotype.Component;

@Component
public class Object1 {
    private String name;

    public Object1(){
        this.name = "Divya";

    }
    public String getName(){
        return name;

    }

}
