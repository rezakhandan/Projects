package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DAO.PazireshDAO;
import Models.PazireshModel;

@Controller
public class PazireshController {


	@Autowired
	PazireshDAO pdDAO;
	
/*	   @SuppressWarnings("null")
	   @RequestMapping(value="/PazireshPage" , method = RequestMethod.GET)
	   public String PazireshPage(ModelMap model) {
	      model.addAttribute("title", "Show Page for Student");
	     
	      return "PazireshPage";
	   }*/
	   
	   @SuppressWarnings("null")
	   @RequestMapping(value="/PazireshPage" , method = RequestMethod.POST)
	   public void PazireshPageSave(ModelMap model, HttpServletRequest req) {
		   String Name = req.getParameter("Name");
		   String Family = req.getParameter("Family");
		   String FName = req.getParameter("FatherName");
		   String MCode = req.getParameter("MCode");
		   String City = req.getParameter("City");
		   String MobileNumber = req.getParameter("MobileNumber");
		   String HomeNumber = req.getParameter("HomeNumber");
		   String IllnessKind = req.getParameter("IllnessKind");
		   String InsuranceKind = req.getParameter("InsuranceKind");
		   String Gender = req.getParameter("Gender");
		   String Address = req.getParameter("Address");
		   
		   PazireshModel Paziresh = new PazireshModel();
		   
		   Paziresh.setName(Name);
		   Paziresh.setFamily(Family);
		   Paziresh.setFName(FName);
		   Paziresh.setMCode(Integer.parseInt(MCode));
		   Paziresh.setCity(City);
		   Paziresh.setMobileNumber(MobileNumber);
		   Paziresh.setHomeNumber(HomeNumber);
		   Paziresh.setIllnessKind(IllnessKind);
		   Paziresh.setInsuranceKind(InsuranceKind);
		   Paziresh.setGender(Gender);
		   Paziresh.setAddress(Address);
		   
		   pdDAO.insert(Paziresh);
	   }
}
