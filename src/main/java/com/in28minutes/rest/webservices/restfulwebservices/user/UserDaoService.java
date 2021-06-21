package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Adam",new Date()));
        users.add(new User(2,"Eve",new Date()));
        users.add(new User(3,"Jack",new Date()));
    }




}
