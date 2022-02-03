package example.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.CityDAO;
import example.CityDTO;

public class InsertCityAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("A : InsertCityAction_execute() 실행!");
		
		request.setCharacterEncoding("UTF-8");
		
		CityDTO cdto = new CityDTO();
		CityDAO cdao = new CityDAO();
		
		cdao.insertCity(cdto);
		System.out.println("A : 도시정보 저장 완료!");
		
		cdto = cdao.getCity(1);
		System.out.println("A : cityDTO 정보 들고오기 완료!");
		
		request.setAttribute("cdto", cdto);
		
		ActionForward forward = new ActionForward();
		forward.setPath("/InsertCity.tr");
		forward.setRedirect(false);
		
		return forward;
	}
	
}
