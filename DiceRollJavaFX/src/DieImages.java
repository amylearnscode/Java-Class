import javafx.scene.image.Image;


public class DieImages {
    Image pic1 = new Image("1Die.bmp");
    Image pic2 = new Image("2Die.bmp");
    Image pic3 = new Image("3Die.bmp");
    Image pic4 = new Image("4Die.bmp");
    Image pic5 = new Image("5Die.bmp");
    Image pic6 = new Image("6Die.bmp");
    
    
    private Image dieImage = pic1;
    
    public void setImage(int sides)
    {
        int value = sides;
        if(value == 1)
            dieImage = pic1;
        if(value == 2)
            dieImage = pic2;
        if(value == 3)
            dieImage = pic3;
        if(value == 4)
            dieImage = pic4;
        if(value == 5)
            dieImage = pic5;
        if(value == 6)
            dieImage = pic6;
    }
    public Image getImage()
    {
        return dieImage;
    }
    
}

