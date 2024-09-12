import java.util.Scanner;
public class CarTester(){
  public Car addCar(){
    Scanner x = new Scanner(System.in);
    Car a = new Car();
    System.out.print("Please enter the car's name: ")
    a.getCarName(x.nextString());
    System.out.println();
    System.out.print("Please enter cars miles: ")
    a.getMilesDriven(x.nextDouble());
    System.out.println();
    System.out.print("Please enter cars gallons: ")
    a.getGallonsUsed(x.nextDouble());
    System.out.println();
    return a;
  public static void(String[] args){
    CarTester s = new CarTester();
    Car a1 = new s.addCar();
    a1.toString();
    Car a2 = new s.addCar();
    a2.toString();
  }
}
