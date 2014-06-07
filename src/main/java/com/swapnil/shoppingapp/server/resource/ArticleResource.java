/**
 * 
 */
package com.swapnil.shoppingapp.server.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.swapnil.shoppingapp.server.dao.ArticleDao;
import com.swapnil.shoppingapp.server.pojo.Article;

/**
 * @author "Swapnil Singh"
 * 
 */
@Path("/article")
public class ArticleResource {

	private static final Logger log = Logger.getLogger(ArticleResource.class);

	private ArticleDao articleDao;
	
	public ArticleResource(final ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@POST
	public void addArticle(final Article article) {
		articleDao.addArticle(article);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Article> getAllArticles(){
		return articleDao.getAllArticles();
	}
}
