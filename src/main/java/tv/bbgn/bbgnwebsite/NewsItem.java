package tv.bbgn.bbgnwebsite;



import java.util.Date;

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
	private String pubDate;
	
	@Lob
	private String content;
	
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;
	
	public NewsItem() {}
	
	public NewsItem(String pubDate, String headline, String content) {
		this.pubDate = pubDate;
		this.headline = headline;
		this.content = content;
		
	}
	

	public String getHeadline() {
		return headline;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getPubDate(){
		pubDate = creationDateTime.toString();
		return pubDate;
	}
}
