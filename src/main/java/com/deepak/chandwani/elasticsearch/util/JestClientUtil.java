package com.deepak.chandwani.elasticsearch.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.deepak.chandwani.elasticsearch.app.Example;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Bulk;
import io.searchbox.core.Index;
import io.searchbox.indices.CreateIndex;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class JestClientUtil {
	
	public static void main(String[] args) throws IOException {
		 JestClientFactory factory = new JestClientFactory();
		 factory.setHttpClientConfig(new HttpClientConfig
		                        .Builder("http://18.189.192.25:9200")
		                        .multiThreaded(true)
					//Per default this implementation will create no more than 2 concurrent connections per given route
					.defaultMaxTotalConnectionPerRoute(1)
					// and no more 20 connections in total
					.maxTotalConnection(1)
		                        .build());
		 JestClient client = factory.getObject();
		 client.execute(new CreateIndex.Builder("twitter").build());
		 System.out.println();
		 
		 PodamFactory podamFactory = new PodamFactoryImpl();
		 List<Index> listOfIndexes = new ArrayList<>();
		 
		 ObjectMapper objectMapper = new ObjectMapper();
 		 for (int i = 0; i < 1000; i++) {
			 Example myPojo = podamFactory.manufacturePojo(Example.class);
			 listOfIndexes.add(new Index.Builder(objectMapper.writeValueAsString(myPojo)).build());
		}	 
		 
		 
		Bulk bulk = new Bulk.Builder()
	                .defaultIndex("twitter")
	                .defaultType("tweet")
	                .addAction(listOfIndexes)
	                .build();

	client.execute(bulk);
	System.out.println();
		 
	}

}
