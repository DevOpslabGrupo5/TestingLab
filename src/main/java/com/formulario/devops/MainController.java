package com.formulario.devops;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
public class MainController {
     
    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
         
        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);
         
        return "register_form";
    }
    
    private float impu;
    
    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
    	System.out.println(user);
    	
    	user.setDiezxciento(Util.getDxc(user.ahorro,user.sueldo));
    	user.setSaldo(user.ahorro-user.diezxciento);
    	
    	/*impu=Util.getDxc(user.ahorro,user.sueldo);*/
    	impu=Util.impuesto(user.sueldo);
    	user.setImpuesto(impu);
    	return "Register_success";
    }
     
}