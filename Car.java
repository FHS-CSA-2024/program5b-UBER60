public class Car{
  private String carName;
  private double mileDriven;
  private double gallonsUsed;

  public Car(){
    carName = "";
    mileDriven = 0;
    gallonsUsed = 0;
  }
  public Car(String newCarName, double newMileDriven, double newGallonsUsed){
    carName = newCarName;
    MileDriven = newMileDriven;
    GallonsUsed = newGallonsUsed;
  }
  public String getCarName(){
    return carName
  }
}
