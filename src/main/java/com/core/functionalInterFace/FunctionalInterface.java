package com.core.functionalInterFace;

public class FunctionalInterface {

    interface User{
        void detail(String jobPost);
    }

    public static void main(String[] args){
        User user = jobPost-> System.out.println("Job role  : "+jobPost+" Experience 3+ years.");
        user.detail("Java Developer");
    }



}
