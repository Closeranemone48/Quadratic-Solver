import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JPanel outputPanel;
	private JPanel inputPanel;
	private JLabel welcomeLabel;
	private JLabel inputA;
	private JFormattedTextField aInput;
	private JLabel inputB;
	private JFormattedTextField bInput;
	private JLabel inputC;
	private JFormattedTextField cInput;
	private JLabel output;
	private JTextArea outputArea;
	private JButton go;
	private NumberFormat amountFormat;

	public Frame(String _title) {
		super(_title);
		initComponents();
		pack();
		this.setVisible(true);
		this.getContentPane().setBackground(new java.awt.Color(11, 11, 54));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initComponents() {
		setLayout(new FlowLayout());
		// create components
		mainPanel = new JPanel(new GridLayout(3, 1));
		mainPanel.setBackground(new java.awt.Color(11, 11, 54));
		outputPanel = new JPanel(new FlowLayout());
		outputPanel.setBackground(new java.awt.Color(11, 11, 54));
		inputPanel = new JPanel(new GridLayout(3, 2));
		inputPanel.setBackground(new java.awt.Color(11, 11, 54));
		welcomeLabel = new JLabel(
				"Welcome! Please input the requested values following the format of ax\u00b2 + bx + c = 0 , a \u2260 0"
						+ "\n");
		welcomeLabel.setForeground(Color.white);
		inputA = new JLabel("What is the value of a:");
		aInput = new JFormattedTextField(amountFormat);
		aInput.setValue(Main.a);
		aInput.setColumns(25);
		inputA.setForeground(Color.white);
		inputB = new JLabel("What is the value of b:");
		bInput = new JFormattedTextField(amountFormat);
		bInput.setValue(Main.b);
		bInput.setColumns(25);
		inputB.setForeground(Color.white);
		inputC = new JLabel("What is the value of c:");
		cInput = new JFormattedTextField(amountFormat);
		cInput.setValue(Main.c);
		cInput.setColumns(25);
		inputC.setForeground(Color.white);
		go = new JButton("Go");
		output = new JLabel("When y is zero x is: ");
		output.setForeground(Color.white);
		outputArea = new JTextArea(12, 25);
		amountFormat = NumberFormat.getNumberInstance();
		// add components to the JPanel
		mainPanel.add(welcomeLabel);
		inputPanel.add(inputA);
		inputPanel.add(aInput);
		inputPanel.add(inputB);
		inputPanel.add(bInput);
		inputPanel.add(inputC);
		inputPanel.add(cInput);
		outputPanel.add(go);
		outputPanel.add(output);
		outputPanel.add(outputArea);
		mainPanel.add(inputPanel);
		mainPanel.add(outputPanel);
		// add JPanel to the JFrame
		add(mainPanel);
		// add actionListeners
		go.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent _actionEvent) {
		Object source = _actionEvent.getSource();
		QuadraticEquation q = new QuadraticEquation();
		String result = q.quadraticMath(((Double) aInput.getValue()), ((Double) bInput.getValue()),
				((Double) cInput.getValue()));
		outputArea.append(result + "\n");
	}
}
