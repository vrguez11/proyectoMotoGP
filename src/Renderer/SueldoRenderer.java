package Renderer;

import java.text.NumberFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class SueldoRenderer extends DefaultTableCellRenderer { 

    public SueldoRenderer() { 
        setHorizontalAlignment(SwingConstants.RIGHT); 
    } 

    @Override 
    public void setValue(Object aValue) { 
        Object result = aValue; 
        if ((aValue != null) && (aValue instanceof Number)) { 
            Number numberValue = (Number) aValue; 
            NumberFormat formatter = NumberFormat.getCurrencyInstance(); 
            result = formatter.format(numberValue.doubleValue()); 
        } 
        super.setValue(result); 
    } 

}