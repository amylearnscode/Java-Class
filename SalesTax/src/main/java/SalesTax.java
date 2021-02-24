import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amy
 */
public class SalesTax extends JFrame {
    private JPanel panel;
    private JTextField totalSales;
    private JButton calcButton;
    
    private final double COUNTY_RATE = 0.02;
    private final double STATE_RATE = 0.04;
    
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 100;
    
    public SalesTax()
    {
        setTitle("Monthly Sales Tax Report");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }
    private void buildPanel()
    {
        JLabel totalSalesMsg =
                    new JLabel("Enter the total sales: ");
        totalSales = new JTextField(10);
        calcButton = new JButton("Calculate sales tax");
        calcButton.addActionListener(new CalcButtonListener());
        panel = new JPanel();
        
        panel.add(totalSalesMsg);
        panel.add(totalSales);
        panel.add(calcButton);
        
    }
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double totalSalesAmount;
            double countyTaxAmount;
            double stateTaxAmount;
            double totalTaxAmount;
            
            
            totalSalesAmount = Double.parseDouble(totalSales.getText());
            countyTaxAmount = totalSalesAmount * COUNTY_RATE;
            stateTaxAmount = totalSalesAmount * STATE_RATE;
            totalTaxAmount = countyTaxAmount + stateTaxAmount;
            
            JOptionPane.showMessageDialog(null, "County sales tax: $"
            + countyTaxAmount + "\nState sales tax: $" + stateTaxAmount +
                    "\nTotal tax amount: $" + totalTaxAmount);
        }
    }
    public static void main(String[] args)
    {
      SalesTax stv = new SalesTax();  
    }
    
    
    
}
