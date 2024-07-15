package _99_extra;

import java.awt.Color;

public class PixelRunner {

	public static void main(String[] args) {
	PixelParty pixelparty = new PixelParty();
	pixelparty.setColor(255, 0, 0);
	pixelparty.drawCircle(200, 25, 15);
	pixelparty.drawRectangle(300, 30, 100, 150);
	pixelparty.drawTriangle(100, 50, 200, 100, 200, 50);
	pixelparty.drawCircle(150, 250, 45);

	pixelparty.saveImage();
	pixelparty.displayImage();
	
	
	
	
	}
	
}
