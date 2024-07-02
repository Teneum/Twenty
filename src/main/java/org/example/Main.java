package org.example;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.*;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public Main(){
        init();
    }

    private void init(){
        setTitle("Twenty");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800,600));
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        FlatMacDarkLaf.setup();
        UIManager.put("defaultFont", new Font("Segoe UI", Font.PLAIN, 13));
        EventQueue.invokeLater(()->new Main().setVisible(true));
    }
}