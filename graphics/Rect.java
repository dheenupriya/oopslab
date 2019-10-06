import java.awt.*;
class Rect extends Canvas
{
  public Rect()
  {
    setSize(200,200);
  }
  public static void main(String[] args)
  {
    Rect r = new Rect();
    Frame f = new Frame("RECTANGLES");
    f.setSize(350,300);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    f.add(r);
  }
  public void paint(Graphics g)
  {
    g.drawRect(10,10,50,50);
    g.drawRoundRect(70,30,50,30,10,10);
    g.fillRect(40,100,150,100);
    g.fillRoundRect(200,10,70,100,10,10);
    g.drawString("Its a Rectangle",30,90);
  }
}
