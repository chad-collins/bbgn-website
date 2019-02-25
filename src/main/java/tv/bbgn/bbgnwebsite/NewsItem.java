package tv.bbgn.bbgnwebsite;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class NewsItem {

	@Id
	@GeneratedValue
	private Long id;
	private String headline;
	
	@Lob
	private String content;
	
	
	public NewsItem() {}
	
	public NewsItem(String headline, String content) {
		this.headline = headline;
		this.content = content;
		
	}
	

	public String getHeadline() {
		return headline;
	}
	
	public String getContent() {
		return content;
	}
	
}
