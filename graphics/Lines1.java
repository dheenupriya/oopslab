import java.awt.*;
class Lines1 extends Canvas
{
  public Lines1()
  {
    setSize(200,200);
  }
  public static void main(String[] args)
  {
    Lines1 l = new Lines1();
    Frame f = new Frame("Line");
    f.setSize(350,300);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    f.add(l);
  }
  public void paint(Graphics g)
  {
    g.drawLine(0,0,30,60);
    g.drawLine(0,100,30,400);
    g.drawString("Its a Line",200,200);
  }
}
