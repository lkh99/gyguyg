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
	System.out.println("输入你所需要的份数");
	store 香辣肉丝  = new store();
	store 米饭 = new store();
	store 麻辣香锅 = new store();
	store  地三鲜= new store();
	store 可乐 = new store();
	香辣肉丝.price=15;
	米饭.price=2;
	麻辣香锅.price=20;
	地三鲜.price=15;
	可乐.price=3;
	香辣肉丝.money(scan.nextInt());
	System.out.println("香辣肉丝需要"+香辣肉丝.price);
	米饭.money(scan.nextInt());
	System.out.println("米饭需要"+米饭.price);
	麻辣香锅.money(scan.nextInt());
	System.out.println("麻辣香锅需要"+麻辣香锅.price);
	地三鲜.money(scan.nextInt());
	System.out.println("地三鲜需要"+地三鲜.price);
	可乐.money(scan.nextInt());
	System.out.println("可乐需要"+可乐.price);
	int sum=0;
	sum+=香辣肉丝.price+米饭.price+麻辣香锅.price+地三鲜.price+可乐.price;
	System.out.println("一共需要"+sum);
	}

}




