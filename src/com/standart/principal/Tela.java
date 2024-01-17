package com.standart.principal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela {
	
	public Tela(JFrame tela,JPanel painel,int x, int y, int largura, int altura) {
		tela.add(painel);
		tela.setBounds(x, y, largura, altura);
		tela.setVisible(true);
		tela.setResizable(false);
		
	}
	
	public void CriarBotao(JPanel painel,JButton botao,String texto, Color color,int largura, int altura) {
		painel.add(botao);
		botao.setText(texto);
		botao.setBackground(color);
		botao.setPreferredSize(new Dimension(largura,altura));
	}
	
	public void ExibirTextoAoClicarBotao(JPanel painel, JButton botao,String textoInserido, JLabel textoExibido) {
			painel.add(textoExibido);
			botao.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
	                    textoExibido.setText(textoInserido);
	                    textoExibido.setVisible(true); 
				}
			});	
			
	}
	
	public void ExcluirTexto(JPanel painel,JButton botao,JLabel textoExibido ) {
		botao.addActionListener(new ActionListener() {				
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textoExibido.setVisible(false);                 
			}
		});			
	}
	
	
}
