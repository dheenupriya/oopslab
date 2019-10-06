import java.awt.*;
class Button2
{
  public static void main(String[] args)
  {
    int i;
    Frame f=new Frame("Hello");
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    Button b[]=new Button[5];
    String Fruits[]={"Mango","Orange","Banana","Apple","Strawberry"};
    for(i=0;i<5;i++)
    {
      b[i]=new Button(" "+Fruits[i]);
      f.add(b[i]);
    }
  }
}
