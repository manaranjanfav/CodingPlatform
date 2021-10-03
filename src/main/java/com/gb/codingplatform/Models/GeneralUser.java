package com.gb.codingplatform.Models;

import com.gb.codingplatform.Repository.ContestRepository.ContestDB;
import com.gb.codingplatform.Services.ContestService.AttendContest;
import com.gb.codingplatform.Services.ContestService.CreateContest;
import com.gb.codingplatform.Services.ContestService.RunContest;

public class GeneralUser extends User{

   
    public GeneralUser() {
         this.createContest = new CreateContest();
         this.runContest = new RunContest();
         this.attendContest = new AttendContest();
    }

    public Contest createcontest(int creater_id,ContestDB contestDB)
    {
       Contest contest = this.createContest.createcontest(creater_id,contestDB);
       return contest;
    }

    public void runcontest(Contest contest)
    {
        runContest.run(contest);
    }

    public void attendcontest(Contest contest,GeneralUser user)
    {
        this.attendContest.attend(contest,user);
    }

   
}
