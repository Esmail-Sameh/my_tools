package com.mycompany.mytools;

import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Tools{
    
    public static void msgBox(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void createFolderWithPath(String folderName , String path) {
        File f = new File(path + "/" + folderName);
        f.mkdir();
    }
    
    public static void createFolderWithOutPath(String folderName) {
        File f = new File(folderName);
        f.mkdir();
    }
    
    public static void openForm(JFrame f) {
//            Image img = ImageIO.read(Tools.class.getResource("img.png"));
//            f.setIconImage(img);
            f.setDefaultCloseOperation(2);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
    }
    
    public static void clearTexts(Container form){
        for(Component c : form.getComponents()){
            if(c instanceof JTextField){
                ((JTextField) c).setText("");
            }else if(c instanceof Container){
                clearTexts((Container) c);
            }
        }
    }
    
    
}

