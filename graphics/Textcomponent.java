import java.awt.*;
class Textcomponent
{
  public static void main(String[] args)
  {
    int i;
    Frame f = new Frame("TEXT");
    f.setSize(400,400);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    Label l1 = new Label("Enter your Name");
    Label l2 = new Label("Address");
    TextField t=new TextField("ZAYN MALIK",40);
    TextArea ta= new TextArea(10,20);
    f.add(l1);
    f.add(t);
    f.add(l2);
    f.add(ta);
  }
}
