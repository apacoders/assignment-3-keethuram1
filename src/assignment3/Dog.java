
package assignment3;

public class Dog extends Animal {

    public Dog(int legs, String speakParameter) {
        super(legs, speakParameter);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Wagging Tail");
        xCoordinate = x;
        yCoordinate = y;
    }
    
}
    

