package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMessageService;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService service;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHome() {
		return "home";
	}
	
	@RequestMapping(value="/wish",method=RequestMethod.GET)
	public ModelAndView showWishMessage() {
		String message=service.generateWishMessage();
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg",message);
		mav.setViewName("display");
		return mav;
	}
	
}
