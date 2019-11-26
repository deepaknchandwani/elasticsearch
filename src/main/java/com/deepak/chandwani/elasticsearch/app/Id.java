package com.deepak.chandwani.elasticsearch.app;

 
 

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"kind",
"channelId",
"videoId"
})
public class Id {

@JsonProperty("kind")
private String kind;
@JsonProperty("channelId")
private String channelId;
@JsonProperty("videoId")
private String videoId;
 
@JsonProperty("kind")
public String getKind() {
return kind;
}

@JsonProperty("kind")
public void setKind(String kind) {
this.kind = kind;
}

@JsonProperty("channelId")
public String getChannelId() {
return channelId;
}

@JsonProperty("channelId")
public void setChannelId(String channelId) {
this.channelId = channelId;
}

@JsonProperty("videoId")
public String getVideoId() {
return videoId;
}

@JsonProperty("videoId")
public void setVideoId(String videoId) {
this.videoId = videoId;
}

 

}
 
 