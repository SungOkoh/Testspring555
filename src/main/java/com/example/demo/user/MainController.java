package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	
	@RequestMapping("user")
	public ModelAndView listMap() {
		ModelAndView mav = new ModelAndView();
		List<UserVO> userList = userService.getUserName();
		for (UserVO u : userList) {
			System.out.println(u.getUserName());;
		}
		mav.addObject("list", userList);
		mav.setViewName("userList");
		return mav;
	}
	@RequestMapping("/") public String mainPage() {
		return "index";
	}
	@PostMapping("/user")
	public String userAdd(UserVO userVO) {
		userService.insertName(userVO);
		return "redirect:/user";
	}
	
	/*
	 * @Autowired UserDAO userDAO;
	 * 
	 * @GetMapping("/") public String mainPage() { return "index"; }
	 */
	/*
	 * @PostMapping("/user") public String userAdd(UserVO userVO) {
	 * System.out.println(userVO); userDAO.insert(userVO); return "redirect:/user";
	 * }
	 */
	
	/*
	 * @GetMapping("/user") public String userList(ModelAndView mav) {
	 * mav.addObject("users", userDAO.listForBeanPropertyRowMapper()); return
	 * "userList"; }
	 */
	
	/*
	 * @RequestMapping(value="/user", method = RequestMethod.GET) public
	 * ModelAndView userList() { ModelAndView mav = new ModelAndView();
	 * mav.setViewName("userList"); mav.addObject("users",
	 * userDAO.listForBeanPropertyRowMapper()); return mav; }
	 */
}

