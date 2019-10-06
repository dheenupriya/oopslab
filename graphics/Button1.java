import java.awt.*;
class Button1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("Button");
    f.setSize(400,200);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    Button b1 = new Button("OK");
    Button b2 = new Button("CANCEL");
    f.add(b1);
    f.add(b2);
  }
}
