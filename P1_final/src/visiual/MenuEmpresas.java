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
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
				JLabel lblBienvenido = new JLabel("Bienvenido");
				lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
				lblBienvenido.setForeground(Color.BLACK);
				lblBienvenido.setFont(new Font("Century", Font.ITALIC, 15));
				lblBienvenido.setBounds(157, 0, 208, 40);
				panel.add(lblBienvenido);
			}
			{
				JLabel label = new JLabel("USUARIO");
				label.setBackground(new Color(255, 255, 204));
				label.setBounds(231, 50, 60, 23);
				panel.add(label);
			}
			{
				JLabel lblVacantesDisponibles = new JLabel("Vacantes disponibles");
				lblVacantesDisponibles.setFont(new Font("Yu Gothic UI", Font.ITALIC, 13));
				lblVacantesDisponibles.setBounds(24, 57, 149, 23);
				panel.add(lblVacantesDisponibles);
			}
			
			JList list = new JList();
			list.setBounds(10, 87, 193, 217);
			panel.add(list);
			
			JButton btnAgregar = new JButton("Agregar");
			btnAgregar.setBounds(10, 314, 92, 23);
			panel.add(btnAgregar);
			
			JButton btnBorrar = new JButton("Borrar");
			btnBorrar.setBounds(111, 314, 92, 23);
			panel.add(btnBorrar);
			
			JButton btnMatchear = new JButton("Matchear");
			btnMatchear.setBounds(213, 175, 97, 46);
			panel.add(btnMatchear);
			
			JList list_1 = new JList();
			list_1.setBounds(320, 87, 193, 217);
			panel.add(list_1);
			
			JLabel lblPosiblesEmpleados = new JLabel("Posibles empleados");
			lblPosiblesEmpleados.setFont(new Font("Yu Gothic UI", Font.ITALIC, 13));
			lblPosiblesEmpleados.setBounds(338, 57, 129, 23);
			panel.add(lblPosiblesEmpleados);
			
			JButton btnContratar = new JButton("Contratar");
			btnContratar.setBounds(320, 314, 92, 23);
			panel.add(btnContratar);
			
			JButton btnDescartar = new JButton("Descartar");
			btnDescartar.setBounds(422, 314, 92, 23);
			panel.add(btnDescartar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton RegistrarButton = new JButton("Registrar");
				RegistrarButton.setActionCommand("OK");
				buttonPane.add(RegistrarButton);
				getRootPane().setDefaultButton(RegistrarButton);
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
