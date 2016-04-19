package org.koushik.javabrains.messenger.model;

import java.util.Date;

public class Comment {
	
	private long id;
	private String message;
	private Date ceated;
	private String author;
	
	public Comment(){
		
	}

	public Comment(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.ceated= new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCeated() {
		return ceated;
	}

	public void setCeated(Date ceated) {
		this.ceated = ceated;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
