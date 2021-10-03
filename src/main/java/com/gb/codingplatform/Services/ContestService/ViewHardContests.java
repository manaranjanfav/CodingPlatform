package com.gb.codingplatform.Services.ContestService;

import java.util.List;

import com.gb.codingplatform.Enums.ContestLevel;
import com.gb.codingplatform.Models.Contest;
import com.gb.codingplatform.Repository.ContestRepository.ContestDB;
import com.gb.codingplatform.Services.ViewService.View;

public class ViewHardContests implements View{
    @Override
    public void view(ContestDB contestDB) {
        
        List<Contest> contests = contestDB.getContests();

        for(int i=0;i<contests.size();i++)
        {
            if(contests.get(i).getContestLevel().equals(ContestLevel.HIGH))
            {System.out.println(contests.get(i).getContest_name());
            }
        }
    }
}
