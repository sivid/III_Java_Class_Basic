package textBook;

public class Exercise5_2_mouse {
	static int x = 1, y = 0;		// current location of mouse, origin is at top left of maze
									// destination is x=6, y=5
	static int current_x = x, current_y = y;
	Exercise5_2_maze maze1 = new Exercise5_2_maze();
	/* return 1: we arrived!
	 * return 2: it was a walkable grid, keep walking
	 * return 3: it wasn't a walkable grid, go back to previous grid, keep walking
	 */
	public int walker(char direction){		
		if (direction == 'u')
			current_x = x - 1;
		if (direction == 'd')
			current_x = x + 1;
		if (direction == 'r')
			current_y = y + 1;
		if (direction == 'l')
			current_y = y - 1;
		// now we have 'current' x,y
		if (current_x==6 && current_y==5){
			x = current_x;
			y = current_y;
			System.out.println("WE ARRIVED!! x: " + x + " y: " + y);
			return 1;
		}
		// mouse isn't there yet, now we ask maze if this grid is walkable
		if (maze1.isThisWalkable(x, y)){
			x = current_x;
			y = current_y;
			System.out.println("good step, x: " + x + " y: " + y);
			return 2;
		}
		// grid isn't walkable, discard current x y, then walk again.
		if (!maze1.isThisWalkable(x, y)){
			current_x = x;			// actually we don't need to do this, but w/e
			current_y = y;
			System.out.println("bad step, x: " + x + " y: " + y);
			return 3;
		}
		System.out.println("WHY");
		return 0;		// logic error, should not be here
	}	// end walker
		
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void drawKnownMap(){		// probably won't get to this one XD
	}
}
