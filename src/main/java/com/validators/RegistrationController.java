package com.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.validators.entities.Registration;
import com.validators.repositories.RegistrationRepository;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationRepository Repo;
	
  @RequestMapping("/view")
  public String viewReg() {
	  return "view_reg";
  }
  @RequestMapping("/save")
  public String saveReg(@ModelAttribute("reg") Registration reg) {
	  try {
		  Repo.save(reg);
	} catch (Exception e) {
    System.out.println(e.getMessage());		
	}
	  return "view_reg";
  }
}
