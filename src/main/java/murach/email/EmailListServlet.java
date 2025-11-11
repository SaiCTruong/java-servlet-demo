package murach.email;

import java.io.*;
import jakarta.servlet.*; 
import jakarta.servlet.http.*;

import murach.business.User; 


public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {


        String url = "/index.html";
        

        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; 
        }


        if (action.equals("join")) {
            url = "/index.html";
        } 

        else if (action.equals("add")) {
            
    
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
          
            User user = new User(firstName, lastName, email);

    
            String dateOfBirth = request.getParameter("dateOfBirth");
            String heardFrom = request.getParameter("form"); 
            String contactMethod = request.getParameter("contact");

    
            
            String wantsUpdates = request.getParameter("like");
            if (wantsUpdates == null) {
                wantsUpdates = "No"; 
            } else {
                wantsUpdates = "Yes";
            }
            
            String emailOK = request.getParameter("emailOK");
            if (emailOK == null) {
                emailOK = "No";
            } else {
                emailOK = "Yes";
            }

    
            request.setAttribute("user", user); 
            request.setAttribute("dateOfBirth", dateOfBirth); 
            request.setAttribute("form", heardFrom); 
            request.setAttribute("like", wantsUpdates);
            request.setAttribute("emailOK", emailOK); 
            request.setAttribute("contact", contactMethod);
            
            url = "/thanks.jsp";
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