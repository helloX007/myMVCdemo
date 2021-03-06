package com.example.entity;

/**
 * Created with IDEA
 * author : chengbaiming
 * Date : 2019/4/24 0024
 * Time : 上午 11:13
 */
public class User {
    private int id;
    private String user_name;
    private String password;
    private int age;

    public User(){    }

    public User(int id,String username,String password,int age){
        this.id = id;
        this.user_name = username;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
