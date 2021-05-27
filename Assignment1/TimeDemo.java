class Time{
	private int hr,min,sec;
	Time(int hr,int min, int sec) {
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		
	}
	public void add(Time obj) {
		int h=this.hr + obj.hr;
		int m = this.min + obj.min;
		int s= this.sec + obj.sec;
		m = m+s/60;
		s=s%60;
		h = h + m/60;
		m=m%60;
		h = h%24;
		System.out.println(h +" " + m + " " + s);
		
	}
}
public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time obj1=new Time(8,59,59);
		Time obj2=new Time(6,40,10);
		obj1.add(obj2);

	}

}
