package mypack;
//here we cretaed mypack as sum which that organizes a set of related classes and interfaces.
import mypack.ClassA;
//importing classA methods
public class ClassB {
	//public : it can be called from anywhere.
	//class defines instance and class fields,methods and inner classes as
	//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class

	//created class name as tree
	public static void main(String[] args) 
	//public : it can be called from anywhere.
	//static : doesn't belong to a specific object.
	//void : returns to no value.
	//main : is special because it will start the program.
		{
		// TODO Auto-generated method stub
		System.out.println("The properties of a cat is:");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		
		ClassA demo=new ClassA();//creating an object
		System.out.println("here the classA methods have been called in another package");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		demo.meow();//calling meow
		demo.run();//calling run
	}

}