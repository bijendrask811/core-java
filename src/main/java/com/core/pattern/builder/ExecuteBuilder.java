package com.core.pattern.builder;

public class ExecuteBuilder{

    public static void main(String[] args){
        User user = new User.Builder().setUserName("Bijendra").setAge(20).setEmail("abc@gmail.com").setActive(true).build();
        System.out.println(user);
    }

}
