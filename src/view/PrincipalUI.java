package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setTitle("Pesquisa Presidencial ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 434);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCandidato = new JMenu("Candidato");
		menuBar.add(mnCandidato);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatosUI candidatoUI = new CadastroCandidatosUI();
				candidatoUI.setVisible(true);
				contentPane.add(candidatoUI,0);
			}
		});
		mnCandidato.add(mntmCadastrar);
		
		JMenuItem mntmSalvos = new JMenuItem("Salvos");
		mnCandidato.add(mntmSalvos);
		
		JMenuItem mntmCancelamentos = new JMenuItem("Cancelamentos");
		mnCandidato.add(mntmCancelamentos);
		
		JMenuItem mntmTabela = new JMenuItem("Consulta");
		mnCandidato.add(mntmTabela);
		
		JMenu mnPesquisa = new JMenu("Pesquisa");
		menuBar.add(mnPesquisa);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mntmCadastrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPesquisaUI pesquisaUI = new CadastroPesquisaUI();
				pesquisaUI.setVisible(true);
				contentPane.add(pesquisaUI,0);
			}
		});
		mnPesquisa.add(mntmCadastrar_1);
		
		JMenuItem mntmSalvas = new JMenuItem("Salvas");
		mnPesquisa.add(mntmSalvas);
		
		JMenuItem mntmCancelamentos_1 = new JMenuItem("Cancelamentos");
		mnPesquisa.add(mntmCancelamentos_1);
		
		JMenuItem mntmConsultas = new JMenuItem("Consultas");
		mnPesquisa.add(mntmConsultas);
		
		JMenu mnVotos = new JMenu("Votos");
		menuBar.add(mnVotos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 440, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 253, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
