package com.deepak.chandwani.elasticsearch.app; 

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"totalResults",
"resultsPerPage"
})
public class PageInfo {

@JsonProperty("totalResults")
private Integer totalResults;
@JsonProperty("resultsPerPage")
private Integer resultsPerPage;
 
@JsonProperty("totalResults")
public Integer getTotalResults() {
return totalResults;
}

@JsonProperty("totalResults")
public void setTotalResults(Integer totalResults) {
this.totalResults = totalResults;
}

@JsonProperty("resultsPerPage")
public Integer getResultsPerPage() {
return resultsPerPage;
}

@JsonProperty("resultsPerPage")
public void setResultsPerPage(Integer resultsPerPage) {
this.resultsPerPage = resultsPerPage;
}

 

}

