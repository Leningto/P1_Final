package visiual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Empresa;
import logico.Persona;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtRNC;
	private JTextField txtNombreCeo;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtNombre;

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
		contentPanel.setBackground(new Color(255, 250, 205));
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
				JLabel lblNombre = new JLabel("Nombre\r\n:");
				lblNombre.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				lblNombre.setBounds(45, 66, 68, 23);
				panel.add(lblNombre);
			}
			{
				JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
				lblTelefono.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				lblTelefono.setBounds(43, 97, 68, 23);
				panel.add(lblTelefono);
			}
			{
				JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
				lblDireccion.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				lblDireccion.setBounds(40, 128, 68, 23);
				panel.add(lblDireccion);
			}
			{
				JLabel lblNombreCeo = new JLabel("Nombre CEO:");
				lblNombreCeo.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				lblNombreCeo.setBounds(16, 159, 83, 23);
				panel.add(lblNombreCeo);
			}
			{
				JLabel lblRNC = new JLabel("RNC:");
				lblRNC.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
				lblRNC.setBounds(68, 190, 68, 23);
				panel.add(lblRNC);
			}
			{
				txtRNC = new JTextField();
				txtRNC.setColumns(10);
				txtRNC.setBounds(120, 190, 187, 23);
				panel.add(txtRNC);
			}
			{
				txtNombreCeo = new JTextField();
				txtNombreCeo.setColumns(10);
				txtNombreCeo.setBounds(120, 159, 187, 23);
				panel.add(txtNombreCeo);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setColumns(10);
				txtDireccion.setBounds(120, 128, 187, 23);
				panel.add(txtDireccion);
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				txtTelefono.setBounds(120, 97, 187, 23);
				panel.add(txtTelefono);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setColumns(10);
				txtNombre.setBounds(120, 66, 187, 23);
				panel.add(txtNombre);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.WHITE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton RegistrarButton = new JButton("Registrar");
				RegistrarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						
						
						
						
						Empresa emp=null;
						
						String nombre=txtNombre.getText();
						String telefono=txtTelefono.getText();
						String direccion=txtDireccion.getText();
						String nombreCeo=txtNombreCeo.getText();
						String RNC=txtRNC.getText();			
					}
					
					
					
					
					
					
				});
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
