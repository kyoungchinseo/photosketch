package org.nhnnext.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PhotoComment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length=1000, nullable=true)
	private String comment;
	
	@ManyToOne
	private PhotoBoard board;
	
	public PhotoComment() { 
		// 반드시 빈 생성자를 생성해야 한다. }
	}
	
	public PhotoComment(PhotoBoard board, String contents) { 
		this.board = board;
		this.comment = contents;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + "]";
	}
	
	
	
	
}
