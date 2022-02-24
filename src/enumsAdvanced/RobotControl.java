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
		
		/*
		System.out.print("R2D2: \n\tInitial position & direction: ");
		System.out.println("(0, 0), looking UP");
		System.out.println("\tTarget position: (3, 0)");
		Robot r2d2 = new Robot(0, 0, Direction.UP);
		moveRobot(r2d2, 3, 0);
		
		System.out.println("New Robot");
		
		Robot c3pO = new Robot(1, 1, Direction.RIGHT);
		moveRobot(c3pO, 0, -1);
		*/
	}
	
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
		
		if (deltaX != 0 && currentDirection == xDirection) {
			System.out.println("First case: "
					+ "Already towards good direction on X axis"); 
			
			do {
				robot.stepForward();
				System.out.println("robot.stepForward()");
				deltaX = toX - robot.getX();
			} while (deltaX != 0);
			
			currentDirection = robot.getDirection();
			
			if (deltaY != 0) {
				// Needed to move along Y axis
				if ( (currentDirection == left && yDirection == down) 
						|| (currentDirection == right && yDirection == up)) { 
					robot.turnLeft();
					System.out.println("robot.turnLeft()");
				} else {
					robot.turnRight();
					System.out.println("robot.turnRight()");
				}
				do {
					robot.stepForward();
					System.out.println("robot.stepForward()");
					deltaY = toY - robot.getY();
				} while (deltaY != 0);
			}
			
		} else if (deltaY != 0 && currentDirection == yDirection) {
			System.out.println("Second case: " 
					+ "Already towards good direction on Y axis");
			do {
				robot.stepForward();
				System.out.println("robot.stepForward()");
				deltaY = toY - robot.getY();
			} while (deltaY != 0);
			
			currentDirection = robot.getDirection();
			
			if (deltaX != 0) {
				// Needed to move along X axis
				if ( (currentDirection == up && xDirection == left) 
						|| (currentDirection == down && xDirection == right)) {
					robot.turnLeft();
					System.out.println("robot.turnLeft()");
				} else {
					robot.turnRight();
					System.out.println("robot.turnRight()");
				}
				do {
					robot.stepForward();
					System.out.println("robot.stepForward()");
					deltaX = toX - robot.getX();
				} while (deltaX != 0);
			}
		} else {
			// Third case TODO : Not directed at all in a good direction ...
			System.out.println("Third case: Not directed towards any "
					+ "good direction... ");
			if (currentDirection == up || currentDirection == down) {
				if (deltaX != 0) {
					if ((currentDirection == up && xDirection == left)
							|| (currentDirection == down && yDirection == right)) {
						robot.turnLeft();
						System.out.println("robot.turnLeft()");
					} else {
						robot.turnRight();
						System.out.println("robot.turnRight()");
					}
					do {
						robot.stepForward();
						System.out.println("robot.stepForward()");
						deltaX = toX - robot.getX();
					} while (deltaX != 0);
				} else {
					robot.turnLeft();
					System.out.println("robot.turnLeft()");
				}
				
				currentDirection = robot.getDirection();
				
				if (deltaY != 0) {
					if ( (currentDirection == left && yDirection == down) 
							|| (currentDirection == right && yDirection == up) ) {
						robot.turnLeft();
						System.out.println("robot.turnLeft()");
					} else {
						robot.turnRight();
						System.out.println("robot.turnRight()");
					}
					do {
						robot.stepForward();
						System.out.println("robot.stepForward()");
						deltaY = toY - robot.getY();
					} while (deltaY != 0);
				}
				
			} else {
				if (deltaY != 0) {
					if ( (currentDirection == left && yDirection == down) 
							|| (currentDirection == right && yDirection == up) ) {
						robot.turnLeft();
						System.out.println("robot.turnLeft()");
					} else {
						robot.turnRight();
						System.out.println("robot.turnRight()");
					}
					do {
						robot.stepForward();
						System.out.println("robot.stepForward()");
						deltaY = toY - robot.getY();
					} while (deltaY != 0);
				} else {
					robot.turnLeft();
					System.out.println("robot.turnLeft()");
				}
				
				if (deltaX != 0) {
					if ((currentDirection == up && xDirection == left)
							|| (currentDirection == down && yDirection == right)) {
						robot.turnLeft();
						System.out.println("robot.turnLeft()");
					} else {
						robot.turnRight();
						System.out.println("robot.turnRight()");
					}
					do {
						robot.stepForward();
						System.out.println("robot.stepForward()");
						deltaX = toX - robot.getX();
					} while (deltaX != 0);
				}
				
			}
			
			currentDirection = robot.getDirection();
			
		}
		

        // robot.stepForward(); // your implementation here
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
