package textBook;
public class Exercise5_2_maze {
	int[][] maze = {
			{2, 2, 2, 2, 2, 2, 2},
			{0, 0, 0, 0, 0, 0, 2},
			{2, 0, 2, 0, 2, 0, 2},
			{2, 0, 0, 2, 0, 2, 2},
			{2, 2, 0, 2, 0, 2, 2},
			{2, 0, 0, 0, 0, 0, 2},
			{2, 2, 2, 2, 2, 0, 2}
	};

	public boolean isThisWalkable(int x, int y){
		if (x>6 || x<0 || y>6 || y<0){
			System.out.println("maze says: map exited.     x="+x+", y="+y);
			return false;
		}
		if (maze[x][y] == 2){
			System.out.println("maze says: wall.           x="+x+", y="+y);
			return false;
		}
		if (maze[x][y] == 0){
			System.out.println("maze says: walkable path.  x="+x+", y="+y);
			return true;
		}
		return false;
	}
}
