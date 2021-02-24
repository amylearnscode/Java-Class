
 
package dormandmealcalculator;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;



/**
 *
 * @author amy
 */
public class CalcGUI extends JFrame {
    private final String[] dormOptions = {"Allen Hall", "Pike Hall", 
                                            "Farthing Hall", "University Suites"};
    private final String[] mealPlans = {"7 per week", "14 per week", "Unlimited"};
    private final int[] dormPrices = {1500, 1600, 1200, 1800};
    private final int[] mealPlanPrices = {560, 1095, 1500};
    private JComboBox dormBox, mealBox;
    private JButton totalButton;
    private JLabel dormLabel, mealLabel;
    private JPanel dormPanel, mealPanel;
    private int finalDormCost = 1500;
    private int finalMealCost = 560;
    public CalcGUI(){
        setTitle("Dorm and Meal Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        pack();
        setVisible(true);
        
    }
    private void buildPanel(){
        dormPanel = new JPanel();
        mealPanel = new JPanel();
        dormBox = new JComboBox(dormOptions);
        mealBox = new JComboBox(mealPlans);
        dormLabel = new JLabel("Dorm Options: ");
        mealLabel = new JLabel("Meal Plans: ");
        totalButton = new JButton("Calculate total: ");
        
        dormBox.addItemListener(new DormListener());
        mealBox.addItemListener(new MealListener());
        totalButton.addActionListener(new TotalListener());
        
        dormPanel.add(dormLabel);
        dormPanel.add(dormBox);
        mealPanel.add(mealLabel);
        mealPanel.add(mealBox);
        
        add(dormPanel, BorderLayout.NORTH);
        add(mealPanel, BorderLayout.CENTER);
        add(totalButton, BorderLayout.SOUTH);
            
    }
    private class DormListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            int dormPlanChosen = dormBox.getSelectedIndex();
            finalDormCost = dormPrices[dormPlanChosen];
            
        }
    }
    private class MealListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            int mealPlanChosen = mealBox.getSelectedIndex();
            finalMealCost = mealPlanPrices[mealPlanChosen];
            
        }
    }
    
    private class TotalListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int totalCost = finalDormCost + finalMealCost;
            JOptionPane.showMessageDialog(null, "Dorm plan price: $ " + finalDormCost+
                                                 "\nMeal plan price: $" + finalMealCost+
                                                         "\nTotal Price: $" + totalCost);
        }
    }
}
    
    
   
        
        
    

    

