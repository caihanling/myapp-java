package chl.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import chl.demo.model.User;
import chl.demo.service.UserService;
import chl.demo.source.GetInterface;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Inject
	private UserService userService;
	
	GetInterface getInterface = new GetInterface();
	
	
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<User> getAllUser(HttpServletRequest request , HttpServletResponse response) throws IOException{
		//response.setCharacterEncoding("UTF-8");
		//response.setHeader("Access-Control-Allow-Origin", "*");
		
		//PrintWriter writer = response.getWriter();
		//Object result = getInterface.getData("http://192.168.6.145:81/foodstack/index.php/senty/senty/index/key/%E5%90%88%E8%82%A5");
		//System.err.println(result);
		//writer.print(result);
		
		return userService.getAllUsers();
		//return result;
	}
	
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<User> login(HttpServletResponse response , @RequestBody User user){
		
		System.err.println("运行到login");
		//response.setCharacterEncoding("UTF-8");
		//response.setHeader("Access-Control-Allow-Origin", "*");
		//response.setHeader("Access-Control-Allow-Methods","POST"); 
		
		//response.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");
		
		
		
	  //  response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	  //  response.setHeader("Access-Control-Max-Age", "3600");
	  //  response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		
		return userService.login(user);
	}

}
