package io.springbootstarter.urlShortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlShortenerController {
	
	@Autowired
	private UrlShortenerService urlService;
	
	@RequestMapping(method=RequestMethod.POST,value="/urlShortener")
	public void urlShortener(@RequestBody UrlShortener urlSr)
	{
		urlService.urlShortener(urlSr);
	}
	
}
