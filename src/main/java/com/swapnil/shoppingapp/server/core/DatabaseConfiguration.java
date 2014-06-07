/**
 * 
 */
package com.swapnil.shoppingapp.server.core;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author "Swapnil Singh"
 *
 */
public class DatabaseConfiguration {

	@JsonProperty
	private String driver;
	@JsonProperty
	private String url;
	@JsonProperty
	private String userName;
	@JsonProperty
	private String password;
	
	public DatabaseConfiguration(String driver, String url, String userName,
			String password) {
		this.driver = driver;
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	
	public DatabaseConfiguration() {
	}

	public String getDriver() {
		return driver;
	}
	public String getUrl() {
		return url;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
}
