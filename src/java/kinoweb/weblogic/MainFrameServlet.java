/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinoweb.weblogic;

import java.io.IOException;
import kinoweb.logic.variables.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Дмитрий
 */
@WebServlet(name = "MainFrameServlet", urlPatterns = {"/main"})
public class MainFrameServlet extends HttpServlet{
    public MainFrameServlet() {
        super();
    }
    @Override
    public void init() throws ServletException {
    }
    
    @Override
    protected void doPost (HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        
        request.getRequestDispatcher("html/index.html").forward(request, response);
    }
    
    
    @Override
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
    }
}
