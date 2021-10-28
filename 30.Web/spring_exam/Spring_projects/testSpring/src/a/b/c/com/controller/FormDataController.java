package a.b.c.com.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.vo.FormDataVO;

@Controller
public class FormDataController {
	
	@RequestMapping(value="formdata_find", method=RequestMethod.GET)
	public String formdata() {
		/*
			�ϱ� ���� ��� �� ���ʿ� '/'�� ������ ������ 
			spring-servlet.xml ���� �� ȯ�漳������ ���� ��ο� �̹� �����صξ��� �����̴�. 
			<property name="prefix" value="/WEB-INF/view/" />
		*/
		return "mvc/formdata_return";
	}
	
	@RequestMapping(value="formdata_get_servlet", method=RequestMethod.GET)
	public String formdata_get(HttpServletRequest req, Model m) {

		String datanum = req.getParameter("datanum");
		System.out.println("FormDataController.formdata_get���� ���� �α� : datanum : " + datanum);
		String dataid = req.getParameter("dataid");
		System.out.println("FormDataController.formdata_get���� ���� �α� : dataid : " + dataid);
		String datapw = req.getParameter("datapw");
		System.out.println("FormDataController.formdata_get���� ���� �α� : datapw : " + datapw);
		String dataname = req.getParameter("dataname");
		System.out.println("FormDataController.formdata_get���� ���� �α� : dataname : " + dataname);		
		
		m.addAttribute("model_datanum", datanum);
		m.addAttribute("model_dataid", dataid);
		m.addAttribute("model_datapw", datapw);
		m.addAttribute("model_dataname", dataname);
		
		req.setAttribute("request_datanum", datanum);
		req.setAttribute("request_dataid", dataid);
		req.setAttribute("request_datapw", datapw);
		req.setAttribute("request_dataname", dataname);
		
		return "mvc/formdata_get_servlet";
	}
	
	@RequestMapping(value="formdata_get_spring_servlet", method=RequestMethod.GET)
	public String formdata_get_spring(HttpServletRequest req, Model m) {

		String datanum = req.getParameter("datanum");
		System.out.println("FormDataController.formdata_get_spring���� ���� �α� : datanum : " + datanum);
		String dataid = req.getParameter("dataid");
		System.out.println("FormDataController.formdata_get_spring���� ���� �α� : dataid : " + dataid);
		String datapw = req.getParameter("datapw");
		System.out.println("FormDataController.formdata_get_spring���� ���� �α� : datapw : " + datapw);
		String dataname = req.getParameter("dataname");
		System.out.println("FormDataController.formdata_get_spring���� ���� �α� : dataname : " + dataname);		
		
		m.addAttribute("model_datanum", datanum);
		m.addAttribute("model_dataid", dataid);
		m.addAttribute("model_datapw", datapw);
		m.addAttribute("model_dataname", dataname);
		
		req.setAttribute("request_datanum", datanum);
		req.setAttribute("request_dataid", dataid);
		req.setAttribute("request_datapw", datapw);
		req.setAttribute("request_dataname", dataname);

		
		return "mvc/formdata_get_spring_servlet";
	}
	
	@RequestMapping(value="formdata_post_spring_servlet", method=RequestMethod.POST)
	public String formdata_post_spring(HttpServletRequest req, Model m) {

		String datanum = req.getParameter("datanum");
		System.out.println("FormDataController.formdata_post_spring���� ���� �α� : datanum : " + datanum);
		String dataid = req.getParameter("dataid");
		System.out.println("FormDataController���� ���� �α� : dataid : " + dataid);
		String datapw = req.getParameter("datapw");
		System.out.println("FormDataController���� ���� �α� : datapw : " + datapw);
		String dataname = req.getParameter("dataname");
		System.out.println("FormDataController���� ���� �α� : dataname : " + dataname);		
		
		m.addAttribute("model_datanum", datanum);
		m.addAttribute("model_dataid", dataid);
		m.addAttribute("model_datapw", datapw);
		m.addAttribute("model_dataname", dataname);
		
		req.setAttribute("request_datanum", datanum);
		req.setAttribute("request_dataid", dataid);
		req.setAttribute("request_datapw", datapw);
		req.setAttribute("request_dataname", dataname);
		
		return "mvc/formdata_post_spring_servlet";
	}
	
