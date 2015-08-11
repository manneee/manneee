package spring.web.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {

	public QuestionController() {
		System.out.println("::: QuestionController default Constructor call...");
	}

	//권한 유무 확인 / navigation
	@RequestMapping("/questionView.do")
	public ModelAndView questionManageView() {

		System.out.println("[questionView() start...]");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/questionpage.html");
//		modelAndView.addObject("message", message);

		System.out.println("[questionView() end...]\n");

		return modelAndView;
	}
}