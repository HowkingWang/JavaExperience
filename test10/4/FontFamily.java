import java.awt.GraphicsEnvironment;    
public class FontFamily {  
    String[] font;  
    GraphicsEnvironment ge;    
    FontFamily() {  
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();  
        font = ge.getAvailableFontFamilyNames();  
    }  
  
    public String[] getFont() {  
        return font;  
    }  
}  