package com.timoponce.mobile

import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.annotation.WebServlet

@WebServlet(urlPatterns = Array("/hello2"))
class HelloServlet extends HttpServlet {

  override def doGet(request : HttpServletRequest,response : HttpServletResponse ) {

        val html = "<html><body><h1>Hello World 2 </h1></body></html>"
        response.getOutputStream().println(html)
    }
}