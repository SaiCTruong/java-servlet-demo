package murach.email;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.User;
//import murach.data.UserDB;
public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="/index.html";
        //get current acction
        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; //default action
        }
        //perform action and set URL to approprivate page
        if (action.equals("join")) {
            url= "/index.html"; //the join page
        }
        else if (action.equals("add")) {
            //get parameter from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            
           
            User user = new User(firstName, lastName, email);
            //UserDB.insert(user);
            
            //set User object in request object and set URL
            request.setAttribute("user", user);
            url="/thanks.jsp";
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
        
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
        doPost(request, response);
    }
}