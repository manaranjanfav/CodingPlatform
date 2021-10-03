package com.gb.codingplatform.Models;

import com.gb.codingplatform.Repository.ContestRepository.ContestDB;
import com.gb.codingplatform.Repository.UserRepository.UserDB;
import com.gb.codingplatform.Services.UserService.CreateUser;

public class Admin extends User{

    UserDB userDB;
    ContestDB contestDB;
    CreateUser createUser;


    public UserDB getUserDB() {
        return this.userDB;
    }

    public void setUserDB(UserDB userDB) {
        this.userDB = userDB;
    }

    public ContestDB getContestDB() {
        return this.contestDB;
    }

    public void setContestDB(ContestDB contestDB) {
        this.contestDB = contestDB;
    }

    public void createuserdb()
    {
        userDB = new UserDB();
    }

    public void createcontestdb()
    {
        contestDB = new ContestDB();
    }

    public void createuser()
    {
        
    }
    

    
}
