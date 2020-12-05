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

public class RegistrarEmpresa extends JDialog {

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
			RegistrarEmpresa dialog = new RegistrarEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarEmpresa() {
		setTitle("Registro de empresa");
		setBounds(100, 100, 377, 316);
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
				JLabel label = new JLabel("Registra tu empresa\r\n");
				label.setFont(new Font("Yu Gothic UI", Font.ITALIC, 15));
				label.setBounds(99, 11, 149, 31);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Nombre\r\n");
				label.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				label.setBounds(42, 68, 68, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Telefono");
				label.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				label.setBounds(42, 99, 68, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Direccion");
				label.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				label.setBounds(42, 130, 68, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Nombre CEO");
				label.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				label.setBounds(27, 157, 83, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("RNC");
				label.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				label.setBounds(42, 184, 68, 14);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(120, 182, 187, 20);
				panel.add(textField);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(120, 155, 187, 20);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(120, 128, 187, 20);
				panel.add(textField_2);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(120, 97, 187, 20);
				panel.add(textField_3);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(120, 66, 187, 20);
				panel.add(textField_4);
			}
		}
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
