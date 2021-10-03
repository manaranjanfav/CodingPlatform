package com.gb.codingplatform.Services.ContestService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gb.codingplatform.Enums.ContestLevel;
import com.gb.codingplatform.Models.Contest;
import com.gb.codingplatform.Models.Question;
import com.gb.codingplatform.Repository.ContestRepository.ContestDB;
import com.gb.codingplatform.Services.QuestionService.CreateQuestion;

public class CreateContest {
    Contest contest;
    List<Question> questions;
    CreateQuestion createQuestion;

    public CreateContest() {
        contest = new Contest();
        questions = new ArrayList<>();
        createQuestion = new CreateQuestion();
        
    }

    public Contest createcontest(int user_id,ContestDB contestDB)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the contest name");
        String name = sc.nextLine();
        System.out.println("Enter the contest Difficulty level LOW,HIGH,MEDIUM");
        String contestlevel = sc.nextLine();

        System.out.println("Enter the contest start time");
        String start_time = sc.nextLine();
        System.out.println("Enter the contest duration");
        int duration = sc.nextInt();

        System.out.println("Enter the number of questions");
        int no_of_question = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<no_of_question;i++)
        {
            Question question = createQuestion.createquestion(sc);
            questions.add(question);
        }

        contest.setContest_name(name);
        contest.setContestCreatorId(user_id);
        contest.setContest_start_time(start_time);
        contest.setContest_duration(duration);
        contest.setQuestions(questions);
        int total_contests = contestDB.getContests().size();
        contest.setContest_id(total_contests+1);
        contest.setContestLevel(ContestLevel.valueOfEnum(contestlevel));
        
        contestDB.getContests().add(contest);
        contestDB.getContest_id_to_contest().put(contest.getContest_id(), contest);

        sc.close();

        return contest;
    }
}
