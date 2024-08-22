package com.mycompany.calculadora;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SalidaImagen {
public void frame(String string) {
  JFrame frame = new JFrame();
  frame.setTitle("jframe");
  frame.setSize(400, 400);
  frame.setVisible(true);
  JLabel label = new JLabel(string);
  frame.add(label);
}  
}
