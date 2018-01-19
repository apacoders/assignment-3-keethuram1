
package assignment3;

public class Mouse extends Animal {

    public Mouse(int legs, String speakParameter) {
        super(legs, speakParameter);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Sniffing ground");
        xCoordinate = x;
        yCoordinate = y;
    }

}
