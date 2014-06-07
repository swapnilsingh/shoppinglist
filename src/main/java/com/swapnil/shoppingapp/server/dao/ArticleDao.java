/**
 * 
 */
package com.swapnil.shoppingapp.server.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.util.StringMapper;

import com.swapnil.shoppingapp.server.pojo.Article;

/**
 * @author "Swapnil Singh"
 * 
 */
public class ArticleDao {

	private static final Logger log = Logger.getLogger(ArticleDao.class);

	private DBI dbi;
	private Handle handle;

	public ArticleDao(DBI dbi) {
		this.dbi = dbi;
	}

	public void addArticle(final Article article) {
		log.info("Article Received:" + article);
		this.handle = dbi.open();
		handle.execute(
				"INSERT INTO `test`.`article` (`article_name`, `article_quantity`) VALUES (?,?)",
				article.getArticleName(), article.getArticleQuantity());
		handle.close();
	}

	public List<Article> getAllArticles() {
		this.handle = dbi.open();
		List<Article> articles = handle
				.createQuery(
						"SELECT article_name as articleName , article_quantity as  articleQuantity FROM article")
				.map(Article.class).list();
		handle.close();
		return articles;
	}

}
