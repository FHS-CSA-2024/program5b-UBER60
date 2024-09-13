import java.util.Scanner;
public class CarTester{
  public Car addCar(){
    Scanner x = new Scanner(System.in);
    Car a = new Car();
    System.out.print("Please enter the car's name: ");
    a.setCarName(x.next());
    System.out.print("Please enter cars miles: ");
    a.setMileDriven(x.nextDouble());
    System.out.print("Please enter cars gallons: ");
    a.setGallonsUsed(x.nextDouble());
    return a;
  }
  public static void main(String args[]){
    CarTester s = new CarTester();
    Car a1 = s.addCar();
    System.out.println(a1.toString());
    Car a2 = s.addCar();
    System.out.println(a2.toString());
  }
}
