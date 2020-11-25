package visiual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistroEmpresa extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Registra tu empresa\r\n");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroEmpresa frame = new RegistroEmpresa();
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
	public RegistroEmpresa() {
		setTitle("Registro de empresa");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 319, 256);
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.ITALIC, 15));
		lblNewLabel.setBounds(82, 11, 149, 31);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre\r\n");
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(25, 68, 68, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(103, 66, 187, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblTelefono.setBounds(25, 99, 68, 14);
		panel.add(lblTelefono);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 97, 187, 20);
		panel.add(textField_1);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblDireccion.setBounds(25, 130, 68, 14);
		panel.add(lblDireccion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 128, 187, 20);
		panel.add(textField_2);
		
		JLabel lblNombreCeo = new JLabel("Nombre CEO");
		lblNombreCeo.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblNombreCeo.setBounds(10, 157, 83, 14);
		panel.add(lblNombreCeo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(103, 155, 187, 20);
		panel.add(textField_3);
		
		JLabel lblRnc = new JLabel("RNC");
		lblRnc.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblRnc.setBounds(25, 184, 68, 14);
		panel.add(lblRnc);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(103, 182, 187, 20);
		panel.add(textField_4);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(46, 213, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(187, 213, 89, 23);
		panel.add(btnNewButton_1);
	}
}
