package com.gb.codingplatform.Services.QuestionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gb.codingplatform.Enums.QuestionLevel;
import com.gb.codingplatform.Models.Question;

public class CreateQuestion {


    public CreateQuestion() {
    }

    
    public Question createquestion(Scanner sc)
    {    
      
        System.out.println("Enter question_name");
        String name = sc.nextLine();
        int question_id = 1;
        QuestionLevel question_level = QuestionLevel.LOW;
        System.out.println("Enter description");
        String description = sc.nextLine();
        System.out.println("Enter time complexity");
        double timeComplexity = sc.nextDouble();
        List<String> languages = new ArrayList<>();
        System.out.println("Enter score of the question");
        int question_mark = sc.nextInt();
        sc.nextLine();
       
        /*System.out.println("Enter number of language");
        int number = sc.nextInt();

        for(int i=0;i<number;i++)
        {
            System.out.println("Enter the language " + i);
            String templang = sc.nextLine();
            languages.add(templang);
        }*/
        
        

        Question question = new Question(question_id, name, question_level, description, timeComplexity, languages,question_mark);
        return question;
        
    }
}
