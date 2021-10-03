package com.gb.codingplatform.Services.QuestionService;

import com.gb.codingplatform.Enums.QuestionLevel;
import com.gb.codingplatform.Repository.ContestRepository.ContestDB;

public class ViewQuestions {
    QuestionLevel questionLevel;
    ViewHardQuestions viewHardQuestions;
    ViewLowQuestions viewLowQuestions;
    ViewMediumQuestions viewMediumQuestions;
    ContestDB contestDB;

    public ViewQuestions() {
        
        viewHardQuestions = new ViewHardQuestions();
        viewLowQuestions = new ViewLowQuestions();
        viewMediumQuestions = new ViewMediumQuestions();
       
        viewLowQuestions.view(contestDB);
        viewMediumQuestions.view(contestDB);
        viewHardQuestions.view(contestDB);
    }

    public ViewQuestions(QuestionLevel questionLevel) {
        this.questionLevel = questionLevel;
        switch(this.questionLevel)
        {
          case LOW: viewLowQuestions.view(contestDB);break;
          case MEDIUM: viewMediumQuestions.view(contestDB);break;
          case HIGH: viewHardQuestions.view(contestDB);
        }
    }

    public ContestDB getContestDB() {
        return this.contestDB;
    }

    public void setContestDB(ContestDB contestDB) {
        this.contestDB = contestDB;
    }



    
  

}
