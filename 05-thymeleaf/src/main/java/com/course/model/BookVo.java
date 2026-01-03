package com.course.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookVo {

	@NotBlank
	private String name;
	
	@NotBlank
	private String author;
	
	private String imgName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
	
}