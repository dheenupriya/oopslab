import java.awt.*;
class Oval1 extends Canvas
{
  public Oval1()
  {
    setSize(200,200);
    setBackground(Color.white);
  }
  public static void main(String[] args)
  {
    Oval1 o = new Oval1();
    Frame f = new Frame("OVAL");
    f.setSize(300,300);
    f.setVisible(true);
    f.add(o);
  }
  public void paint(Graphics g)
  {
    g.drawOval(10,10,50,50);
    g.setColor(Color.green);
    g.fillOval(80,80,150,150);
    g.drawString("OVAL",40,50);
  }
}
