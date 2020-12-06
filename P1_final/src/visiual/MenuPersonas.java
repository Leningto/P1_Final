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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

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
		setBounds(100, 100, 373, 444);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 204));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblcurriculums = new JLabel("Su lista de solicitudes activas");
		lblcurriculums.setForeground(new Color(0, 0, 0));
		lblcurriculums.setBounds(89, 57, 180, 23);
		contentPanel.add(lblcurriculums);
		
		JList list = new JList();
		list.setBounds(37, 82, 281, 214);
		contentPanel.add(list);
		
		JLabel lblBienvenidos = new JLabel("Bievenido");
		lblBienvenidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidos.setForeground(new Color(0, 0, 0));
		lblBienvenidos.setFont(new Font("Century", Font.ITALIC, 15));
		lblBienvenidos.setBounds(70, 0, 208, 35);
		contentPanel.add(lblBienvenidos);
		
		JLabel lblusuario = new JLabel("USUARIO");
		lblusuario.setBackground(new Color(255, 255, 204));
		lblusuario.setBounds(150, 34, 70, 23);
		contentPanel.add(lblusuario);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setBackground(new Color(255, 255, 204));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnAgregar = new JButton("Agregar");
			buttonPane.add(btnAgregar);
			btnAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//agregar curriculums
					NuevoCurriculum nuevo=new NuevoCurriculum();
					nuevo.setVisible(true);
				}
			});
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				
				JButton btnEliminar = new JButton("Eliminar");
				buttonPane.add(btnEliminar);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
