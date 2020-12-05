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
import javax.swing.SwingConstants;
import javax.swing.JList;

public class MenuPersonas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuPersonas dialog = new MenuPersonas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuPersonas() {
		setTitle("Persona");
		setBounds(100, 100, 373, 399);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 204));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("Su lista de curriculums activos");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setBounds(102, 57, 155, 14);
		contentPanel.add(label_1);
		
		JList list = new JList();
		list.setBounds(37, 82, 281, 195);
		contentPanel.add(list);
		
		JLabel label = new JLabel("Bievenido");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Century", Font.ITALIC, 15));
		label.setBounds(70, 0, 208, 46);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBackground(new Color(255, 255, 204));
		lblNewLabel.setBounds(149, 36, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBounds(37, 294, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(229, 294, 89, 23);
		contentPanel.add(btnEliminar);
		
		JButton btnNewButton_1 = new JButton("Vacantes");
		btnNewButton_1.setBounds(136, 294, 89, 23);
		contentPanel.add(btnNewButton_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 204));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
	}
}
