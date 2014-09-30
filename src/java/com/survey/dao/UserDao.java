package com.survey.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.survey.beans.UserBean;
import com.survey.dao.UserDao;
import com.survey.dbconnection.ConnectionProvider;
import com.survey.handler.UserHandler;

public class UserDao {

    private Connection conn;

    public UserDao() {
        conn = ConnectionProvider.getConnection();
    }
/**
 * Fetch data from "survey.question" to display. 
 * specific data to be displayed by comparing column "id" from the question table.
 * copy data from database table into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected question by comparing the id 
 */	
    public UserBean displayQuestion(int q_ID) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM question where id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, q_ID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userBean.setquestionID(rs.getInt("id"));
                userBean.setquestion(rs.getString("question_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }

/**
 * Insert "survey_id & question_name" into "survey.question" table. 
 * survey_id is the foreign key of "survey.survey_sections" in question table. 
 * one to many relationship between tables "survey.survey_sections" & "survey.question"
 * copy data from UserBean class "getter methods" and save into "survey.question" table.
 *         insert user selected data into the database.
 */		    
    public void addQues(UserBean userBean) {
        try {
            String sql = "INSERT INTO question(survey_id, question_name)"
                    + " VALUES (? , ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            //       ps.setInt(1, userBean.getquestionID());
            ps.setInt(1, userBean.getsurveyID());
            ps.setString(2, userBean.getquestion());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 * Insert or replace data into "survey.question_options" table.
 * question_id is the foreign key in question_option table.
 * one to one relationship between tables "survey.question_options" & "survey.question".
 * copy data from UserBean class "getter methods" and save into "survey.question_option" table.
 *         insert user selected data into "survey.question_options" including "question_id" of selected data.
 */	

    public void addOptions(UserBean userBean) {
        try {
            String sql = "REPLACE INTO question_options(question_id, first_option, second_option, third_option, forth_option)"
                    + " VALUES (? , ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            //       ps.setInt(1, userBean.getquestionID());
            
            ps.setInt(1, userBean.getquestionID());
            ps.setString(2, userBean.get_f_option());
            ps.setString(3, userBean.get_s_option());
            ps.setString(4, userBean.get_t_option());
            ps.setString(5, userBean.get_fo_option());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 * Delete data from "survey.question" table.
 * use column "id" to specify "selected by user".    
 */	
    public void removeQues(int userId) {
        try {
            String sql = "DELETE FROM question WHERE id=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/**
 * Delete data from "survey.answers" table.
 * 
 */	
    public void removeAns(int userId) {
        try {
            String sql = "DELETE FROM answers AS a INNER JOIN question AS ON a.question_id=q.id WHERE survey_id=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/**
 * Delete data from "survey.question" table.
 * All data deleted against the specific "survey.survey_sections.question".
 * 
 */
    public void removeQuesbySID(int userId) {
        try {
            String sql = "DELETE FROM question WHERE survey_id=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/**
 * Update data from "survey.question" table.
 * Data will be updated against the specific selected question.
 * Compared data with column "question_name" and "id".
 */
    public void editQues(UserBean userBean) {
        try {
            String sql = "UPDATE question SET question_name=?"
                    + " WHERE id=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(1, userBean.getquestion());
            ps.setInt(2, userBean.getquestionID());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 * Fetch data from "survey.question" to display. 
 * copy data from database table into bean class variables by using setter method from the UserBean class
 * @return data in List
 *         display all questions column "survey.question" 
 */
    public List getAllQues() {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM question";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setquestionID(rs.getInt("id"));
                userBean.setQues_SurID(rs.getInt("survey_id"));
                userBean.setquestion(rs.getString("question_name"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
/**
 * Fetch data from "survey.question" to display. 
 * specific data to be displayed by comparing column "id" from the question table.
 * copy data from database table into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected question by comparing the id 
 */
    public UserBean getQuesById(int userId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM question WHERE id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userBean.setquestionID(rs.getInt("id"));
                userBean.setquestion(rs.getString("question_name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
/**
 * Fetch data from "survey.question_options" to display. 
 * specific data to be displayed by comparing column "question_id" from the question_options table.
 * copy data from database table "survey.question_options" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected question_options by comparing the id 
 */
    public UserBean getQuesOptionById(int userId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM question_options WHERE question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userBean.setquestionID(rs.getInt("question_id"));
                userBean.set_f_option(rs.getString("first_option"));
                userBean.set_s_option(rs.getString("second_option"));
                userBean.set_t_option(rs.getString("third_option"));
                userBean.set_fo_option(rs.getString("forth_option"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
/**
 * Insert column "section_name" into "survey.survey_sections" table. 
 * copy data from UserBean class "getter methods" and save into "survey.survey_sections.section_name" table.
 *         insert user selected data into the database.
 */	
    public void addSurvey(UserBean userBean) {
        try {
            String sql = "INSERT INTO survey_sections(section_name)"
                    + " VALUES (?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            //  ps.setInt(1, userBean.getsurveyID());
            ps.setString(1, userBean.getsurvey());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/**
 * Delete data from "survey.survey_sections" table.
 * use column "id" to specify "selected by user".    
 */	    
    public void removeSurvey(int userId) {
        try {
            String sql = "DELETE FROM survey_sections WHERE id=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/**
 * Update data from "survey.survey_sections" table.
 * Data will be updated against the specific selected survey.
 * Compared data with column "section_name" and "id".
 */    
    public void editSurvey(UserBean userBean) {
        try {
            String sql = "UPDATE survey_sections SET section_name=?"
                    + " WHERE id=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(1, userBean.getsurvey());
            ps.setInt(2, userBean.getsurveyID());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 * Fetch data from "survey.survey_sections" to display. 
 * copy data from database table into bean class variables by using setter method from the UserBean class
 * @return data in List.
 *         display all Survey column "survey.survey_sections" 
 */
    public List getAllsurvey() {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM survey_sections";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setsurveyID(rs.getInt("id"));
                userBean.setsurvey(rs.getString("section_name"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

/**
 * Fetch data from "survey.question" to display. 
 * specific data to be displayed by comparing column "survey_id" from the question table.
 * "survey.survey_id" is a foreign key in "survey.question" table
 * copy data from database table into bean class variables by using setter method from the UserBean class.
 * @return data in List.
 *         display selected "question" by comparing the "survey_id"
 */	
    public List getAllQuesBysurvey(int userID) {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM question WHERE survey_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setQues_SurID(rs.getInt("survey_id"));
                userBean.setquestionID(rs.getInt("id"));
                userBean.setQues_Survey(rs.getString("question_name"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
/**
 * Fetch data from "survey.question" to display. 
 * specific data to be displayed by comparing column "survey_id" from the question table.
 * "survey.question.survey_id" is a foreign key in "survey.question" table
 * copy data from database table into bean class variables by using setter method from the UserBean class.
 * @return data in List.
 *         display selected "question" by comparing the "survey_id" 
*/
    public List getOpt_dynamic(int userID) {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM question WHERE survey_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setQues_SurID(rs.getInt("survey_id"));
                userBean.setquestionID(rs.getInt("id"));
                userBean.setQues_Survey(rs.getString("question_name"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

/**
 * Fetch data from "survey.question_options" to display. 
 * specific data to be displayed by comparing column "question_id" from the question_options table.
 * "survey.question_options.question_id" is a foreign key in "survey.question_options" table
 * copy data from database table into bean class variables by using setter method from the UserBean class.
 * @return UserBean Object.
 *         display selected "question_options" by comparing the "question_id" 
*/    
    public UserBean getQuesOptionById_list(int userId) {
       UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM question_options WHERE question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                userBean.setquestionID(rs.getInt("question_id"));
                userBean.set_f_option(rs.getString("first_option"));
                userBean.set_s_option(rs.getString("second_option"));
                userBean.set_t_option(rs.getString("third_option"));
                userBean.set_fo_option(rs.getString("forth_option"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }


/**
 * Fetch data from "survey.survey_sections" to display. 
 * specific data to be displayed by comparing column "id" from the survey_sections table.
 * copy data from database table into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected survey by comparing the id 
 */    
    public UserBean getSurveyById(int userId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM survey_sections WHERE id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userBean.setsurveyID(rs.getInt("id"));
                userBean.setsurvey(rs.getString("section_name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
/**
 * Fetch data from "survey.question" to display. 
 * specific data to be displayed by comparing column "survey_id" from the question table.
 * copy data from database table "survey.question" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected question by comparing the id 
 */
    public UserBean getQuesBySurveyId(int userId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM question WHERE survey_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userBean.setQues_SurID(rs.getInt("survey_id"));
                userBean.setQues_Survey(rs.getString("question_name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }


/**
 * Insert "question_id & answer_numeric" into "survey.answers" table. 
 * question_id is the foreign key of "survey.answers".
 * one to many relationship between tables "survey.question" & "survey.answers".
 * copy data from UserBean class "getter methods" and save into "survey.question" table.
 *         insert user selected data into the database.
 */    
    public void addAnswer(UserBean userBean) {
        try {
            String sql = "INSERT INTO answers(question_id, answer_numeric)"
                    + " VALUES (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);


            ps.setInt(1, userBean.getquestionID());
            ps.setInt(2, userBean.getanswer());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 * Fetch data from "survey.answers" to display. 
 * copy data from database table into bean class variables by using setter method from the UserBean class
 * @return data in List
 *         display all questions column "survey.answers" 
 */
    public List getAllanswers() {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM answers";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setansID(rs.getInt("id"));
                userBean.set_ques_option_id(rs.getInt("question_option_id"));
                userBean.setanswer(rs.getInt("answer_numeric"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

/**
 * Fetch data from "survey.answers" to display. 
 * copy data from database table into bean class variables by using setter method from the UserBean class.
 * @return data in List.
 *         display all questions column "survey.answers". 
 */ 
    public List getAllansForGraph() {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM answers";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setansID(rs.getInt("id"));
                userBean.setanswer(rs.getInt("question_id"));
                userBean.set_ques_option_id(rs.getInt("answer_numeric"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

/**
 * Fetch data from "survey.answers" to display. 
 * specific data to be displayed by comparing column "question_id" from the answers table.
 * copy data from database table "survey.answers" into bean class variables by using setter method from the UserBean class
 * @return List
 *         display selected answers by comparing the question_id 
 */   
    public List getGraphbyQuesID(int userID) {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM answers WHERE question_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setquestionID(rs.getInt("question_id"));
                userBean.set_ques_graph_answer_numeric(rs.getInt("answer_numeric"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

/**
 * Fetch data from "survey.answers" to display. 
 * specific data to be displayed by comparing column "question_id" and "answer_numeric" from the answers table.
 * count total numbers of data entries and return the result for Graph display "graph_display.jsp"
 * copy data from database table "survey.answers" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected answers by comparing the question_id and answer_numeric
 */ 
    public UserBean data_pieChart_option1(int UserId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT COUNT(*) as count FROM answers where answer_numeric=1 && question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, UserId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                //  userBean.setquestionID(rs.getInt("question_id"));
                userBean.setpie_graph1(rs.getInt("count"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }

/**
 * Fetch data from "survey.answers" to display. 
 * specific data to be displayed by comparing column "question_id" and "answer_numeric" from the answers table.
 * count total numbers of data entries and return the result for Graph display "graph_display.jsp"
 * copy data from database table "survey.answers" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected answers by comparing the question_id and answer_numeric
*/
    public UserBean data_pieChart_option2(int UserId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT COUNT(*) as count FROM answers where answer_numeric=2 && question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, UserId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                //  userBean.setquestionID(rs.getInt("question_id"));
                userBean.setpie_graph2(rs.getInt("count"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }

/**
 * Fetch data from "survey.answers" to display. 
 * specific data to be displayed by comparing column "question_id" and "answer_numeric" from the answers table.
 * count total numbers of data entries and return the result for Graph display "graph_display.jsp"
 * copy data from database table "survey.answers" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected answers by comparing the question_id and answer_numeric
 */   
    public UserBean data_pieChart_option3(int UserId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT COUNT(*) as count FROM answers where answer_numeric=3 && question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, UserId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                //  userBean.setquestionID(rs.getInt("question_id"));
                userBean.setpie_graph3(rs.getInt("count"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }

/**
 * Fetch data from "survey.answers" to display. 
 * specific data to be displayed by comparing column "question_id" and "answer_numeric" from the answers table.
 * count total numbers of data entries and return the result for Graph display "graph_display.jsp"
 * copy data from database table "survey.answers" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean class
 *         display selected answers by comparing the question_id and answer_numeric
 */    
       public UserBean data_pieChart_option4(int UserId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT COUNT(*) as count FROM answers where answer_numeric=4 && question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, UserId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                //  userBean.setquestionID(rs.getInt("question_id"));
                userBean.setpie_graph4(rs.getInt("count"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
/**
 * Fetch data from "survey.answers" to display. 
 * specific data to be displayed by comparing column "question_id" from the answers table.
 * copy data from database table "survey.answers" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean.
 *         display selected answers by comparing the question_id 
 */
    public UserBean getAllGraphbyQuesId(int userId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM answers WHERE question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userBean.setGraph_QuesID(rs.getInt("question_id"));
                userBean.set_ques_graph_answer_numeric(rs.getInt("answer_numeric"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }

/**
 * Fetch data from "survey.answers" to display. 
 * specific data to be displayed by comparing column "question_id" from the answers table.
 * copy data from database table "survey.answers" into bean class variables by using setter method from the UserBean class
 * @return object of UserBean.
 *         display selected answers by comparing the question_id 
 */
    public UserBean getAllansByQuesID(int userId) {
        UserBean userBean = new UserBean();
        try {
            String sql = "SELECT * FROM answers WHERE question_id=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userBean.set_ques_graph_answer_numeric(rs.getInt("answer_numeric"));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
    ////////  For Testing ONLY   //////////////////////////////////////////////////////////////////   

    public List getAllansForGraph_test() {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM answers";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setansID(rs.getInt("id"));
                userBean.setanswer(rs.getInt("question_id"));
                userBean.set_ques_option_id(rs.getInt("answer_numeric"));
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}