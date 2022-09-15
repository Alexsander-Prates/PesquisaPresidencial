package view;

import controller.CandidatoController;
import controller.PesquisaController;
import model.Candidato;
import model.Pesquisa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Screen extends JFrame {


    private JPanel contentPane;

    JTextField cadastrarCandidato;
    JTextField cadastrarPesquisa;


    public Screen(){

        setTitle("Cadastros Diversos");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null);

        JButton jButton = new JButton("Cadastrar");
        jButton.setBounds(60,160,100, 60);
        jButton.setFont(new Font("Arial", Font.BOLD,10));
        jButton.setForeground(new Color(10,10,10));
        jButton.setBackground(new Color(252, 249, 249, 255));

        add(jButton);
        jButton.addActionListener(this::actionPerformed);

        JButton jButton2 = new JButton("Cadastrar");
        jButton2.setBounds(300,160,100, 60);
        jButton2.setFont(new Font("Arial", Font.BOLD,10));
        jButton2.setForeground(new Color(10,10,10));
        jButton2.setBackground(new Color(252, 249, 249, 255));

        add(jButton2);
        jButton2.addActionListener(this::actionPerformedP);

        cadastrarCandidato = new JTextField("Clicar aqui");
        cadastrarCandidato.setBounds(10,60,200, 70 );
        cadastrarCandidato.setFont(new Font("Arial", Font.BOLD,10));
        add(cadastrarCandidato);

        cadastrarPesquisa = new JTextField("Clicar aqui");
        cadastrarPesquisa.setBounds(250,60,200, 70 );
        cadastrarPesquisa.setFont(new Font("Arial", Font.BOLD,10));
        add(cadastrarPesquisa);

        JLabel jLabelCandidato = new JLabel("Cadastrar candidato:");
        jLabelCandidato.setBounds(10,10,200, 70 );
        add(jLabelCandidato);

        JLabel jLabelPesquisa = new JLabel("Cadastrar Pesquisa:");
        jLabelPesquisa.setBounds(250,10,200, 70 );
        add(jLabelPesquisa);


        setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(null,
                cadastrarCandidato.getText() + " cadastrado", "Salvando com sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        try {

            Candidato candidato = new Candidato();
            candidato.setNome(cadastrarCandidato.getText());
            new CandidatoController().salvar(candidato);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Candidato");
        }
    }
    private void actionPerformedP(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null,
                cadastrarPesquisa.getText() + " cadastrado", "Salvando com sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        try {

            Pesquisa instituto = new Pesquisa();
            instituto.setInstituto(cadastrarPesquisa.getText());
            new PesquisaController().salvar(instituto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Instituto");
        }
    }
}