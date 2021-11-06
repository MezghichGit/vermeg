package vermeg_oca.chapter3;

import java.util.Arrays;
import java.util.Comparator;

public class MainString {
	
	public static void main(String[] args) {
		/*
		String v1 = "oca";
		String v2 = new String("oca");
		String v3 = "oca";
		
		System.out.println(v1 == v2);
		System.out.println(v1 == v3);
		
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));*/
		
		/*Student s1 = new Student();
		s1.id = 100;
		Student s2 = new Student();
		s2.id = 100;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		//System.out.println(1 + 2 + "c"); 
		//System.out.println("c"+1 + 2);
		/*int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); */
		String ch = "\t o \t c a \n";
		//String ch2 = ch.replace('a', 'p');
		//System.out.println(ch2);
		/*System.out.println(ch);
		System.out.println(ch.trim());*/
		/*StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("abcabcabcabcabcteabcabcabcabcabcteyr");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());*/
		/*
		int [] t = {10,24};
		int tab[] = new int[2];
		tab[0]=10;
		
		for(int i =0; i<tab.length;i++)
		{
			System.out.println(tab[i]);
		}
		System.out.println("************");
		for(int i : tab)
		{
			System.out.println(i);
		}
		*/
		//int [][] tab = new int[2][3];
		/*
		int [] tab [] = new int[2][];
		tab[0] = new int[4];
		tab[1] = new int[6];
		tab[0][0]=10;
		tab[0][1]=11;
		tab[0][2]=12;
		tab[0][3]=13;
		
		tab[1][0]=20;
		tab[1][1]=21;
		tab[1][2]=22;
		tab[1][3]=23;
		tab[1][4]=24;
		tab[1][5]=25;
		System.out.println(tab.length);
		System.out.println(tab[0].length);
		System.out.println(tab[1].length);*/
		
		/*String names[]= {"anis","seif","wifek","nour"};
		Arrays.sort(names);
		for(String name : names)
		{
			System.out.println(name);
		}*/
		Student students[] = new Student[3];
		students[0] = new Student(100);
		students[1] = new Student(1);
		students[2] = new Student(10);
		
		Comparator<Student> comp =(Student s1, Student s2)->{return s1.id-s2.id;};
		Comparator<Student> compDes =(Student s1, Student s2)->{return s2.id-s1.id;};
		//Arrays.sort(students);
		System.out.println("Tri ascendant");
		Arrays.sort(students, comp);
		for(Student student : students)
		{
			System.out.println(student);
		}
		System.out.println("Tri descendant");
		Arrays.sort(students, compDes);
		for(Student student : students)
		{
			System.out.println(student);
		}
		
	}

}
