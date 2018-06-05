package pl.krejzolekpro.byobjects.objects;

import java.util.ArrayList;
import java.util.List;

public class UserUtil {

    public static List<User> userList = new ArrayList<User>();

    public static void addUser(User user){
        if(!userList.contains(user)){
            userList.add(user);
        }
    }

    public static User get(String name){
        for(User user : userList){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return new User(name);
    }
}
