import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.util.Random;

public class MouseMover {
    public static final int MOVE_INTERVAL = 240000;
    
    public static void main(String... args) throws Exception {
        Point curPos;
        Robot robot = new Robot();
        Random rand = new Random();

        while(true) {
            curPos = MouseInfo.getPointerInfo().getLocation();
            int newX = curPos.x + (rand.nextBoolean() ? 1 : -1);
            int newY = curPos.y + (rand.nextBoolean() ? 1 : -1);
            System.out.println("-- Cur (" + curPos.x + "," + curPos.y + ") : New (" + newX + "," + newY + ")");
            robot.mouseMove(newX, newY);
            Thread.sleep(MOVE_INTERVAL);
        }
    }
}
