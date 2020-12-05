package visiual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.SystemColor;

public class RegistrarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarUsuario dialog = new RegistrarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarUsuario() {
		setTitle("Registrar Usuario");
		setBounds(100, 100, 605, 435);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.info);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(0, 0, 228, 355);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("C\u00E9dula:");
				lblNewLabel.setBounds(10, 29, 50, 23);
				panel.add(lblNewLabel);
			}
			
			textField = new JTextField();
			textField.setBounds(10, 57, 120, 23);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Nombre:");
			lblNewLabel_1.setBounds(10, 85, 50, 23);
			panel.add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(10, 113, 150, 23);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Nacionalidad:");
			lblNewLabel_2.setBounds(10, 141, 82, 23);
			panel.add(lblNewLabel_2);
			
			textField_2 = new JTextField();
			textField_2.setBounds(10, 169, 120, 23);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n:");
			lblNewLabel_3.setBounds(10, 197, 60, 23);
			panel.add(lblNewLabel_3);
			
			textField_3 = new JTextField();
			textField_3.setBounds(10, 225, 150, 23);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
			lblNewLabel_4.setBounds(10, 253, 60, 23);
			panel.add(lblNewLabel_4);
			
			textField_4 = new JTextField();
			textField_4.setBounds(10, 281, 120, 23);
			panel.add(textField_4);
			textField_4.setColumns(10);
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.info);
		panel.setBorder(new TitledBorder(null, "Informaci\u00F3n a completar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(226, 0, 363, 355);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo de vacante:");
		lblNewLabel_5.setBounds(10, 29, 108, 23);
		panel.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Universitario");
		rdbtnNewRadioButton.setBackground(SystemColor.info);
		rdbtnNewRadioButton.setBounds(9, 67, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("T\u00E9cnico");
		rdbtnNewRadioButton_1.setBackground(SystemColor.info);
		rdbtnNewRadioButton_1.setBounds(127, 67, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Obrero");
		rdbtnNewRadioButton_2.setBackground(SystemColor.info);
		rdbtnNewRadioButton_2.setBounds(245, 67, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.info);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 109, 363, 217);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Carrera:");
		lblNewLabel_6.setBounds(71, 37, 59, 23);
		panel_1.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(136, 37, 120, 23);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("\u00C1rea de desarrollo:");
		lblNewLabel_7.setBounds(10, 97, 120, 23);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Habilidades:");
		lblNewLabel_8.setBounds(48, 157, 69, 23);
		panel_1.add(lblNewLabel_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(136, 157, 120, 23);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(136, 97, 120, 23);
		panel_1.add(comboBox_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.window);
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
