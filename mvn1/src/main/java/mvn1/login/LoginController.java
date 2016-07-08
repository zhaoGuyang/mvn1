package mvn1.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/test/login.do")
	public String login(String username,String password){
		System.out.println("username:"+username+"\npassword:"+password);
		return "";
	}
}
