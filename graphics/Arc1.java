import java.awt.*;
class Arc1 extends Canvas
{
  public Arc1()
  {
    setSize(600,600);
    setBackground(Color.yellow);
  }
  public static void main(String[] args)
  {
    Arc1 a = new Arc1();
    Frame f = new Frame("ARC");
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    f.add(a);
  }
  public void paint(Graphics g)
  {
    g.drawArc(100,60,100,100,0,90);
    g.setColor(Color.pink);
    g.fillArc(200,120,200,200,180,360);
    g.drawString("ARC",500,500);
  }
}
