package com.example.projectweek2.service;

import com.example.projectweek2.modle.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    private static final ArrayList<User> userArrayList=new ArrayList<>();

    public static ArrayList<User> getUser(){
        return userArrayList;
    }
    public static void addUser(User user){
        userArrayList.add(user);
    }
    public static void updateUser(int index, User user){
        userArrayList.set(index,user);
    }
    public static void delUser(int index){
        userArrayList.remove(index);
    }




}