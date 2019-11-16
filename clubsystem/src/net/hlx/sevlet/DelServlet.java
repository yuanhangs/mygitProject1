package net.hlx.sevlet;

import net.hlx.service.MembersinfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author HLX
 * @Date 2019/11/16 9:46
 */
@WebServlet(name = "DelServlet", urlPatterns = "/del")
public class DelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //业务对象
        MembersinfoService service =new MembersinfoService();
        //request data
        String strId=request.getParameter("id");
        int count=service.delete(Integer.parseInt(strId));

        //输出
        out.print(count);

        out.flush();
        out.close();

    }
}
