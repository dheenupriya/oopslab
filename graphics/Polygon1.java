import java.awt.*;
class Polygon1 extends Canvas
{
  public Polygon1()
  {
    setSize(700,700);
    setBackground(Color.pink);
  }
  public static void main(String[] args)
  {
    Polygon1 p = new Polygon1();
    Frame f = new Frame("POLYGON");
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
  }
  public void paint(Graphics g)
  {
    int x[]={50,20,20,20,80};
    int y[]={60,30,30,30,90};
    int num=5;
    g.drawPolygon(x,y,num);
    g.setColor(Color.magenta);
    g.setColor(Color.black);
    g.fillPolygon(x,y,num);
    g.drawString("Its a Polygon",100,100);
  }
}
