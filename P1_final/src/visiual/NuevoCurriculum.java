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
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoCurriculum extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JCheckBox chckbxIngles;
	private JCheckBox chckbxFrances;
	private JCheckBox chckbxEspanol;
	private JCheckBox chckbxSi;
	private JCheckBox chckbxNo;

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
		setTitle("Creacion de solicitud");
		setBounds(100, 100, 326, 333);
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
			
			JLabel lblNuevaSolicitud = new JLabel("Nueva solicitud");
			lblNuevaSolicitud.setFont(new Font("Yu Gothic UI", Font.ITALIC, 15));
			lblNuevaSolicitud.setBounds(96, 1, 130, 31);
			panel.add(lblNuevaSolicitud);
			
			JLabel label_1 = new JLabel("Idiomas dominados");
			label_1.setBounds(10, 43, 116, 23);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("Sueldo ideal (RD$)");
			label_2.setBounds(161, 95, 116, 23);
			panel.add(label_2);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(161, 121, 108, 23);
			panel.add(textField);
			
			JLabel label_3 = new JLabel("\u00BFTiene licencia de conducir?");
			label_3.setBounds(123, 150, 180, 23);
			panel.add(label_3);
			
			chckbxSi = new JCheckBox("");
			chckbxSi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chckbxSi.setSelected(true);
					chckbxNo.setSelected(false);
					
				}
			});
			chckbxSi.setBackground(new Color(255, 255, 204));
			chckbxSi.setBounds(179, 173, 21, 23);
			panel.add(chckbxSi);
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				buttonPane.setBounds(0, 251, 300, 33);
				panel.add(buttonPane);
				buttonPane.setBackground(Color.WHITE);
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
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
			
			chckbxEspanol = new JCheckBox("Espanol");
			chckbxEspanol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chckbxEspanol.setSelected(true);
					chckbxIngles.setSelected(false);
					chckbxFrances.setSelected(false);
					
				}
				
			});
			chckbxEspanol.setBackground(new Color(255, 255, 204));
			chckbxEspanol.setBounds(10, 69, 97, 23);
			panel.add(chckbxEspanol);
			
			chckbxIngles = new JCheckBox("Ingles");
			chckbxIngles.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chckbxEspanol.setSelected(false);
					chckbxIngles.setSelected(true);
					chckbxFrances.setSelected(false);
				}
			});
			chckbxIngles.setBackground(new Color(255, 255, 204));
			chckbxIngles.setBounds(10, 95, 97, 23);
			panel.add(chckbxIngles);
			
			chckbxFrances = new JCheckBox("Frances");
			chckbxFrances.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chckbxEspanol.setSelected(false);
					chckbxIngles.setSelected(false);
					chckbxFrances.setSelected(true);
				}
			});
			chckbxFrances.setBackground(new Color(255, 255, 204));
			chckbxFrances.setBounds(10, 121, 97, 23);
			panel.add(chckbxFrances);
			
			JLabel lblPuestoDeTrabajo = new JLabel("Puesto de trabajo");
			lblPuestoDeTrabajo.setBounds(161, 43, 116, 23);
			panel.add(lblPuestoDeTrabajo);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(161, 69, 108, 23);
			panel.add(textField_1);
			
			JLabel lblTipoDeEmpleo = new JLabel("Tipo de empleo");
			lblTipoDeEmpleo.setBounds(10, 170, 97, 23);
			panel.add(lblTipoDeEmpleo);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tiempo Completo", "Tiempo Parcial", "A distancia"}));
			comboBox.setBounds(10, 196, 130, 23);
			panel.add(comboBox);
			
			JLabel lblSi = new JLabel("Si");
			lblSi.setBounds(161, 173, 22, 23);
			panel.add(lblSi);
			
			JLabel lblNo = new JLabel("No");
			lblNo.setBounds(206, 173, 22, 23);
			panel.add(lblNo);
			
			chckbxNo = new JCheckBox("");
			chckbxNo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chckbxSi.setSelected(false);
					chckbxNo.setSelected(true);
				}
			});
			chckbxNo.setBackground(new Color(255, 250, 205));
			chckbxNo.setBounds(228, 173, 21, 23);
			panel.add(chckbxNo);
		}
	}
}
