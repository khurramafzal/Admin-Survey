/**
 * For Testing purpose only.
 * This servlet can be deleted 
 * once deleted the servlet then the data from web.xml also has to be deleted
 *
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
public class UserHandlerSurvey2 extends HttpServlet {    
    private static String INSERT = "/user.jsp";
    private static String Edit = "/edit.jsp";
    private static String UserRecord = "/listUser.jsp";
    
    private static String Insert_Ques = "/add_ques.jsp";
    private static String Record_Ques = "/admin.jsp";
    private static String Update_Ques = "/update_admin.jsp";
    
    private UserDao dao;

    public UserHandlerSurvey2() {
        super();
        dao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect="";
        String uId = request.getParameter("quesid");        
        String action = request.getParameter("action");
        if(!((uId)== null) && action.equalsIgnoreCase("insert"))
        {
                int id = Integer.parseInt(uId);
                UserBean user = new UserBean();
                user.setquestionID(id);
            user.setquestion(request.getParameter("Question"));
                dao.addQues(user);
                redirect = Record_Ques;
            request.setAttribute("question", dao.getAllQues());    
                System.out.println("Record Added Successfully");
        } 
        else if (action.equalsIgnoreCase("delete")){
            String userId = request.getParameter("quesid");
            int uid = Integer.parseInt(userId);
            dao.removeQues(uid);
            redirect = Record_Ques;
            request.setAttribute("question", dao.getAllQues());
            System.out.println("Record Deleted Successfully");
        }else if (action.equalsIgnoreCase("editform")){         
                redirect = Update_Ques;            
        } else if (action.equalsIgnoreCase("edit")){
                String userId = request.getParameter("quesid");
            int uid = Integer.parseInt(userId);            
            UserBean user = new UserBean();
                user.setquestionID(uid);
            user.setquestion(request.getParameter("Question"));
            dao.editQues(user);
            request.setAttribute("add_ques", user);
            redirect = Record_Ques;
            System.out.println("Record updated Successfully");
         } else if (action.equalsIgnoreCase("listUser")){
            redirect = Record_Ques;
            request.setAttribute("question", dao.getAllQues());
         } else {
            redirect = Insert_Ques;
        }

        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
    
    
    
}