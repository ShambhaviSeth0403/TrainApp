package main;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie
class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Main class (ONLY public class)
public class UC14 {
    public static void main(String[] args) {
        try {
            PassengerBogie b = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b.getType());
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}