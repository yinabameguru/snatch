package com.jza.snatch.redis;

public interface KeyPrefix {
		
	int expireSeconds();
	
	String getPrefix();
	
}
