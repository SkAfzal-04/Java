class Rectangle {
    int l,w;
    Rectangle(int l, int w){
        this.l = l;
        this.w = w;
    }
    int area(){
        return l * w;
    }
}
class RectBox extends Rectangle{
    int h;
    RectBox(int l , int w, int h){
        super(l,w);
        this.h = h;
    }
    int vol(){
        return area() * h;
    }
}
public class Rectangular_Inheritance{
    public static void main(String[] str){
        int l = Integer.parseInt(str[0]);
        int w = Integer.parseInt(str[1]);
        int h = Integer.parseInt(str[2]);
        Rectangle ob1 = new Rectangle(l,w);
        System.out.println("The area is " + ob1.area());
        RectBox ob2 = new RectBox(l, w, h);
        System.out.println("The volume is " + ob2.vol());
    }
}
