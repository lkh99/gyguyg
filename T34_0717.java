package T34_0705;
import java.io.*;
import java.util.Scanner;
class store{
	int price;
	int num;
	void money(int  num) {
		price*=num;
	}
}
public class T34_0717 {
	int tableNumber;
	String orderedMenu;
	int menuPrice;
	int orderedNumber;

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getOrderedMenu() {
		return orderedMenu;
	}

	public void setOrderedMenu(String orderedMenu) {
		this.orderedMenu = orderedMenu;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

	public int getOrderedNumber() {
		return orderedNumber;
	}

	public void setOrderedNumber(int orderedNumber) {
		this.orderedNumber = orderedNumber;
	}

	@Override
	public String toString() {
		return "Order [tableNumber=" + tableNumber + ", orderedMenu=" + orderedMenu + ", menuPrice=" + menuPrice
				+ ", orderedNumber=" + orderedNumber + ", totalPrice=" + menuPrice*orderedNumber + "]";
	}

	public void printOrder() {
		System.out.printf("Table: %d\t Menu: %s\t Number: %d\t Price:%d\t Pay:%d\n", tableNumber, orderedMenu, orderedNumber, menuPrice,
				menuPrice*orderedNumber);
	} 
	public static void main(String[] args)throws Exception {
		T34_0717 order = new T34_0717();
		FileInputStream fi2 = new FileInputStream("d:/java/order.txt");
		int ch2;
		byte[] bt = new byte[100];
		int i=0;
		while((ch2= fi2.read())!=-1) {
			bt[i] = (byte)ch2;
			i++;
		}
		System.out.println(new String(bt));
		fi2.close();
	
	Scanner scan = new Scanner(System.in);
	System.out.println("����������Ҫ�ķ���");
	store ������˿  = new store();
	store �׷� = new store();
	store ������� = new store();
	store  ������= new store();
	store ���� = new store();
	������˿.price=15;
	�׷�.price=2;
	�������.price=20;
	������.price=15;
	����.price=3;
	������˿.money(scan.nextInt());
	System.out.println("������˿��Ҫ"+������˿.price);
	�׷�.money(scan.nextInt());
	System.out.println("�׷���Ҫ"+�׷�.price);
	�������.money(scan.nextInt());
	System.out.println("���������Ҫ"+�������.price);
	������.money(scan.nextInt());
	System.out.println("��������Ҫ"+������.price);
	����.money(scan.nextInt());
	System.out.println("������Ҫ"+����.price);
	int sum=0;
	sum+=������˿.price+�׷�.price+�������.price+������.price+����.price;
	System.out.println("һ����Ҫ"+sum);
	}

}




