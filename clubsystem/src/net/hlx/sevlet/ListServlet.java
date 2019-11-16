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
        //设置编码必须在第一行哦!!
        response.setContentType("text/html;charset=UTF-8");
        //输出对象
        PrintWriter out = response.getWriter();

        //业务对象
        MembersinfoService service =new MembersinfoService();

        //request encoding
        request.setCharacterEncoding("utf-8");

        //request data
        String strId=request.getParameter("id");
        String name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String age=request.getParameter("age");
        String address=request.getParameter("address");
        String email=request.getParameter("email");

        //封装对象
        Membersinfo info =new Membersinfo(Integer.parseInt(strId),name,gender,Integer.parseInt(age),address,email);

        System.out.println("info==>"+info);

        int tag=0;
        int count = service.update(info);
        //判断标记
        if(count>0){
            tag=1;
        }else{
            tag=0;
        }
        response.sendRedirect("all?flag="+tag);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码必须在第一行哦!!
        response.setContentType("text/html;charset=UTF-8");
        //输出对象
        PrintWriter out = response.getWriter();

        //业务对象
        MembersinfoService service =new MembersinfoService();
        List<Membersinfo> lists = null;
        try {
            lists = service.list();
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        System.out.println(lists.get(0));

        //保存
        request.setAttribute("list",lists);
        //标识修改
        request.setAttribute("flag",request.getParameter("flag"));
        request.getRequestDispatcher("list.jsp").forward(request,response);


        out.flush();
        out.close();
    }
}
