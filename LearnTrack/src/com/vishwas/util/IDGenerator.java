package com.vishwas.util;

public class IDGenerator {
    public static int GenerateID(String name){
        if(name == null)    return 0;
        return name.hashCode();
    }
}
