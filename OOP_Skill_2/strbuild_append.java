package OOP_Skill_2;

public class strbuild_append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder("Sai");
		StringBuilder s2 = new StringBuilder("Sree");
		System.out.println(s1);
		System.out.println(s2);
	    s1.append(s2);
	    System.out.println("String after joining: "+s1);

	}

}