	@RequestMapping(value="formdata_post_spring111_servlet", method=RequestMethod.POST)
	public String formdata_post_spring111(HttpServletRequest req, Model m) {

		String datanum = req.getParameter("datanum");
		System.out.println("FormDataController.formdata_post_spring111���� ���� �α� : datanum : " + datanum);
		String dataid = req.getParameter("dataid");
		System.out.println("FormDataController.formdata_post_spring111���� ���� �α� : dataid : " + dataid);
		String datapw = req.getParameter("datapw");
		System.out.println("FormDataController.formdata_post_spring111���� ���� �α� : datapw : " + datapw);
		String dataname = req.getParameter("dataname");
		System.out.println("FormDataController.formdata_post_spring111���� ���� �α� : dataname : " + dataname);		
		
		m.addAttribute("model_datanum", datanum);
		m.addAttribute("model_dataid", dataid);
		m.addAttribute("model_datapw", datapw);
		m.addAttribute("model_dataname", dataname);
		
		req.setAttribute("request_datanum", datanum);
		req.setAttribute("request_dataid", dataid);
		req.setAttribute("request_datapw", datapw);
		req.setAttribute("request_dataname", dataname);
		
		return "mvc/formdata_post_spring111_servlet";
	}

	// Spring Web MVC ������� (��ü�� �̿��� ������ ����)
	@RequestMapping(value="formdata_get_spring", method=RequestMethod.GET)
	public String formdata_get_spring(FormDataVO fvo, Model m) {
		
		System.out.println("formdata_get_spring = fvo��ü�� ��ƿɴϴ�, fvo : " + fvo);
		System.out.println("formdata_get_spring = fvo��ü�� ��ƿɴϴ�, fvo.getDatanum : " + fvo.getDatanum());
		System.out.println("formdata_get_spring = fvo��ü�� ��ƿɴϴ�, fvo.getDataid : " + fvo.getDataid());
		System.out.println("formdata_get_spring = fvo��ü�� ��ƿɴϴ�, fvo.getDatapw : " + fvo.getDatapw());
		System.out.println("formdata_get_spring = fvo��ü�� ��ƿɴϴ�, fvo.getDataname : " + fvo.getDataname());
		
		m.addAttribute("m_fvo", fvo);
		
		
		return "mvc/formdata_get_spring_return";
	}
	
	
	// Spring @ModelAttribute
	@RequestMapping(value="formdata_post_spring", method=RequestMethod.POST)
	public String formdata_post_modelattribute(@ModelAttribute("ma_fdvo") FormDataVO fdvo) {
		
		System.out.println("formdata_post_modelattribute : fdvo : " + fdvo);
		System.out.println("formdata_post_modelattribute : fdvo.getDatanum() : " + fdvo.getDatanum());
		System.out.println("formdata_post_modelattribute : fdvo.getDataid() : " + fdvo.getDataid());
		System.out.println("formdata_post_modelattribute : fdvo.getDatapw() : " + fdvo.getDatapw());
		System.out.println("formdata_post_modelattribute : fdvo.getDataname() : " + fdvo.getDataname());
		
		return "mvc/formdata_post_spring_modelattribute_return";
	}
	
	
	@RequestMapping(value="formdata_post_valueobject", method=RequestMethod.POST)
	public String formdata_post_valueobject(FormDataVO fdvo) {
		
		System.out.println("formdata_post_modelattribute : fdvo : " + fdvo);
		System.out.println("formdata_post_modelattribute : fdvo.getDatanum() : " + fdvo.getDatanum());
		System.out.println("formdata_post_modelattribute : fdvo.getDataid() : " + fdvo.getDataid());
		System.out.println("formdata_post_modelattribute : fdvo.getDatapw() : " + fdvo.getDatapw());
		System.out.println("formdata_post_modelattribute : fdvo.getDataname() : " + fdvo.getDataname());
		
		return "mvc/formdata_post_valueobject";
	}
	

}