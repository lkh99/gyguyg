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
	String[] menu = {"��1","��2","��3"};
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
	System.out.println("����������Ҫ�ķ���");
	store ��1 = new store();
	store ��2 = new store();
	store ��3 = new store();
	��1.price=30;
	��2.price=20;
	��3.price=15;
	��1.money(scan.nextInt());
	System.out.println("��1��Ҫ"+��1.price);
	��2.money(scan.nextInt());
	System.out.println("��2��Ҫ"+��2.price);
	��3.money(scan.nextInt());
	System.out.println("��3��Ҫ"+��3.price);
	int sum=0;
	sum+=��1.price+��2.price+��3.price;
	System.out.println("һ����Ҫ"+sum);
	}

}


