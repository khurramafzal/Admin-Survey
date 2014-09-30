
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.survey.handler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import com.survey.dbconnection.ConnectionProvider;
import com.survey.handler.UserHandler;

/**
 *
 * @author MAfzal 
 */
public class UserHandlerSurvey extends HttpServlet {

    private static String Insert_Ques = "/add_ques.jsp";
    private static String Record_Ques = "/admin.jsp";
    private static String Update_Ques = "/update_admin.jsp";
    private static String Insert_Survey = "/addsurvey.jsp";
    private static String Record_Survey = "/displaysurvey.jsp";
    private static String Update_Survey = "/editsurvey.jsp";
    private static String display_ques_byID = "/displayQuestion.jsp";
    private static String disQuesOnUser = "/userDisplay.jsp";
    private static String disQuesOnGraph = "/graph_display.jsp";
    private static String disQuesOption = "/addQuesOptions.jsp";
     
    private UserDao dao;

    public UserHandlerSurvey() {
        super();
        dao = new UserDao();
    }

/**

 */    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect = "";
        String uId = request.getParameter("surveyid");
        String action = request.getParameter("action");
        String uId_ques = request.getParameter("quesid");


/**
 *  Action call "insert" from jsp page.
 *  get survey name from parameter. 
 *  set "survey "value in bean class variable by using the method  "setsurvey("survey")".
 *  save "survey" value in "survey.survey_sections" by using method "dao.addSurvey(user)" class "package com.survey.dao;"
 *  Redirect to addsurvey.jsp
 */           
           if (!((uId) == null) && action.equalsIgnoreCase("insert")) {
            //   int id = Integer.parseInt(uId);
            UserBean user = new UserBean();
            //      user.setsurveyID(id);
            user.setsurvey(request.getParameter("Survey"));
            dao.addSurvey(user);
            redirect = Insert_Survey;
            request.setAttribute("survey_sections", dao.getAllsurvey());
            System.out.println("Record Added Successfully");
        } 
/**
 * Action call "addsurveyPage" from jsp page.
 * Redirect to addsurvey.jsp.
*/            
      else if (action.equalsIgnoreCase("addsurveyPage")) {

            redirect = Insert_Survey;
            
/**
 * Action call "add_quesPage" from jsp page.
 * Redirect to add_ques.jsp.
*/      
        } else if (action.equalsIgnoreCase("add_quesPage")) {
            redirect = Insert_Ques;
        } 

/**
 *  Action call "delete" from jsp page.
 *  get surveyid from parameter. 
 *  delete the selected survey by comparing the "surveyid"
 *  Redirect to displaysurvey.jsp"
 */  
        
        else if (action.equalsIgnoreCase("delete")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            dao.removeAns(uid);
            dao.removeQuesbySID(uid);
            dao.removeSurvey(uid);
            redirect = Record_Survey;
            request.setAttribute("survey_sections", dao.getAllsurvey());
            System.out.println("Record Deleted Successfully");
        } 
/**
 * Delete the survey within the "add_ques.jsp" page
 *  Action call "delete2" from jsp page.
 *  get surveyid name from parameter. 
 *  delete the selected survey by comparing the "surveyid"
 *  Redirect to addsurvey.jsp"
*/        

        else if (action.equalsIgnoreCase("delete2")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
             dao.removeAns(uid);
            dao.removeQuesbySID(uid);
            dao.removeSurvey(uid);
            redirect = Insert_Survey;
            request.setAttribute("survey_sections", dao.getAllsurvey());
            System.out.println("Record Deleted Successfully");
        } 
        
/**
 * Action call "add_quesPage" from jsp page.
 * Redirect to editsurvey.jsp
*/      
        else if (action.equalsIgnoreCase("editform")) {
            redirect = Update_Survey;
        } 
        
/**
 *  Action call "edit" from jsp page.
 *  get surveyid from parameter. 
 *  set "surveyid" and "survey name" value in bean class variable by using the method  
 *  update "survey" value in "survey.survey_sections" by using method "dao.editSurvey(user);" class "package com.survey.dao;"
 *  Redirect to displaysurvey.jsp
 */       
        else if (action.equalsIgnoreCase("edit")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            user.setsurvey(request.getParameter("Survey"));
            dao.editSurvey(user);
            request.setAttribute("addsurvey", user);
            redirect = Record_Survey;
            System.out.println("Record updated Successfully");
        } 

/**
 *  Action call "displayReq_Ques" from jsp page
 *  get surveyid from parameter
 *  get data from table "survey.question" by comparing "surveyid" selected by users
 *  Redirect to add_ques.jsp
 */         
        
