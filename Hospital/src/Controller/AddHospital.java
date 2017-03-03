package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DAO.HospitalDAO;
import Models.Hospital;

@Controller
public class AddHospital {

	@Autowired
	HospitalDAO hosDAO;
	
/*	@SuppressWarnings("null")
	@RequestMapping(value="/AddPage" , method = RequestMethod.GET)
	public String AddPage(ModelMap model) {
		 model.addAttribute("title", "Show Page for Student");
		 return "AddPage";
	}*/
	@SuppressWarnings("null")
	@RequestMapping(value="/AddPage" , method = RequestMethod.POST)
	public void AddPageSave(ModelMap model, HttpServletRequest req) {
		   String Code = req.getParameter("code");
		   String HospitalName = req.getParameter("HospitalName");
		   String AdminName = req.getParameter("AdminName");
		   String PhoneNumber = req.getParameter("PhoneNumber");
		   String KindHospital = req.getParameter("KindHospital");
		   String Address = req.getParameter("Address");
		   
	Hospital hosp = new Hospital();
	
	hosp.setCode(Integer.parseInt(Code));
	hosp.setHospitalName(HospitalName);
	hosp.setAdminName(AdminName);
	hosp.setPhoneNumber(PhoneNumber);
	hosp.setKindHospital(KindHospital);
	hosp.setAddress(Address);
	
	hosDAO.insert(hosp);

	}
}
