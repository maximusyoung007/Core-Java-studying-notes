package pojo;

import org.springframework.web.multipart.MultipartFile;

/*
 * UploadedImageFile中封装MultipartFile类型的字段 image ，用于接受页面的注入
 */
public class UploadedImageFile {
	MultipartFile image;

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	} 
}
