public class Car{
  private String carName;
  private double mileDriven;
  private double gallonsUsed;

  public Car(){
    carName = "";
    mileDriven = 0.0;
    gallonsUsed = 0.0;
  }
  public Car(String newCarName, double newMileDriven, double newGallonsUsed){
    carName = newCarName;
    mileDriven = newMileDriven;
    gallonsUsed = newGallonsUsed;
  }
  public String getCarName(){
    return carName;
  }
  public double getMileDriven(){
    return mileDriven;
  }
  public double getGallonsUsed(){
    return gallonsUsed;
  }
  public void setCarName(String name){
    carName = name;
  }
  public void setMileDriven(double miles){
    mileDriven = miles;
  }
  public void setGallonsUsed(double gallons){
    gallonsUsed = gallons;
  }
  public double calculateAverage(){
    return Math.round(gallonsUsed * 100)/100.0;
  }
  public String toString(){
    return carName + " averaged " + (Math.round(gallonsUsed * 100)/100.0) + " m/g";
  }
}
