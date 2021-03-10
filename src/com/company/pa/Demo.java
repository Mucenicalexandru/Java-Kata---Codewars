package com.company.pa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Demo {





    public static void main(String[] args) {
        User user1 = new User(1);
        User user2 = new User(1);

        Integer i1 = 1;
        Integer i2 = 1;

        Map<User, String> map = new HashMap<>();
        map.put(user1, "Alex");
        map.put(user2, "Alex");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(i1, "1");
        map1.put(i2, "1");

        System.out.println(map.size());
        System.out.println(map1.size());
    }
}

class User{

    private int id;

    User(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
