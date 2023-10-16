package oocminihw2;

//It is clear that Formula 1 is a particular kind of vehicle because it extends the Vehicle class.
public class Formula1 extends Vehicle {
    
    // Constructor that accepts the "make" input to create an instance of Formula1.
    public Formula1(String make) {
        super(); // Makes an initialization call to the constructor of the base class (Vehicle).

        setMake(make); // Sets the Formula One car's manufacturer.

        setType("Formula 1 Car"); // Changes the vehicle's type to "Formula 1 Car."

        setNumWheels(4); // We decided on 4 wheels because that is the standard number of wheels for Formula 1 cars.
    }
}
