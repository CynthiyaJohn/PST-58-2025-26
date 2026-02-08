package PST;
//method overriding,single inheritance_Runtime Polymorphism
public class MethodoverridingPolyInher {

  public static void main(String[] args) {

  
	      S objA = new S();
	      objA.CSE();
	      T objB = new T();
	      objB.IT();
	      
  }
}

class S {
  	 
    static void CSE() {
  		 
  		 System.out.println("hii CSE Gurllsss");
  	 }
}
class T  extends  S {
  	  
	static void IT() {
  		 System.out.println("hloooo");
  	  
    }
}