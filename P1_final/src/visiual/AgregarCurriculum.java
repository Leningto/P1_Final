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

public class AgregarCurriculum extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(28, 43, 46, 14);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
		comboBox.setBounds(10, 68, 92, 20);
		panel.add(comboBox);
	}
}
