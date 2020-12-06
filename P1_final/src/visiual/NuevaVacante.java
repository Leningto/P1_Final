package visiual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaLaboral;
import logico.Obrero;
import logico.Persona;
import logico.Tecnico;
import logico.Universitario;
import logico.Vacante;
import logico.vancanteUniversitario;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaVacante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevaVacante dialog = new NuevaVacante();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevaVacante() {
		setTitle("Creaci\u00F3n de vacante");
		setBounds(100, 100, 613, 454);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 204));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNuevaVacante = new JLabel("Nueva vacante");
				lblNuevaVacante.setFont(new Font("Yu Gothic UI", Font.ITALIC, 15));
				lblNuevaVacante.setBounds(232, 11, 149, 31);
				panel.add(lblNuevaVacante);
			}
			{
				JLabel label = new JLabel("Puesto de trabajo");
				label.setBounds(10, 48, 116, 14);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(10, 65, 108, 20);
				panel.add(textField);
			}
			{
				JLabel label = new JLabel("Sueldo ideal (RD$)");
				label.setBounds(10, 164, 116, 14);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(10, 189, 108, 20);
				panel.add(textField_1);
			}
			{
				JLabel label = new JLabel("Idiomas dominados");
				label.setBounds(10, 223, 116, 14);
				panel.add(label);
			}
			{
				JCheckBox checkBox = new JCheckBox("Espanol");
				checkBox.setBackground(new Color(255, 255, 204));
				checkBox.setBounds(10, 244, 97, 23);
				panel.add(checkBox);
			}
			{
				JCheckBox checkBox = new JCheckBox("Ingles");
				checkBox.setBackground(new Color(255, 255, 204));
				checkBox.setBounds(10, 270, 97, 23);
				panel.add(checkBox);
			}
			{
				JCheckBox checkBox = new JCheckBox("Frances");
				checkBox.setBackground(new Color(255, 255, 204));
				checkBox.setBounds(10, 296, 97, 23);
				panel.add(checkBox);
			}
			{
				JLabel label = new JLabel("Tipo de empleo");
				label.setBounds(10, 99, 116, 14);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(10, 122, 116, 20);
				panel.add(comboBox);
			}
			
			JLabel label = new JLabel("Tipo de vacante:");
			label.setBounds(326, 76, 108, 23);
			panel.add(label);
			
			JRadioButton radioButton = new JRadioButton("Universitario");
			radioButton.setBackground(SystemColor.info);
			radioButton.setBounds(213, 107, 109, 23);
			panel.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("T\u00E9cnico");
			radioButton_1.setBackground(SystemColor.info);
			radioButton_1.setBounds(336, 107, 109, 23);
			panel.add(radioButton_1);
			
			JRadioButton radioButton_2 = new JRadioButton("Obrero");
			radioButton_2.setBackground(SystemColor.info);
			radioButton_2.setBounds(460, 107, 109, 23);
			panel.add(radioButton_2);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("\u00BFRequiere licencia de conducir?");
			chckbxNewCheckBox.setBackground(new Color(255, 255, 204));
			chckbxNewCheckBox.setBounds(277, 49, 220, 23);
			panel.add(chckbxNewCheckBox);
			
			JLabel label_1 = new JLabel("Carrera:");
			label_1.setBounds(298, 150, 59, 23);
			panel.add(label_1);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(363, 150, 120, 23);
			panel.add(comboBox);
			
			JLabel label_2 = new JLabel("\u00C1rea de desarrollo:");
			label_2.setBounds(237, 184, 120, 23);
			panel.add(label_2);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(363, 188, 120, 23);
			panel.add(comboBox_1);
			
			JLabel label_3 = new JLabel("Habilidades:");
			label_3.setBounds(277, 219, 69, 23);
			panel.add(label_3);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(363, 223, 120, 23);
			panel.add(comboBox_2);
			
			JComboBox comboBox_3 = new JComboBox();
			comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Cualquiera", "Femenino", "Masculino"}));
			comboBox_3.setBounds(213, 306, 116, 20);
			panel.add(comboBox_3);
			
			JLabel lblGeneroPredilecto = new JLabel("Genero predilecto");
			lblGeneroPredilecto.setBounds(213, 274, 116, 23);
			panel.add(lblGeneroPredilecto);
			
			JLabel lblCiudad = new JLabel("Ciudad");
			lblCiudad.setBounds(404, 274, 116, 23);
			panel.add(lblCiudad);
			
			textField_2 = new JTextField();
			textField_2.setBounds(404, 306, 116, 20);
			panel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 204));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						/*
						 * 	Persona per=null;
						
						String cedula=txtCedula.getText();
						String nombre=txtNombre.getText();
						String nacionalidad=txtNacionalidad.getText();
						String telefono=txtTelefono.getText();
						String direccion=txtDireccion.getText();
						String genero=cbxGenreo.getSelectedItem().toString();
						
						if(rdbtUniversitario.isSelected()) {
							String carrera=cbxCarrera.getSelectedItem().toString();
							per=new Universitario(nombre, cedula, telefono, direccion, true, nacionalidad, carrera);
						}
						if(rdbtnTecnico.isSelected()) {
							String area=cbxAreaDesarrollo.getSelectedItem().toString();
							per=new Tecnico(nombre, cedula, telefono, direccion, true, nacionalidad, area);
						}
						if(rdbtnObrero.isSelected()) {
							String Habilidad=cbxHabilidades.getSelectedItem().toString();
							per=new Obrero(nombre, cedula, telefono, direccion, true, nacionalidad, Habilidad);
						}
						if(BolsaLaboral.getInstance().insertarUnsuario(per)) {
							JOptionPane.showMessageDialog(null, "Realizado con EXITO", "Informacion",JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "NO Realizado", "Informacion",JOptionPane.INFORMATION_MESSAGE);
						}
						
					}
						 */
						//Vacante vaca=null;
						
						

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
