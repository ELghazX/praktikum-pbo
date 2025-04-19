package com.gym.app.repository;

import java.util.ArrayList;
import java.util.List;

import com.gym.app.entity.User;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int id) {
        users.removeIf(u -> u.getId() == id);
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public List<User> getAll() {
        return users;
    }

    public User findByNameAndPassword(String name, String password) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name) && user.getPassword().equalsIgnoreCase(password)) {
                return user;
            }
        }
        return null;
    }
}
