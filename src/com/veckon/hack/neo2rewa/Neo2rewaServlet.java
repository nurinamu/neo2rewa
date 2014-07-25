package com.veckon.hack.neo2rewa;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Neo2rewaServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("Hello, world");
    }
}
