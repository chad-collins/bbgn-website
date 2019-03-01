package tv.bbgn.bbgnwebsite.controllers;



import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tv.bbgn.bbgnwebsite.models.NewsItem;
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
	
	
	@GetMapping("/add-news")
	public String newNewsPost(Model model) {
		model.addAttribute("newsItems", newsItems.findAll());
		return "add-news";
	}


	@PostMapping("/add-news")
	public String greetingSubmit(String headline, String content) {
		newsItems.save(new NewsItem(headline, content));
		return "redirect:/";
	}
}