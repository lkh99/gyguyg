
public class T33_0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =2;
		int score = 96; 
		
		String grade ="";
		int num1=10, num2=5,result=0;
		char op = '*';
		
		System.out.println("======1.if: 奇数偶数");
		if (input % 2==0) {
			System.out.println("偶数");
		}
		System.out.println("奇数");
		
		System.out.println("======2.if_else:奇数偶数");
		input = 28;
		if(input % 2 == 0) {
			System.out.println("偶数");
		}else { 
			System.out.println("奇数");
		}
		System.out.println("======3.if_else:奇数偶数");
		if (score>=90) {
			grade="A";
		}
			if (score>=95) {
				System.out.println("grade="+grade+'+');	
			}
			else if (score<=94) {
				System.out.println("grade="+grade+'-');
			}
		System.out.println("======4.swich:奇数偶数");
		switch(input%2) {
			case 0:
				System.out.println("偶数!!");
				break;
			case 1:
				System.out.println("奇数!!");
				break;
		}
		System.out.println("======5.swich:计算器");
		switch (op) {
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1- num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			default	:
				System.out.println("输入有误");
		}	
		System.out.println("======6.for语句");
		int i;
		for(i=0;i<10;i++) {
			System.out.print(i);
		}
		System.out.println("======7.for.99乘法表");
		int j,k;
		for(j=2;j<5;j++) {
			for(k=1;k<10;k++) {
				System.out.println(j+"*"+k+"="+j*k);
			}
		}
		System.out.println("======8.while");
		i=0;
		while(i<10) {
			System.out.print(i);
			i++;
		}
		System.out.println("======9.while99乘法表");
		int a=1;
		while(a++<9) {
			int b=0;
			while(b++<9) {
				System.out.println(a+"*"+b+"="+a*b);
			}	
		}
		System.out.println("======10.do while");
		char munja='a';
		do {
			System.out.print(""+munja);
			munja++;
		}while(munja<='z');
		System.out.println();
		System.out.println("======11.break test");
		
		
		
		
		
		
		System.out.println("======12.continue test");
		int num=0;
		for (i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
		System.out.print("  "+i);
				num+=i;
		System.out.println("   "+num);
		}
		System.out.println("======13.return test");
	
		System.out.println("======14.return test");
		int x,z;
		for(x=1;x<10;x++) {
			for(z=1;z<10;z++) {
				System.out.println(x+"*"+z+"="+x*z);
				}
			}	
		}
	}


