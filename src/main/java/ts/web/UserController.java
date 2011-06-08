package ts.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ts.domain.User;
import ts.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping ("/index")
	public String listUsers(Map <String, Object> map){
		
		map.put("user", new User());
		map.put("userList", userService.listUser());
		return "user";
	}
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String createUser(@ModelAttribute("user") User user,
			BindingResult result) {

		userService.createUser(user);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@ModelAttribute("user") User user) {

		userService.deleteUser(user);

		return "redirect:/index";
	}
	

}
