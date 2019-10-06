import java.awt.*;
class Canvas1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("canvas");
    Canvas c= new Canvas();
    c.setSize(120,120);
    c.setBackground(Color.blue);
    c.setForeground(Color.green);
    f.setLayout(new FlowLayout());
    f.setSize(300,300);
    f.setVisible(true);
    f.add(c);
  }
}
