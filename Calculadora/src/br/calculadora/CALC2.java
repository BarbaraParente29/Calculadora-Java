package br.calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class CALC2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	
	private Integer num1;
	private Integer num2;
	private String operador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALC2 frame = new CALC2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CALC2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setEditable(false);
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		btnNewButton_1 = new JButton("9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '9');
				}else {
					num2 = Integer.parseInt(valor_anterior + '9');
				}
				
				textField.setText(valor_anterior + "9");
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '8');
				}else {
					num2 = Integer.parseInt(valor_anterior + '8');
				}
				
				textField.setText(valor_anterior + "8");
			}
		});
		panel.add(btnNewButton_4);
		
		btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '7');
				}else {
					num2 = Integer.parseInt(valor_anterior + '7');
				}
				
				textField.setText(valor_anterior + "7");
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "/";
			}
		});
		panel.add(btnNewButton_8);
		
		btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '6');
				}else {
					num2 = Integer.parseInt(valor_anterior + '6');
				}
				
				textField.setText(valor_anterior + '6');
			}
		});
		panel.add(btnNewButton_12);
		
		btnNewButton_9 = new JButton("5");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '5');
				}else {
					num2 = Integer.parseInt(valor_anterior + '5');
				}
				
				textField.setText(valor_anterior + '5');
			}
		});
		panel.add(btnNewButton_9);
		
		btnNewButton_15 = new JButton("4");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '4');
				}else {
					num2 = Integer.parseInt(valor_anterior + '4');
				}
				
				textField.setText(valor_anterior + "4");
			}
		});
		panel.add(btnNewButton_15);
		
		btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "*";
			}
		});
		panel.add(btnNewButton_14);
		
		btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '3');
				}else {
					num2 = Integer.parseInt(valor_anterior + '3');
				}
				
				textField.setText(valor_anterior + "3");
			}
		});
		panel.add(btnNewButton_13);
		
		btnNewButton_10 = new JButton("2");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '2');
				}else {
					num2 = Integer.parseInt(valor_anterior + '2');
				}
				
				textField.setText(valor_anterior + "2");
			}
		});
		panel.add(btnNewButton_10);
		
		btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '1');
				}else {
					num2 = Integer.parseInt(valor_anterior + '1');
				}
				
				textField.setText(valor_anterior + "1");
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "-";
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor_anterior = textField.getText();
				if(operador == null) { 
					num1 = Integer.parseInt(valor_anterior + '0');
				}else {
					num2 = Integer.parseInt(valor_anterior + '0');
				}
				
				textField.setText(valor_anterior + "0");
			}
		});
		panel.add(btnNewButton_11);
		
		btnNewButton_6 = new JButton("=");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(operador) {
					case "+":  textField.setText(num1 + num2 + "");
								break;
					case "-":  textField.setText(num1 - num2 + "");
					break;
					
					case "*":  textField.setText(num1 * num2 + "");
					break;
					
					case "/":  textField.setText(num1 / num2 + "");
					break;
				
				}
			}
		});
		panel.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("CE");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				num1 = null;
				num2 = null;
				operador = null;

			}
		});
		panel.add(btnNewButton_7);
		
		btnNewButton_5 = new JButton("+");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				operador = "+";
			}
		});
		panel.add(btnNewButton_5);
	}

}
