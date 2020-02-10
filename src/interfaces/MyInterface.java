package interfaces;

/*
Interfaces are like abstract class except they are 100% abstract. They have no constructors and generally all functions declared here
will be abstract, unless they are private function in which case having a body is enforced.

Fields are static and final, so bear this in mind when using fields in interfaces
 */
public interface MyInterface {

    // Example of a field
    int myfield = 0;

    // Declaring an abstract function
    double activationFunction();
    // ^ Don't need abstract or public here as they are the default in interfaces


}
