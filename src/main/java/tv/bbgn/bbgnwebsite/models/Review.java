package tv.bbgn.bbgnwebsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	private String reviewTitle;
	private String reviewAuthor;
	private String gameBeingReviewed;
	
	@Lob
	private String reviewArticle;
	
	public Review() {}
	
	public Review(String reviewTitle, String reviewAuthor, String gameBeingReviewed, String reviewArticle) {
		
		this.reviewTitle = reviewTitle;
		this.reviewAuthor = reviewAuthor;
		this.gameBeingReviewed = gameBeingReviewed;
		this.reviewArticle = reviewArticle;
		
	}

	public Long getId() {
		return id;
	}

	public String getReviewAuthor() {
		return reviewAuthor;
	}

	public String getReviewArticle() {
		return reviewArticle;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", reviewTitle=" + reviewTitle + ", reviewAuthor=" + reviewAuthor
				+ ", gameBeingReviewed=" + gameBeingReviewed + ", reviewArticle=" + reviewArticle + "]";
	}

	public String getReviewTitle() {
		return reviewTitle;
	}



	public String getGameBeingReviewed() {
		return gameBeingReviewed;
	}
	
	

}
