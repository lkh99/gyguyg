package T34_0705;
import java.util.*;
class car{
	String color;
	int speed;

	void upspeed(int value) {
		speed+=value;
	}
	void downspeed(int value) {
		speed-=value;
	}
}
class store{
	int price;
	int num;
	void money(int  num) {
		price*=num;
	}
}


public class T34_0710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car a1=new car();
		car a2=new car();
		car a3=new car();
		
		a1.color="蓝色";
		a1.speed=0;
		a2.color="红色";
		a2.speed=0;
		a3.color="白色";
		a3.speed=0;
		
		a1.upspeed(30);
		System.out.println("汽车1的颜色如果是"+a1.color+","+"当前速度为"+a1.speed);
		a2.upspeed(60);
		System.out.println("汽车2的颜色如果是"+a2.color+","+"当前速度为"+a2.speed);
		a1.upspeed(100);
		System.out.println("汽车3的颜色如果是"+a3.color+","+"当前速度为"+a3.speed);
		
		
		System.out.println("==========2");
		String[] menu = {"菜1","菜2","菜3"};
		int i;
		for(i=0;i<3;i++) {
			System.out.println(menu[i]);
		}
		String[] price= {"30","20","15"};
		int j;
		for(j=0;j<3;j++) {
			System.out.println(price[j]);
		} 
		Scanner scan = new Scanner(System.in);
		System.out.println("输入你所需要的份数");
		store 菜1 = new store();
		store 菜2 = new store();
		store 菜3 = new store();
		菜1.price=30;
		菜2.price=20;
		菜3.price=15;
		菜1.money(scan.nextInt());
		System.out.println("菜1需要"+菜1.price);
		菜2.money(scan.nextInt());
		System.out.println("菜2需要"+菜2.price);
		菜3.money(scan.nextInt());
		System.out.println("菜3需要"+菜3.price);
		int sum=0;
		sum+=菜1.price+菜2.price+菜3.price;
		System.out.println("一共需要"+sum);
		}

	
}


