package java_algorithm.inflearn.sec6;

import java.util.*;

class Point implements Comparable<Point>{
	public int x,y;
	Point (int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x)
			return this.y-o.y;
		else
			return this.x-o.x;
	}
}

public class _7좌표정렬 {
	//compareTo사용
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Point> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			arr.add(new Point(x,y));
		}
		Collections.sort(arr);
		for(Point point:arr) {
			System.out.println(point.x+" "+point.y);
		}
	}
	

}
