package tv.bbgn.bbgnwebsite.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tv.bbgn.bbgnwebsite.models.Review;
import tv.bbgn.bbgnwebsite.repositories.ReviewsRepository;

@Controller
@RequestMapping("/reviews")
public class ReviewsController {

	@Resource
	ReviewsRepository reviewsRepo;
	
	
	@RequestMapping("")
		public String reviewsLandingPage(Model model) {
		model.addAttribute("reviews", reviewsRepo.findAll());
		return "reviews";
	}
	
@GetMapping("/{id}")
		public String getReview(@PathVariable Long id, Model model) {
		model.addAttribute("review", reviewsRepo.findById(id).get());
		return "reviewarticle";
}
	
	@GetMapping("/write-review")
		public String reviewToWrite(Model model) {
		model.addAttribute("reviews", reviewsRepo.findAll());
		return "write-review";
	}
		
		
	@PostMapping("/write-review")
	public String reviewToSave
			   (String reviewTitle, 
				String reviewAuthor, 
				String gameBeingReviewed, 
				String reviewArticle) {
		
		reviewsRepo.save(new Review(reviewTitle, reviewAuthor, gameBeingReviewed, reviewArticle));
		return "redirect:/reviews";
	
}



}
