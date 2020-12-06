package visiual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaVacante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox chckbxEspanol;
	private JCheckBox chckbxIngles;
	private JCheckBox chckbxFrances;
	private JRadioButton rdbtnUniversitario;
	private JRadioButton rdbtnTecnico;
	private JRadioButton rdbtnObrero;

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
		setBounds(100, 100, 613, 419);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 205));
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
				lblNuevaVacante.setBounds(243, 2, 149, 31);
				panel.add(lblNuevaVacante);
			}
			{
				JLabel label = new JLabel("Puesto de trabajo");
				label.setBounds(10, 48, 116, 23);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(10, 73, 120, 23);
				panel.add(textField);
			}
			{
				JLabel label = new JLabel("Sueldo ideal (RD$)");
				label.setBounds(10, 148, 116, 23);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(10, 173, 120, 23);
				panel.add(textField_1);
			}
			{
				JLabel label = new JLabel("Idiomas dominados");
				label.setBounds(10, 215, 116, 23);
				panel.add(label);
			}
			{
				chckbxEspanol = new JCheckBox("Espanol");
				chckbxEspanol.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						chckbxEspanol.setSelected(true);
						chckbxIngles.setSelected(false);
						chckbxFrances.setSelected(false);
					}
				});
				chckbxEspanol.setBackground(new Color(255, 255, 204));
				chckbxEspanol.setBounds(10, 244, 97, 23);
				panel.add(chckbxEspanol);
			}
			{
				chckbxIngles = new JCheckBox("Ingl\u00E9s");
				chckbxIngles.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						chckbxEspanol.setSelected(false);
						chckbxIngles.setSelected(true);
						chckbxFrances.setSelected(false);
					}
				});
				chckbxIngles.setBackground(new Color(255, 255, 204));
				chckbxIngles.setBounds(10, 270, 97, 23);
				panel.add(chckbxIngles);
			}
			{
				chckbxFrances = new JCheckBox("Franc\u00E9s");
				chckbxFrances.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						chckbxEspanol.setSelected(false);
						chckbxIngles.setSelected(false);
						chckbxFrances.setSelected(true);
					}
				});
				chckbxFrances.setBackground(new Color(255, 255, 204));
				chckbxFrances.setBounds(10, 296, 97, 23);
				panel.add(chckbxFrances);
			}
			{
				JLabel label = new JLabel("Tipo de empleo");
				label.setBounds(10, 98, 116, 23);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(10, 123, 120, 23);
				panel.add(comboBox);
			}
			
			JLabel label = new JLabel("Tipo de vacante:");
			label.setBounds(326, 76, 108, 23);
			panel.add(label);
			
			rdbtnUniversitario = new JRadioButton("Universitario");
			rdbtnUniversitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnUniversitario.setSelected(true);
					rdbtnTecnico.setSelected(false);
					rdbtnObrero.setSelected(false);
				}
			});
			rdbtnUniversitario.setBackground(new Color(255, 250, 205));
			rdbtnUniversitario.setBounds(213, 107, 109, 23);
			panel.add(rdbtnUniversitario);
			
			rdbtnTecnico = new JRadioButton("T\u00E9cnico");
			rdbtnTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnUniversitario.setSelected(false);
					rdbtnTecnico.setSelected(true);
					rdbtnObrero.setSelected(false);
				}
			});
			rdbtnTecnico.setBackground(new Color(255, 250, 205));
			rdbtnTecnico.setBounds(336, 107, 109, 23);
			panel.add(rdbtnTecnico);
			
			rdbtnObrero = new JRadioButton("Obrero");
			rdbtnObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnUniversitario.setSelected(true);
					rdbtnTecnico.setSelected(false);
					rdbtnObrero.setSelected(false);
				}
			});
			rdbtnObrero.setBackground(new Color(255, 250, 205));
			rdbtnObrero.setBounds(460, 107, 109, 23);
			panel.add(rdbtnObrero);
			
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
			comboBox_3.setBounds(213, 295, 116, 23);
			panel.add(comboBox_3);
			
			JLabel lblGeneroPredilecto = new JLabel("Genero predilecto");
			lblGeneroPredilecto.setBounds(213, 270, 116, 23);
			panel.add(lblGeneroPredilecto);
			
			JLabel lblCiudad = new JLabel("Ciudad");
			lblCiudad.setBounds(404, 270, 116, 23);
			panel.add(lblCiudad);
			
			textField_2 = new JTextField();
			textField_2.setBounds(404, 295, 116, 23);
			panel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton CrearButton = new JButton("Crear");
				CrearButton.setActionCommand("OK");
				buttonPane.add(CrearButton);
				getRootPane().setDefaultButton(CrearButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
