import java.io.*;
import java.util.*;

public class T34_0703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		int[] score = (100,90,80,70,60,50);
		String scoreName[] = ("rk","ek","qk","wk","ck");
		System.out.println("size:"+ score.length); 
		int intArray2[][]=new int[4][];
		intArray2[0]=new int[3];
		intArray2[1]=new int[2];
		intArray2[2]=new int[3];
		intArray2[3]=new int[2];
		Scanner scan=new Scanner (System.in);
		int input=0;
		InputStreamReader rd = new InputStreamReader (System.in);
		
		System.out.println("=======1");
		for(int i=0;i<6; i++) {
			System.out.println(score[i]);
		}
		System.out.println("=======2");
		for(int i: score) {
			System.out.println(i);
		}
		System.out.println("=======3");
		for(String s:scoreName) {
			System.out.println(s);
		}
		System.out.println("=======4");
		for(int i=0;i<intArray.length;i++) {
			for(int k=0;k<intArray[i].length;k++) {
				System.out.println("intArrya["+i+"]["+k+"]="+intArray[i][k]);
			}
		}
		System.out.println("=======5");
		for(int i=0;i<intArray2.length;i++) {
			for(int j=0;j<intArray2[i].length;j++) {
				intArray2[i][j]=(i+1)*10+j;
			}
		}
		for(int i=0;i<intArray2.length;i++) {
			for(int j=0;j<intArray2[i].length;j++) {
				System.out.print(intArray2[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("=======6");
		System.out.println("paramete's counts:"+args);
		for(String i:args){
			System.out.println(""+args);
		}
		System.out.println("=======8");
		System.out.println("输入姓名和学号");
		System.out.println("  "+scan.next());
		System.out.println("  "+scan.nextInt());
		
		System.out.println("=======7");
		try {
			while (true) {
				input =rd.read();
				if(input==-1)break;
				System.out.println((char)input);
			}
		}catch(IOException e) {
			System.out.println("发生错误");
		}
		System.out.println("=======9");
		try {
			Exception  e=new Exception("故意抛出的异常");
			throw e;
		}catch(Exception e){
			System.out.println("错误信息:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("程序正常结束");
		
	}

}
