
import ImageStrategy.*;

public class main {
//    private static ImageContext context;

    public static void main(String[] args) {
     ImageContext context = new ImageContext(new ImageReader());
     context.executeStrategy();
    }
}