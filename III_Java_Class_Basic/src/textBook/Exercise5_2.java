package textBook;
/*
 * class mouse:
 * 	actually does the walking/testing
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
	public static void main(String[] args) throws InterruptedException{
		Exercise5_2_mouse mouse1 = new Exercise5_2_mouse();
		boolean notThereYet = true;
		int direction_int = 0;
		int mouse_return = 0;
		/* uses mouse.feeler() to look in (absolute) direction
		 * has an idea of which direction it took before.  if problematic, send mouse in another direction.
		 */
		while (notThereYet){
			/*
			if ((direction_int % 4) == 0){
				face_direction = 0;
				//System.out.println("facing north");
			}
			if ((direction_int % 4) == 1){
				face_direction = 1;
				//System.out.println("facing east");
			}
			if ((direction_int % 4) == 2){
				face_direction = 2;
				//System.out.println("facing south");
			}
			if ((direction_int % 4) == 3){
				face_direction = 3;
				//System.out.println("facing west");
			}*/
			mouse_return = mouse1.feeler(direction_int % 4);
			/* mouse_return
			 * 		right(1)front(2)left(4)
			 * 1 -	Y		no		no
			 * 2 -	no		Y		no
			 * 3 -	Y		Y		no
			 * 4 -	no		no		Y
			 * 5 -	Y		no		Y
			 * 6 -	no		Y		Y
			 * 7 -	Y		Y		Y
			 * Main knows Mouse's absolute heading, and also knows the results of Mouse's observations.
			 * Mouse heading is controlled by Main.  In this following code, we will 
			 * 1. change direction_int
			 * 2. send heading to Mouse 
			 * 3. tell Mouse to walk (relative) forward
			 * Then Mouse checks if it's arrived at destination.
			 */
			switch(mouse_return){
			case 1:
				direction_int = (direction_int+1)%4;
				System.out.println("Turn right");
				break;
			case 2:
				// direction_int = direction_int;	// commented to avoid Eclipse's warning
				System.out.println("go forward");
				break;
			case 3:
				direction_int = (direction_int+1)%4;
				System.out.println("Turn right");
				break;
			case 4:
				direction_int = (direction_int+3)%4;
				System.out.println("Turn left");
				break;
			case 5:
				direction_int = (direction_int+1)%4;
				System.out.println("Turn right");
				break;
			case 6:
				// direction_int = direction_int;	// commented to avoid Eclipse's warning
				System.out.println("go forward");
				break;
			case 7:
				direction_int = (direction_int+1)%4;
				System.out.println("Turn right");
				break;
			case 0:
				direction_int = (direction_int+2)%4;
				System.out.println("turn around");
				break;
			default:
				System.out.println("This should not happen!");
			}// end switch
			Thread.sleep(1000);
			mouse1.set_heading(direction_int);
			notThereYet = mouse1.walker();
		} // end while()
		if (notThereYet == false)
			System.out.println("YAY");
		else
			System.out.println("WHY ARE WE HERE??");
	}	// end main()
}

