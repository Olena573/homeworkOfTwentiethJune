public class Car {
    //Here is a class "Car"
    String carColor;
    String carType;
    int carDoors;

    public Car(String carColor, String carType, int carDoors) {
        this.carColor = carColor;
        this.carType = carType;
        this.carDoors = carDoors;

      //  car.someSound();
    }
    public String getCarColor (){
        return carColor;
    }
    public String getCarType (){
        return carType;
    }

    public int getCarDoors (){
        return carDoors;
    }

    public void setCarColor(String carColor){
        this.carColor = carColor;
    }
    public void setCarType (String carType){
        this.carType = carType;
    }
    public void setCarDoors (int carDoors){
        this.carDoors = carDoors;
    }

    @Override
    public boolean equals (Object o){
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof Car)) return false;
    Car car = (Car) o;
    return carColor == car.carColor;
    }


    public String toString(){
        return "A Car has these properties: " + '\n' +
                "Color of this car is: " + carColor + ", "+ '\n' +
                "Type of this Car is: " + carType + ", "+ '\n' +
                "and this car has " + carDoors + " doors.";
    }





}
