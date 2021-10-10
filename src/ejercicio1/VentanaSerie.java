package ejercicio1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtRecorrido;
	private JTextArea varSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VentanaSerie frame = new VentanaSerie();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(222, 227, 89, 23);
		contentPane.add(btnSalir);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(186, 43, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(186, 78, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		txtRecorrido = new JTextField();
		txtRecorrido.setBounds(186, 120, 86, 20);
		contentPane.add(txtRecorrido);
		txtRecorrido.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Numero Inicial 1");
		lblNumero1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNumero1.setBounds(72, 40, 114, 23);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero Inicial 2");
		lblNumero2.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNumero2.setBounds(72, 75, 114, 23);
		contentPane.add(lblNumero2);
		
		JLabel lblRecorrido = new JLabel("Recorridos");
		lblRecorrido.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblRecorrido.setBounds(97, 117, 89, 23);
		contentPane.add(lblRecorrido);
		
		JButton btnGenerarSerie = new JButton("Generar");
		btnGenerarSerie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String varNumero1S = txtNumero1.getText();
				String varNumero2S = txtNumero2.getText();
				String varIteraS = txtRecorrido.getText();
				String cadena="";
				
				int varNumero1I= Integer.parseInt(varNumero1S);
				int varNumero2I= Integer.parseInt(varNumero2S);
				int varIteraI= Integer.parseInt(varIteraS);
				int suma=0;
				int i=0;
				cadena=cadena+varNumero1S+" "+varNumero2S;
;				 do {
			            suma=varNumero1I+varNumero2I;

			            varNumero1I=varNumero2I;
			            varNumero2I=suma;
			            cadena = cadena+" "+suma;
			            i++;

			        } while (i<=varIteraI);
					varSerie.setText(cadena);
			}
		});
		btnGenerarSerie.setBounds(71, 227, 89, 23);
		contentPane.add(btnGenerarSerie);
		
		varSerie = new JTextArea();
		varSerie.setBounds(61, 151, 244, 61);
		contentPane.add(varSerie);
		
		JLabel lblNombre = new JLabel("Dulce Maria Mendoza Medina 19100217 ");
		lblNombre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNombre.setBounds(72, 6, 262, 23);
		contentPane.add(lblNombre);
	}
}
