package oocminihw2;

// It is a form of flyable vehicle because the Jet class extends the Flyable class.
public class Jet extends Flyable {

    // A "make" parameter is accepted by the constructor when constructing a Jet instance.
    public Jet(String make) {
        super(); // Makes a call to the Flyable base class' constructor to perform initialization.

        setMake(make); // Sets the make of the Jet.

        setType("Jet"); // Sets the type of the vehicle to "Jet."

        setNumWings(2); // We set the quantity of wings to 2, as two wings are typical for aircraft.

    }

    // The Jet's number of wings can be obtained via a getter technique.
    public int getNumWings() {
        return numWings;
    }

    // Update the Jet's number of wings using the setter method.
    public void setNumWings(int numWings) {
        this.numWings = numWings;
    }
}
