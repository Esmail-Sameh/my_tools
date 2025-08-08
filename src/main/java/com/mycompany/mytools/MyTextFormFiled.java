package com.mycompany.mytools;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;

public class MyTextFormFiled extends JTextField{

    public MyTextFormFiled(int size){
        super(size);
        super.setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);

        super.paintComponent(g);
    }
    
    @Override
    protected  void paintBorder(Graphics g){
        g.setColor(Color.BLUE);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15); 
    }
    
}
