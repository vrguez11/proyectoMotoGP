package Renderer;
 
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
 
public class CampeonRenderer extends DefaultTableCellRenderer{
   
    public CampeonRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER);
    }
   
    @Override
    public void setValue(Object aValue) {
        if((boolean)aValue == true) {
            setIcon(new ImageIcon(getClass().getResource("/images/TRUEHD.png")));      
        }else{
            setIcon(new ImageIcon(getClass().getResource("/images/FALSEHD.png")));
        }
       
    }
}