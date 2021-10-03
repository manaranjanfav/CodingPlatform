package com.gb.codingplatform.Services.ContestService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.gb.codingplatform.Enums.ContestLevel;
import com.gb.codingplatform.Models.Contest;
import com.gb.codingplatform.Models.GeneralUser;
import com.gb.codingplatform.Models.Question;


public class RunContest {

    public RunContest() {
        
    }


     public void run(Contest contest)
     {
       System.out.println("Contest name is " + contest.getContest_name());
       System.out.println("Contest has started.............");

       List<Question> questions = contest.getQuestions();
       List<GeneralUser> users = contest.getParticipants();
       int no_of_questions = questions.size();
       int no_of_users = users.size();

       System.out.println("Questions....");

       for(int i=0;i<questions.size();i++)
       {
           System.out.println(i+". " + questions.get(i).getDescription());
       }

       System.out.println("contest has ended Running System test.........");
       System.out.println("System testing done");
       Random rd = new Random();
       for(int i=0;i<no_of_users;i++)
       {
           int no_of_solved = rd.nextInt(no_of_questions) + 1;
           List<Integer> solved_questions = new ArrayList<>();
           int contest_score = 0 ;
           System.out.println("user " + users.get(i).getName() + "solves... ");
           for(int j=0;j<no_of_solved;j++)
           {
               int question_no = rd.nextInt(no_of_questions)+1;
               System.out.println(question_no);
               solved_questions.add(question_no);
               int question_mark = questions.get(question_no-1).getMarks();
               contest_score =  contest_score + question_mark;
               
           }

           if(contest.getContestLevel()==ContestLevel.LOW)
            {
                int final_score = users.get(i).getRating() + contest_score - 50;
                contest.getUser_to_score().put(users.get(i).getId(), contest_score);
                users.get(i).setRating(final_score);
            }

       }

       System.out.println("updating leaderboard....");
       System.out.println("Leaderboard Updated.....");

       
     }
    
}
