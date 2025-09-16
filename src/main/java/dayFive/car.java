package dayFive;

public class car {

    String brand;
    String model;
    int year;

    car()
    {
        System.out.println("this defalut constructor");
    }


    car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}