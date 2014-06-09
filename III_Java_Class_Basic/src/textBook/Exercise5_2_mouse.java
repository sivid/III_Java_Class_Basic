package textBook;
public class Exercise5_2_mouse {
	int x = 1, y = 0;				// current location of mouse, origin is at top left of maze
									// destination is x=6, y=5
	int front_x = x, front_y = y;
	int right_x = x, right_y = y;
	int left_x = x, left_y = y;
	int heading = 0;
	Exercise5_2_maze maze1 = new Exercise5_2_maze();
	/* Ok here's the new method.  Mouse should know which (absolute) direction Main wants it to check,
	 * check (relative) right, front, left grids, then let Main know which grid(s) are walkable.
	 * Main should tell Mouse to "keep to the right side".
	 */
	public int feeler(int look_direction){		// looking north(absolute)
		System.out.println("Checking directions, mouse is now at " + x + "," + y + ", heading " + look_direction);
		if (look_direction == 0){
			front_x = x - 1;
			front_y = y;
			right_x = x;
			right_y = y + 1;
			left_x = x;
			left_y = y - 1;
			//System.out.println("we got a u");
		}
		if (look_direction == 1){				// looking east(absolute)
			front_x = x;
			front_y = y + 1;
			right_x = x + 1;
			right_y = y;
			left_x = x - 1;
			left_y = y;
			//System.out.println("we got a r");
		}
		if (look_direction == 2){				// looking south(absolute)
			front_x = x + 1;
			front_y = y;
			right_y = y - 1;
			right_x = x;
			left_x = x;
			left_y = y + 1;
			//System.out.println("we got a d");
		}
		if (look_direction == 3){				// looking west(absolute)
			front_x = x;
			front_y = y - 1;
			right_x = x - 1;
			right_y = y;
			left_x = x + 1;
			left_y = y;
			//System.out.println("we got a l");
		}
		
		int mouse_return = 0;				// +1, +2, +4 if right, front, left side is walkable
		if (maze1.isThisWalkable(right_x, right_y))
			mouse_return += 1;
		if (maze1.isThisWalkable(front_x, front_y))
			mouse_return += 2;
		if (maze1.isThisWalkable(left_x, left_y))
			mouse_return += 4;
		return mouse_return;
	}	// end feeler()
	public void set_heading(int heading_from_main){
		heading = heading_from_main;
	}
	public boolean walker(){
		if (heading == 0){
			x = x - 1;
			//System.out.println("we got a u");
		}
		if (heading == 1){
			y = y + 1;
			//System.out.println("we got a r");
		}
		if (heading == 2){
			x = x + 1;
			//System.out.println("we got a d");
		}
		if (heading == 3){
			y = y - 1;
			//System.out.println("we got a l");
		}
		System.out.println("walker done, mouse is now at " + x + "," + y);
		System.out.println("heading is " + heading);
		if (x==6 && y==5){
			return false;	// ARRIVED!!
		}
		else
			return true;	// ehh, keep going
	} // end walker()
		
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void drawKnownMap(){		// probably won't get to this one XD
	}
}
