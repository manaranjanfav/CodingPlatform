package com.gb.codingplatform.Models;

import com.gb.codingplatform.Services.ContestService.AttendContest;
import com.gb.codingplatform.Services.ContestService.CreateContest;
import com.gb.codingplatform.Services.ContestService.RunContest;

public abstract class User {
    String name;
    String email;
    String phone;
    int rating;
    int id;

    CreateContest createContest;
    RunContest runContest;
    AttendContest attendContest;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CreateContest getCreateContest() {
        return this.createContest;
    }

    public void setCreateContest(CreateContest createContest) {
        this.createContest = createContest;
    }

    public RunContest getRunContest() {
        return this.runContest;
    }

    public void setRunContest(RunContest runContest) {
        this.runContest = runContest;
    }

    public AttendContest getAttendContest() {
        return this.attendContest;
    }

    public void setAttendContest(AttendContest attendContest) {
        this.attendContest = attendContest;
    }

    
    

   



}
