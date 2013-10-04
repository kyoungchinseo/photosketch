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
	public Long getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "PhotoBoard [Id=" + Id + ", title=" + title + ", comment="
				+ comment + ", fileName=" + fileName + "]";
	}
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.Id = id;
	}
	
	
	
	
}
