package com.yc.springmvc.web;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadAction {
	
	@PostMapping(path="upload",produces="text/html;charset=utf-8")
	public String upload(@RequestParam("file")MultipartFile file) throws IllegalStateException, IOException {
		String diskpath = "E:/缺课视频文件/05-美女时钟 (1)/05-美女时钟/images/";
		String filename = file.getOriginalFilename(); //文件名
		file.transferTo(new File(diskpath + filename));
		
		return "success: " + "photo/" + filename;
	}
	

}
