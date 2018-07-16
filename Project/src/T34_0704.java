

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250; 
}
class Car{
	String color;
	String gearType;
	int door;
	Car(){
		color = "white";
		gearType = "auto";
		door = 4;
	}
	Car(String c,String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}
class InitTest{
	static int cv = 1;
	int iv = 1;
	static {cv = 2; }
	{iv = 2;}
	InitTest(){iv = 3;}
}	

public class T34_0704 {
	public static int factorial(int n) {
		if(n==1) 
		return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======1");
		Card c1=new Card();
		Card c2=new Card();
		c1.number=7;
		c2.number=4;
		c1.kind="Heart";
		c2.kind="Spade";
		System.out.println("c1:"+c1.kind+","+c1.number+","+"大小:"+c1.width+","+c1.height);
		System.out.println("c2:"+c2.kind+","+c2.number+","+"大小:"+c2.width+","+c2.height);
		c1.width=50;
		c1.height=80;
		System.out.println("c1的宽和高变更为:"+c1.width+","+c1.height);
		
		System.out.println("======2");
		Car a1= new Car();
		Car a2= new Car("black","gear",6);
		Car a3= new Car("blue","auto",4);
		Car a4= new Car("black","gear",6);
		System.out.println("a1的color="+a1.color+","+"gearType="+a1.gearType+","+"door="+a1.door);
		System.out.println("a2的color="+a2.color+","+"gearType="+a2.gearType+","+"door="+a2.door);
		System.out.println("a3的color="+a3.color+","+"gearType="+a3.gearType+","+"door="+a3.door);
		System.out.println("a4的color="+a4.color+","+"gearType="+a4.gearType+","+"door="+a4.door);

		System.out.println("======3");
		InitTest it = new InitTest();
		System.out.println("cv="+it.cv+","+"iv="+it.iv);
		
		System.out.println("======4");
		System.out.println(factorial(4));
	}
}

	
