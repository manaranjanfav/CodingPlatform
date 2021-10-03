package com.gb.codingplatform.Repository.ContestRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gb.codingplatform.Models.Contest;


public class ContestDB {
   
    List<Contest> contests;
    Map<Integer,Contest> contest_id_to_contest;

    public ContestDB() {
        contests = new ArrayList<>();
        contest_id_to_contest = new HashMap<>();
    }

    public List<Contest> getContests() {
        return this.contests;
    }

    public void setContests(List<Contest> contests) {
        this.contests = contests;
    }

    public Map<Integer,Contest> getContest_id_to_contest() {
        return this.contest_id_to_contest;
    }

    public void setContest_id_to_contest(Map<Integer,Contest> contest_id_to_contest) {
        this.contest_id_to_contest = contest_id_to_contest;
    }
    

        
}
