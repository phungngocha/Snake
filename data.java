import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.net.URL;

public class data {
    //public static Image imageHead;
    public static Image imageWorm;
    public static  void loadImage(){
        try{
           imageWorm = ImageIO.read(new File("res/apple.png"));

        }catch (Exception e){}
    }
}
