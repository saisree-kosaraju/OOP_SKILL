package OOP_Skill_2;

public class strbuffer_strop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("Sai");
		StringBuffer s2 = new StringBuffer("Sree");
		s1.append(s2);
		System.out.println(s1);
		System.out.println("Length of string s2 is: "+s2.length());
		System.out.println("Substring of s1: "+s1.substring(3,7));
		System.out.println("String s1 after deletion: "+s1.delete(3,7));
		System.out.println("String s1 after insertion of other string: "+s1.insert(3, " sree chowdary"));
		System.out.println("String s1 after reversing it: "+s1.reverse());

	}

}
