package tv.bbgn.bbgnwebsite.controllers;



import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import tv.bbgn.bbgnwebsite.NewsItem;
import tv.bbgn.bbgnwebsite.repositories.NewsItemsRepository;

@Controller
public class HomeController {

	@Resource
	NewsItemsRepository newsItems;
	
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("newsItems", newsItems.findAll());
		return "home";
	}
	
	
	@GetMapping("/create-news-item")
	public String newNewsPost(Model model) {
		model.addAttribute("newsItems", newsItems.findAll());
		return "create-news-item";
	}


	@PostMapping("/create-news-item")
	public String greetingSubmit(String headline, String content) {
		newsItems.save(new NewsItem(headline, content));
		return "redirect:/";
	}
}