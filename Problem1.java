
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        checkForDoor();
    }
    public void corner() {
        if (!frontIsClear()) {
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
                turnLeft();
            }
        }
    }
    public void findWall() {
        while(frontIsClear()) {
            super.move();
        }
        turnLeft();
    }
    public void checkForDoor() {
        while (frontIsClear()) {
           turnRight();
           if (frontIsClear()) {
               exitWall();
            }
           else {
               turnLeft();
            }
            move();
            corner();
}
}
public void exitWall() {
    move();
    move();
}
 public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
}
}

