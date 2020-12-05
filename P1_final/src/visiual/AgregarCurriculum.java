package visiual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class AgregarCurriculum extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarCurriculum frame = new AgregarCurriculum();
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
	public AgregarCurriculum() {
		setTitle("Crear curriculum");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNuevoCurriculum = new JLabel("Nuevo curriculum");
		lblNuevoCurriculum.setFont(new Font("Yu Gothic UI", Font.ITALIC, 15));
		lblNuevoCurriculum.setBounds(142, 11, 149, 31);
		panel.add(lblNuevoCurriculum);
		
		JLabel lblNewLabel = new JLabel("Genero");
		lblNewLabel.setBounds(10, 52, 74, 14);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
		comboBox.setBounds(10, 68, 103, 20);
		panel.add(comboBox);
		
		JLabel lblIdiomasDominados = new JLabel("Idiomas dominados");
		lblIdiomasDominados.setBounds(10, 99, 116, 14);
		panel.add(lblIdiomasDominados);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 124, 103, 132);
		panel.add(textArea);
		
		JLabel lblSueldoIdealrd = new JLabel("Sueldo ideal (RD$)");
		lblSueldoIdealrd.setBounds(10, 267, 116, 14);
		panel.add(lblSueldoIdealrd);
		
		textField = new JTextField();
		textField.setBounds(5, 282, 108, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lbltieneLicenciaDe = new JLabel("\u00BFTiene licencia de conducir?");
		lbltieneLicenciaDe.setBounds(10, 313, 176, 14);
		panel.add(lbltieneLicenciaDe);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(92, 334, 21, 23);
		panel.add(chckbxNewCheckBox);
	}
}
