package org.example;

import java.util.HashSet;
import java.util.Set;

public class UserManager {
    private Set<String> users = new HashSet();

    public UserManager(){
    }

    public void addUser(String username){
        this.users.add(username);
    }

    public void removeUser(String username){
        this.users.remove(username);
    }

    public int getUserCount(){
        return this.users.size();
    }

    public boolean userExist(String username){
        return this.users.contains(username);
    }

    public void clearUsers(){
        this.users.clear();
    }
}
