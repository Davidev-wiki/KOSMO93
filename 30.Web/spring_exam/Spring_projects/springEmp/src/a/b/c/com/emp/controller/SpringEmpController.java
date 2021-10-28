package a.b.c.com.emp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.emp.service.SpringEmpService;
import a.b.c.com.emp.vo.SpringEmpVO;

@Controller
public class SpringEmpController {
	private Logger logger = Logger.getLogger(SpringEmpController.class);
	
	// ��Ʈ�ѷ����� ���� ���� 
	private SpringEmpService springEmpService;
		
	// �����ڿ� @Autowired ������̼�����  DI (������ �����ϱ�)
	@Autowired(required=false)
	public SpringEmpController(SpringEmpService springEmpService) {
		this.springEmpService = springEmpService;
	}
	
	// springEmpSelectAll : ��ü ��ȸ ������
	// ���񽺸� ȣ���� ��ü ��ȸ ����� �޾ƿ� List<SpringEmpVO> Ÿ������ ������ ��
	// 'listAll'�̶�� �̸����� Model�� ����, emp/springEmpSelectAll.jsp�� �����Ѵ�.
	// �Ű����� : Model ��ü
	@RequestMapping(value="springEmpSelectAll", method=RequestMethod.GET)
	public String springEmpSelectAll(Model model) {
		logger.info("SpringEmpController springEmpSelectAll() �Լ� ���� >>> : ");
		
		List<SpringEmpVO> listAll = springEmpService.springEmpSelectAll();
		int nCnt = listAll.size();
		logger.info("������ �������� ���� nCnt >>> : " + nCnt);
		
		if (nCnt > 0) {
			model.addAttribute("listAll", listAll);
			return "emp/springEmpSelectAll";
		}
		
		return "emp/springEmpForm";
	}
	
	// springEmpSelectForm : ������ ���� ��� ����,
	// �����͸� ������ ���� ��ȸ �������� �̵��ϱ� ���� �Ű������� �����صξ���.
	// �Ű����� : SpringEmpVO ��ü, Model ��ü
	// @ModelAttribute ��� : 
	@RequestMapping(value="springEmpSelectForm", method=RequestMethod.GET)
	public String springEmpSelectForm(@ModelAttribute SpringEmpVO evo, Model model) {
		
		logger.info("SpringEmpController.springEmpSelectForm() ����");
		
		return "emp/springEmpSelectForm";
	}
	
	// springEmpSelect : ��ȸ ��� ������
	// �Ű����� : SpringEmpVO ��ü, Model ��ü
	// @ModelAttribute ��� : 
	// �����͸� ������ ������ ��ȸ ��� ��������, 
	// �����͸� ������ ���� ���ϸ� �ٽ� ��� ���� ��ȸ �������� �̵�.
	@RequestMapping(value="springEmpSelect", method=RequestMethod.GET)
	public String springEmpSelect(@ModelAttribute SpringEmpVO evo, Model model ) {
		
		logger.info("SpringEmpController.springEmpSelectForm() ����");
		logger.info("SpringEmpController. evo.getSearchFilter() : " + evo.getSearchFilter());
		logger.info("SpringEmpController. evo.getKeyword() : " + evo.getKeyword());
		logger.info("SpringEmpController. evo.getStartDate() : " + evo.getStartDate());
		logger.info("SpringEmpController. evo.getEndDate() : " + evo.getEndDate());

		List<SpringEmpVO> searchList = springEmpService.springEmpSelect(evo);
		int nCnt = searchList.size();
		logger.info("������ �������� ���� nCnt >>> : " + nCnt);
		if(nCnt > 0) {
			model.addAttribute("searchList", searchList);
			return "emp/springEmpSelect";
		}
		return "emp/springEmpSelectForm";
	}
	
	// springEmpInsertFom : ��� ��� ������
	// �Ű����� : Model ��ü
	@RequestMapping(value="springEmpInsertForm", method=RequestMethod.GET)
	public String springEmpInsertForm(Model model) {
		logger.info("SpringEmpController.springEmpInsertForm() ����");

		return "emp/springEmpInsertForm";
	}
	// springEmpInsert : �� ������
	// �Ű����� : SpringEmpVO ��ü, Model ��ü
	// �����͸� ������ ������ �� ��������, 
	// �����͸� ������ ���� ���ϸ� �ٽ� ��� ��� �������� �̵�.
	@RequestMapping(value="springEmpInsert", method=RequestMethod.GET)
	public String springEmpInsert(SpringEmpVO evo, Model model) {
		logger.info("SpringEmpController.springEmpInsert() ����");
		logger.info("SpringEmpController.springEmpInsert evo.getEmpno()" + evo.getEmpno());
		logger.info("SpringEmpController.springEmpInsert evo.getEname()" + evo.getEname());
		logger.info("SpringEmpController.springEmpInsert evo.getHiredate()" + evo.getHiredate());
		
		int insertCnt = springEmpService.springEmpInsert(evo);
		
		if(insertCnt > 0) {
			logger.info("������ �������� ���� insertCnt >>> : " + insertCnt);

			model.addAttribute("insertCnt", insertCnt);
			return "emp/springEmpInsert";
		}
		
		return "emp/springEmpForm";
	}
	
	// springEmpUpdateForm : ��� ���� ������
	// �Ű����� : Model ��ü
	@RequestMapping(value="springEmpUpdateForm", method=RequestMethod.GET)
	public String springEmpUpdateForm(Model model) {
		logger.info("SpringEmpController.springEmpUpdateForm() ����");
		
		return "emp/springEmpUpdateForm";
	}
	
	// springEmpUpdate : �� ������
	// �Ű����� : SpringEmpVO ��ü, Model��ü
	// @ModelAttribute ��� : 
	// �����͸� ������ ������ �� ��������, 
	// �����͸� ������ ���� ���ϸ� �ٽ� ��� ���� �������� �̵�.
	@RequestMapping(value="springEmpUpdate", method=RequestMethod.GET)
	public String springEmpUpdate(@ModelAttribute SpringEmpVO evo, Model model) {
		logger.info("SpringEmpController.springEmpUpdate() ����");
		logger.info("SpringEmpController.springEmpUpdate evo.getEmpno()" + evo.getEmpno());
		logger.info("SpringEmpController.springEmpUpdate evo.getEname()" + evo.getEname());
		logger.info("SpringEmpController.springEmpUpdate evo.getHiredate()" + evo.getHiredate());
		
		int updateCnt = springEmpService.springEmpUpdate(evo);
		
		if(updateCnt > 0) {
			logger.info("������ �������� ���� updateCnt >>> : " + updateCnt);
			model.addAttribute("updateCnt", updateCnt);
			return "emp/springEmpUpdate";
		}
		
		return "emp/springEmpForm";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}