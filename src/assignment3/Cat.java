
package assignment3;

public class Cat extends Animal {

    public Cat(int legs, String speakParameter) {
        super(legs, speakParameter);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Lying Down");
        xCoordinate = x;
        yCoordinate = y;
    }

}
