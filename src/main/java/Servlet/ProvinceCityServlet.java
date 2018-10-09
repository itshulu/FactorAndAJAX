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
@WebServlet(name = "ProvinceCityServlet", urlPatterns = "/ProvinceCityServlet")
public class ProvinceCityServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String province = request.getParameter("province");
        //通知AJAX异步对象，服务器响应的数据为xml格式的
        response.setContentType("text/xml;charset=UTF-8");
        //获取字符输出流
        PrintWriter pw = response.getWriter();
        pw.write("<?xml version='1.0' encoding='UTF-8'?>");
        pw.write("<root>");
        if ("广东".equals(province)) {
            pw.write("<city>广州</city>");
            pw.write("<city>深圳</city>");
            pw.write("<city>中山</city>");
        } else if ("湖南".equals(province)) {
            pw.write("<city>长沙</city>");
            pw.write("<city>株洲</city>");
            pw.write("<city>湘潭</city>");
            pw.write("<city>岳阳</city>");
        }
        pw.write("</root>");
        pw.flush();
        pw.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }
}
