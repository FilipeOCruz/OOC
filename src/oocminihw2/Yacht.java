package oocminihw2;

// Create the Yacht class, which implements the Sailable interface.
public class Yacht extends Sailable {

    private boolean sailHoisted; // A boolean to track whether the sail is hoisted

    // Constructor for Yacht class
    public Yacht() {
        sailHoisted = false; // Initialize sailHoisted to false when a new Yacht is created
    }

    // Implement the hoistSail method from the Sailable interface
    
    public void hoistSail() {
        sailHoisted = true; // Set sailHoisted to true when the sail is hoisted
        System.out.println("Raising a sail"); // Print a message indicating the sail has been raised
    }

    // Implement the lowerSail method from the Sailable interface
    
    public void lowerSail() {
        sailHoisted = false; // When the sail is lowered, set sailHoisted to false.
        System.out.println("Sail lowered"); // Print a message indicating the sail has been lowered
    }

    // Implement the Sailable interface's isSailHoisted function.

    
    public boolean isSailHoisted() {
        return sailHoisted; // Get sailHoisted's current state back.
    }

    //Use the Sailable interface to implement the landHo function.
    
    public void landHo() {
        System.out.println("A yacht has come ashore."); // Print a note stating that the yacht has arrived at the shore.
    }
}
