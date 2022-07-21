package com.example.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.client.domain.Client;
import com.example.client.service.ClientService;

@RestController
public class ClientController {

	@Autowired
    private ClientService service;
 
    @GetMapping("/Shalini")
     public List<Client> ListAll(){
    	 return service.listAll();
    	 
     }
 
//    @GetMapping("/new")
//    public String add(Model model) {
//        model.addAttribute("client", new Client());
//        return "new";
//    }
// 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<String> saveClient(@RequestBody Client cl) {
        service.save(cl);
        
        String msg="success";
       
        return new ResponseEntity<String>(msg,HttpStatus.OK) ;
        
    }
    
    
    @PutMapping("/edit/{id}")
    	public Client showEditRolePage(@RequestBody Client newcl , @PathVariable(name="id") int id) {
    		Client cl = service.get(id);
    		cl.setClientname(newcl.getClientname());
    		service.save(cl);
    		return cl;
    	}
    	
    
    @RequestMapping(value= "/delete/{id}", method=RequestMethod.DELETE)
    public String deletestudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
	
	
	
}
