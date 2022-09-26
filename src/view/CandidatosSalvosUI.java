package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.CandidatoController;
import viewTable.TableModels;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CandidatosSalvosUI extends JInternalFrame {
	private JTable jtCandidatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CandidatosSalvosUI frame = new CandidatosSalvosUI();
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
	public CandidatosSalvosUI() {
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JButton btnAlterar = new JButton("Alterar");
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnExcluir = new JButton("Excluir");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAlterar)
							.addGap(18)
							.addComponent(btnCancelar)
							.addGap(18)
							.addComponent(btnExcluir)))
					.addGap(35))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAlterar)
						.addComponent(btnCancelar)
						.addComponent(btnExcluir))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		
		jtCandidatos = new JTable();
		jtCandidatos.setModel(new TableModels(new CandidatoController().listar()));
		scrollPane.setViewportView(jtCandidatos);
		getContentPane().setLayout(groupLayout);

	}
}
