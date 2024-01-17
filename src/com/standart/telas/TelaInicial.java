package com.standart.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.standart.principal.Tela;

public class TelaInicial {

	public TelaInicial(){
		JFrame frame = new JFrame();
		JPanel painel = new JPanel();
		JButton botao = new JButton();
		JButton botao2 = new JButton();
		JLabel textoNaTela = new JLabel();
		painel.setLayout(new GridBagLayout());
		
		Tela telaPrincipal = new Tela(frame,painel,50,50,350,300);
		telaPrincipal.ExibirTextoAoClicarBotao(painel,botao, "Olá Mundo", textoNaTela);
		telaPrincipal.CriarBotao(painel, botao, "Mostrar", Color.red, 100, 25);
		telaPrincipal.CriarBotao(painel, botao2, "Apagar", Color.red, 100, 25);
		telaPrincipal.ExcluirTexto(painel, botao2,textoNaTela);
	}
}
