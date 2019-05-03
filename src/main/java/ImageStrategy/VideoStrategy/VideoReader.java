package ImageStrategy.VideoStrategy;

import ImageStrategy.IImageStrategy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import ImageStrategy.ImageReader;
import org.bytedeco.javacv.FFmpegFrameGrabber;

public class VideoReader implements IImageStrategy {
    BufferedImage image;
    int width;
    int height;

    public void readImage()
    {
        try {
            FFmpegFrameGrabber g = new FFmpegFrameGrabber(VideoReader.class.getResource("/image.jpg").toURI())

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void doOperation() {
        readImage();
    }
}
