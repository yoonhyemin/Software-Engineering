import java.awt.*;
import javax.swing.*;

class Font1 extends JPanel {
 public void paintComponent(Graphics g){
  super.paintComponent(g);
  Font font = new Font("����鱹ȭ",Font.PLAIN,30);
  g.setFont(font);
  g.drawString("���� : ���ѹα�(����鱹ȭ)",50,30);
  
  
  
  Font font8 = new Font("�����",Font.PLAIN,30);
  g.setFont(font8);
  g.drawString("���� : ������(�����)",50,100);
  
 
  
  
 }
}
public class FontTest2 extends JFrame{
 public FontTest2(){
  setTitle("FontTest");
  add(new Font1());
  setSize(600,300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
  }
 public static void main(String[] args){
  new FontTest();
 }
}