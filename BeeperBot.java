
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeepers();
    }
} public void collectBeepers() {
        if (facingEast() == true && !nextToABeeper()) {
            move();
        }
        else if (facingEast() == true && nextToABeeper()) {
            turnLeft();
        }
        while(facingNorth() && nextToABeeper()) {
            move();            
        }
        if (facingNorth() && !nextToABeeper()) {
            turnLeft();
            turnLeft();
            move();
        }
        while (facingSouth() && nextToABeeper()) {
            pickBeeper();
            if(frontIsClear()) {
                move();
            }
            else {
                turnLeft();
            }
        }
        
    }
    }
