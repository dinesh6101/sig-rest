package com.sig.team.webworks.rest.resources;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.http.HttpStatus;

import com.sig.team.webworks.rest.RestResource;

public abstract class AsyncRestResource implements RestResource {

	private static final long serialVersionUID = 8544297469005067448L;
	
	public static final String STATUS_WAITING = "WAITING"; //Protocol Status + Cache Status
	public static final String STATUS_RECEIVED = "RECEIVED";//Protocol Status + Cache Status
	public static final String STATUS_FAILED = "FAILED";////Protocol Status (rare, when not to re initiate) + Cache Status
	
	public static final String STATUS_INITIATED = "INITIATED";//Protocol Status
	public static final String STATUS_EXPIRED = "EXPIRED";//Protocol Status (rare, when not to re initiate)
	public static final String STATUS_EXPIRED_INITIATED = "EXPIRED_INITIATED";//Protocol Status
	public static final String STATUS_EXPIRED_WAITING = "EXPIRED_WAITING";//Protocol Status
	public static final String STATUS_FAILED_INITIATED = "FAILED_INITIATED";//Protocol Status
	public static final String STATUS_FAILED_WAITING = "FAILED_WAITING";//Protocol Status
	
	private String status;
	private long retryAfter;
	private long startTimeStamp;
	private long endTimeStamp;
	
	protected AsyncRestResource(String status, long retryAfter){
		this.status = status;
		this.retryAfter = retryAfter;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public long getRetryAfter() {
		return retryAfter;
	}

	public void setRetryAfter(long retryAfter) {
		this.retryAfter = retryAfter;
	}

	@JsonIgnore
	public long getStartTimeStamp() {
		return startTimeStamp;
	}
	
	public void setStartTimeStamp(long startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
	}
	
	@JsonIgnore
	public long getEndTimeStamp() {
		return endTimeStamp;
	}

	public void setEndTimeStamp(long endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
	}

	@JsonIgnore
	public HttpStatus generateHttpStatus() {
		if( STATUS_INITIATED.equalsIgnoreCase(this.status)||
			STATUS_EXPIRED_INITIATED.equalsIgnoreCase(this.status)||
			STATUS_FAILED_INITIATED.equalsIgnoreCase(this.status)){
			return HttpStatus.ACCEPTED;
		}else if(STATUS_WAITING.equalsIgnoreCase(this.status)||
			STATUS_EXPIRED_WAITING.equalsIgnoreCase(this.status)||
			STATUS_FAILED_WAITING.equalsIgnoreCase(this.status)){
			//return HttpStatus.PROCESSING;
			return HttpStatus.ACCEPTED;
		}else if(STATUS_RECEIVED.equalsIgnoreCase(this.status)||
			STATUS_EXPIRED.equalsIgnoreCase(this.status)){
			return HttpStatus.OK;
		}else if(STATUS_FAILED.equalsIgnoreCase(this.status)){
			return HttpStatus.EXPECTATION_FAILED;
		}else{
			return null;
		}
	}
	
	public abstract void appendToResourceLocation(String tailer);
}
