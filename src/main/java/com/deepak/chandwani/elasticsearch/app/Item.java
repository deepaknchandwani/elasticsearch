package com.deepak.chandwani.elasticsearch.app;

 

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"kind",
"etag",
"id"
})
public class Item {

@JsonProperty("kind")
private String kind;
@JsonProperty("etag")
private String etag;
@JsonProperty("id")
private Id id;

 

@JsonProperty("kind")
public String getKind() {
return kind;
}

@JsonProperty("kind")
public void setKind(String kind) {
this.kind = kind;
}

@JsonProperty("etag")
public String getEtag() {
return etag;
}

@JsonProperty("etag")
public void setEtag(String etag) {
this.etag = etag;
}

@JsonProperty("id")
public Id getId() {
return id;
}

@JsonProperty("id")
public void setId(Id id) {
this.id = id;
}

 

}
