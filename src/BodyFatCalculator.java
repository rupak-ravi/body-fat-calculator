import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class BodyFatCalculator implements ActionListener{
   // Instance variables
   private JFrame frame;
   private JTextField h1, h2, we, wa, ne, hi;
   private JLabel height, feet, hInches, wInches, nInches, hiInches, pounds, weight, waist, neck, hips, sex, level, BMI, BMIa, WHR, WHRa, PBF, PBFa, LBM, LBMa, info1, info2, info3, info4, info5, info6, e1, e2, e3, e4, e5;
   private JRadioButton male, female, invisible1, invisible2, sedentary, moderate, active;
   private JButton clear, calculate;
   private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12, panel13, panel14;
   private String info, percentBodyFatString, bodyMassIndexString, leanBodyMassString, waistToHeightString;
   private double percentBodyFat, leanBodyMass, waistToHeight, bodyMassIndex, Uweightkg, Uheight1, Uheight2, Uweight, Uwaist, Uneck, Uhip, protein;
   private GridBagConstraints gbc1 = new GridBagConstraints();
   private GridBagConstraints gbc2 = new GridBagConstraints();
   private GridBagConstraints gbc8 = new GridBagConstraints();
   private GridBagConstraints gbcp = new GridBagConstraints();
   private DecimalFormat tenths, hundredths, none;
      
   public static void main(String[] args){
      BodyFatCalculator gui = new BodyFatCalculator();
   }
   
   public BodyFatCalculator(){
      // Constructor
      frame = new JFrame("BMI and Body Fat Calculator");
      h1 = new JTextField(4);
      h2 = new JTextField(4);
      we = new JTextField(4);
      wa = new JTextField(4);
      ne = new JTextField(4);
      hi = new JTextField(4);
      height = new JLabel("Height: ");
      weight = new JLabel("Weight: ");
      waist = new JLabel("Waist: ");
      neck = new JLabel("Neck: ");
      hips = new JLabel("Hips (Female): ");
      feet = new JLabel(" feet");
      hInches = new JLabel(" inches");
      wInches = new JLabel(" inches");
      nInches = new JLabel(" inches");
      hiInches = new JLabel(" inches");
      pounds = new JLabel(" pounds");
      sex = new JLabel("Sex:");
      level = new JLabel("<html>Level of<br>Activity:</html>");
      BMI = new JLabel("Body Mass Index: ");
      WHR = new JLabel("Waist-to-Height ratio: ");
      PBF = new JLabel("Percent Body Fat: ");
      LBM = new JLabel("Lean Body Mass: ");
      BMIa = new JLabel("");
      WHRa = new JLabel("");
      PBFa = new JLabel("");
      LBMa = new JLabel("");
      info = new String("");
      info1 = new JLabel("<html><div style='text-align: center;'>" + info + "</div></html>");
      info2 = new JLabel("waist-to-height ratio is normal.");
      info3 = new JLabel("You may be overweight or have unusual");
      info4 = new JLabel("mass distribution");
      info5 = new JLabel("Your diet should contain at least 49 grams");
      info6 = new JLabel("of protein per day.");
      e1 = new JLabel("");
      e2 = new JLabel("");
      e3 = new JLabel("");
      e4 = new JLabel("");
      e5 = new JLabel("");
      male = new JRadioButton("Male");
      female = new JRadioButton("Female");
      invisible1 = new JRadioButton("Invisible");
      invisible2 = new JRadioButton("Invisible");
      sedentary = new JRadioButton("sedentary");
      moderate = new JRadioButton("moderate");
      active = new JRadioButton("active");
      clear = new JButton("Clear");
      calculate = new JButton("Calculate");
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      panel4 = new JPanel();
      panel5 = new JPanel();
      panel6 = new JPanel();
      panel7 = new JPanel();
      panel8 = new JPanel();
      panel9 = new JPanel();
      panel10 = new JPanel();
      panel11 = new JPanel();
      panel12 = new JPanel();
      panel13 = new JPanel();
      panel14 = new JPanel();
      ButtonGroup bg1 = new ButtonGroup();
      ButtonGroup bg2 = new ButtonGroup();
      gbc1.insets = new Insets(5, 0, 0, 0);
      gbc2.insets = new Insets(5, 0, 0, 0);
      Uheight1 = 0.0; 
      Uheight2 = 0.0;
      Uweight = 0.0;
      Uwaist = 0.0;
      Uneck = 0.0;
      Uhip = 0.0;
      Uweightkg = 0.0;
      protein = 0.0;
      percentBodyFat = 0.0;
      waistToHeight = 0.0;
      bodyMassIndex = 0.0;
      leanBodyMass = 0.0;
      percentBodyFatString = new String("");
      bodyMassIndexString = new String("");
      leanBodyMassString = new String("");
      waistToHeightString = new String("");
      tenths = new DecimalFormat("#.#");
      hundredths = new DecimalFormat("#.##");
      none = new DecimalFormat("#");
      gbcp.insets = new Insets(2, 0, 0, 0);
       
      male.addActionListener(this);
      female.addActionListener(this);
      sedentary.addActionListener(this);
      moderate.addActionListener(this);
      active.addActionListener(this);
      clear.addActionListener(this);
      calculate.addActionListener(this);
      
      frame.setLayout(new GridBagLayout());
      panel1.setLayout(new GridBagLayout());
      panel2.setLayout(new GridBagLayout());
      panel3.setLayout(new GridLayout(3, 3));
      panel4.setLayout(new BorderLayout());
      panel5.setLayout(new BorderLayout());
      panel6.setLayout(new BorderLayout());
      panel7.setLayout(new FlowLayout());
      panel8.setLayout(new GridBagLayout());
      panel9.setLayout(new FlowLayout());
      panel10.setLayout(new FlowLayout());
      panel11.setLayout(new FlowLayout());
      panel12.setLayout(new FlowLayout());
      panel13.setLayout(new FlowLayout());
      panel14.setLayout(new FlowLayout());
      
      frame.getContentPane().setBackground(Color.WHITE);
      panel1.setBackground(Color.WHITE);
      panel2.setBackground(Color.WHITE);
      panel3.setBackground(Color.WHITE);
      panel4.setBackground(Color.WHITE);
      panel5.setBackground(Color.WHITE);
      panel6.setBackground(Color.WHITE);
      panel7.setBackground(Color.WHITE);
      panel8.setBackground(Color.WHITE);
      panel9.setBackground(Color.WHITE);
      panel10.setBackground(Color.WHITE);
      panel11.setBackground(Color.WHITE);
      panel12.setBackground(Color.WHITE);
      panel13.setBackground(Color.WHITE);
      panel14.setBackground(Color.WHITE);
      male.setBackground(Color.WHITE);
      female.setBackground(Color.WHITE);
      sedentary.setBackground(Color.WHITE);
      moderate.setBackground(Color.WHITE);
      active.setBackground(Color.WHITE);
      
      gbc1.gridx = 0;
      gbc1.gridy = 0;
      gbc1.anchor = GridBagConstraints.EAST;
      panel1.add(height, gbc1);
      gbc1.gridx = 1;
      gbc1.gridy = 0;
      panel1.add(h1, gbc1);
      gbc1.gridx = 2;
      gbc1.gridy = 0;
      gbc1.anchor = GridBagConstraints.WEST;
      panel1.add(feet, gbc1);
      gbc1.gridx = 3;
      gbc1.gridy = 0;
      panel1.add(h2, gbc1);
      gbc1.gridx = 4;
      gbc1.gridy = 0;
      panel1.add(hInches, gbc1);
      gbc1.gridx = 0;
      gbc1.gridy = 1;
      gbc1.anchor = GridBagConstraints.EAST;
      panel1.add(weight, gbc1);
      gbc1.gridx = 1;
      gbc1.gridy = 1;
      panel1.add(we, gbc1);
      gbc1.gridx = 2;
      gbc1.gridy = 1;
      gbc1.anchor = GridBagConstraints.WEST;
      panel1.add(pounds, gbc1);
      gbc1.gridx = 0;
      gbc1.gridy = 2;
      gbc1.anchor = GridBagConstraints.EAST;
      panel1.add(waist, gbc1);
      gbc1.gridx = 1;
      gbc1.gridy = 2;
      panel1.add(wa, gbc1);
      gbc1.gridx = 2;
      gbc1.gridy = 2;
      gbc1.anchor = GridBagConstraints.WEST;
      panel1.add(wInches, gbc1);
      gbc1.gridx = 0;
      gbc1.gridy = 3;
      gbc1.anchor = GridBagConstraints.EAST;
      panel1.add(neck, gbc1);
      gbc1.gridx = 1;
      gbc1.gridy = 3;
      panel1.add(ne, gbc1);
      gbc1.gridx = 2;
      gbc1.gridy = 3;
      gbc1.anchor = GridBagConstraints.WEST;
      panel1.add(nInches, gbc1);
      gbc1.gridx = 0;
      gbc1.gridy = 4;
      gbc1.anchor = GridBagConstraints.EAST;
      panel1.add(hips, gbc1);
      gbc1.gridx = 1;
      gbc1.gridy = 4;
      panel1.add(hi, gbc1);
      gbc1.gridx = 2;
      gbc1.gridy = 4;
      gbc1.anchor = GridBagConstraints.WEST;
      panel1.add(hiInches, gbc1);
      gbc1.gridx = 0;
      gbc1.gridy = 5;
      gbc1.anchor = GridBagConstraints.EAST;
      
      gbc2.gridx = 0;
      gbc2.gridy = 0;
      panel2.add(sex, gbc2);
      gbc2.gridx = 1;
      gbc2.gridy = 0;
      panel2.add(male, gbc2);
      gbc2.gridx = 2;
      gbc2.gridy = 0;
      panel2.add(female, gbc2);
      
      panel3.add(level);
      panel4.add(sedentary);
      panel3.add(panel4);
      panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      panel3.add(e1);
      panel3.add(e5);
      panel5.add(moderate);
      panel3.add(panel5);
      panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      panel3.add(e2);
      panel3.add(e3);
      panel6.add(active);
      panel3.add(panel6);
      panel6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      panel3.add(e4);
      
      panel7.add(clear);
      panel7.add(calculate);
      
      gbc8.gridx = 0;
      gbc8.gridy = 0;
      gbc8.anchor = GridBagConstraints.EAST;
      panel8.add(BMI, gbc8);
      gbc8.gridx = 1;
      gbc8.gridy = 0;
      gbc8.anchor = GridBagConstraints.WEST;
      panel8.add(BMIa, gbc8);
      gbc8.gridx = 0;
      gbc8.gridy = 1;
      gbc8.anchor = GridBagConstraints.EAST;
      panel8.add(WHR, gbc8);
      gbc8.gridx = 1;
      gbc8.gridy = 1;
      gbc8.anchor = GridBagConstraints.WEST;
      panel8.add(WHRa, gbc8);
      gbc8.gridx = 0;
      gbc8.gridy = 2;
      gbc8.anchor = GridBagConstraints.EAST;
      panel8.add(PBF, gbc8);
      gbc8.gridx = 1;
      gbc8.gridy = 2;
      gbc8.anchor = GridBagConstraints.WEST;
      panel8.add(PBFa, gbc8);
      gbc8.gridx = 0;
      gbc8.gridy = 3;
      gbc8.anchor = GridBagConstraints.EAST;
      panel8.add(LBM, gbc8);
      gbc8.gridx = 1;
      gbc8.gridy = 3;
      gbc8.anchor = GridBagConstraints.WEST;
      panel8.add(LBMa, gbc8);
      
      panel9.add(info1);
      panel10.add(info2);
      panel11.add(info3);
      panel12.add(info4);
      panel13.add(info5);
      panel14.add(info6);
      
      bg1.add(male);
      bg1.add(female);
      bg1.add(invisible1);
      bg2.add(sedentary);
      bg2.add(moderate);
      bg2.add(active);
      bg2.add(invisible2);
      
      gbcp.gridx = 0;
      gbcp.gridy = 0;
      frame.add(panel1, gbcp);
      gbcp.gridx = 0;
      gbcp.gridy = 1;
      frame.add(panel2, gbcp);
      gbcp.gridx = 0;
      gbcp.gridy = 2;
      frame.add(panel3, gbcp);
      gbcp.gridx = 0;
      gbcp.gridy = 3;
      frame.add(panel7, gbcp);
      gbcp.gridx = 0;
      gbcp.gridy = 4;
      frame.add(panel8, gbcp);
      gbcp.gridx = 0;
      gbcp.gridy = 5;
      frame.add(panel9, gbcp);
      
      frame.setSize(330,550);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      invisible1.setVisible(false);
      invisible2.setVisible(false);
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getActionCommand().equals("Calculate") && female.isSelected() == true){
         Uheight1 = (Double.parseDouble(h1.getText()))*12;
         Uheight2 = Double.parseDouble(h2.getText());
         Uweight = Double.parseDouble(we.getText());
         Uwaist = Double.parseDouble(wa.getText());
         Uneck = Double.parseDouble(ne.getText());
         Uhip = Double.parseDouble(hi.getText());
         Uweightkg = Uweight/2.20462263218;
         
         //Female BMI Calculation
         bodyMassIndex = (Uweight*703)/((Uheight1+ Uheight2)*(Uheight1+ Uheight2));
         bodyMassIndexString = " " + tenths.format(bodyMassIndex) + " lb/in²";
         BMIa.setText(bodyMassIndexString);
         
         //Female Body Fat Percentage Calculation
         percentBodyFat = 163.205*Math.log10(Uwaist + Uhip - Uneck) - 97.684*Math.log10(Uheight1 + Uheight2)-78.387;
         percentBodyFatString = " " + tenths.format(percentBodyFat) + "%";
         PBFa.setText(percentBodyFatString);
         
         //Female Lean Body Mass Calculation
         double tenthsPercentBodyFat = Double.parseDouble(tenths.format(percentBodyFat));
         leanBodyMass = Uweight * (1 - (tenthsPercentBodyFat/100));
         leanBodyMassString = " " + tenths.format(leanBodyMass) + " lb";
         LBMa.setText(leanBodyMassString);
         
         //Female Waist to Height Ratio Calculation
         waistToHeight = Uwaist / (Uheight1 + Uheight2);
         waistToHeightString = " " + hundredths.format(waistToHeight);
         WHRa.setText(waistToHeightString);
         
         //Information Generator
         if(bodyMassIndex < 18.5)
            info += "<html>Your BMI is lower than normal, but your<br>";
         else if(bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9)
            info += "<html>Your BMI is normal, but your<br>";
         else if(bodyMassIndex >= 25 && bodyMassIndex <= 29.9)
            info += "<html>Your BMI is greater than normal, but your<br>";
         else if(bodyMassIndex >= 30)
            info += "<html>Your BMI is significantly greater than normal, but your<br>";
         
         if(waistToHeight <= 0.5)
            info += "waist-to-height ratio is normal.<br>";
         else
            info += "waist-to-height ratio is greater than normal.<br>";
         
         if(bodyMassIndex < 18.5)
            info += "You may be underweight or have unusual<br>";
         else if(bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9)
            info += "You are healthy and have normal<br>";
         else if(bodyMassIndex >= 25 && bodyMassIndex <= 29.9)
            info += "You may be overweight or have unusual<br>";
         else if(bodyMassIndex >= 30)
            info += "You may be obese or have unusual<br>";
            
         info += "mass distribution.<br>";
         
         if(sedentary.isSelected() == true){
            protein = 0.8*Uweightkg;
            info += "Your diet should contain atleast " + none.format(Math.floor(protein)) + " grams<br>";
         }
         else if(moderate.isSelected() == true){
            protein = 1.1*Uweightkg;
            info += "Your diet should contain atleast " + none.format(Math.floor(protein)) + " grams<br>";
         }
         else if(active.isSelected() == true){
            protein = 1.4*Uweightkg;
            info += "Your diet should contain atleast " + none.format(Math.floor(protein)) + " grams<br>";
         }
         
         info += "of protein per day.</html>";
         
         info1.setText("<html><div style='text-align: center;'>" + info + "</div></html>");
      }
      if(e.getActionCommand().equals("Calculate") && male.isSelected() == true){ 
         Uheight1 = (Double.parseDouble(h1.getText()))*12;
         Uheight2 = Double.parseDouble(h2.getText());
         Uweight = Double.parseDouble(we.getText());
         Uwaist = Double.parseDouble(wa.getText());
         Uneck = Double.parseDouble(ne.getText());
         Uweightkg = Uweight/2.20462263218;
         
         //Male BMI Calculation
         bodyMassIndex = (Uweight*703)/((Uheight1+ Uheight2)*(Uheight1+ Uheight2));
         bodyMassIndexString = " " + tenths.format(bodyMassIndex) + " lb/in²";
         BMIa.setText(bodyMassIndexString);
         
         //Male Body Fat Percentage Calculation
         percentBodyFat = 86.010*Math.log10(Uwaist-Uneck)-70.041*Math.log10(Uheight1 + Uheight2) + 36.76;
         percentBodyFatString = " " + tenths.format(percentBodyFat) + "%";
         PBFa.setText(percentBodyFatString);
         
         //Male Lean Body Mass Calculation
         leanBodyMass = Uweight * (1 - (percentBodyFat/100));
         leanBodyMassString = " " + tenths.format(leanBodyMass) + " lb";
         LBMa.setText(leanBodyMassString);
         
         //Male Waist to Height Ratio Calculation
         waistToHeight = Uwaist / (Uheight1 + Uheight2);
         waistToHeightString = " " + hundredths.format(waistToHeight);
         WHRa.setText(waistToHeightString);
         
         //Information Generator
         if(bodyMassIndex < 18.5)
            info += "<html>Your BMI is lower than normal, but your<br>";
         else if(bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9)
            info += "<html>Your BMI is normal, but your<br>";
         else if(bodyMassIndex >= 25 && bodyMassIndex <= 29.9)
            info += "<html>Your BMI is greater than normal, but your<br>";
         else if(bodyMassIndex >= 30)
            info += "<html>Your BMI is significantly greater than normal, but your<br>";
         
         if(waistToHeight <= 0.5)
            info += "waist-to-height ratio is normal.<br>";
         else
            info += "waist-to-height ratio is greater than normal.<br>";
         
         if(bodyMassIndex < 18.5)
            info += "You may be underweight or have unusual<br>";
         else if(bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9)
            info += "You are healthy and have normal<br>";
         else if(bodyMassIndex >= 25 && bodyMassIndex <= 29.9)
            info += "You may be overweight or have unusual<br>";
         else if(bodyMassIndex >= 30)
            info += "You may be obese or have unusual<br>";
            
         info += "mass distribution.<br>";
         
         if(sedentary.isSelected() == true){
            protein = 0.8*Uweightkg;
            info += "Your diet should contain atleast " + none.format(protein) + " grams<br>";
         }
         else if(moderate.isSelected() == true){
            protein = 1.1*Uweightkg;
            info += "Your diet should contain atleast " + none.format(protein) + " grams<br>";
         }
         else if(active.isSelected() == true){
            protein = 1.4*Uweightkg;
            info += "Your diet should contain atleast " + none.format(protein) + " grams<br>";
         }
         
         info += "of protein per day.</html>";
         
         info1.setText("<html><div style='text-align: center;'>" + info + "</div></html>");
      }
      if(e.getActionCommand().equals("Clear")){
         h1.setText("");
         h2.setText("");
         we.setText("");
         wa.setText("");
         ne.setText("");
         hi.setText("");
         BMIa.setText("");
         PBFa.setText("");
         WHRa.setText("");
         LBMa.setText("");
         Uheight1 = 0;
         Uheight2 = 0;
         Uweight = 0;
         Uwaist = 0;
         Uneck = 0;
         Uhip = 0;
         bodyMassIndex = 0;
         percentBodyFat = 0;
         invisible1.doClick();
         invisible2.doClick();
         info = "";
         info1.setText("");
      }
   }
}