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

/**
 * @Author HLX
 * @Date 2019/11/16 9:46
 */
@WebServlet(name = "FindServlet", urlPatterns = "/find")
public class FindServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //请求编码
        request.setCharacterEncoding("utf-8");

        //获得数据
        String strId = request.getParameter("id");
        int id = Integer.parseInt(strId);

        MembersinfoService service = new MembersinfoService();
        try {
            Membersinfo info = service.find(id);
            request.setAttribute("info", info);
            request.getRequestDispatcher("update.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }

        out.flush();
        out.close();

    }
}
