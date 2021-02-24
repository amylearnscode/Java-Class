

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author amy
 */
public class SmartPhoneGUI extends JFrame {
    private final double MODEL100 = 299.95, MODEL110 = 399.95, MODEL200 = 499.95;
    private final int GIG8 = 45, GIG16 = 65, GIG20 = 99;
    private final int PHONEINS = 5, WIFIHOT = 10;
    private final DecimalFormat DOLLAR = new DecimalFormat("$#,###,##0.00");
    
    private JMenuBar menuBar;
    private JMenu modelMenu, gigMenu, extraMenu;
    private JRadioButtonMenuItem model100Item, model110Item, model200Item;
    private JRadioButtonMenuItem gig8Item, gig16Item, gig20Item;
    private JCheckBoxMenuItem phoneInsItem, wifiHotItem;
    private boolean phoneInsSelected, wifiHotSelected;
    
    private JTextField selectedModelField, selectedGigField, phoneInsField, wifiHotField;
    private JLabel selectedModelLabel, selectedGigLabel, phoneInsLabel, wifiHotLabel, totalLabel;
    private JTextField modelCost, gigCost, phoneinsCost, wifihotCost, totalCost;
    private double modelFinalCost = 299.95, gigFinalCost = 45, 
                   phoneinsFinalCost = 0, wifihotFinalCost = 5;
    
