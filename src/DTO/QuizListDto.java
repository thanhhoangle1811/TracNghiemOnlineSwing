/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author TMK_PLAN4
 */
// dethi
public class QuizListDto {

    private int quizID;
    private String subjectID;
    private int time;
    private int noOflev1Ques;
    private int noOflev2Ques;
    private int noOflev3Ques;

    public QuizListDto() {
    }

    public QuizListDto(int quizID, String subjectID, int time, int noOflev1Ques, int noOflev2Ques, int noOflev3Ques) {
        this.quizID = quizID;
        this.subjectID = subjectID;
        this.time = time;
        this.noOflev1Ques = noOflev1Ques;
        this.noOflev2Ques = noOflev2Ques;
        this.noOflev3Ques = noOflev3Ques;
    }

    public QuizListDto(String subjectID, int time, int noOflev1Ques, int noOflev2Ques, int noOflev3Ques) {
        this.subjectID = subjectID;
        this.time = time;
        this.noOflev1Ques = noOflev1Ques;
        this.noOflev2Ques = noOflev2Ques;
        this.noOflev3Ques = noOflev3Ques;
    }
    

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNoOflev1Ques() {
        return noOflev1Ques;
    }

    public void setNoOflev1Ques(int noOflev1Ques) {
        this.noOflev1Ques = noOflev1Ques;
    }

    public int getNoOflev2Ques() {
        return noOflev2Ques;
    }

    public void setNoOflev2Ques(int noOflev2Ques) {
        this.noOflev2Ques = noOflev2Ques;
    }

    public int getNoOflev3Ques() {
        return noOflev3Ques;
    }

    public void setNoOflev3Ques(int noOflev3Ques) {
        this.noOflev3Ques = noOflev3Ques;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quizID=" + quizID + ", subjectID=" + subjectID + ", time=" + time + ", noOflev1Ques=" + noOflev1Ques + ", noOflev2Ques=" + noOflev2Ques + ", noOflev3Ques=" + noOflev3Ques + '}';
    }

    
}
