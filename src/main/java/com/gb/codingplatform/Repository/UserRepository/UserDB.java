package com.gb.codingplatform.Repository.UserRepository;
import java.util.*;
import com.gb.codingplatform.Models.GeneralUser;

public class UserDB {
    List<GeneralUser> userList;
    Map<Integer,GeneralUser> user_id_to_user;

    public List<GeneralUser> getUserList() {
        return this.userList;
    }

    public void setUserList(List<GeneralUser> userList) {
        this.userList = userList;
    }

    public Map<Integer,GeneralUser> getUser_id_to_user() {
        return this.user_id_to_user;
    }

    public void setUser_id_to_user(Map<Integer,GeneralUser> user_id_to_user) {
        this.user_id_to_user = user_id_to_user;
    }


}
