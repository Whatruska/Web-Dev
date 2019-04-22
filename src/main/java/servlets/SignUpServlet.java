package servlets;

import entities.User;
import repositories.SingletonUserRepository;
import interfaces.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/sign_up")
public class SignUpServlet extends HttpServlet {
    private UserRepository userRepository = SingletonUserRepository.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = userRepository.getUsers();
        request.setAttribute("users", users);
        request.getServletContext().getRequestDispatcher("/signUp.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        LocalDate birthday = LocalDate.parse(req.getParameter("birthday"));

        User user = new User(username,password,birthday);

        userRepository.save(user);

        doGet(req, resp);
    }
}
