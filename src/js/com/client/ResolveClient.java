package js.com.client;

import js.com.util.QRCodeUtil;

public class ResolveClient {

	public static void main(String[] args) throws Exception{
		
		String imgPath = "image.png";
		
		String decoderContent = QRCodeUtil.decoderQRCode(imgPath);
		
		System.out.println(decoderContent);
	}
}
