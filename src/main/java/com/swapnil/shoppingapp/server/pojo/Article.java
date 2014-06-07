/**
 * 
 */
package com.swapnil.shoppingapp.server.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author "Swapnil Singh"
 *
 */
public class Article {
	@JsonProperty
	private String articleName;
	@JsonProperty
	private String articleQuantity;
	public Article(String articleName, String articleQuantity) {
		this.articleName = articleName;
		this.articleQuantity = articleQuantity;
	}
	public Article() {
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getArticleQuantity() {
		return articleQuantity;
	}
	public void setArticleQuantity(String articleQuantity) {
		this.articleQuantity = articleQuantity;
	}
	@Override
	public String toString() {
		return "Article [articleName=" + articleName + ", articleQuantity="
				+ articleQuantity + "]";
	}
	

}
