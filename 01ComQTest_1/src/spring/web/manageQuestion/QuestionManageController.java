package spring.web.manageQuestion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.QuestionManageList;

@Controller
public class QuestionManageController {

	public QuestionManageController() {
		System.out.println("::: QuestionManageController default Constructor call...");
	}

	@RequestMapping("/questionManageView.do")
	public ModelAndView questionManageView() {

		System.out.println("[questionManageView() start...]");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/manager/question_manage.html");
//		modelAndView.addObject("message", message);

		System.out.println("[questionManageView() end...]\n");

		return modelAndView;
	}
	
	@RequestMapping("/addQuestionManage.do")
	public ModelAndView addQuestionManage(@ModelAttribute QuestionManageList qm) {

		System.out.println("[addQuestionManage() start...]");
		
		System.out.println(qm.getCuratingCode());
		
		for(int i = 0; i < qm.getQuestManageList().size(); i++) {
			System.out.println(qm.getQuestManageList().get(i).getQuestionText());
			for(int j = 0; j < qm.getQuestManageList().get(i).getAnswers().size(); j++) {
				System.out.println(qm.getQuestManageList().get(i).getAnswers().get(j).getAnswerText());
				System.out.println(qm.getQuestManageList().get(i).getAnswers().get(j).getAnswerKeyword());
			}
			System.out.println("=========================================");
			System.out.println();
		}
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/index.html");
//		modelAndView.addObject("message", message);

		System.out.println("[addQuestionManage() end...]\n");

		return modelAndView;
	}
}