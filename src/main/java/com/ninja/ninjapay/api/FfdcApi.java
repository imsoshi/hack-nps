package com.ninja.ninjapay.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class FfdcApi {
	
	@Value("${ffdcapi.baseUrl}")
	private String baseUrl;

    @Autowired
    private RestTemplate restTemplate;
    
    
    public String getSchemeAPI() {
        UriComponents uriBuilder = UriComponentsBuilder
        		.fromUriString(baseUrl + "/payment/reference/clearing-schemes/v1/names")
        		.queryParam("currency", "EUR")
        		.queryParam("messageFormatType", "ISO")
        		.build();
//        return restTemplate.getForObject(uriBuilder.toUri(), String.class);
        
        return restTemplate.exchange(uriBuilder.toUri(), HttpMethod.GET, null, String.class).getBody();
    }
    
    /*
    public TradeCaptureStaticDataList getReferenceSourcesLegalEntities () {
        UriComponents uriBuilder = UriComponentsBuilder
                .fromUriString(baseUrl + "/capital-market/trade-capture/static-data/v1/reference-sources")
                .queryParam("applicableEntities", "legal-entities")
                .build();
        return restTemplate.exchange(uriBuilder.toUri(), HttpMethod.GET, null, TradeCaptureStaticDataList.class).getBody();
    }
    
    public Countries getCurrencyResources () {
        UriComponents uriBuilder = UriComponentsBuilder
                .fromUriString(baseUrl+"/referential/v1/countries")
                .build();
        return restTemplate.exchange(uriBuilder.toUri(), HttpMethod.GET, null, Countries.class).getBody();
    }
    */
    

}
