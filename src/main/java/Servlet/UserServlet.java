package Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 舒露
 */
@WebServlet(name = "UserServlet", urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String tip="images/MsgSent.gif";
        if("杰克".equals(username)){
            tip="images/MsgError.gif";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter=response.getWriter();
        printWriter.write(tip);
        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        byte[] buf = username.getBytes("ISO8859-1");
        username=new String(buf,"UTF-8");
        System.out.println(username);
        String tip="可以注册";
        if("杰克".equals(username)){
            tip="用户名已注册";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter=response.getWriter();
        printWriter.write(tip);
        printWriter.flush();
        printWriter.close();
    }
}
