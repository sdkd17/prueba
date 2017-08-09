package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import logica.IControladorUsuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class EliminarUsuario extends JInternalFrame {

	private IControladorUsuario controlUsr;
	private JTextField textFieldNombre;

	/**
	 * Create the frame.
	 */
	public EliminarUsuario(IControladorUsuario icu) {
		setTitle("Eliminar Usuario");
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel();
		getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//operar con el icu
			}
		});
		
		JLabel labelNombre = new JLabel("Ingresar Nombre:");
		panelNorte.add(labelNombre);
		
		textFieldNombre = new JTextField();
		panelNorte.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		btnEliminar.setToolTipText("Elimina el usuario ingresado si existe en el sistema");
		panelNorte.add(btnEliminar);
		
		JPanel panelSur = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelSur.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panelSur, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//Cerrar la ventana
				
			}
		});
		panelSur.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
					// Cerrar la ventana
			}
		});
		panelSur.add(btnNewButton);
		
		controlUsr = icu;
		
		
	}

}
