import java.awt.*;
import javax.swing.*;

class Font1 extends JPanel {
 public void paintComponent(Graphics g){
  super.paintComponent(g);
  Font font = new Font("서울들국화",Font.PLAIN,30);
  g.setFont(font);
  g.drawString("국적 : 대한민국(서울들국화)",50,30);
  
  
  
  Font font8 = new Font("서울시",Font.PLAIN,30);
  g.setFont(font8);
  g.drawString("성명 : 양유진(서울꿈)",50,100);
  
 
  
  
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