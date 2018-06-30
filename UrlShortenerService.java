package io.springbootstarter.urlShortener;




import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class UrlShortenerService {


	ConversionLogic conversion=new ConversionLogic();
	
	public void urlShortener(UrlShortener urlShortener)
	{
		 String projectUrl=conversion.shortenURL(urlShortener.getUrl());
		 String finalRouting=conversion.expandURL(projectUrl);
		 
		 //Finally to be routed to finalRouting URL 
		 
	}
	
}
