package RECURSION_PART4;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// possible outcomePath in 2D matrix

		int m = 3;// number of Row
		int n = 3;// number of Column
		printPath(m - 1, n - 1, 0, 0, "");

	}

	public static void printPath(int ec, int er, int cr, int cc, String ans) {
//base case hit
		if (cc == ec && cr == er) {
			System.out.println(ans+" ");
			return;

		}
		if (cc > ec || cr > er) {
			return;
		}

		printPath(er, ec, cr, cc + 1, ans+"H");
		printPath(er, ec, cr + 1, cc, ans+"V");

	}
}
//// if(life.difficulty==HARD){
//adapt().t
//hen(overCome);
//}