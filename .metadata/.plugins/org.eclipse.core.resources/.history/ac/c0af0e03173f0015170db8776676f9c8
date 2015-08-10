package Edd.Grafico;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteHoja {
private BufferedImage capa;

 public SpriteHoja(String path){
	 try {
		capa=ImageIO.read(getClass().getResource(path));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 public BufferedImage getSprite(int x,int y){
	 return capa.getSubimage(x*32-32, y*32-32, 32, 32);
 }
 
 public BufferedImage getSprite2(int x,int y){
	 return capa.getSubimage(x*32-32, y*48-48, 32, 48);
 }
}

