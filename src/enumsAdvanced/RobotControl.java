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
	
	public static void main(String[] args) {
		Robot robot1 = new Robot(0, 0, Direction.UP);
		Robot robot2 = new Robot(1, 1, Direction.RIGHT);
		Robot robot3 = new Robot(0, 0, Direction.UP);
		Robot[] arrayRobots = {robot1, robot2, robot3};
		int[] targetRobots = {3, 0, 0, -1, 10, 10};
		
		for (int i = 0; i < arrayRobots.length; i++) {
			System.out.printf("Robot%d:\n\tInitial position & direction = ", 
					i);
			System.out.printf("(%d, %d), looking %s\n", 
					arrayRobots[i].getX(), 
					arrayRobots[i].getY(), 
					String.valueOf(arrayRobots[i].getDirection()));
			System.out.printf("\tTarget position: (%d, %d)\n", 
					targetRobots[i * 2], targetRobots[i * 2 + 1]);
			moveRobot(
					arrayRobots[i], 
					targetRobots[i * 2], 
					targetRobots[i * 2 + 1]);
			System.out.printf("Final position: (%d, %d)\n\n", 
					arrayRobots[i].getX(), 
					arrayRobots[i].getY());
			
		}
		
	}
	
	public static void moveRobot(Robot robot, int toX, int toY) {
		int deltaX = toX - robot.getX();
		int deltaY = toY - robot.getY();		
		Direction currentDirection = robot.getDirection();
		Direction left = Direction.LEFT;
		Direction right = Direction.RIGHT;
		Direction up = Direction.UP;
		Direction down = Direction.DOWN;
		Direction xDirection = deltaX < 0 ? left : right;
		Direction yDirection = deltaY < 0 ? down : up;
		
		if (deltaX != 0 && currentDirection == xDirection) {
			System.out.println("First case: "
					+ "Already towards good direction on X axis"); 
			
			reachTarget(robot, Math.abs(deltaX));
			
			if (deltaY != 0) {
				// Needed to move along Y axis
				orientRobot(robot, yDirection);
				reachTarget(robot, Math.abs(deltaY));
			}
			
		} else if (deltaY != 0 && currentDirection == yDirection) {
			System.out.println("Second case: " 
					+ "Already towards good direction on Y axis");
			reachTarget(robot, Math.abs(deltaY));
			
			if (deltaX != 0) {
				// Needed to move along X axis
				orientRobot(robot, xDirection);
				reachTarget(robot, Math.abs(deltaX));
			}
		} else {
			// Third case TODO : Not directed at all in a good direction ...
			System.out.println("Third case: Not directed towards any "
					+ "good direction... ");
			if (currentDirection == up || currentDirection == down) {
				if (deltaX != 0) {
					orientRobot(robot, xDirection);
					reachTarget(robot, Math.abs(deltaX));
				} else {
					robot.turnLeft(); // random ... turnRight() would work too.
					System.out.println("robot.turnLeft()");
				}
				
				currentDirection = robot.getDirection();
				
				if (deltaY != 0) {
					orientRobot(robot, yDirection);
					reachTarget(robot, Math.abs(deltaY));
				}
				
			} else {
				if (deltaY != 0) {
					orientRobot(robot, yDirection);
					reachTarget(robot, Math.abs(deltaY));
				} else {
					robot.turnLeft(); // random ... turnRight() would work too
					System.out.println("robot.turnLeft()");
				}
				
				if (deltaX != 0) {
					orientRobot(robot, xDirection);
					reachTarget(robot, Math.abs(deltaX));					
				}				
			}
						
		}

    }
	
	
	public static void reachTarget(Robot robot, int nbSteps) {
		while (nbSteps != 0) {
			System.out.println("robot.stepForward() - method");
			robot.stepForward();
			nbSteps--;
		}		
	}
	
	
	public static void orientRobot(Robot robot, Direction targetDirection) {
		Direction left = Direction.LEFT;
		Direction right = Direction.RIGHT;
		Direction up = Direction.UP;
		Direction down = Direction.DOWN;
		Direction currentDirection = robot.getDirection();
		if (currentDirection == up && targetDirection == left) {
			robot.turnLeft();
		} else if (currentDirection == left && targetDirection == down) {
			robot.turnLeft();
		} else if (currentDirection == down && targetDirection == right) {
			robot.turnLeft();
		} else if (currentDirection == right && targetDirection == up) {
			robot.turnLeft();
			System.out.println("robot.turnLeft() - method");
		} else {
			robot.turnRight();
			System.out.println("robot.turnRight() - method");
		}
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
