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

public class MenuEmpresas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuEmpresas dialog = new MenuEmpresas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuEmpresas() {
		setTitle("Empresa");
		setBounds(100, 100, 550, 484);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 204));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 204));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("Bievenido");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setForeground(Color.BLACK);
				label.setFont(new Font("Century", Font.ITALIC, 15));
				label.setBounds(140, 0, 208, 46);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("USUARIO");
				label.setBackground(new Color(255, 255, 204));
				label.setBounds(223, 49, 46, 14);
				panel.add(label);
			}
			{
				JLabel lblVacantesDisponibles = new JLabel("Vacantes disponibles");
				lblVacantesDisponibles.setFont(new Font("Yu Gothic UI", Font.ITALIC, 13));
				lblVacantesDisponibles.setBounds(10, 57, 149, 31);
				panel.add(lblVacantesDisponibles);
			}
			
			JList list = new JList();
			list.setBounds(10, 87, 177, 217);
			panel.add(list);
			
			JButton btnNewButton = new JButton("Agregar");
			btnNewButton.setBounds(10, 314, 78, 23);
			panel.add(btnNewButton);
			
			JButton btnBorrar = new JButton("Borrar");
			btnBorrar.setBounds(98, 314, 89, 23);
			panel.add(btnBorrar);
			
			JButton btnNewButton_1 = new JButton("Matchear");
			btnNewButton_1.setBounds(197, 181, 99, 46);
			panel.add(btnNewButton_1);
			
			JList list_1 = new JList();
			list_1.setBounds(306, 87, 193, 217);
			panel.add(list_1);
			
			JLabel lblPosiblesEmpleados = new JLabel("Posibles empleados");
			lblPosiblesEmpleados.setFont(new Font("Yu Gothic UI", Font.ITALIC, 13));
			lblPosiblesEmpleados.setBounds(370, 57, 129, 31);
			panel.add(lblPosiblesEmpleados);
			
			JButton btnNewButton_2 = new JButton("Contratar");
			btnNewButton_2.setBounds(306, 314, 89, 23);
			panel.add(btnNewButton_2);
			
			JButton btnDescartar = new JButton("Descartar");
			btnDescartar.setBounds(410, 314, 89, 23);
			panel.add(btnDescartar);
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
