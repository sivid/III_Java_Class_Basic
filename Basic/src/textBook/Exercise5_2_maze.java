package textBook;
public class Exercise5_2_maze {
	int[][] maze = {
			{2, 2, 2, 2, 2, 2, 2},
			{0, 0, 0, 0, 0, 0, 0},
			{2, 0, 2, 0, 2, 0, 2},
			{2, 0, 0, 2, 0, 2, 2},
			{2, 2, 0, 2, 0, 2, 2},
			{2, 0, 0, 0, 0, 0, 2},
			{2, 2, 2, 2, 2, 0, 2}
	};

	public boolean isThisWalkable(int x, int y){
		if (x>6 || x<0 || y>6 || y<0)		
			return false;
		if (maze[x][y] == 2)
			return false;
		if (maze[x][y] == 0)
			return true;
		return false;
	}
}
