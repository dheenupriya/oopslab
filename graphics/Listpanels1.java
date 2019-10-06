import java.awt.*;
class Listpanels1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("Panel");
    f.setSize(350,300);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    List flower= new List(4,false);
    flower.add("Rose");
    flower.add("Jasmine");
    flower.add("Lotus");
    flower.add("Lily");
    f.add(flower);
  }
}
