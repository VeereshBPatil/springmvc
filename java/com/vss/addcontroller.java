package com.vss;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vss.serv.addserv;

@Controller
public class addcontroller 

{
	@RequestMapping("/adder")
	public ModelAndView add( @RequestParam("t1") int a,@RequestParam("t2") int b ,  HttpServletRequest req,HttpServletResponse res)
	{
	
		
		//int a=Integer.parseInt(req.getParameter("t1"));
		//int b=Integer.parseInt(req.getParameter("t2"));
		
		addserv as=new addserv();
		int c=as.adder(a,b);
		
	//	int c=a+b;
		
		//System.out.println(c);
		
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("res",c);
		
		
		
		
	return mv;
	} 
}
