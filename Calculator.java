package calc;


	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;

	public class Calculator implements ActionListener {

	    boolean isOperatorClicked = false;

	    JFrame jf;
	    JLabel displayLabel;
	    JButton sevenButton;

	    String oldValue;
	    String operator;
	    JButton sqrtButton;

	    
	    JButton backspaceButton;
	    JButton percentageButton;

	    JButton eightButton;
	    JButton nineButton;
	    JButton fourButton;
	    JButton fiveButton;
	    JButton sixButton;
	    JButton oneButton;
	    JButton twoButton;
	    JButton threeButton;
	    JButton dotButton;
	    JButton zeroButton;
	    JButton equalButton, divButton, mulButton, plusButton, minusButton, clearButton;

	    public Calculator() {

	        jf = new JFrame("Calculator");
	        jf.setLayout(null);
	        jf.setSize(600, 600);
	        jf.setLocation(300, 90);

	        displayLabel = new JLabel();
	        displayLabel.setBounds(30, 35, 530, 70);
	        displayLabel.setBackground(new Color(176, 156, 255));
	        displayLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 8)); 

	     


	        displayLabel.setFont(new Font("Arial", Font.PLAIN, 60));
	        displayLabel.setOpaque(true);

	        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	        displayLabel.setForeground(Color.WHITE);
	        jf.add(displayLabel);

	        sevenButton = new JButton("7");
	        sevenButton.setBounds(30, 130, 80, 80);
	        sevenButton.setBackground(Color.WHITE);
	        sevenButton.setForeground(new Color(54, 38, 85));
	        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        sevenButton.addActionListener(this);
	        jf.add(sevenButton);

	        eightButton = new JButton("8");
	        eightButton.setBounds(130, 130, 80, 80);
	        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        eightButton.setBackground(Color.WHITE);
	        eightButton.setForeground(new Color(54, 38, 85));
	        eightButton.addActionListener(this);
	        jf.add(eightButton);

	        nineButton = new JButton("9");
	        nineButton.setBounds(230, 130, 80, 80);
	        nineButton.setBackground(Color.WHITE);
	        nineButton.setForeground(new Color(54, 38, 85));
	        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        nineButton.addActionListener(this);
	        jf.add(nineButton);

	        fourButton = new JButton("4");
	        fourButton.setBounds(30, 230, 80, 80);
	        fourButton.setBackground(Color.WHITE);
	        fourButton.setForeground(new Color(54, 38, 85));
	        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        fourButton.addActionListener(this);
	        jf.add(fourButton);

	        fiveButton = new JButton("5");
	        fiveButton.setBounds(130, 230, 80, 80);
	        fiveButton.setBackground(Color.WHITE);
	        fiveButton.setForeground(new Color(54, 38, 85));
	        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        fiveButton.addActionListener(this);
	        jf.add(fiveButton);

	        sixButton = new JButton("6");
	        sixButton.setBounds(230, 230, 80, 80);
	        sixButton.setBackground(Color.WHITE);
	        sixButton.setForeground(new Color(54, 38, 85));
	        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        sixButton.addActionListener(this);
	        jf.add(sixButton);

	        oneButton = new JButton("1");
	        oneButton.setBounds(30, 330, 80, 80);
	        oneButton.setBackground(Color.WHITE);
	        oneButton.setForeground(new Color(54, 38, 85));
	        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        oneButton.addActionListener(this);
	        jf.add(oneButton);

	        twoButton = new JButton("2");
	        twoButton.setBounds(130, 330, 80, 80);
	        twoButton.setBackground(Color.WHITE);
	        twoButton.setForeground(new Color(54, 38, 85));
	        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        twoButton.addActionListener(this);
	        jf.add(twoButton);

	        threeButton = new JButton("3");
	        threeButton.setBounds(230, 330, 80, 80);
	        threeButton.setBackground(Color.WHITE);
	        threeButton.setForeground(new Color(54, 38, 85));
	        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        threeButton.addActionListener(this);
	        jf.add(threeButton);

	        dotButton = new JButton(".");
	        dotButton.setBounds(30, 430, 80, 80);
	        dotButton.setBackground(Color.WHITE);
	        dotButton.setForeground(new Color(50, 38, 85));
	        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        dotButton.addActionListener(this);
	        jf.add(dotButton);

	        zeroButton = new JButton("0");
	        zeroButton.setBounds(130, 430, 80, 80);
	        zeroButton.setBackground(Color.WHITE);
	        zeroButton.setForeground(new Color(40, 38, 85));
	        jf.add(zeroButton);
	        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        zeroButton.addActionListener(this);

	        equalButton = new JButton("=");
	        equalButton.setBounds(230, 430, 80, 80);
	        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        equalButton.setBackground(new Color(176,156,225)); 

	        equalButton.addActionListener(this);
	        jf.add(equalButton);

	        divButton = new JButton("/");
	        divButton.setBounds(330, 130, 80, 80);
	        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        divButton.setBackground(new Color(176, 156, 255));
	        divButton.addActionListener(this);
	        jf.add(divButton);

	        mulButton = new JButton("x");
	        mulButton.setBounds(330, 230, 80, 80);
	        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        mulButton.setBackground(new Color(176, 156, 255));
	        mulButton.addActionListener(this);
	        jf.add(mulButton);

	        minusButton = new JButton("-");
	        minusButton.setBounds(330, 330, 80, 80);
	        minusButton.setFont(new Font("Arial", Font.PLAIN, 60));
	        minusButton.setBackground(new Color(176, 156, 255));
	        minusButton.addActionListener(this);
	        jf.add(minusButton);

	        plusButton = new JButton("+");
	        plusButton.setBounds(330, 430, 80, 80);
	        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        plusButton.setBackground(new Color(176, 156, 255));
	        plusButton.addActionListener(this);
	        jf.add(plusButton);

	        clearButton = new JButton("clear");
	        clearButton.setBounds(430, 430, 130, 80);
	        clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        clearButton.setBackground(new Color(176, 156, 255));
	        clearButton.addActionListener(this);
	        jf.add(clearButton);

	        backspaceButton = new JButton("←");
	        backspaceButton.setBounds(430, 330, 130, 80);
	        backspaceButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        backspaceButton.setBackground(new Color(176, 156, 255));
	        backspaceButton.addActionListener(this);
	        jf.add(backspaceButton);
	        
	        percentageButton = new JButton("%");
	        percentageButton.setBounds(430, 230, 130, 80);
	        percentageButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        percentageButton.setBackground(new Color(176, 156, 255));
	        percentageButton.addActionListener(this);
	        jf.add(percentageButton);
	        
	        sqrtButton = new JButton("√");
	        sqrtButton.setBounds(430, 130, 130, 80);
	        sqrtButton.setFont(new Font("Arial", Font.PLAIN, 40));
	        sqrtButton.setBackground(new Color(176, 156, 255));
	        sqrtButton.addActionListener(this);
	        jf.add(sqrtButton);
	        
	        
	        jf.setVisible(true);
	        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {
	        new Calculator();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == sevenButton || e.getSource() == eightButton || e.getSource() == nineButton
	                || e.getSource() == fourButton || e.getSource() == fiveButton || e.getSource() == sixButton
	                || e.getSource() == threeButton || e.getSource() == twoButton || e.getSource() == oneButton
	                || e.getSource() == zeroButton) {
	            handleDigitButton(e);
	        } else if (e.getSource() == dotButton) {
	            handleDotButton();
	        } else if (e.getSource() == plusButton || e.getSource() == minusButton || e.getSource() == mulButton
	                || e.getSource() == divButton) {
	            handleOperatorButton(e);
	        } else if (e.getSource() == equalButton) {
	            handleEqualButton();
	        } else if (e.getSource() == clearButton) {
	        	
	            handleClearButton();
	        }
	        else if (e.getSource() == backspaceButton) {
	            handleBackspaceButton();
	        }
	        
	        else if (e.getSource() == percentageButton) {
	            handlePercentageButton();
	        }
	        else if (e.getSource() == sqrtButton) {
	            handleSqrtButton();
	        }

	    }
	    
	    private void handleSqrtButton() {
	        String currentText = displayLabel.getText();
	        if (!currentText.isEmpty()) {
	            double currentValue = Double.parseDouble(currentText);
	            if (currentValue >= 0) {
	                double sqrtValue = Math.sqrt(currentValue);
	                displayLabel.setText(sqrtValue + "");
	            } else {
	                displayLabel.setText("Error");
	            }
	        }
	    }
	    
	    
	    private void handlePercentageButton() {
	        String currentText = displayLabel.getText();
	        if (!currentText.isEmpty()) {
	            float currentValue = Float.parseFloat(currentText);
	            float percentageValue = currentValue / 100;
	            displayLabel.setText(percentageValue + "");
	        }
	    }

	  
	    	private void handleBackspaceButton() {
	    	    String currentText = displayLabel.getText();
	    	    if (!currentText.isEmpty()) {
	    	        displayLabel.setText(currentText.substring(0, currentText.length() - 1));
	    	    }
	    	}
			
		

		private void handleDigitButton(ActionEvent e) {
	        JButton clickedButton = (JButton) e.getSource();
	        if (isOperatorClicked) {
	            displayLabel.setText(clickedButton.getText());
	            isOperatorClicked = false;
	        } else {
	            displayLabel.setText(displayLabel.getText() + clickedButton.getText());
	        }
	    }

	    private void handleDotButton() {
	        String currentText = displayLabel.getText();
	        if (!currentText.contains(".")) {
	            displayLabel.setText(currentText + ".");
	        }
	    }

	    private void handleOperatorButton(ActionEvent e) {
	        JButton clickedOperatorButton = (JButton) e.getSource();
	        if (!isOperatorClicked) {
	            oldValue = displayLabel.getText();
	            operator = clickedOperatorButton.getText();
	            displayLabel.setText("");
	            isOperatorClicked = true;}
	        }
	 

	    private void handleEqualButton() {
	        String newValue = displayLabel.getText();

	        try { 
	            float oldValueF = Float.parseFloat(oldValue);
	            float newValueF = Float.parseFloat(newValue);

	            switch (operator) {
	                case "+":
	                    displayLabel.setText((oldValueF + newValueF) + "");
	                    break;
	                case "-":
	                    displayLabel.setText((oldValueF - newValueF) + "");
	                    break;
	                case "x":
	                    displayLabel.setText((oldValueF * newValueF) + "");
	                    break;
	                case "/":
	                    if (newValueF != 0) {
	                        displayLabel.setText((oldValueF / newValueF) + "");
	                    } else {
	                        displayLabel.setFont(new Font("Arial", Font.PLAIN, 25)); 
	                        displayLabel.setText("Error: Cannot divide by zero");
	                    }
	                    break;
	                default:
	                    displayLabel.setFont(new Font("Arial", Font.PLAIN, 25));
	                    displayLabel.setText("Error: Invalid operator");
	                    break;
	            }

	            isOperatorClicked = false;
	        } catch (NumberFormatException e) {
	            displayLabel.setFont(new Font("Arial", Font.PLAIN, 25)); 
	            displayLabel.setText("Error: Invalid input");
	        }
	    }

	  
	    private void handleClearButton() {
	        displayLabel.setText("");
	        isOperatorClicked = false;
	    }
	}


