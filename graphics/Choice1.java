import java.awt.*;
class Choice1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("CHECKBOX");
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    Choice c1= new Choice();
    Choice c2= new Choice();
    c1.add("Mango");
    c1.add("Apple");
    c1.add("Strawberry");
    c1.add("Banana");
    c2.add("Rose");
    c2.add("Lily");
    c2.add("Lotus");
    c2.add("Jasmine");
    f.add(c1);
    f.add(c2);
  }
}
