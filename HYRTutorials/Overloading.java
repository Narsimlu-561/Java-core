package HYRTutorials;

class Parent{
  void display(){
    System.out.println("this is a parent class");
  }
}
class Child extends Parent {
  void show(){
    System.out.println("this is a chid class ");
  }
}
class grandChild extends Child {
  void see(){
    System.out.println("this is a grandChild class ");
  }
}
public class Overloading {
  public static void main(String[] args) {
    grandChild gc=new grandChild();
    gc.display();
    gc.show();
    gc.see();
  }
}
