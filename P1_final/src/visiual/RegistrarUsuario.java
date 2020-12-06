package visiual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.Persona;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		setBounds(100, 100, 605, 447);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 205));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 250, 205));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(0, 0, 228, 380);
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
			comboBox.setBounds(10, 337, 150, 23);
			panel.add(comboBox);
			
			JLabel lblGenero = new JLabel("Genero:");
			lblGenero.setBounds(10, 309, 60, 23);
			panel.add(lblGenero);
		}
		
		JPanel panelInformacion = new JPanel();
		panelInformacion.setBorder(new TitledBorder(null, "Informaci\u00F3n a completar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInformacion.setBackground(new Color(255, 250, 205));
		panelInformacion.setBounds(226, 0, 363, 359);
		contentPanel.add(panelInformacion);
		panelInformacion.setLayout(null);
		
		JLabel lblTipoVacante = new JLabel("Tipo de vacante:");
		lblTipoVacante.setBounds(10, 29, 108, 23);
		panelInformacion.add(lblTipoVacante);
		
		rdbtUniversitario = new JRadioButton("Universitario");
		rdbtUniversitario.setSelected(true);
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
		rdbtUniversitario.setBackground(new Color(255, 250, 205));
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
		rdbtnTecnico.setBackground(new Color(255, 250, 205));
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
		rdbtnObrero.setBackground(new Color(255, 250, 205));
		rdbtnObrero.setBounds(245, 67, 109, 23);
		panelInformacion.add(rdbtnObrero);
		
		panelActividad = new JPanel();
		panelActividad.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelActividad.setBackground(new Color(255, 250, 205));
		panelActividad.setBounds(0, 109, 363, 261);
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
				RegistrarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						/*
						 * Queso aux = null;
						
						String nombre = txtNombre.getText();
						float prebase = Float.parseFloat(txtPrecioBase.getText());
						float preUnitario = Float.parseFloat(txtPrecioUnitario.getText());

						if (rbtnEsfera.isSelected()) {
							float radioEsfera = Float.parseFloat(txtRadioEsfera.getText());
							aux = new Esfera("Q-"+Queseria.getCodigo(),nombre, prebase, preUnitario, radioEsfera);
							//aux=new Esfera(nombre, preciobase, precioUnitario, radioE);
						}
						if (rbtnCilindro.isSelected()) {
							float Radiocilindro = Float.parseFloat(txtradio_CILINDRO.getText());
							float alturacilindro = Float.parseFloat(txtAltura_CILINDRO.getText());
							aux = new Cilindro("Q-"+Queseria.getCodigo(),nombre, prebase, preUnitario, Radiocilindro, alturacilindro);
						}
						if (rbtnCilindroHUECO.isSelected()) {
							float radioInterno = Float.parseFloat(txt_Interno_Hueco.getText());
							float radioExterno = Float.parseFloat(txtrRadioExternoHueco.getText());
							float alturahueco=Float.parseFloat(txtAlturaHueco.getText());
							aux=new CilindroHueco("Q-"+Queseria.getCodigo(),nombre, prebase, preUnitario, radioExterno,alturahueco,radioInterno);
							//aux=new CilindroHueco(nombre, preciobase, precioUnitario, radioExterno, alturahueco, radioInterno)
						}

						if(Queseria.getInstance().insertarQueso(aux)) {
							JOptionPane.showMessageDialog(null, "Realizado con EXITO", "Informacion",JOptionPane.INFORMATION_MESSAGE);
							clean();
						}
						else {
							JOptionPane.showMessageDialog(null, "Realizado con EXITO", "Informacion",JOptionPane.INFORMATION_MESSAGE);
						}
						
					}

						 */
						Persona per=null;
						
						String cedula=txtCedula.getText();
						String nombre=txtNombre.getText();
						String nacionalidad=txtNacionalidad.getText();
						String telefono=txtTelefono.getText();
						
					}
				});
				RegistrarButton.setActionCommand("OK");
				buttonPane.add(RegistrarButton);
				getRootPane().setDefaultButton(RegistrarButton);
			}
			{
				JButton cancelarButton = new JButton("Cancelar");
				cancelarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelarButton.setActionCommand("Cancel");
				buttonPane.add(cancelarButton);
			}
		}
	}
}
