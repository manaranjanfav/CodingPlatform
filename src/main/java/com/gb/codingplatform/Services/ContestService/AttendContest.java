package com.gb.codingplatform.Services.ContestService;

import com.gb.codingplatform.Models.Contest;
import com.gb.codingplatform.Models.GeneralUser;

public class AttendContest {

    public AttendContest() {
        
    }

    public void attend(Contest contest, GeneralUser user)
    {
        contest.getParticipants().add(user);
    }
}
