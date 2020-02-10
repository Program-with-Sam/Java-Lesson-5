package enumerators;

public enum Direction {
    // Define constants
    UP, RIGHT, DOWN, LEFT;

    // Create an array of the constants
    private static Direction[] directions = values();

    // Declare a function to get the next direction
    public Direction nextDirection() {
        // Return the next direction based on the position in the array
        return directions[(this.ordinal()+1) % directions.length];
        //                                   ^ This helps to ensure the output wraps around
    }

    // A main function to test the direction changer
    public static void main(String args[]) {
        // Declare a direction
        Direction d = Direction.UP;
        // For 20  iterations
        for(int i = 0; i < 20; i++) {
            // Change to the next direction
            d = d.nextDirection();
            // Output the direction
            System.out.println(d.toString());
        }
    }
}
