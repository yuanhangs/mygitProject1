package net.hlx.sevlet;

import net.hlx.entity.Membersinfo;
import net.hlx.service.MembersinfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Repeatable;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author HLX
 * @Date 2019/11/15 16:24
 */
@WebServlet(name = "ListServlet",urlPatterns = "/all")
public class ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        //业务对象
        MembersinfoService service =new MembersinfoService();
        List<Membersinfo> lists = null;
        try {
            lists = service.list();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //保存
        request.setAttribute("list",lists);
        request.getRequestDispatcher("list.jsp").forward(request,response);

        out.flush();
        out.close();
    }
}
