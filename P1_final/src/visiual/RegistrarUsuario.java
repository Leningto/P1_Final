package visiual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class RegistrarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtNacionalidad;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JRadioButton rdbtnTecnico;
	private JRadioButton rdbtnObrero;
	private JLabel lblCarrera;
	private JComboBox cbxCarrera;
	private JLabel lblAreaDesarrollo;
	private JComboBox cbxAreaDesarrollo;
	private JLabel lblHabilidades;
	private JComboBox cbxHabilidades;
	private JPanel panelActividad;
	private JRadioButton rdbtUniversitario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarUsuario dialog = new RegistrarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarUsuario() {
		setTitle("Registrar Usuario");
		setBounds(100, 100, 605, 435);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.info);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(0, 0, 228, 355);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCedula = new JLabel("C\u00E9dula:");
				lblCedula.setBounds(10, 29, 50, 23);
				panel.add(lblCedula);
			}
			
			txtCedula = new JTextField();
			txtCedula.setBounds(10, 57, 120, 23);
			panel.add(txtCedula);
			txtCedula.setColumns(10);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(10, 85, 50, 23);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(10, 113, 150, 23);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblNacionalidad = new JLabel("Nacionalidad:");
			lblNacionalidad.setBounds(10, 141, 82, 23);
			panel.add(lblNacionalidad);
			
			txtNacionalidad = new JTextField();
			txtNacionalidad.setBounds(10, 169, 120, 23);
			panel.add(txtNacionalidad);
			txtNacionalidad.setColumns(10);
			
			JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
			lblDireccion.setBounds(10, 197, 60, 23);
			panel.add(lblDireccion);
			
			txtDireccion = new JTextField();
			txtDireccion.setBounds(10, 225, 150, 23);
			panel.add(txtDireccion);
			txtDireccion.setColumns(10);
			
			JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
			lblTelefono.setBounds(10, 253, 60, 23);
			panel.add(lblTelefono);
			
			txtTelefono = new JTextField();
			txtTelefono.setBounds(10, 281, 120, 23);
			panel.add(txtTelefono);
			txtTelefono.setColumns(10);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
			comboBox.setBounds(10, 324, 150, 20);
			panel.add(comboBox);
			
			JLabel lblGenero = new JLabel("Genero:");
			lblGenero.setBounds(10, 303, 60, 23);
			panel.add(lblGenero);
		}
		
		JPanel panelInformacion = new JPanel();
		panelInformacion.setBackground(SystemColor.info);
		panelInformacion.setBorder(new TitledBorder(null, "Informaci\u00F3n a completar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInformacion.setBounds(226, 0, 363, 355);
		contentPanel.add(panelInformacion);
		panelInformacion.setLayout(null);
		
		JLabel lblTipoVacante = new JLabel("Tipo de vacante:");
		lblTipoVacante.setBounds(10, 29, 108, 23);
		panelInformacion.add(lblTipoVacante);
		
		rdbtUniversitario = new JRadioButton("Universitario");
		rdbtUniversitario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtUniversitario.setSelected(true);
				rdbtnTecnico.setSelected(false);
				rdbtnObrero.setSelected(false);
				panelActividad.setVisible(true);
				lblCarrera.setVisible(true);
				cbxCarrera.setVisible(true);
				lblAreaDesarrollo.setVisible(false);
				cbxAreaDesarrollo.setVisible(false);
				lblHabilidades.setVisible(false);
				cbxHabilidades.setVisible(false);
			}
		});
		rdbtUniversitario.setBackground(SystemColor.info);
		rdbtUniversitario.setBounds(9, 67, 109, 23);
		panelInformacion.add(rdbtUniversitario);
		
		rdbtnTecnico = new JRadioButton("T\u00E9cnico");
		rdbtnTecnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtUniversitario.setSelected(false);
				rdbtnTecnico.setSelected(true);
				rdbtnObrero.setSelected(false);
				panelActividad.setVisible(true);
				lblCarrera.setVisible(false);
				cbxCarrera.setVisible(false);
				lblAreaDesarrollo.setVisible(true);
				cbxAreaDesarrollo.setVisible(true);
				lblHabilidades.setVisible(false);
				cbxHabilidades.setVisible(false);
			}
		});
		rdbtnTecnico.setBackground(SystemColor.info);
		rdbtnTecnico.setBounds(127, 67, 109, 23);
		panelInformacion.add(rdbtnTecnico);
		
		rdbtnObrero = new JRadioButton("Obrero");
		rdbtnObrero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtUniversitario.setSelected(false);
				rdbtnTecnico.setSelected(false);
				rdbtnObrero.setSelected(true);
				panelActividad.setVisible(true);
				lblCarrera.setVisible(false);
				cbxCarrera.setVisible(false);
				lblAreaDesarrollo.setVisible(false);
				cbxAreaDesarrollo.setVisible(false);
				lblHabilidades.setVisible(true);
				cbxHabilidades.setVisible(true);
			}
		});
		rdbtnObrero.setBackground(SystemColor.info);
		rdbtnObrero.setBounds(245, 67, 109, 23);
		panelInformacion.add(rdbtnObrero);
		
		panelActividad = new JPanel();
		panelActividad.setBackground(SystemColor.info);
		panelActividad.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelActividad.setBounds(0, 109, 363, 217);
		panelInformacion.add(panelActividad);
		panelActividad.setLayout(null);
		
		lblCarrera = new JLabel("Carrera:");
		lblCarrera.setBounds(71, 37, 59, 23);
		panelActividad.add(lblCarrera);
		
		cbxCarrera = new JComboBox();
		cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"Derecho", "Telematica", "Administracion", "Programacion"}));
		cbxCarrera.setBounds(136, 37, 120, 23);
		panelActividad.add(cbxCarrera);
		
		lblAreaDesarrollo = new JLabel("\u00C1rea de desarrollo:");
		lblAreaDesarrollo.setBounds(10, 97, 120, 23);
		panelActividad.add(lblAreaDesarrollo);
		
		lblHabilidades = new JLabel("Habilidades:");
		lblHabilidades.setBounds(48, 157, 69, 23);
		panelActividad.add(lblHabilidades);
		
		cbxHabilidades = new JComboBox();
		cbxHabilidades.setModel(new DefaultComboBoxModel(new String[] {"Carpintero", "Constructor", "Electricista", "Plomero"}));
		cbxHabilidades.setBounds(136, 157, 120, 23);
		panelActividad.add(cbxHabilidades);
		
		cbxAreaDesarrollo = new JComboBox();
		cbxAreaDesarrollo.setModel(new DefaultComboBoxModel(new String[] {"Agronomia", "Contabilidad", "Enfermeria", "Informatica"}));
		cbxAreaDesarrollo.setBounds(136, 97, 120, 23);
		panelActividad.add(cbxAreaDesarrollo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.window);
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton RegistrarButton = new JButton("Registrar");
				RegistrarButton.setActionCommand("OK");
				buttonPane.add(RegistrarButton);
				getRootPane().setDefaultButton(RegistrarButton);
			}
			{
				JButton cancelarButton = new JButton("Cancelar");
				cancelarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				cancelarButton.setActionCommand("Cancel");
				buttonPane.add(cancelarButton);
			}
		}
	}
}
