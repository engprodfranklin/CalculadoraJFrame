/**
 * 
 * @Franklin
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcular {

	private JFrame princ;
	private JTextField text1;
	private JTextField text2;
	private JTextField textResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcular window = new Calcular();
					window.princ.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
	}

	/**
	 * Create the application.
	 */
	public Calcular() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculos c = new Calculos();
		princ = new JFrame();
		princ.setBackground(Color.GRAY);
		princ.setTitle("CALCULADORA B\u00C1SICA");
		princ.setBounds(100, 100, 311, 317);
		princ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		princ.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe o 1\u00BA n\u00FAmero:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 24, 176, 35);
		princ.getContentPane().add(lblNewLabel);
		
		JLabel lblInformeO = new JLabel("Informe o 2\u00BA n\u00FAmero:");
		lblInformeO.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInformeO.setBounds(24, 69, 176, 35);
		princ.getContentPane().add(lblInformeO);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(24, 183, 85, 35);
		princ.getContentPane().add(lblResultado);
		
		JButton btSoma = new JButton("+");
		btSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(text1.getText());	
		int y = Integer.parseInt(text2.getText());
		c.setSoma(x, y);
		int z = c.getSoma();
		//Enviando o resultado do inteiro na String
		textResul.setText(String.valueOf(z));		
			}
		});
		btSoma.setFont(new Font("Tahoma", Font.BOLD, 28));
		btSoma.setBounds(25, 132, 57, 36);
		princ.getContentPane().add(btSoma);
		
		JButton btSub = new JButton("-");
		btSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(text1.getText());	
				int y = Integer.parseInt(text2.getText());
				c.setSub(x, y);
				int z = c.getSub();
				//Enviando o resultado do inteiro na String
				textResul.setText(String.valueOf(z));
			}
		});
		btSub.setFont(new Font("Tahoma", Font.BOLD, 30));
		btSub.setBounds(92, 132, 57, 36);
		princ.getContentPane().add(btSub);
		
		JButton btMult = new JButton("x");
		btMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(text1.getText());	
				int y = Integer.parseInt(text2.getText());
				c.setMult(x, y);
				int z = c.getMult();
				//Enviando o resultado do inteiro na String
				textResul.setText(String.valueOf(z));
			}
		});
		btMult.setFont(new Font("Tahoma", Font.BOLD, 30));
		btMult.setBounds(158, 132, 57, 36);
		princ.getContentPane().add(btMult);
		
		JButton btDiv = new JButton("/");
		btDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(text1.getText());	
				int y = Integer.parseInt(text2.getText());
				c.setDiv(x, y);
				float z = c.getDiv();
				//Enviando o resultado do float na String
				textResul.setText(String.valueOf(z));
			}
		});
		btDiv.setFont(new Font("Tahoma", Font.BOLD, 26));
		btDiv.setBounds(225, 132, 57, 36);
		princ.getContentPane().add(btDiv);
		
		text1 = new JTextField();
		text1.setHorizontalAlignment(SwingConstants.RIGHT);
		text1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text1.setBounds(192, 24, 90, 29);
		princ.getContentPane().add(text1);
		text1.setColumns(10);
		
		
		text2 = new JTextField();
		text2.setHorizontalAlignment(SwingConstants.RIGHT);
		text2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text2.setColumns(10);
		text2.setBounds(192, 69, 90, 29);
		princ.getContentPane().add(text2);
		
		textResul = new JTextField();
		textResul.setText("0");
		textResul.setHorizontalAlignment(SwingConstants.RIGHT);
		textResul.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textResul.setColumns(10);
		textResul.setBounds(110, 183, 172, 29);
		princ.getContentPane().add(textResul);
		
		JButton btLimpar = new JButton("LIMPAR");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				textResul.setText("0");
			}
		});
		btLimpar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btLimpar.setBounds(24, 228, 125, 36);
		princ.getContentPane().add(btLimpar);
		
		JButton btSair = new JButton("SAIR");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Código-fonte para fechar
				System.exit(0);
			}
		});
		btSair.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btSair.setBounds(158, 228, 124, 36);
		princ.getContentPane().add(btSair);
	}
}
