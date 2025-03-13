package CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePowers;

    public Car(String brand, String model, int horsePower){
            this.brand = brand;
            this.model = model;
            this.horsePowers = horsePower;

    }

    public int getHorsePowers(){
        return this.horsePowers;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public void setHorsePowers(int horsePowers){
        this.horsePowers = horsePowers;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }

    String carInfo(){
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePowers);
    }


}
package CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> myCars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++){
            String[] info = scanner.nextLine().split(" ");
            String brand = info[0];
            String model = info[1];
            int horsePower = Integer.parseInt(info[2]);

            Car car = new Car(brand, model, horsePower);
            myCars.add(car);
            System.out.println(car.carInfo());
        }
    }
}
/*3
Chevrolet Impala 390
Mercedes Benz 500
Volga 24 49*/
