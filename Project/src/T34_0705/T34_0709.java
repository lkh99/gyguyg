package T34_0705;
import java.io.*;
import java.util.Scanner;
public class T34_0709 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=======1");
		FileInputStream fi1 = new FileInputStream("d:/test/test.txt");
		int ch1;
		while ((ch1=fi1.read())!=-1) {
			System.out.print((char)ch1);
		}
		fi1.close();
		
		System.out.println();
		System.out.println("=======2");
		FileInputStream fi2 = new FileInputStream("d:/test/test.txt");
		int ch2;
		byte[] bt = new byte[1024];
		int i=0;
		while((ch2= fi2.read())!=-1) {
			bt[i] = (byte)ch2;
			i++;
		}
		System.out.println(new String(bt));
		fi2.close();
		
		System.out.println("=======3");
		FileReader fReader =new FileReader("d:/test/test.txt");
		BufferedReader bReader=new BufferedReader(fReader);
		String str = null;
		while((str = bReader.readLine())!=null) {
			System.out.println(str);
		}
		bReader.close();
		fReader.close();
		
		System.out.println("=======4");
		Scanner sc = new Scanner (new File("d:/test/add.txt"));
		int hap=0,value=0;
		while(sc.hasNext()) {
			value = sc.nextInt();
			System.out.println("数字:"+value);
			hap+=value;
		}
		System.out.println("和:"+hap);
		sc.close();
		
		System.out.println("=======6");
		FileWriter fw6 = new FileWriter("d:/test/fi6.txt");
		Scanner sc6= new Scanner(System.in);
		String str6=null; 
		while(!(str6=sc6.nextLine()).equals("")) {
			fw6.write(str6 +"");
		}
		fw6.close();
		
		System.out.println("=======5");
		FileOutputStream fos = new FileOutputStream("d:/test/fi5.txt");
		int ch;
		while((ch = System.in.read())!=13) {
			fos.write((byte)ch);
		}
		fos.close();
		
		System.out.println("=======7");
		FileInputStream fi7 = new FileInputStream("c:/windows/win.ini");
		FileOutputStream fo7 = new FileOutputStream("d:/test/fi7.txt");
		int ch7;
		while((ch7 = fi7.read())!=-1) {
			 fo7.write((byte)ch7);
		}
		System.out.println("结束");
		fi7.close();
		fo7.close();
		
		System.out.println("=======8");
		FileInputStream fi8 = new FileInputStream(args[0]);
		FileOutputStream fo8 = new FileOutputStream(args[1]);
		int ch8;
		while((ch8 = fi8.read())!=-1) {
			 fo8.write((byte)ch8);
		}
		System.out.println("结束");
		fi8.close();
		fo8.close();
	}

}
