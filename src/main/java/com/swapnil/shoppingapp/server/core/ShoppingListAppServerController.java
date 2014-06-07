/**
 * 
 */
package com.swapnil.shoppingapp.server.core;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.apache.log4j.Logger;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import com.swapnil.shoppingapp.server.dao.ArticleDao;
import com.swapnil.shoppingapp.server.resource.ArticleResource;

/**
 * @author "Swapnil Singh"
 * 
 */
public class ShoppingListAppServerController extends
		Application<ShoppingListAppConfiguration> {

	private static final Logger log = Logger
			.getLogger(ShoppingListAppServerController.class);

	public static void main(String[] args) throws Exception {
		new ShoppingListAppServerController().run(args);
	}

	@Override
	public void initialize(Bootstrap<ShoppingListAppConfiguration> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(ShoppingListAppConfiguration configuration,
			Environment environment) throws Exception {
		DBI dbi = new DBI(configuration.getDatabaseConfig().getUrl(),
				configuration.getDatabaseConfig().getUserName(), configuration
						.getDatabaseConfig().getPassword());
		environment.jersey().register(new ArticleResource(new ArticleDao(dbi)));

	}

}
