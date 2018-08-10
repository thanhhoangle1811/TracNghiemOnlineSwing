/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.QuizListDto;
import DTO.ResultDto;
import java.sql.CallableStatement;

/**
 *
 * @author Sony
 */
public class QuizListDao {
    
     public boolean insertQuizList(QuizListDto quizListDto) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_insertQuizNum (?,?,?,?,?)}");
            conn.setString(1, quizListDto.getSubjectID());
            conn.setInt(2, quizListDto.getTime());
            conn.setInt(3, quizListDto.getNoOflev1Ques());
            conn.setInt(4, quizListDto.getNoOflev2Ques());
            conn.setInt(5, quizListDto.getNoOflev3Ques());          
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println("err insert{} : " + e.getMessage());
        }
        return false;
    }

    
}
