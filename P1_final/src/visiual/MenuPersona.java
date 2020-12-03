package visiual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MenuPersona extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPersona frame = new MenuPersona();
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
	public MenuPersona() {
		setTitle("Persona");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 93, 239, 304);
		panel.add(list);
		
		JLabel lblNewLabel = new JLabel("Su lista de curriculums activos");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(58, 68, 155, 14);
		panel.add(lblNewLabel);
		
		JLabel lblBievenido = new JLabel("Bievenido");
		lblBievenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBievenido.setFont(new Font("Century", Font.ITALIC, 15));
		lblBievenido.setForeground(Color.WHITE);
		lblBievenido.setBounds(26, 11, 208, 46);
		panel.add(lblBievenido);
		
		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.setBounds(10, 422, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(160, 422, 89, 23);
		panel.add(btnNewButton_1);
	}
}
