package interfaces;

/*
Class to implement the interfaces
 */
public class Sigmoidal implements MyInterface {
                        // ^ Implements not extends

    /*
    When implementing an interface all abstract functions must be overridden
    From here you can define how you want this function to behave in this class
     */
    @Override
    public double activationFunction() {
        // Return a val
        return 0;
    }
}
