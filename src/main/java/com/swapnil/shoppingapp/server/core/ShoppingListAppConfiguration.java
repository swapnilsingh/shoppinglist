/**
 * 
 */
package com.swapnil.shoppingapp.server.core;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author "Swapnil Singh"
 *
 */
public class ShoppingListAppConfiguration extends Configuration{
	@Valid
    @NotNull
    @JsonProperty
    private DatabaseConfiguration databaseConfig = new DatabaseConfiguration();

	public ShoppingListAppConfiguration(DatabaseConfiguration databaseConfig) {
		this.databaseConfig = databaseConfig;
	}

	public ShoppingListAppConfiguration() {		
	}

	public DatabaseConfiguration getDatabaseConfig() {
		return databaseConfig;
	}

	public void setDatabaseConfig(DatabaseConfiguration databaseConfig) {
		this.databaseConfig = databaseConfig;
	}
	
    	
}
