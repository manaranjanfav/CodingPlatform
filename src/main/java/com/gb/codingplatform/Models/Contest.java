package com.gb.codingplatform.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gb.codingplatform.Enums.ContestLevel;

public class Contest {
    int contest_id;
    String contest_name;
    ContestLevel contestLevel;
    int contestCreatorId;
    String contest_start_time;
    int contest_duration;
    List<Question> questions;
    List<GeneralUser> participants;
    Map<Integer,Integer> user_to_score;


    public Contest() {
        participants = new ArrayList<>();
        user_to_score = new HashMap<>();
    }


    public String getContest_name() {
        return this.contest_name;
    }

    public void setContest_name(String contest_name) {
        this.contest_name = contest_name;
    }

    public int getContestCreatorId() {
        return this.contestCreatorId;
    }

    public void setContestCreatorId(int contestCreatorId) {
        this.contestCreatorId = contestCreatorId;
    }
    
    public int getContest_id() {
        return this.contest_id;
    }

    public void setContest_id(int contest_id) {
        this.contest_id = contest_id;
    }

    public ContestLevel getContestLevel() {
        return this.contestLevel;
    }

    public void setContestLevel(ContestLevel contestLevel) {
        this.contestLevel = contestLevel;
    }

    public String getContest_start_time() {
        return this.contest_start_time;
    }

    public void setContest_start_time(String contest_start_time) {
        this.contest_start_time = contest_start_time;
    }

    public int getContest_duration() {
        return this.contest_duration;
    }

    public void setContest_duration(int contest_duration) {
        this.contest_duration = contest_duration;
    }

    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Map<Integer,Integer> getUser_to_score() {
        return this.user_to_score;
    }

    public void setUser_to_score(Map<Integer,Integer> user_to_score) {
        this.user_to_score = user_to_score;
    }


    public List<GeneralUser> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<GeneralUser> participants) {
        this.participants = participants;
    }






}
