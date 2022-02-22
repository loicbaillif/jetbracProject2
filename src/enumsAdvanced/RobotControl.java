package enumsAdvanced;

/* ****** EXERCISE : Robot Control ******
 * 
 * 
 * There is a robot in the game field. The position of the robot in this field 
 * is described by two integer coordinates: X and Y. The X axis is oriented 
 * from left to right, the Y axis — from bottom to top.
 * 
 * At the initial moment, the robot is located at some coordinate on the field. 
 * It's also known where the robot looks: up, down, to the right or to the 
 * left. The initial position of the robot and its direction can have any 
 * values. 
 * You need to bring the robot to the destination point of the game field.
 * 
 * A robot is described by the Robot class. You can use the here-below methods 
 * of this class (with unknown implementation);
 * The direction of the robot is an enumeration;
 */

public class RobotControl {
	
	public static void moveRobot(Robot robot, int toX, int toY) {
		int deltaX = toX - robot.getX();
		int deltaY = toY - robot.getY();
		Direction xDirection = deltaX < 0 ? Direction.LEFT : Direction.RIGHT;
		Direction yDirection = deltaY < 0 ? Direction.DOWN : Direction.UP;
		Direction currentDirection = robot.getDirection();
		Direction left = Direction.LEFT;
		Direction right = Direction.RIGHT;
		Direction up = Direction.UP;
		Direction down = Direction.DOWN;
		
		if (deltaX !=0 && currentDirection == xDirection) {
			// First case: Already towards good direction on X axis
			do {
				robot.stepForward();
				deltaX = toX - robot.getX();
			} while (deltaX != 0);
			
			if (deltaY != 0) {
				// Needed to move along Y axis
				if ( (currentDirection == left && yDirection == down) 
						|| (currentDirection == right && yDirection == up)) { 
					robot.turnLeft();
				} else {
					robot.turnRight();
				}
				do {
					robot.stepForward();
					deltaY = toY - robot.getY();
				} while (deltaY != 0);
			}
			
		}
		
		if (deltaY != 0 && currentDirection == yDirection) {
			// Second case: Already towards good direction on Y axis
			do {
				robot.stepForward();
				deltaY = toY - robot.getY();
			} while (deltaY != 0);
			
			if (deltaX != 0) {
				// Needed to move along X axis
				if ( (currentDirection == up && xDirection == left) 
						|| (currentDirection == down && xDirection == right)) {
					robot.turnLeft();
				} else {
					robot.turnRight();
				}
			}
		}
		
		// Third case TODO : Not directed at all in a good direction ...
		// Then we'll do X first and Y then
		

        robot.stepForward(); // your implementation here
    }

}


enum Direction {
	UP(0,1), 
	DOWN(0,-1), 
	LEFT(-1,0), 
	RIGHT(1,0);

	private final int dx;
	private final int dy;

	Direction(int dx, int dy) { // Constructor
		this.dx = dx;
		this.dy = dy;
	}


	public Direction turnLeft() {
		switch (this) {
			case UP:
				return LEFT;
			case LEFT:
				return DOWN;
			case DOWN:
				return RIGHT;
			case RIGHT:
				return UP;
			default:
				throw new IllegalStateException();
		}
	}

	public Direction turnRight() {
		switch (this) {
			case UP:
				return RIGHT;
			case RIGHT:
				return DOWN;
			case DOWN:
				return LEFT;
			case LEFT:
				return UP;
			default:
				throw new IllegalStateException();
		}
	}


	// Getters:
	public int dx() {
		return dx;
	}

	public int dy() {
		return dy;
	}
}

class Robot {
	private int x;
	private int y;
	private Direction direction;
	
	public Robot(int x, int y, Direction direction) { // constructor
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void turnLeft() {
		direction = direction.turnLeft();
	}
	
	public void turnRight() {
		direction = direction.turnRight();
	}
	
	public void stepForward() {
		x += direction.dx();
		y += direction.dy();
	}
	
	
	// Getters:
	public Direction getDirection() {
		return direction;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
