package a.b.c.com.emp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.emp.service.EmpService;
import a.b.c.com.emp.vo.EmpVO;

@Controller
public class EmpController{
	
	// �ΰ� ����
	private Logger logger = Logger.getLogger(EmpController.class);
	
	// ��Ʈ�ѷ����� ���񽺸� ����
	private EmpService empService;
	
	// ������ ����
	public EmpController(){
		
	}
	
	// empService�� �̿��� EmpController�� ȣ���� ��� 
	// ���� ����Ǿ��ִ� Service�� ����.
	@Autowired(required=false)
	public EmpController(EmpService empService){
		this.empService = empService;
	}
	
	// ��� ��ȸ ���(��) �Լ� ���� empSelectForm()
	// Request������ �ɼǿ� ���� ������̼� ����. 
	// GET������� "empSelectForm" ����� ����.
	@RequestMapping(value="empSelectForm", method=RequestMethod.GET)
	public String empSelectForm(@ModelAttribute EmpVO evo, Model model){
		logger.info("EmpController.empSelectForm() ����");
		return "emp/empSelectForm"; // ��θ� ��Ÿ���� ���ڿ��� �Ϻκ����� ����.
	}
	
	// ��ü ��ȸ �Լ� ���� empSelectAll()
	@RequestMapping(value="empSelectAll", method=RequestMethod.GET)
	public String empSelectAll(Model model){
		logger.info("EmpController.empSelectAll() ����");
		
		List<EmpVO> listAll = empService.empSelectAll(); // empService.empSelectAll() ���� �������� list�̴�.
		int nCnt = listAll.size(); // list�� ���� ī��Ʈ.
		logger.info("��ü��ȸ ��� ��(nCnt) : " + nCnt);
		
		// ��ü ��ȸ �� �����Ͱ� �����ϴ� ��쿡��
		if (nCnt > 0) {
			// �𵨿��ٰ� �Ӽ��� �߰����ֱ�
			model.addAttribute("listAll", listAll);
			return "emp/empSelectAll";
		}
		
		return "emp/empForm"; // ���ڿ��̴�!!
	}
	
	
	
	// ���� ��ȸ �Լ� ���� empSelectAll()
	@RequestMapping(value="empSelect", method=RequestMethod.GET)
	public String empSelect(@ModelAttribute EmpVO evo, Model model){
		// ���� ���� VO���� getter�� �̿��� ���õ� �����͸� �̾� ����غ���
		// �� 7���� ������ ��  empno, ename, hiredate�� ������ 4���� ���.
		// keyword(�˻���), searchFilter(�˻�����), 
		// startDate(�˻� �Ⱓ ������), endDate(�˻� �Ⱓ ������)
		logger.info("EmpController.empSelectAll() ����");
		logger.info("EmpController evo.getSearchFilter()�� �� : " + evo.getSearchFilter());
		logger.info("EmpController evo.getKeyword()�� ��  : " + evo.getKeyword());
		logger.info("EmpController evo.getStartDate()�� ��  : " + evo.getStartDate());
		logger.info("EmpController evo.getEndDate()�� ��  : " + evo.getEndDate());
		
		// ���� �˻��� ����� 'searchList' ������ �ʱ�ȭ.
		List<EmpVO> searchList = empService.empSelect(evo);
		int nCnt = searchList.size();
		logger.info("���� ��ȸ ��� �� : " + nCnt);
		
		// ���ǿ� �´� �����Ͱ� �ִ� ��쿡��
		if(nCnt > 0){
			model.addAttribute("searchList", searchList);
			return "emp/empSelect"; // ��� !!!
		}
		
		return "emp/empForm"; // ���ڿ��̴�!!
	}
	
}