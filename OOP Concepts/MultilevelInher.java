package PST;

public class MultilevelInher {

	public static void main(String[] args) {

		V obj1=new V();
		obj1.pst1();
		obj1.pst2();
		obj1.pst3();
	}

}

class R {

	static void pst1() {

		System.out.println("hii CSE Gurllsss");
	}
}

class U extends R {

	static void pst2() {
		System.out.println("hloooo");

	}
}

class V extends U {

	static void pst3() {
		System.out.println("hii");

	}
}