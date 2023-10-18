package br.com.java.swing;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JFrame;

import javax.swing.SwingUtilities;


public class Calculadora {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			
			public void run() {
				
				/*
				 * cria o objeto “frame” a partir do construtor “userInterface”. Esse objeto recebe
				 * todas as características definidas no construtor, já citadas anteriormente,
				 * incluindo a inicialização dos componentes e a definição dos eventos.
				 */

				UserInterface frame = new UserInterface();
				
				Color corFundo = Color.decode("#1b1e23");

				frame.getContentPane().setBackground(corFundo);


				/*
				 * possui o método setDefaultCloseOperation, responsável por encerrar a
				 * aplicação quando a janela for fechada. A constante usada foi EXIT_ON_CLOSE.
				 * Outras constantes que podem ser usadas são: HIDE_ON_CLOSE (oculta a janela
				 * quando fechada), DO_NOTHING_ON_ CLOSE (não faz nada, apenas desativa o botão
				 * de encerramento) e DISPOSE_ON_CLOSE (a janela desaparece e os recursos usados
				 * pela classe são liberados).
				 */
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				/*
				 * cria um objeto chamado “tela” contendo as dimensões da tela. Essa dimensão
				 * varia em função da resolução gráfica usada no ambiente em que a aplicação
				 * está sendo executada.
				 */
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

				/*
				 * define a localização em que o frame aparecerá na tela do monitor por meio do
				 * método setLocation, que recebe dois parâmetros (posicionamento em relação ao
				 * canto esquerdo, posicionamento em relação ao topo), isto é, cada valor define
				 * um ponto da coordenada x,y a partir da qual o frame aparecerá. Observe que é
				 * realizado um cálculo que leva em consideração o tamanho da tela e do frame
				 * ((largura da tela – largura do frame)/2,(altura da tela – altura do
				 * frame)/2). Isso permite centralizar o frame na tela, independentemente de seu
				 * tamanho.
				 */

				frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);

				/* torna o frame visível. */
				frame.setVisible(true);
			}
		});

	}

}