    public SmartPhoneGUI() {
        setTitle("Get a New Phone!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildMenu();
        buildPanel();
        pack();
        setVisible(true);
    }
    private void buildPanel(){
        setLayout(new GridLayout(5,3,5,9));
        selectedModelField = new JTextField("Model 100",5);
        selectedGigField = new JTextField("8 GIG's/month",5);
        phoneInsField = new JTextField("Not selected",5);
        wifiHotField = new JTextField("Not selected",5);
        selectedModelLabel = new JLabel("Selected model: ");
        selectedGigLabel = new JLabel("Selected GIGs: ");
        phoneInsLabel = new JLabel("Phone Insurance: ");
        wifiHotLabel = new JLabel("WIFI Hot Spot: ");
        modelCost = new JTextField(DOLLAR.format(modelFinalCost));
        gigCost = new JTextField(DOLLAR.format(gigFinalCost));
        phoneinsCost = new JTextField(DOLLAR.format(phoneinsFinalCost));
        wifihotCost = new JTextField(DOLLAR.format(wifihotFinalCost));
        totalLabel = new JLabel("Total cost: ");
        totalCost = new JTextField(DOLLAR.format(wifihotFinalCost+modelFinalCost+gigFinalCost+
                phoneinsFinalCost));
        
        totalCost.setEditable(false);
        modelCost.setEditable(false);
        gigCost.setEditable(false);
        phoneinsCost.setEditable(false);
        wifihotCost.setEditable(false);
        selectedModelField.setEditable(false);
        selectedGigField.setEditable(false);
        phoneInsField.setEditable(false);
        wifiHotField.setEditable(false);
        
        add(selectedModelLabel);
        add(selectedModelField);
        add(modelCost);
        add(selectedGigLabel);
        add(selectedGigField);
        add(gigCost);
        add(phoneInsLabel);
        add(phoneInsField);
        add(phoneinsCost);
        add(wifiHotLabel);
        add(wifiHotField);
        add(wifihotCost);
        add(totalLabel);
        add(totalCost);
        
    }
    private void buildMenu(){
        menuBar = new JMenuBar();
        buildModelMenu();
        buildGigMenu();
        buildExtraMenu();
        setJMenuBar(menuBar);
    }
      private void buildModelMenu(){
        modelMenu = new JMenu("Model");
        model100Item = new JRadioButtonMenuItem("Model 100", true);
        model110Item = new JRadioButtonMenuItem("Model 110");
        model200Item = new JRadioButtonMenuItem("Model 200");
        ButtonGroup group = new ButtonGroup();
        group.add(model100Item);
        group.add(model110Item);
        group.add(model200Item);
        model100Item.addItemListener(new ModelListener());
        model110Item.addItemListener(new ModelListener());
        model200Item.addItemListener(new ModelListener());
        modelMenu.add(model100Item);
        modelMenu.add(model110Item);
        modelMenu.add(model200Item);
        menuBar.add(modelMenu);
    }
      private void buildGigMenu(){
        gigMenu = new JMenu("Gigabytes");
        gig8Item = new JRadioButtonMenuItem("8 Gigabytes");
        gig16Item = new JRadioButtonMenuItem("16 Gigabytes", true);
        gig20Item = new JRadioButtonMenuItem("20 Gigabytes");
        ButtonGroup group = new ButtonGroup();
        group.add(gig8Item);
        group.add(gig16Item);
        group.add(gig20Item);
        gig8Item.addItemListener(new GigListener());
        gig16Item.addItemListener(new GigListener());
        gig20Item.addItemListener(new GigListener());
        gigMenu.add(gig8Item);
        gigMenu.add(gig16Item);
        gigMenu.add(gig20Item);
        menuBar.add(gigMenu);
    }
      private void buildExtraMenu(){
        extraMenu = new JMenu("Additional Items");
        phoneInsItem = new JCheckBoxMenuItem("Phone Insurance", true);
        wifiHotItem = new JCheckBoxMenuItem("Wifi Hot Spot");
        phoneinsFinalCost = 0;
        wifihotFinalCost = 0;
        phoneInsItem.addActionListener(new ExtraListener());
        wifiHotItem.addActionListener(new ExtraListener());
        extraMenu.add(phoneInsItem);
        extraMenu.add(wifiHotItem);
        menuBar.add(extraMenu);
    }
        private class ModelListener implements ItemListener{
            
        public void itemStateChanged(ItemEvent e){
            if(model100Item.isSelected()){
                modelFinalCost = MODEL100;
                selectedModelField.setText("Model 100");
            }else if(model110Item.isSelected()){
                modelFinalCost = MODEL110;
                selectedModelField.setText("Model 110");
            }else if(model200Item.isSelected()){
                modelFinalCost = MODEL200;
                selectedModelField.setText("Model 200");
            }
            modelCost.setText(DOLLAR.format(modelFinalCost));
            totalCost.setText(DOLLAR.format(modelFinalCost+gigFinalCost+
                    phoneinsFinalCost+wifihotFinalCost));
        }
    }
        private class GigListener implements ItemListener{
            
        public void itemStateChanged(ItemEvent e){
            if(gig8Item.isSelected()){
                selectedGigField.setText("8 Gigs/month");
                gigFinalCost = GIG8;
            }else if(gig16Item.isSelected()){
                selectedGigField.setText("16 gigs/month");
                gigFinalCost = GIG16;
            }else if(gig20Item.isSelected()){
                selectedGigField.setText("20 gigs/month");
                gigFinalCost = GIG20;
            }
            gigCost.setText(DOLLAR.format(gigFinalCost));
            totalCost.setText(DOLLAR.format(modelFinalCost+gigFinalCost+
                    phoneinsFinalCost+wifihotFinalCost));
        }
    }
        private class ExtraListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==phoneInsItem){
                if(phoneInsItem.isSelected()){
                    phoneinsFinalCost = PHONEINS;
                    phoneInsField.setText("Selected");
                }else{
                    phoneinsFinalCost = 0;
                    phoneInsField.setText("Not selected");
                }
                phoneinsCost.setText(DOLLAR.format(phoneinsFinalCost));
            }
            if(e.getSource()==wifiHotItem){
                if(wifiHotItem.isSelected()){
                    wifihotFinalCost = WIFIHOT;
                    wifiHotField.setText("Selected");
                }else{
                    wifihotFinalCost = 0;
                    wifiHotField.setText("Not selected");
                    
                }
                wifihotCost.setText(DOLLAR.format(wifihotFinalCost));
            }
            totalCost.setText(DOLLAR.format(modelFinalCost + gigFinalCost +
                    phoneinsFinalCost + wifihotFinalCost));
        }
    }
    
   
}
