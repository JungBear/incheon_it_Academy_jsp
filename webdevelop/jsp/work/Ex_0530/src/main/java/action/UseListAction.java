package action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.UserVO;

import java.io.IOException;
import java.util.List;

import dao.UserDAO;

/**
 * Servlet implementation class UseListAction
 */
@WebServlet("/user_list.do")
public class UseListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 회원목록 가져오기
		List<UserVO> list = UserDAO.getInstance().selectList();
		
		// 바인딩
		request.setAttribute("list", list);
		
		// 포워딩
		RequestDispatcher disp = request.getRequestDispatcher("user_list.jsp");
		disp.forward(request, response);
	}

}
