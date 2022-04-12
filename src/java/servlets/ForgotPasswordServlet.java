
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.AccountService;


public class ForgotPasswordServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response); 
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String path = getServletContext().getRealPath("/WEB-INF");
        
        AccountService as = new AccountService();
        as.forgotPassword(email, path);
        
        
        HttpSession session = request.getSession();
        session.setAttribute("message", "If the address you entered is valid, you will receive an email very soon.");
        
        getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
        
    }


}
