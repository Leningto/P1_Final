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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NuevoCurriculum extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoCurriculum dialog = new NuevoCurriculum();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoCurriculum() {
		setTitle("Creacion de curriculum");
		setBounds(100, 100, 326, 285);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 204));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel label = new JLabel("Nuevo curriculum");
			label.setFont(new Font("Yu Gothic UI", Font.ITALIC, 15));
			label.setBounds(84, 11, 149, 31);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Idiomas dominados");
			label_1.setBounds(10, 43, 116, 14);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("Sueldo ideal (RD$)");
			label_2.setBounds(133, 94, 116, 14);
			panel.add(label_2);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(136, 111, 108, 20);
			panel.add(textField);
			
			JLabel label_3 = new JLabel("\u00BFTiene licencia de conducir?");
			label_3.setBounds(133, 135, 176, 14);
			panel.add(label_3);
			
			JCheckBox checkBox = new JCheckBox("");
			checkBox.setBackground(new Color(255, 255, 204));
			checkBox.setBounds(133, 151, 21, 23);
			panel.add(checkBox);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBounds(10, 203, 291, 33);
				panel.add(buttonPane);
				buttonPane.setBackground(new Color(255, 255, 204));
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				{
					JButton okButton = new JButton("OK");
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
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("Espanol");
			chckbxNewCheckBox.setBackground(new Color(255, 255, 204));
			chckbxNewCheckBox.setBounds(10, 55, 97, 23);
			panel.add(chckbxNewCheckBox);
			
			JCheckBox chckbxIngles = new JCheckBox("Ingles");
			chckbxIngles.setBackground(new Color(255, 255, 204));
			chckbxIngles.setBounds(10, 81, 97, 23);
			panel.add(chckbxIngles);
			
			JCheckBox chckbxFrances = new JCheckBox("Frances");
			chckbxFrances.setBackground(new Color(255, 255, 204));
			chckbxFrances.setBounds(10, 108, 97, 23);
			panel.add(chckbxFrances);
			
			JLabel lblPuestoDeTrabajo = new JLabel("Puesto de trabajo");
			lblPuestoDeTrabajo.setBounds(133, 55, 116, 14);
			panel.add(lblPuestoDeTrabajo);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(136, 72, 108, 20);
			panel.add(textField_1);
			
			JLabel lblTipoDeEmpleo = new JLabel("Tipo de empleo");
			lblTipoDeEmpleo.setBounds(10, 137, 116, 14);
			panel.add(lblTipoDeEmpleo);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tiempo Completo", "Tiempo Parcial", "A distancia"}));
			comboBox.setBounds(10, 154, 116, 20);
			panel.add(comboBox);
		}
	}
}
