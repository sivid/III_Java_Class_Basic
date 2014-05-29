package textBook;
/*
 * class mouse:
 * 	decides which direction to walk
 * 	records where it is in maze[][]
 * 	records which grids are Paths and which grids are Walls
 * 	decides if current grid is 6,5
 * 	BONUS: draw a 2*2 array of discovered 'map'
 * class maze:
 * 	stores the maze
 * 	decides if that grid is walkable
 * main: 
 * 	initiates mouse and maze
 * 	decides mouse movement direction
 */
public class Exercise5_2 {
	public static void main(String[] args) {
		Exercise5_2_mouse mouse1 = new Exercise5_2_mouse();
		boolean notThereYet = true;
		int direction_int = 0;
		char direction_char = 'u';
		int mouse_return = 0;
		/* sends direction for mouse to go, via mouse.walker()
		 * has an idea of which direction it took before.  if return 3, send mouse in another direction.
		 * if return 2, repeat while loop, going in same direction as before
		 * if return 1, end and celebrate
		 */
		while (notThereYet){
			if ((direction_int % 4) == 0)
				direction_char = 'u';
			if ((direction_int % 4) == 1)
				direction_char = 'r';
			if ((direction_int % 4) == 2)
				direction_char = 'd';
			if ((direction_int % 4) == 3)
				direction_char = 'l';
			mouse_return = mouse1.walker(direction_char);
			if (mouse_return == 3)
				direction_int++;
			else if (mouse_return == 1)
				notThereYet = false;
		}
		if (notThereYet == false)
			System.out.println("YAY");
		else
			System.out.println("WHY ARE WE HERE??");
	}	// end main()
}

