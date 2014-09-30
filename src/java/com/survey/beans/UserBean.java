package com.survey.beans;

/**
 * UserBean class to set and get database values
 * @author Khurram Afzal
 * @version 1.0
 */
public class UserBean {

/**
   * Holds questionID primary key "survey.question"
  */  
    private int questionID;
    private int ques_surid;
    private String ques_survey;
    private String question;
    private int surveyID;
    private String survey;
    private int ansID;
    private int answer;
    private int ques_optionID;
    private int graph_answer_numeric;
    private int graph_quesid;
    private int pie_graph1;
    private int pie_graph2;
    private int pie_graph3;
    private int pie_graph4;
    

    private String first_option;
    private String second_option;
    private String third_option;
    private String forth_option;


    
    public int getquestionID() {
        return questionID;
    }


  /**
   * setter method for questionID. 
   * @param questionID . 
   */    
    public void setquestionID(int questionID) {
        this.questionID = questionID;
    }
/**
 * getter method
 * @return ques_surid
 */
    public int getQues_SurID() {
        return ques_surid;
    }
 /**
   * setter method for ques_surid. 
   * @param ques_surid . 
   */   
    public void setQues_SurID(int ques_surid) {
        this.ques_surid = ques_surid;
    }

/**
 * getter method
 * @return graph_quesid
 */  
    public int getGraph_QuesID() {
        return graph_quesid;
    }
 /**
   * setter method
   * @param graph_quesid . 
   */ 
    public void setGraph_QuesID(int graph_quesid) {
        this.graph_quesid = graph_quesid;
    }
/**
 * getter method
 * @return ques_survey
 */
    public String getQues_Survey() {
        return ques_survey;
    }
 /**
   * setter method
   * @param ques_survey. 
   */ 
    public void setQues_Survey(String ques_survey) {
        this.ques_survey = ques_survey;
    }
/**
 * getter method
 * @return question
 */
    public String getquestion() {
        return question;
    }
 /**
   * setter method
   * @param question. 
   */ 
    public void setquestion(String question) {
        this.question = question;
    }
/**
 * getter method
 * @return ques_surid
 */
    public int getsurveyID() {
        return surveyID;
    }
 /**
   * setter method 
   * @param surveyID. 
   */ 
    public void setsurveyID(int surveyID) {
        this.surveyID = surveyID;
    }
/**
 * getter method
 * @return survey
 */
    public String getsurvey() {
        return survey;
    }
 /**
   * setter method
   * @param survey. 
   */ 
    public void setsurvey(String survey) {
        this.survey = survey;
    }
/**
 * getter method
 * @return ansID
 */
    public int getansID() {
        return ansID;
    }
 /**
   * setter method
   * @param ansID. 
   */ 
    public void setansID(int ansID) {
        this.ansID = ansID;
    }
/**
 * getter method
 * @return answer
 */
    public int getanswer() {
        return answer;
    }
 /**
   * setter method
   * @param answer. 
   */ 
    public void setanswer(int answer) {
        this.answer = answer;
    }
/**
 * getter method
 * @return ques_optionID
 */
    public int get_ques_option_id() {
        return ques_optionID;
    }
 /**
   * setter method
   * @param ques_optionID. 
   */ 
    public void set_ques_option_id(int ques_optionID) {
        this.ques_optionID = ques_optionID;
    }
/**
 * getter method
 * @return graph_answer_numeric
 */
    public int get_ques_Graph_answer_numeric() {
        return graph_answer_numeric;
    }
 /**
   * setter method
   * @param graph_answer_numeric. 
   */ 
    public void set_ques_graph_answer_numeric(int graph_answer_numeric) {
        this.graph_answer_numeric = graph_answer_numeric;
    }
/**
 * getter method
 * @return pie_graph1
 */
    public int getpie_graph1() {
        return pie_graph1;
    }
 /**
   * setter method 
   * @param pie_graph1. 
   */ 
    public void setpie_graph1(int pie_graph1) {
        this.pie_graph1 = pie_graph1;
    }
/**
 * getter method
 * @return pie_graph2
 */    
      public int getpie_graph2() {
        return pie_graph2;
    }
 /**
   * setter method
   * @param pie_graph2. 
   */ 
    public void setpie_graph2(int pie_graph2) {
        this.pie_graph2 = pie_graph2;
    }
/**
 * getter method
 * @return pie_graph3
 */      
    public int getpie_graph3() {
        return pie_graph3;
    }
 /**
   * setter method 
   * @param pie_graph3. 
   */ 
    public void setpie_graph3(int pie_graph3) {
        this.pie_graph3 = pie_graph3;
    }
/**
 * getter method
 * @return pie_graph4
 */      
    public int getpie_graph4() {
        return pie_graph4;
    }
 /**
   * setter method
   * @param pie_graph4. 
   */       
    public void setpie_graph4(int pie_graph4) {
        this.pie_graph4 = pie_graph4;
    }
/**
 * getter method
 * @return first_option
 */    
    public String get_f_option() {
        return first_option;
    }
 /**
   * setter method 
   * @param first_option. 
   */     
    public void set_f_option(String first_option) {
        this.first_option = first_option;
    }
/**
 * getter method
 * @return second_option
 */    
        public String get_s_option() {
        return second_option;
    }
 /**
   * setter method
   * @param second_option. 
   */         
    public void set_s_option(String second_option) {
        this.second_option = second_option;
    }
/**
 * getter method
 * @return third_option
 */    
        public String get_t_option() {
        return third_option;
    }
 /**
   * setter method
   * @param third_option. 
   */         
    public void set_t_option(String third_option) {
        this.third_option = third_option;
    }
/**
 * getter method
 * @return forth_option
 */    
        public String get_fo_option() {
        return forth_option;
    }
 /**
   * setter method
   * @param forth_option. 
   */         
    public void set_fo_option(String forth_option) {
        this.forth_option = forth_option;
    }
    
}