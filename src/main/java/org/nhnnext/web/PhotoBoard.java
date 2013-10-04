package org.nhnnext.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhotoBoard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(length=100, nullable=false)
	private String title;
	
	@Column(length=5000, nullable=false)
	private String comment;
	
	@Column(length=100,nullable=true)
	private String fileName;
	
	
	public String getTitle() {
		return title;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Board [title=" + title + ", comment=" + comment + "]";
	}
	
	public Long getId() {
		// TODO Auto-generated method stub
		return Id;
	}
	
	
	
}
