package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DAO.LoginDAO;
import Models.LoginModel;


@Controller
public class LoginController {
	
	
	@Autowired
	LoginDAO logDAO;
	
   @SuppressWarnings("null")
   @RequestMapping(value="/LoginPage" , method = RequestMethod.GET)
   public String loginR(ModelMap model) {
      model.addAttribute("title", "Show Page for Student");
     
      return "LoginPage";
   }
   @SuppressWarnings("null")
   @RequestMapping(value="/LoginPage" , method = RequestMethod.POST)
   public String LoginSave(ModelMap model, HttpServletRequest req) {
	   String UserName = req.getParameter("UserName");
	   String Password = req.getParameter("Password");
	   LoginModel lm = logDAO.getone(UserName, Password);
	   
	   if(lm.getId() != 0)
		   return "AddPage";
	   else
		   return "LoginPage";
   }
}
