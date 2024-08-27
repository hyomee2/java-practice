package org.example.chap99_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static String name = "권형미";
    private static String pw = "password";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        StringBuilder sb = new StringBuilder();

        sb.append("<h1>로그인</h1>")
                .append("<form action=\"login\" method=\"post\">")
                .append("<label>사용자명: </label>")
                .append("<input type=\"text\" name=\"username\">")
                .append("<label>비밀번호: </label>")
                .append("<input type=\"password\" name=\"password\">")
                .append("<input type=\"submit\" value=\"로그인\">")
                .append("</form>");

        writer.print(sb);
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.getWriter().println("<html><body>");

        if (username.equals(name) && password.equals(pw)) {
            resp.getWriter().println("<h1>로그인 성공</h1>");
        } else {
            resp.getWriter().println("<h1>로그인 실패</h1>");
        }

        resp.getWriter().println("</body></html>");
    }
}
