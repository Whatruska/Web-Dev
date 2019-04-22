package servlets;

import entities.User;
import interfaces.UserRepository;
import repositories.SingletonUserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User(login,password, LocalDate.now());
        UserRepository userRepository = SingletonUserRepository.getInstance();
        User userFromRepo = userRepository.findByUsername(login);

        if (user.getPassword().equals(userFromRepo.getPassword())){
            HttpSession session = req.getSession();
            session.setAttribute("username",login);
            req.getServletContext().getRequestDispatcher("/home.jsp").forward(req,resp);
        } else {
            req.getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
