package com.gb.codingplatform.Models;

import java.util.List;

import com.gb.codingplatform.Enums.QuestionLevel;

public class Question {
    int question_id;
    String name;
    QuestionLevel difficulty;
    String description;
    double timeComplexity;
    List<String> languages;
    int marks;
    
    public Question(int question_id, String name, QuestionLevel difficulty, String description, double timeComplexity, List<String> languages,int marks) {
        this.question_id = question_id;
        this.name = name;
        this.difficulty = difficulty;
        this.description = description;
        this.timeComplexity = timeComplexity;
        this.languages = languages;
        this.marks = marks;
    }

    public int getQuestion_id() {
        return this.question_id;
    }

    public String getName() {
        return this.name;
    }

    public QuestionLevel getDifficulty() {
        return this.difficulty;
    }

    public String getDescription() {
        return this.description;
    }

    public double getTimeComplexity() {
        return this.timeComplexity;
    }

    public List<String> getLanguages() {
        return this.languages;
    }


    public int getMarks() {
        return this.marks;
    }





    

}
