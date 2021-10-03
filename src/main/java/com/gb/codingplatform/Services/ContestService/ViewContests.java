package com.gb.codingplatform.Services.ContestService;

import com.gb.codingplatform.Enums.ContestLevel;
import com.gb.codingplatform.Repository.ContestRepository.ContestDB;

public class ViewContests {
    ContestLevel contestLevel;
    ViewHardContests viewHardContests;
    ViewLowContests viewLowContests;
    ViewMediumContests viewMediumContests;
    ContestDB contestDB;

    public ViewContests(ContestDB contestDB) {
        this.contestDB = contestDB;
        viewHardContests = new ViewHardContests();
        viewLowContests = new ViewLowContests();
        viewMediumContests = new ViewMediumContests();
    }

    public void viewcontests() {

        viewLowContests.view(contestDB);
        viewMediumContests.view(contestDB);
        viewHardContests.view(contestDB);
    }

    public void viewcontests(ContestLevel contestLevel) {
        this.contestLevel= contestLevel;
        switch(this.contestLevel)
        {
          case LOW: viewLowContests.view(contestDB);break;
          case MEDIUM: viewMediumContests.view(contestDB);break;
          case HIGH: viewHardContests.view(contestDB); break;
          default:
          break;
        }
    }



    
}
