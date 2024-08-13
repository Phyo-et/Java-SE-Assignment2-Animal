import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import src.Animal;
public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Animal[] animalArray = new Animal[50];
		String name;
		int age;
		String species;
		int count = 0;
		String agree;

		do {

		System.out.print("Enter the Animal Name : " );
		name = br.readLine();
		System.out.print("Enter the Animal Age : " );
		age = Integer.parseInt(br.readLine());
		System.out.print("Enter the Animal Species Name : ");
		species = br.readLine();

		Animal ani =new Animal();
			ani.name = name ;
			ani.age = age ;
			ani.species = species;


		animalArray[count] = ani ;
		count++;

		System.out.print("Do u want to add more Animals ?(yes/no) : ");
		agree = br.readLine();

		}while( agree.equalsIgnoreCase("yes"));
		System.out.println("Animal Information");
		System.out.println("=============================================");
		System.out.println("Total Number of Animal : "+count);


		for ( int x=0 ; x < count ;x++ ) {
			System.out.println("Animal Number : "+ count);
			animalArray[x].inputData();

		}

	}


}