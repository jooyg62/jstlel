package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iVal = 10;
		long lVal = 10;
		float fVal = 3.14f;
		boolean bVal = true;
		Object obj = null;
		
		request.setAttribute("iVal", iVal);
		request.setAttribute("lVal", lVal);
		request.setAttribute("fVal", fVal);
		request.setAttribute("bVal", bVal);
		request.setAttribute("obj", obj);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("iVal", iVal);
		map.put("lVal", lVal);
		map.put("fVal", fVal);
		map.put("bVal", bVal);
		request.setAttribute("map", map);
		
		// scope test
		
		UserVo vo = new UserVo();
		vo.setNo(10L);
		vo.setName("둘리");
		
		// request scope
		request.setAttribute("vo", vo);
		
		// session scope
		UserVo vo2 = new UserVo();
		vo2.setNo(20L);
		vo2.setName("마이콜");
		
		HttpSession session = request.getSession();
		session.setAttribute("vo", vo2);
		
		request.
		getRequestDispatcher("/WEB-INF/views/01.jsp").
		forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
