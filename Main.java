
public class Main implements Methods{
	private int[] id;
	void union(int num1,int num2) {
		if(find(num1)!=find(num2)) {
			for(int a = 0; a < id.length(); a++) {
				if(connected(a,num2)) {
					id[a] = num1;
				}
			}
		}
		else {
			id[num2] = find(num1);
		}
	}
	int find(int index) {
		return id[index];
	}
	public boolean connected(int num1,int num2) {
		return id[num1] == id[num2] && num1 != num2;
	}
	public void setup(int num) {
		for(int b = 0; b < num; b++) {
			id[b] = b;
		}
	}
}
