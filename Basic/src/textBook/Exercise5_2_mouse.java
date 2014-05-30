package textBook;

public class Exercise5_2_mouse {
	static int x = 1, y = 0;		// current location of mouse, origin is at top left of maze
									// destination is x=6, y=5
	static int front_x = x, front_y = y;
	static int right_x = x, right_y = y;
	Exercise5_2_maze maze1 = new Exercise5_2_maze();
	/* return 1: we arrived!
	 * return 2: it was a walkable grid and have a wall at right side, keep walking
	 * return 3: it wasn't a walkable grid or had a walkable grid at right side, turn right and keep walking
	 */
	/* Also putting in right-side wall detection.
	 * face_direction is u	front_x=x-1	front_y=y
	 * 						right_x=x	right_y=y+1
	 * face_direction is r	front_x=x	front_y=y+1
	 * 						right_x=x+1	right_y=y
	 * face_direction is d	front_x=x+1	front_y=y
	 * 						right_x=x	right_y=y-1
	 * face_direction is l	front_x=x	front_y=y-1
	 * 						right_x=x-1	right_y=y
	 * Also need to circumvent crossroads.  If both front and right are walkable, go right and tell main we need to turn once.
	 */
	public int walker(char face_direction){		
		if (face_direction == 'u'){
			front_x = x - 1;
			front_y = y;
			right_x = x;
			right_y = y + 1;
			//System.out.println("we got a u");
		}
		if (face_direction == 'd'){
			front_x = x + 1;
			front_y = y;
			right_y = y - 1;
			right_x = x;
			//System.out.println("we got a d");
		}
		if (face_direction == 'r'){
			front_x = x;
			front_y = y + 1;
			right_x = x + 1;
			right_y = y;
			//System.out.println("we got a r");
		}
		if (face_direction == 'l'){
			front_x = x;
			front_y = y - 1;
			right_x = x - 1;
			right_y = y;
			//System.out.println("we got a l");
		}
		// now we have 'front' and 'right side' x,y
		System.out.println("front_x:" + front_x + " front_y:" + front_y);
		if (front_x==6 && front_y==5){
			x = front_x;
			y = front_y;
			System.out.println("WE ARRIVED!! x: " + x + " y: " + y);
			return 1;
		}
		// mouse isn't there yet, now we ask maze if this grid is walkable
		if (maze1.isThisWalkable(front_x, front_y)){
			if (!maze1.isThisWalkable(right_x, right_y)){		// we have walkable space in front, wall at right
				x = front_x;									// should go front
				y = front_y;
				System.out.println("good step, mouse is at " + x + "," + y);
				return 2;
			}
			else{												// we have walkable space in front and right
																// 
				x = right_x;
				y = right_y;
				System.out.println("we just sidestepped to the right, need to turn, mouse is at " + x + "," + y);
				return 3;
			}
		}
		// grid isn't walkable, discard current x y, then turn right and walk again.
		else {
			front_x = x;			// actually we don't need to do this, but w/e
			front_y = y;
			System.out.println("bad step, mouse is at " + x + "," + y);
			return 3;
		}
		/* System.out.println("WHY");
		return 0;		// logic error, should not be here */
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
