
package assignment3;

public class Human extends Animal {

    public Human(int legs, String speakParameter) {
        super(legs, speakParameter);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Looking around");
        xCoordinate = x;
        yCoordinate = y;
    }

}
