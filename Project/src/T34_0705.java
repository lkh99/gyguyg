class Data{int x ;}
class PrivateRestrict34{
	private String name = "34 private lkh";
}
class ProtectedRestrict_01{protected String name="34 protected lkh ";}
public class T34_0705 {
	public static void change(int x) {
		x=1000;
		System.out.println("change():x="+x);
	}
	public static void change(Data d) {
		d.x=1000;
		System.out.println("change():x="+d.x);	
	}
	public static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x =d.x ;
		tmp.x=200;
		return tmp;
	}
	public static Data copy_change(Data d) {
		Data tmp = new Data();
		tmp.x=10;
		return tmp;
	}
	private String name="YUST";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("========1");
	Data d = new Data();
	d.x=10;
	System.out.println("main():x="+d.x);
	change(d.x);
	System.out.println("After change(d.x)");
	System.out.println("main():x="+d.x);
	
	System.out.println("========2");
	change(d);
	System.out.println("After change(d.x)");
	System.out.println("main():x="+d.x);
	
	System.out.println("========3");
	Data d2=copy(d);
	System.out.println("in_copy tmp.x="+d.x);
	System.out.println("in_copy tmp.x="+d2.x);
	System.out.println("d.x="+d.x);
	System.out.println("d2.x="+d2.x);
	
	System.out.println("========4");
	Data d3= copy_change(d);
	System.out.println("d.x="+d.x);
	System.out.println("d3.x="+d3.x);

	System.out.println("========5");
	T34_0705 pr = new T34_0705();
	System.out.println("******1.private   :"+pr.name); 
	
	System.out.println("========6");
	/*PrivateRestrict_34 pr34 = new PrivateRestrict_34();
	System.out.println(pr34.name);*/ 
	
	System.out.println("========7");
	ProtectedRestrict_01 ab = new ProtectedRestrict_01();
	System.out.println(ab.name);
	}

}
