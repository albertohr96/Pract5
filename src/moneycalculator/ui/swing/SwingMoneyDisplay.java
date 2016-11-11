
package moneycalculator.ui.swing;
 
import java.awt.FlowLayout;//mirar porque hace falta en mi programa y en el del profesor no
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.u.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {
    public SwingMoneyDisplay(){
        setLayout(new FlowLayout());
        add(amount());
        add(currency());
    }
    
    private JLabel amount(){
        JLabel label=new JLabel("500");
        return label;
    }
    
    private JLabel currency(){
        JLabel label=new JLabel("$");
        return label;
    }
}


