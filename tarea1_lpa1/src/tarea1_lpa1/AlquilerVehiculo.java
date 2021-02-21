package tarea1_lpa1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AlquilerVehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtAño;
	private JTextField txtPMax;
	private JTextField txtDias;
	private JTextField txtPBase;
	private JTextField txtPFijo;
	private JTextField txtPAdi;
	private JTextField txtDia1;
	private JTextField txtDia2;
	private JTextField txtDia3;
	private JTextField txtTTPBase;
	private JTextField txtTTPFijo;
	private JTextField txtTTPAdi;
	private JTextField txtTTFact;
	private JCheckBox chcBus;
	private JCheckBox chcAuto;
	private JCheckBox chcCamion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Autos Carro = new Autos();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlquilerVehiculo frame = new AlquilerVehiculo();
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
	public AlquilerVehiculo() {
		setFont(new Font("Verdana", Font.ITALIC, 12));
		setResizable(false);
		setTitle("Registro Alquiler Vehiculos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAuto = new JButton("");
		btnAuto.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\tarea1_lpa1\\autos.png"));
		btnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
				chcAuto.setSelected(true);
				chcBus.setSelected(false);
				chcCamion.setSelected(false);
				Autos Carro = new Autos();
				txtPlaca.setText(Carro.VerPlaca());
				txtMarca.setText(Carro.VerMarca());
				txtModelo.setText(Carro.VerModelo());
				txtAño.setText(Carro.VerAño());
				
				Carro.DarPBase();
				txtPBase.setText(Carro.VerPBase());
				
				Carro.DarPFijo();
				txtPFijo.setText(Carro.VerPFijo());
				txtDia2.setText(Carro.VerPFijo());
				txtTTPFijo.setText(Carro.VerPFijo());
				
				Carro.DarPAdic();
				txtPAdi.setText(Carro.VerPAdic());
				
				Carro.DarPMax();
				txtPMax.setText(Carro.VerPMax());
				
			}
		});
		btnAuto.setBounds(34, 0, 146, 88);
		contentPane.add(btnAuto);
		
		JButton btnBus = new JButton("");
		btnBus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
				chcAuto.setSelected(false);
				chcBus.setSelected(true);
				chcCamion.setSelected(false);
				
				MicroBus Bus = new MicroBus();
				txtPlaca.setText(Bus.VerPlaca());
				txtMarca.setText(Bus.VerMarca());
				txtModelo.setText(Bus.VerModelo());
				txtAño.setText(Bus.VerAño());
				
				Bus.DarPBase();
				txtPBase.setText(Bus.VerPBase());
				
				Bus.DarPFijo();
				txtPFijo.setText(Bus.VerPFijo());
				txtDia2.setText("0");
				txtTTPFijo.setText(Bus.VerPFijo());
				
				Bus.DarPAdic();
				txtPAdi.setText(Bus.VerPAdic());
				
				Bus.DarPMax();
				txtPMax.setText(Bus.VerPMax());
	
			}
		});
		btnBus.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\tarea1_lpa1\\MicroBus.png"));
		btnBus.setBounds(190, 0, 143, 88);
		contentPane.add(btnBus);
		
		JButton btnCamion = new JButton("");
		btnCamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
				chcAuto.setSelected(false);
				chcBus.setSelected(false);
				chcCamion.setSelected(true);
				
				Camion Cami = new Camion();
				txtPlaca.setText(Cami.VerPlaca());
				txtMarca.setText(Cami.VerMarca());
				txtModelo.setText(Cami.VerModelo());
				txtAño.setText(Cami.VerAño());
				
				Cami.DarPBase();
				txtPBase.setText(Cami.VerPBase());
				
				Cami.DarPFijo();
				txtPFijo.setText(Cami.VerPFijo());
				txtDia2.setText("0");
				txtTTPFijo.setText(Cami.VerPFijo());
				
				Cami.DarPAdic();
				txtPAdi.setText(Cami.VerPAdic());
				
				Cami.DarPMax();
				txtPMax.setText(Cami.VerPMax());	
			}
		});
		btnCamion.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\tarea1_lpa1\\Camiones.png"));
		btnCamion.setBounds(343, 0, 136, 88);
		contentPane.add(btnCamion);
		
		txtPlaca = new JTextField();
		txtPlaca.setEditable(false);
		txtPlaca.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPlaca.setBounds(136, 141, 136, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setEditable(false);
		txtMarca.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtMarca.setBounds(136, 170, 136, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setEditable(false);
		txtModelo.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtModelo.setBounds(136, 201, 136, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtAño = new JTextField();
		txtAño.setEditable(false);
		txtAño.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtAño.setBounds(136, 232, 136, 20);
		contentPane.add(txtAño);
		txtAño.setColumns(10);
		
		txtPMax = new JTextField();
		txtPMax.setEditable(false);
		txtPMax.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPMax.setBounds(136, 260, 136, 20);
		contentPane.add(txtPMax);
		txtPMax.setColumns(10);
		
		txtDias = new JTextField();
		txtDias.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtDias.setBounds(136, 291, 136, 20);
		contentPane.add(txtDias);
		txtDias.setColumns(10);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String DiaC = txtDias.getText();
								
				if (chcAuto.isSelected()) {
					txtDia1.setText(DiaC);
					txtDia3.setText(DiaC);
					//Calculo de total de Precio Base
					String PB1 = txtPBase.getText();
					int PBint = Integer.parseInt(PB1);
					
					String Di1 = txtDia1.getText();
					int Diint = Integer.parseInt(Di1);
					
					int PTTPBas1= PBint*Diint;
					String TTPB = String.valueOf(PTTPBas1);
					txtTTPBase.setText(TTPB);
					//Calculo de total de Precio Adicional
					String PA1 = txtPAdi.getText();
					double PAdi = Double.parseDouble(PA1);
					
					double  PTTPA1= PAdi*(Diint*1.0);
					String TTPAdi = String.valueOf(PTTPA1);
					txtTTPAdi.setText(TTPAdi);
					
					double TotalF = PTTPA1 + (PTTPBas1*1.0);
					String Total1 = String.valueOf(TotalF);
					txtTTFact.setText(Total1);
				}
				
				
				if (chcBus.isSelected()) {
					txtDia1.setText(DiaC);
					txtDia3.setText(DiaC);
					
					//Calculo de total de Precio Base
					String PB1 = txtPBase.getText();
					int PBint = Integer.parseInt(PB1);
					
					String Di1 = txtDia1.getText();
					int Diint = Integer.parseInt(Di1);
					
					int PTTPBas1= PBint*Diint;
					String TTPB = String.valueOf(PTTPBas1);
					txtTTPBase.setText(TTPB);
					//Calculo de precio fijo
					String PF1 = txtTTPFijo.getText();
					double PFijo = Double.parseDouble(PF1);
					
					
					//Calculo de total de Precio Adicional
					String PA1 = txtPAdi.getText();
					double PAdi = Double.parseDouble(PA1);
					
					double  PTTPA1= PAdi*(Diint*1.0);
					String TTPAdi = String.valueOf(PTTPA1);
					txtTTPAdi.setText(TTPAdi);
					
					//Precio Total Acancelar
					double TotalF = PTTPA1 + PFijo + (PTTPBas1*1.0);
					String Total1 = String.valueOf(TotalF);
					txtTTFact.setText(Total1);
				}
				
				if (chcCamion.isSelected()) {
					txtDia1.setText(DiaC);
					txtDia3.setText(txtPMax.getText());
					
					//Calculo de total de Precio Base
					String PB1 = txtPBase.getText();
					int PBint = Integer.parseInt(PB1);
					
					String Di1 = txtDia1.getText();
					int Diint = Integer.parseInt(Di1);
					
					int PTTPBas1= PBint*Diint;
					String TTPB = String.valueOf(PTTPBas1);
					txtTTPBase.setText(TTPB);
					//Calculo de precio fijo
					String PF1 = txtTTPFijo.getText();
					double PFijo = Double.parseDouble(PF1);
					
					
					//Calculo de total de Precio Adicional
					String PA1 = txtPAdi.getText();
					double PAdi = Double.parseDouble(PA1);
					
					double  PTTPA1= PAdi*(Diint*1.0);
					String TTPAdi = String.valueOf(PTTPA1);
					txtTTPAdi.setText(TTPAdi);
					
					//Precio Total Acancelar
					double TotalF = PTTPA1 + PFijo + (PTTPBas1*1.0);
					String Total1 = String.valueOf(TotalF);
					txtTTFact.setText(Total1);
				}
			}
		});
		btnCalc.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCalc.setBounds(286, 291, 89, 23);
		contentPane.add(btnCalc);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
			}
		});
		btnCancelar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCancelar.setBounds(390, 291, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Placa");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(34, 144, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(34, 173, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(34, 204, 103, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("A\u00F1o");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(34, 235, 103, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Peso Max ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(34, 263, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dias de Alquiler");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(34, 294, 103, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Vehiculo Disponible para Alquiler");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(136, 110, 301, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Detalle de Factura");
		lblNewLabel_7.setForeground(Color.BLUE);
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(107, 315, 301, 20);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Precio Base:");
		lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(34, 357, 103, 14);
		contentPane.add(lblNewLabel_8);
		
		txtPBase = new JTextField();
		txtPBase.setEditable(false);
		txtPBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPBase.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPBase.setBounds(136, 354, 86, 20);
		contentPane.add(txtPBase);
		txtPBase.setColumns(10);
		
		txtPFijo = new JTextField();
		txtPFijo.setEditable(false);
		txtPFijo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPFijo.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPFijo.setBounds(136, 381, 86, 20);
		contentPane.add(txtPFijo);
		txtPFijo.setColumns(10);
		
		txtPAdi = new JTextField();
		txtPAdi.setEditable(false);
		txtPAdi.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPAdi.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPAdi.setBounds(136, 412, 86, 20);
		contentPane.add(txtPAdi);
		txtPAdi.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Cargo Fijo:");
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(34, 384, 103, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Precio Adicional:");
		lblNewLabel_10.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(34, 415, 103, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("Precio");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_12.setBounds(136, 338, 86, 14);
		contentPane.add(lblNewLabel_12);
		
		txtDia1 = new JTextField();
		txtDia1.setEditable(false);
		txtDia1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia1.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtDia1.setBounds(236, 354, 86, 20);
		contentPane.add(txtDia1);
		txtDia1.setColumns(10);
		
		txtDia2 = new JTextField();
		txtDia2.setEditable(false);
		txtDia2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia2.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtDia2.setBounds(236, 381, 86, 20);
		contentPane.add(txtDia2);
		txtDia2.setColumns(10);
		
		txtDia3 = new JTextField();
		txtDia3.setEditable(false);
		txtDia3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia3.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtDia3.setBounds(236, 412, 86, 20);
		contentPane.add(txtDia3);
		txtDia3.setColumns(10);
		
		txtTTPBase = new JTextField();
		txtTTPBase.setEditable(false);
		txtTTPBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTTPBase.setFont(new Font("Verdana", Font.BOLD, 11));
		txtTTPBase.setBounds(332, 354, 131, 20);
		contentPane.add(txtTTPBase);
		txtTTPBase.setColumns(10);
		
		txtTTPFijo = new JTextField();
		txtTTPFijo.setEditable(false);
		txtTTPFijo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTTPFijo.setFont(new Font("Verdana", Font.BOLD, 11));
		txtTTPFijo.setBounds(332, 381, 131, 20);
		contentPane.add(txtTTPFijo);
		txtTTPFijo.setColumns(10);
		
		txtTTPAdi = new JTextField();
		txtTTPAdi.setEditable(false);
		txtTTPAdi.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTTPAdi.setFont(new Font("Verdana", Font.BOLD, 11));
		txtTTPAdi.setBounds(332, 412, 131, 20);
		contentPane.add(txtTTPAdi);
		txtTTPAdi.setColumns(10);
		
		txtTTFact = new JTextField();
		txtTTFact.setEditable(false);
		txtTTFact.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTTFact.setFont(new Font("Verdana", Font.BOLD, 12));
		txtTTFact.setBounds(332, 443, 131, 20);
		contentPane.add(txtTTFact);
		txtTTFact.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Dias");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_13.setBounds(236, 338, 86, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Sub-Total");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel_14.setBounds(332, 338, 131, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Total:");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_15.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_15.setBounds(259, 447, 63, 14);
		contentPane.add(lblNewLabel_15);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
			}
		});
		btnNewButton.setBounds(136, 481, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(259, 481, 89, 23);
		contentPane.add(btnNewButton_1);
		
		chcAuto = new JCheckBox("");
		chcAuto.setEnabled(false);
		chcAuto.setVerticalAlignment(SwingConstants.TOP);
		chcAuto.setBounds(86, 87, 34, 20);
		contentPane.add(chcAuto);
		
		chcBus = new JCheckBox("");
		chcBus.setEnabled(false);
		chcBus.setVerticalAlignment(SwingConstants.TOP);
		chcBus.setBounds(238, 87, 34, 20);
		contentPane.add(chcBus);
		
		chcCamion = new JCheckBox("");
		chcCamion.setEnabled(false);
		chcCamion.setVerticalAlignment(SwingConstants.TOP);
		chcCamion.setBounds(390, 87, 28, 20);
		contentPane.add(chcCamion);
	}
	public JCheckBox getChcBus() {
		return chcBus;
	}
	public JCheckBox getChcAuto() {
		return chcAuto;
	}
	public JCheckBox getChcCamion() {
		return chcCamion;
	}
	public void Limpiar() {
		chcAuto.setSelected(false);
		chcBus.setSelected(false);
		chcCamion.setSelected(false);
		txtPlaca.setText("");
		txtMarca.setText("");
		txtModelo.setText("");
		txtAño.setText("");
		txtPMax.setText("");
		txtDias.setText("");
		
		txtPBase.setText("");
		txtPFijo.setText("");
		txtPAdi.setText("");				
		txtDia1.setText("");
		txtDia2.setText("");
		txtDia3.setText("");		
		txtTTPBase.setText("");
		txtTTPFijo.setText("");
		txtTTPAdi.setText("");
		
		txtTTFact.setText("");
	
	}
}
