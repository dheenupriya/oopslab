import java.awt.*;
class Scrollbar1
{
  public static void main(String[] args)
  {
    Frame f = new Frame();
    Scrollbar s1= new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar s2= new Scrollbar(Scrollbar.VERTICAL);
    f.setLayout(new FlowLayout());
    f.setSize(400,400);
    f.setVisible(true);
    f.add(s1);
    f.add(s2);
  }
}
