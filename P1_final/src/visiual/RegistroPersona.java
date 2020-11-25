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

public class RegistroPersona extends JFrame {

	private JPanel contentPane;
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
					RegistroPersona frame = new RegistroPersona();
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
	public RegistroPersona() {
		setTitle("Registro de Persona");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(SystemColor.inactiveCaption);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblRegistroDePersona = new JLabel("Registro de persona");
		lblRegistroDePersona.setFont(new Font("Yu Gothic UI", Font.ITALIC, 15));
		lblRegistroDePersona.setBounds(82, 11, 149, 31);
		panel.add(lblRegistroDePersona);
		
		JLabel label_1 = new JLabel("Nombre\r\n");
		label_1.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		label_1.setBounds(25, 68, 68, 14);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(103, 66, 187, 20);
		panel.add(textField);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblCedula.setBounds(25, 99, 68, 14);
		panel.add(lblCedula);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 97, 187, 20);
		panel.add(textField_1);
		
		JLabel label_3 = new JLabel("Direccion");
		label_3.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		label_3.setBounds(25, 130, 68, 14);
		panel.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 128, 187, 20);
		panel.add(textField_2);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblTelefono.setBounds(25, 155, 68, 14);
		panel.add(lblTelefono);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(103, 155, 187, 20);
		panel.add(textField_3);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		lblNacionalidad.setBounds(10, 184, 83, 14);
		panel.add(lblNacionalidad);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(103, 182, 187, 20);
		panel.add(textField_4);
		
		JButton button = new JButton("Registrar");
		button.setBounds(46, 213, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Borrar");
		button_1.setForeground(Color.RED);
		button_1.setBounds(187, 213, 89, 23);
		panel.add(button_1);
	}

}
