package visiual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaLaboral;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			/*	FileInputStream empresa;
				FileOutputStream empresa2;
				ObjectInputStream empresaRead;
				ObjectOutputStream empresaWrite;
				try {
					empresa = new FileInputStream ("bolsa.dat");
					empresaRead = new ObjectInputStream(empresa);
					BolsaLaboral temp = (BolsaLaboral)empresaRead.readObject();
					BolsaLaboral. setBolsa(temp);
					empresa.close();
					empresaRead.close();
				} catch (FileNotFoundException e) {
					try {
						empresa2 = new  FileOutputStream("bolsa.dat");
						empresaWrite = new ObjectOutputStream(empresa2);
						//User aux = new User("Administrador", "Admin", "Admin");
						//Control.getInstance().regUser(aux);
						empresaWrite.writeObject(BolsaLaboral.getInstance());
						empresa2.close();
						empresaWrite.close();
					} catch (FileNotFoundException e1) {
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
				} catch (IOException e) {
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				try {
					Principal frame = new Principal();
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
	public Principal() {
		/*addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FileOutputStream empresa2;
				ObjectOutputStream empresaWrite;
				try {
					empresa2 = new  FileOutputStream("bolsa.dat");
					empresaWrite = new ObjectOutputStream(empresa2);
					empresaWrite.writeObject(BolsaLaboral.getInstance());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});*/
		setTitle("Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 18));
		lblNewLabel.setBounds(222, 11, 121, 28);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Empresa");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Felix Titling", Font.BOLD, 17));
		lblNewLabel_1.setBounds(85, 45, 90, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblPersona = new JLabel("Persona");
		lblPersona.setForeground(Color.DARK_GRAY);
		lblPersona.setFont(new Font("Felix Titling", Font.BOLD, 17));
		lblPersona.setBounds(392, 45, 90, 35);
		panel.add(lblPersona);
		
		textField = new JTextField();
		textField.setBounds(85, 91, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("RNC");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(29, 94, 50, 14);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(290, 50, 23, 148);
		panel.add(separator);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblNombre.setBounds(309, 94, 75, 14);
		panel.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(390, 91, 145, 20);
		panel.add(textField_1);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblCodigo.setBounds(22, 125, 57, 14);
		panel.add(lblCodigo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 122, 145, 20);
		panel.add(textField_2);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblClave.setBounds(309, 125, 61, 14);
		panel.add(lblClave);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(390, 122, 145, 20);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuEmpresas menuE=new MenuEmpresas();
				menuE.setVisible(true);
			}
		});
		btnNewButton.setBounds(29, 163, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnRegistrarNueva = new JButton("Registrar nueva");
		btnRegistrarNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarEmpresa regis=new RegistrarEmpresa();
				regis.setVisible(true);
			}
		});
		btnRegistrarNueva.setForeground(Color.RED);
		btnRegistrarNueva.setBounds(128, 163, 152, 23);
		panel.add(btnRegistrarNueva);
		
		JButton btnRegistrar = new JButton("Ingresar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPersonas menuP=new MenuPersonas();
				menuP.setVisible(true);
			}
		});
		btnRegistrar.setBounds(323, 163, 89, 23);
		panel.add(btnRegistrar);
		
		JButton btnRegistrarNueva_1 = new JButton("Registrar nueva");
		btnRegistrarNueva_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarUsuario regi=new RegistrarUsuario();
				regi.setVisible(true);
			}
		});
		btnRegistrarNueva_1.setForeground(Color.RED);
		btnRegistrarNueva_1.setBounds(422, 163, 152, 23);
		panel.add(btnRegistrarNueva_1);
	}
}