        else if (action.equalsIgnoreCase("displayReq_Ques")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            dao.getQuesBySurveyId(uid);
            redirect = Insert_Ques;
            System.out.println("Record updated Successfully");
        } 

/**
 *  Action call "displayReq_Ques_User" from jsp page
 *  get surveyid from parameter
 *  get data from table "survey.question" by comparing "surveyid" selected by users
 *  Redirect to userDisplay.jsp"
 */ 
        
        else if (action.equalsIgnoreCase("displayReq_Ques_User")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            dao.getQuesBySurveyId(uid);
            redirect = disQuesOnUser;
            System.out.println("Record updated Successfully");
        }         
        

/**
 *  Action call "displayReq_Ques_Graph" from jsp page
 *  get surveyid from parameter
 *  get data from table "survey.question" by comparing "surveyid" selected by users
 *  Redirect to userDisplay.jsp
 */         
        
        else if (action.equalsIgnoreCase("displayReq_Ques_Graph")) {
            String userId = request.getParameter("surveyid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setsurveyID(uid);
            dao.getQuesBySurveyId(uid);
            redirect = disQuesOnGraph;
            System.out.println("Record updated Successfully");
        }                 
        
/**
 *  Action call "displayReq_Graph_" from jsp page
 *  get surveyid from parameter
 *  get data from table "survey.answers" by comparing "quesid" selected by users
 *  Redirect to graph_display.jsp
*/ 
        else if (action.equalsIgnoreCase("displayReq_Graph_")) {
            String userId = request.getParameter("quesid");
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setquestionID(uid);
            dao.getAllGraphbyQuesId(uid);
            redirect = disQuesOnGraph;
            System.out.println("Record updated Successfully");
        }                         
/**
 * Action call "listUser" from jsp page.
 * Redirect to displaysurvey.jsp.
*/        
        else if (action.equalsIgnoreCase("listUser")) {
            redirect = Record_Survey;
            request.setAttribute("survey_sections", dao.getAllsurvey());
        } 
        
/**
 *  Action call "insert_ques" from jsp page.
 *  get "survey.question.survey_id" and "Question" from parameter. 
 *  set "survey.question.question_name "value in bean class variable by using the method  "setquestion("Question")".
 *  save "question" value in "survey.survey_sections" by using method "dao.addQues(user)" class "package com.survey.dao;"
 *  Redirect to addsurvey.jsp
 */       
        
        else if (!((uId) == null) && action.equalsIgnoreCase("insert_ques")) {
            //   int id = Integer.parseInt(uId_ques);
            int id2 = Integer.parseInt(request.getParameter("surveyid"));
            UserBean user = new UserBean();
            //              user.setquestionID(id);
            user.setsurveyID(id2);
            user.setquestion(request.getParameter("Question"));
            dao.addQues(user);
            redirect = Insert_Ques;
            request.setAttribute("question", dao.getAllQues());
            System.out.println("Record Added Successfully");

        } 
        
/**
 *  Action call "add_options" from jsp page.
 *  get "survey.question_options.question_id" from parameter. 
 *  set "survey.question_options.first_option " and "survey.question_options.second_option"   and survey.question_options.third_option
 *  and "survey.question_options.forth_option" from the database table
 *  save data in database 
 *  Redirect to add_ques.jsp
 */     
        else if (!((uId) == null) && action.equalsIgnoreCase("add_options")) {
      
            int id2 = Integer.parseInt(request.getParameter("quesid"));
            UserBean user = new UserBean();
          
            user.setquestionID(id2);
            user.set_f_option(request.getParameter("f_option"));
            user.set_s_option(request.getParameter("s_option"));
            user.set_t_option(request.getParameter("t_option"));
            user.set_fo_option(request.getParameter("fo_option"));
            dao.addOptions(user);
            redirect = Insert_Ques;
            request.setAttribute("question", dao.getAllQues());
            System.out.println("Record Added Successfully");

        }         
/**
 *  Action call "insert_ans" from jsp page.
 *  get "quesid" and "value" from parameter. 
 *  set "survey.question_id" and "survey.answer_numeric" value in bean class variable by using the methods  
 *  save into "survey.answers"
 *  Redirect to userDisplay.jsp
 */      
        else if (action.equalsIgnoreCase("insert_ans")) {
            
            int id = Integer.parseInt(request.getParameter("quesid"));
            int id2 = Integer.parseInt(request.getParameter("value"));
            UserBean user = new UserBean();
            user.setquestionID(id);
            user.setanswer(id2);
            dao.addAnswer(user);
            redirect = disQuesOnUser;
            request.setAttribute("answers", dao.getAllanswers());
            System.out.println("Record Added Successfully");
            
/**
 *  Action call "delete_ques" from jsp page.
 *  get quesid from parameter. 
 *  delete the selected survey by comparing the "quesid"
 *  Redirect to add_ques.jsp"
 */ 
        } else if (action.equalsIgnoreCase("delete_ques")) {
            String userId = request.getParameter("quesid");
            int uid = Integer.parseInt(userId);
            dao.removeAns(uid);
            dao.removeQues(uid);
            redirect = Insert_Ques;
            request.setAttribute("question", dao.getAllQues());
            System.out.println("Record Deleted Successfully");

        } 
        
/**
 * Action call "addQuesOption" from jsp page.
 * Redirect to addQuesOptions.jsp
*/   
      else if (action.equalsIgnoreCase("addQuesOption")) {
            redirect = disQuesOption;

        } 

/**
 * Action call "editform_ques" from jsp page.
 * Redirect to update_admin.jsp
*/     
        else if (action.equalsIgnoreCase("editform_ques")) {
            redirect = Update_Ques;

        } 
/**
 * Action call "displaySurvey" from jsp page.
 * Redirect to displaysurvey.jsp
*/         
        else if (action.equalsIgnoreCase("displaySurvey")) {
            redirect = Record_Survey;

        }         
/**
 * Action call "displayQuestions" from jsp page.
 * Redirect to displaysurvey.jsp
*/   
        else if (action.equalsIgnoreCase("displayQuestions")) {
            redirect = Record_Survey;

        }    
        
/**
 * Action call "graph_display" from jsp page.
 * Redirect to graph_display.jsp
*/     
        else if (action.equalsIgnoreCase("graph_display")) {
            redirect = disQuesOnGraph;

        } 
        
/**
 * Action call "userDisplay" from jsp page.
 * Redirect to userDisplay.jsp
*/         
        
        else if (action.equalsIgnoreCase("userDisplay")) {
            redirect = disQuesOnUser;

        }
        
        
    
 /**
 *  Action call "edit_ques" from jsp page.
 *  get "surveyid" and "surveyid" from parameter. 
 *  update "survey.question" table 
 *  Redirect to add_ques.jsp
 */
        
        else if (action.equalsIgnoreCase("edit_ques")) {
            String userId = request.getParameter("quesid");
            String surveyid = request.getParameter("surveyid");
            int surveyId = Integer.parseInt(surveyid);
            int uid = Integer.parseInt(userId);
            UserBean user = new UserBean();
            user.setquestionID(uid);
            user.setsurveyID(surveyId);
            user.setquestion(request.getParameter("Question"));
            dao.editQues(user);
            request.setAttribute("add_ques", user);
            redirect = Insert_Ques;
            System.out.println("Record updated Successfully");
        } 
        

/**
 * Action call "listUser_ques" from jsp page.
 * Redirect to admin.jsp
*/          
        
        else if (action.equalsIgnoreCase("listUser_ques")) {
            redirect = Record_Ques;
            request.setAttribute("question", dao.getAllQues());
        } 

 /**
 * 
 * Redirect to add_ques.jsp
*/         
        else {
            redirect = Insert_Ques;
        }

        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}