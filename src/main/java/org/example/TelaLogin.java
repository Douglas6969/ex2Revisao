package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {
    public JPanel TelaLogar;
    private JTextField textUsuario;
    private JTextField textSenha;
    private JButton LimparButton;
    private JButton LogarButton;

    private String usuario;

    private String senha;




    public JPanel getTelaLogar() {
        return TelaLogar;
    }

    public void setTelaLogar(JPanel telaLogar) {
        TelaLogar = telaLogar;
    }

    public JTextField getTextUsuario() {
        return textUsuario;
    }

    public void setTextUsuario(JTextField textUsuario) {
        this.textUsuario = textUsuario;
    }

    public JTextField getTextSenha() {
        return textSenha;
    }

    public void setTextSenha(JTextField textSenha) {
        this.textSenha = textSenha;
    }

    public JButton getLimparButton() {
        return LimparButton;
    }

    public void setLimparButton(JButton limparButton) {
        LimparButton = limparButton;
    }

    public JButton getLogarButton() {
        return LogarButton;
    }

    public void setLogarButton(JButton logarButton) {
        LogarButton = logarButton;
    }

    public TelaLogin() {
        LogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                usuario = textUsuario.getText();
                senha = textSenha.getText();
                if (usuario.equals("adimin") && senha.equals("adimin")){

                    JOptionPane.showMessageDialog(null,"logado com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null,"Senha ou Usuário Incorreto");
                }


            }
        });
        LimparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUsuario.setText("");
                textSenha.setText("");
            }
        });
    }



}
