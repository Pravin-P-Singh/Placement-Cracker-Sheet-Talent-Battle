class Triangle{
    void display(){
        System.out.println("I am a triangle");
    }
}
class Isosceles extends Triangle{
    void display(){
        System.out.println("I am an isosceles triangle");
        super.display();
    }
}
class Equilateral extends Isosceles{
    void display(){
        System.out.println("I am an equilateral triangle");
        super.display();
    }
}
public class PS69 {
    public static void main(String[] args) {
        Equilateral triangle = new Equilateral();
        triangle.display();
    }
}
