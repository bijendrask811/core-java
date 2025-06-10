package com.core.pattern.builder;



public class User {
    private final String username;
    private final String email;
    private final int age;
    private final boolean active;

    private User(Builder build){
        this.username = build.username;
        this.email = build.email;
        this.age =  build.age;
        this.active = build.active;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public boolean getActive(){
        return active;
    }

    @Override
    public String toString(){
        return "Username :"+ this.username +" | Email : "+this.email +" | Age : "+this.age +" | Active :"+this.active;
    }

    static class Builder {
        private String username;
        private String email;
        private int age;
        private boolean active;

        public Builder setUserName(String userName){
            this.username = userName;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setActive(boolean active){
            this.active = active;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
