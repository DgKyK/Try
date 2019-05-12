package ua.alex.userlist;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserListServlet extends javax.servlet.http.HttpServlet {
    private Map<Integer, String> userList = new ConcurrentHashMap<>();
    private int counter = 3;
    {
        userList.put(1,"Alex");
        userList.put(2,"Dima");
        userList.put(3,"Vlad");
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter pr = response.getWriter();
        String name = request.getParameter("newUser");
        if (name != null && !name.equals("")) {
            counter++;
            userList.put(counter, name);
            pr.println("<b>Added new user : </b>" + name + "<br> <b>Id : " + counter + "</b>");

        } else {
            pr.println("Wrong input!! OR that user already exist");
        }
        pr.println("<a href=\"http://localhost:8087/UserListWEB/\">Main page</a>");


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String name;
        if(!userList.containsKey(id)) {
            name = "Not found!";
        } else {
            name = userList.get(id);

        }
        PrintWriter pr = response.getWriter();
        pr.println("<html>");
        pr.println("<b> Name : " + name + "</b><br><b> Id : " + id + "</b>");
        request.setAttribute("users", userList);
        request.getRequestDispatcher("View.jsp").forward(request,response);
        pr.println("<a href=\"http://localhost:8087/UserListWEB/\">Main page</a>");
        pr.println("<a href=\"http://localhost:8087/UserListWEB/View.jsp\">User list page</a>");

        pr.println("</html>");

    }

    public Map<Integer, String> getUserList() {
        return userList;
    }
}
