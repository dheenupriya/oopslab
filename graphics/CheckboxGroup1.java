import java.awt.*;
class CheckboxGroup1
{
  public static void main(String[] args)
  {
    Frame f = new Frame("CHECKBOX");
    f.setSize(350,300);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    CheckboxGroup bg = new CheckboxGroup();
    Checkbox b1= new Checkbox("Candy",bg,true);
    Checkbox b2= new Checkbox("Icecream",bg,false);
    f.add(b1);
    f.add(b2);
  }
}
