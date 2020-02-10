package enumerators;

public enum Difficulty {
    // Defining some constants
    EASY, MEDIUM, HARD;

    // Overriding the toString function
    @Override
    public String toString() {
        switch (this) {
            case EASY:
                return "Easy";
            case MEDIUM:
                return "Medium";
            case HARD:
                return "Hard";
            default:
                return "N/A";
        }
    }
}
