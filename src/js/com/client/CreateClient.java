package js.com.client;

import js.com.util.QRCodeUtil;

public class CreateClient {
	public static void main(String[] args) {
		String imgPath = "image.png";
		
		String encoderContent = "http://www.126.com";
	
		QRCodeUtil.encoderQRCode(encoderContent, imgPath, "png");
		
		System.out.println("create success!");
	}

}
