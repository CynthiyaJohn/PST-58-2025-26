package PST;

class Student{
	
	 static void stud1() {
		 
		 System.out.println("'CSE DEPARTMENT'");
		 System.out.println("---------------------------");
		 System.out.println();
		 System.out.println("Class Students:CSE-1-Yr");
		 System.out.println("Rep:Sharon");
	}
    static void stud2() {
		 
    	     System.out.println();
		 System.out.println("Class Students:CSE-2-Yr");
		 System.out.println("Rep:Sharon");
	}
    static void stud3() {
		 
    	     System.out.println();
		 System.out.println("Class Students:CSE-3-Yr");
		 System.out.println("Rep:Keerthna");
	}
    static void stud4() {
		 
	     System.out.println();
	 System.out.println("Class Students:CSE-4-Yr");
	 System.out.println("Rep:Anonymous");
    }
		
}
class Mentor{
	static void men1() {
		
		System.out.println();
		System.out.println("Class Mentor:CSE-1-Yr");
		System.out.println("Mentor:Shankar");
	}
	static void men2() {
		
		System.out.println();
		System.out.println("Class Mentor:CSE-2-Yr");
		System.out.println("Mentor:Jayanthi");
	}
	static void men3() {
		
		System.out.println();
		System.out.println("Class Mentor:CSE-3-Yr");
		System.out.println("Mentor:Santhamani");
	}
    static void men4() {
		
		System.out.println();
		System.out.println("Class Mentor:CSE-4-Yr");
		System.out.println("Mentor:Anonymous");
	}
	
}

public class CSE_3 {

	public static void main(String[] args) {
		
		Student s=new Student();
		Mentor m= new Mentor();
		s.stud1();
		s.stud2();
		s.stud3();
		s.stud4();
	
		m.men1();
		m.men2();
		m.men3();
        m.men4();
	}

}
