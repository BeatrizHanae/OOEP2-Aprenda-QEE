package view;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.ActionDH;
import controller.ActionMenu;

public class Menu {
	
	private JPanel painelInicial;
	
	public Menu(JFrame telaInicial) throws IOException{
		criaPainelInicial(telaInicial);
	}
	
	public void criaPainelInicial(JFrame telaInicial){
		
		
		painelInicial = new JPanel();
		painelInicial.setLayout(null);
		painelInicial.setBorder(new EmptyBorder (100, 100, 450, 300));
		painelInicial.setLocation((telaInicial.getWidth()-painelInicial.getWidth()),(telaInicial.getHeight()-painelInicial.getHeight()));

		setTitle("APRENDA QEE!");
		
		JLabel lblNewLabel = new JLabel("Bem vindo à  APRENDA QEE!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(40, 32, 208, 16);
		painelInicial.add(lblNewLabel);
		
		JLabel lblEscolhaQualA = new JLabel("Escolha qual a simulação que deseja prosseguir:");
		lblEscolhaQualA.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaQualA.setBounds(40, 60, 312, 16);
		painelInicial.add(lblEscolhaQualA);
		
		JButton FluxoPotenciaF = new JButton("FLUXO DE POTÊNCIA FUNDAMENTAL");
		FluxoPotenciaF.setBounds(73, 104, 305, 29);
		
		JButton btnNewButton = new JButton("FLUXO DE POTÊNCIA HARMÔNICO");
		btnNewButton.setBounds(73, 214, 305, 29);
		telaInicial.getContentPane().add(painelInicial);
		painelInicial.add(btnNewButton);
		
		JButton btnDistoroHarmnica = new JButton("DISTORÇÃO HARMÔNICA");
		btnDistoroHarmnica.addActionListener(new ActionDH(telaInicial));
		btnDistoroHarmnica.setBounds(73, 159, 305, 29);
		telaInicial.getContentPane().add(painelInicial);
		painelInicial.add(btnDistoroHarmnica);

		FluxoPotenciaF.setActionCommand("FLUXO DE POTÊNCIA FUNDAMENTAL");
		FluxoPotenciaF.addActionListener(new ActionMenu(painelInicial,telaInicial));
		telaInicial.getContentPane().add(painelInicial);
		painelInicial.add(FluxoPotenciaF);
		
		telaInicial.setVisible(true);
		
	}

	private void setTitle(String string) {	
	}
}
