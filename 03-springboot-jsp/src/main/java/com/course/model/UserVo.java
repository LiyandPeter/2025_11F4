package com.course.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserVo {
	
    private String nickname;
    
    private String phone;
    
    private String[] hobby;
    
    // 接收上傳物件
    private MultipartFile photo;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
    
}