package ImageStrategy;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

public class ImageReader implements IImageStrategy {
    BufferedImage image;
    int width;
    int height;

    public void readImage()
    {
        try {
          //  File input = new File("image.jpg");
            File myImage = new File(ImageReader.class.getResource("/image.jpg").toURI());
            image = ImageIO.read(myImage);
            width = image.getWidth();
            height = image.getHeight();

            System.out.println("width: " + width);

            int count = 0;
            for (int i=0; i<height; i++) {
                for (int j=0; j<width; j++) {
                    count++;
                    Color c = new Color(image.getRGB(j, i));
                    System.out.println("pixel no: " + j + " RGB: " + c);
                    //System.out.println("width: " + width);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void doOperation() {
        readImage();
    }
}
