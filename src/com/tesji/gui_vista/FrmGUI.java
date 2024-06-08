package com.tesji.gui_vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JComboBox cmbTipoHamburguesa;
	private JTextArea txtImprimirResultado;
	private JComboBox cmbTipoPago;
	private JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmGUI frame = new FrmGUI();
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
	public FrmGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 449);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hamburguesas \"El naufrago satisfecho\"");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(136, 25, 342, 14);
		contentPane.add(lblNewLabel);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(301, 175, 140, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cmbTipoPago = new JComboBox();
		cmbTipoPago.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONE", "EFECTIVO ", "TARETA DE CREDITO"}));
		cmbTipoPago.setBounds(301, 206, 140, 22);
		contentPane.add(cmbTipoPago);
		
		cmbTipoHamburguesa = new JComboBox();
		cmbTipoHamburguesa.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONE", "SENCILLA ", "DOBLE ", "TRIPLE"}));
		cmbTipoHamburguesa.setBounds(301, 142, 140, 22);
		contentPane.add(cmbTipoHamburguesa);
		
		JButton btnNuevaVenta = new JButton("NUEVA VENTA");
		btnNuevaVenta.setBounds(85, 250, 113, 23);
		contentPane.add(btnNuevaVenta);
		
		JButton btnCalcularVenta = new JButton("CALCULAR VENTA");
		btnCalcularVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tipoHamburguesa;
				int cantidadCompra;
				String tipoPago;
				int costo=0;
				double totalPagar;
				
				tipoHamburguesa = cmbTipoHamburguesa.getSelectedItem().toString();
				
				txtImprimirResultado.setText(tipoHamburguesa);
				
			}
		});
		btnCalcularVenta.setBounds(235, 250, 132, 23);
		contentPane.add(btnCalcularVenta);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(415, 250, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel(".::COSTO DE HAMBURGUESAS::.");
		lblNewLabel_1.setBounds(210, 50, 157, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TIPO DE HAMBURGUESA");
		lblNewLabel_2.setBounds(137, 146, 140, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CANTIDAD");
		lblNewLabel_3.setBounds(137, 178, 70, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TIPO DE PAGO");
		lblNewLabel_4.setBounds(137, 210, 82, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("SENCILLA $20");
		lblNewLabel_1_1.setBounds(226, 71, 157, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DOBLE $25");
		lblNewLabel_1_1_1.setBounds(226, 90, 157, 23);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("TRIPLE $28");
		lblNewLabel_1_1_1_1.setBounds(226, 108, 157, 23);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtImprimirResultado = new JTextArea();
		txtImprimirResultado.setBounds(149, 299, 329, 89);
		contentPane.add(txtImprimirResultado);
	}
}
