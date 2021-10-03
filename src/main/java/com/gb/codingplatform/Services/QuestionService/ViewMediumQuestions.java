package com.gb.codingplatform.Services.QuestionService;

import java.util.List;

import com.gb.codingplatform.Enums.ContestLevel;
import com.gb.codingplatform.Models.Contest;
import com.gb.codingplatform.Models.Question;
import com.gb.codingplatform.Repository.ContestRepository.ContestDB;
import com.gb.codingplatform.Services.ViewService.View;

public class ViewMediumQuestions implements View{

    @Override
    public void view(ContestDB contestDB) {
        
        List<Contest> contests  = contestDB.getContests();
        for(int i=0;i<contests.size();i++)
        {
            if(contests.get(i).getContestLevel().equals(ContestLevel.MEDIUM))
            {
                List<Question> questions = contests.get(i).getQuestions();
                for(int j = 0; j<questions.size(); j++)
                {
                    System.out.println(questions.get(j).getName());
                }
            }
        }
        
    }
    
}
