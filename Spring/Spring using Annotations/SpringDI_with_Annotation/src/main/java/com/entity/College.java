package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("2341")
	private int cid;
	
	@Value("SKNSITS")
	private String cname;
	
	public College() {
		
	}

	public College(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	

}
