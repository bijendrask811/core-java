package com.core.builder.pattern;

public class ExecuteBuilder{

    public void executeBuilder(){
        User user = new User.Builder().setUserName("Bijendra").setAge(20).setEmail("abc@gmail.com").setActive(true).build();
        System.out.println(user);
    }

}
