import java.awt.*;
class Checkbox1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("CHECKBOX");
    f.setSize(350,300);
    f.setLayout(new FlowLayout());

    Checkbox b1 = new Checkbox("CANDY");
    Checkbox b2 = new Checkbox("ICE_CREAM");
    Checkbox b3 = new Checkbox("JUICE");
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.setVisible(true);
  }
}
