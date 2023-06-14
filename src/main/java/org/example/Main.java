package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        TelaLogin Resumo = new TelaLogin();

        JFrame frame = new JFrame();
        frame.setContentPane(Resumo.TelaLogar);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(500,500);

    }
}