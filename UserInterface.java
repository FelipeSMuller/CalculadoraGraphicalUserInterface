package br.com.java.swing;

//Importando as três classes principais
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

//A classe userInterface herda de JFrame, se tornando uma subclasse
public class UserInterface extends JFrame {

	// Definição dos atributos

	// Definindo o modificador como protected

	private JTextField campo;

	private JButton button1;

	private JButton button2;

	private JButton button3;

	private JButton button4;

	private JButton button5;

	private JButton button6;

	private JButton button7;

	private JButton button8;

	private JButton button9;

	private JButton multiplicacao;

	private JButton subtracao;

	private JButton divisao;

	private JButton adicao;

	private static UserInterface frame;

	// Inicialização do método construtor, normalmente podemos fazer isso através
	// dele , ou deixando o construtor default para casos em que a aplicação seja
	// mais complexa

	public UserInterface() {

		inicializarComponentes();

		inicializarEventos();

	}

	private void inicializarComponentes() {

		// Define o título
		setTitle("CALCULADORA");

		/*
		 * setBounds aceita quatro parâmetros (posição esquerda que o componente aparece
		 * na tela, posição superior que o componente aparece na tela, largura do
		 * componente, altura do componente),
		 * 
		 * resumindo (x, y, largura, altura).
		 */
		setBounds(0, 0, 550, 300);

		/*
		 * define como “nulo” o gerenciador de layout a ser usado no frame por meio do
		 * método setLayout. um frame (e outros componentes) podem usar diferentes tipos
		 * de gerenciadores de layout, uma maneira de definir o posicionamento físico
		 * dos componentes no frame. Ao definir o layout como nulo, temos maior
		 * liberdade em posicionar os componentes.
		 */

		setLayout(null);

		// Definindo o "tamanho" do campo como 10
		campo = new JTextField(10);

		// Removendo a borda do campo.
		campo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		campo.setBounds(20, 30, 470, 50); // Corrigido para ajustar o tamanho do campo de texto
		
		
		campo.setBackground(Color.decode("#333333")); // Define o fundo cinza suave
		
		campo.setForeground(Color.WHITE); // Define a cor do texto como branco ou outra cor que contraste
		
		// Acessa diretamente o atributo
		button1 = new JButton("1");

		// Específica os valores onde os botões ficarão disponíveis na tela

		button1.setBounds(20, 100, 50, 50); // (x, y, largura, altura)

		// Definindo a cor de fundo do botão como preto
		button1.setBackground(Color.black);

		// Definindo a cor do "texto" do botão como branco

		button1.setForeground(Color.white);

		// Acessa diretamente o atributo

		button2 = new JButton("2");

		button2.setBounds(80, 100, 50, 50);

		// Acessa diretamente o atributo

		// Definindo a cor de fundo como preto
		button2.setBackground(Color.black);

		// Definindo a cor do texto do botão como branco.

		button2.setForeground(Color.white);

		// Específica os valores onde os botões ficarão disponíveis na tela

		button3 = new JButton("3");

		// Específica os valores onde os botões ficarão disponíveis na tela

		button3.setBounds(140, 100, 50, 50);

		// Definindo a cor de fundo do botão como preto
		button3.setBackground(Color.black);

		// Definindo a cor do "texto" como branco.

		button3.setForeground(Color.white);

		// Acessa diretamente o atributo

		button4 = new JButton("4");

		// Específica os valores onde os botões ficarão disponíveis na tela

		button4.setBounds(200, 100, 50, 50); // Ajustando o valor de x

		// Definindo a cor de fundo do botão como preto
		button4.setBackground(Color.black);

		// Definindo o texto do botão como branco
		button4.setForeground(Color.white);

		// Acessa diretamente o atributo
		button5 = new JButton("5");

		// Define a cor de fundo do botão como preto
		button5.setBackground(Color.black);

		// Define a cor do "texto" como branco.
		button5.setForeground(Color.white);

		// Específica os valores onde os botões ficarão disponíveis na tela

		button5.setBounds(260, 100, 50, 50); // Ajustando o valor de x

		// Acessa diretamente o atributo

		button6 = new JButton("6");

		// Define a cor de fundo do botão como preto
		button6.setBackground(Color.black);

		// Definindo a cor do texto do botão como branco
		button6.setForeground(Color.white);

		// Específica os valores onde os botões ficarão disponíveis na tela

		button6.setBounds(320, 100, 50, 50); // Ajustando o valor de x

		// Acessa diretamente o atributo

		button7 = new JButton("7");

		// Definindo a cor de fundo do botão como preto.
		button7.setBackground(Color.black);

		// Definindo a cor do texto do botão como branco
		button7.setForeground(Color.white);

		// Específica os valores onde os botões ficarão disponíveis na tela

		button7.setBounds(380, 100, 50, 50); // Ajustando o valor de x

		// Acessa diretamente o atributo

		button8 = new JButton("8");

		// Específica os valores onde os botões ficarão disponíveis na tela
		button8.setBounds(440, 100, 50, 50); // Ajustando o valor de x

		// Definindo a cor de fundo do botão como preto;
		button8.setBackground(Color.black);

		// Definindo a cor do texto do botão como branco
		button8.setForeground(Color.white);

		// Acessa diretamente o atributo

		button9 = new JButton("9");

		// Específica os valores onde os botões ficarão disponíveis na tela

		button9.setBounds(20, 160, 50, 50); // Ajustando o valor de x e y

		// Definindo a cor de fundo do botao como preto.
		button9.setBackground(Color.black);

		// Definindo a cor do texto do botão como branco;
		button9.setForeground(Color.white);

		// Acessa diretamente o atributo

		multiplicacao = new JButton("*");

		// Definindo a cor de fundo do botão como preto
		multiplicacao.setBackground(Color.black);

		// Definindo a cor do texto do botão como branco
		multiplicacao.setForeground(Color.white);

		multiplicacao.setBounds(80, 160, 50, 50); // Ajustando o valor de x e y

		// Instanciando um novo objeto do tipo adição

		adicao = new JButton("+");

		// Alterando a cor de fundo do botão de adição para preto

		adicao.setBackground(Color.black);

		// Definindo a cor do texto para branco.

		adicao.setForeground(Color.white);

		// Específica os valores onde os botões ficarão disponíveis na tela

		adicao.setBounds(140, 160, 50, 50); // Ajustando o valor de x e y

		// Acessa diretamente o atributo

		subtracao = new JButton("-");

		// Definindo a cor de fundo do botão como preto

		subtracao.setBackground(Color.black);

		// Definindo a cor do texto como branco.

		subtracao.setForeground(Color.WHITE);

		// Específica os valores onde os botões ficarão disponíveis na tela

		subtracao.setBounds(200, 160, 50, 50);

		// Acessa diretamente o atributo

		divisao = new JButton("/");

		// Definindo a cor de fundo do botão como preto.

		divisao.setBackground(Color.black);

		// Definindo a cor de texto do botão como branco.

		divisao.setForeground(Color.white);

		// Específica os valores onde os botões ficarão disponíveis na tela.

		divisao.setBounds(260, 160, 50, 50);

		// Removendo a borda de todos os botões
		button1.setBorderPainted(false);

		button2.setBorderPainted(false);

		button3.setBorderPainted(false);

		button4.setBorderPainted(false);

		button5.setBorderPainted(false);

		button6.setBorderPainted(false);

		button7.setBorderPainted(false);

		button8.setBorderPainted(false);

		button9.setBorderPainted(false);

		multiplicacao.setBorderPainted(false);

		adicao.setBorderPainted(false);

		subtracao.setBorderPainted(false);

		divisao.setBorderPainted(false);

		// Adiciona o botão ao frame
		add(button1);

		// Adiciona o botão ao frame

		add(button2);

		// Adiciona o botão ao frame

		add(button3);

		// Adiciona o botão ao frame
		add(button4);

		// Adiciona o botão ao frame
		add(button5);

		// Adiciona o botão ao frame

		add(button6);

		// Adiciona o botão ao frame

		add(button7);

		// Adiciona o botão ao frame
		add(button8);

		// Adiciona o botão ao frame
		add(button9);

		// Adiciona o botão ao frame

		add(campo);

		// Adiciona o objeto ao frame.
		add(divisao);

		// Adiciona o objeto ao frame.

		add(subtracao);

		// Adiciona o objeto ao frame.
		add(adicao);

		// Adiciona o botão ao frame
		add(multiplicacao);

	}

	// Inicializando o evento através do método sem retorno
	private void inicializarEventos() {

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String textoCampo = campo.getText(); // Obtém o texto atual no campo

				textoCampo += button1.getText(); // Adiciona o texto do botão 1 ao texto do campo

				campo.setText(textoCampo); // Define o novo texto no campo

			}

		});

	}

}
