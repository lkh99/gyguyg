package T34_0705;
import java.io.*;
import java.util.*;
class store{
	int price;
	int num;
	void money(int  num) {
		price*=num;
	}
}
public class T34_0710q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


