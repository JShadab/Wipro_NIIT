# Wipro_NIIT
Java Full stack batch

Class:
------
1. Class is an imaginary thing (blueprint) which describe the properties and behaviours for an object.
2. Class is representation of similar kind of objects.
3. Class is a logical entity.
4. Class is an user defined data type.


Syntax:
--------
	<modifier> class <name> <extends> <implements>
			{
				// body -> members can be either static or instance
						1. variable(s)
						2. method(s)
						3. constructor*
						4. inner class
						5. initializer blocks
						
			}

Example:
---------
	class A
	{
	}
------------------------
public class B
	{
		int i;
		
		void foo()
			{
			}
	}
==================================================================
Object:
---------
1. Object is an instance of a class.
2. Object is a real world entity.

Sysntax:
---------
	<type>	<var> =	new <type>(<parameters>)
      
Example:
---------
	Car c1 = new Car();
	Car c2 = new Car();
	
	

* new is a keyword in Java and used as an operator. 
	a) It will create all instance variable(s) of the class in heap memory and
	b) return reference/address of that object.
	
	
Accessig members:
-------------------
a) <ClassName>.<member>  //static members
b) <ObjRef>.<member>     // instance member as well as static (not a good thing)

==================================================================
*) static members are associate with class.
*) instance members are associated with object.

==================================================================
inheritance[IS-A relationship]:
-----------------------------------
-> It is a way of code reusability.


class Person
{
	void eat(){}
	void sleep(){}
}
				(IS-A)
class Employee extends Person
{
	void work(){}
}

class Dog
{
}
----------------------------------------
Employee emp = new Employee();
		
		emp.work();
		emp.eat();
		emp.sleep();

================================================
Aggregation[HAS-A relationship]
-----------------------------------
		
class Employee extends Person
{
	void work(){}	
	Dog dog; // HAS-A 	
}
========================================================
Encapsulation:
---------------
1. Wrapping of data amd methods into a single unit called encapsulation.
2. Encapsulation says that  make you data member as private and provide required getter and setters.

		public class Cat {

			private int age;

			// getter
			public int getAge() {
				return age;
			}

			// setter
			public void setAge(int x) {

				if (x <= 0) {

					System.out.println("Are u crazy..");
					return;
				}

				this.age = x;
			}

		}


Polymorphism:
--------------
ability of an object/method to behave like multiple forms
	a. method overloading (Compile time | early | static polymorphism)
	b. method overriding (Runtime | late | dynamic polymorphism)
	c. operator overloading

Abstraction:
------------
1. Data/information hiding.
2. Only neccessary details would be given by hiding unneccessary details.

=================================================================================
Data types in java:
----------------------
Primitive data type:
	boolean, char, byte, short, int, long, float, double

Reference data type:
			class, interface, array, enums
---------------------------------------------------------
byte -> short -> int -> long -> float -> double
        char -> int

------------------------------------10 March 2022-----------------------------------------------------
Java Coding Convention [not a rule]:
------------------------------------
class name : My, MyFirst, MyFirstClass
method/variable Name: my, myFirst, myFirstMethod
constant/enum name: MY, MY_FIRST, MY_FIRST_CONST

Java Source code structure:
---------------------------
1. <package declaration>
2. <import statements>
3. <class/interface definition>

-> All three are optional.
-> Order must be as above.

---------------------------------
Tokens:
----------
-> It is a basic building block of a java source code structure.

Tokens
	|- Keywords: predefine words to the compiler.
	|- Identifiers: name of class, variable, method, package are called identifier.
				  -> contans ony letter, digit, '_', '$'
				  -> never starts from digit
				  -> cannot use keyword as identifier.
	|- literals(values)
		|- Integer values (-10, 10, 0b10, 010, 0x10) (0-9, A-F)
					*) default data type is 'int'
		|- Floating point values (-2.3, 3.5, 2E4, 7e-34)
					*) default data type is 'double'
		|- Boolean values (true, false)
		|- Character values ('1', 'a', '#', ...)
		|- String values ("1", "a", "#", "Abc1234@%..papa", ...)
	
	|- Operators
	|- White spaces (space, enter, tab)
	|- Comments
			|- // single line 
			|- /* ---- */ multiline 
			|- /** ---- */ Java Documentation comment
			
==================================================================
Operators:
=============
1. Arithmetic operators:
----------------------------
a) +, -, *, /, %
	
	int a = 10;
	int b = 3;
	
	System.out.println(a + b); // 13 
	System.out.println(a - b); // 7
	System.out.println(a * b); // 30
	System.out.println(a / b); // 3
	System.out.println(a % b); // 1

b) Extended assignment:
		a = a + b; => a += b;
        a = a - b; => a -= b;
		a = a * b; => a *= b;
		a = a / b; => a /= b;
        a = a % b; => a %= b;

c) MAX(int, <type1>, <type2>, ....)	
		
		double d = 2.5;
		long l= 10;
		
	double	x = (d +5 ) * l;  // MAX(int, double, int, long   )
-------------------------------------
	byte b =10;
	short s = 20;

	int y = b + s ;		// MAX(int, byte, short)

===================================================================================		
2. Relational operators
------------------------
	a) <, <=, >, >=
	b) operands: Numeric
		result: boolean

Example;
-----------
		int x =15;
		boolean b = 10 < x < 20; // Compile time error
				  => true < 20
	
===================================================================================	
3. Equality operators
--------------------------
	a) ==, !=
	b) operands: all
		result: boolean
		
Example;
-----------		
	int i = 10;
	
	boolean b = i == 15; // false
	
			b = b == false; // true
---------------------------------------
 Car c1 = new Car();
 Car c2 = new Car();
 
	boolean b1 = c1 == c2; // false -> reference equality checker comparision ()

===================================================================================	
4. Assignment operators
	
	 <destType> = <srcType>

---------------- WIDENING ------------------------->>
byte -> short -> int -> long -> float -> double
        char -> int
<<---------------- NARROWING ------------------------
	 
     =>  <larger data type> = <smaller data type> (WIDENING is done implicitly) 
	 =>  <smaller data type> = <larger data type> (NARROWING requires casting) 

Example:
-----------
	 	int a = 10; 
		double d = a; // WIDENING

		// --------------------------------------
		double d1 = 2.3;
		int b = (int) d1; // NARROWING
	 
===================================================================================	
5. String Concatenation operators:
------------------------------------
    int a = 10 + 20 ; // 30
	
	String s1 = "10" + "20" ; // "1020"
	String s2 = "I Love " + "Java" ; // "I Love Java"
	String s3 = "ABC" + 101 ; // => "ABC" + "101" => "ABC101"

===================================================================================	
6. Variable increment/decrement operators:
-----------------------------------------------
	++/--

	
	int i =10;
	   ++i; // pre-increment
	System.out.println(i); // 11

--------------------------------------	
	int i =10;
	    i++; // post-increment
	System.out.println(i); // 11
	
-------------------------------------------------------------------------------
	int i = 10;
	int j = ++i; // pre-increment
	 
	System.out.println(i); // 11
	System.out.println(j); // 11

--------------------------------------	
	int i = 10;
	int j =  i++; // post-increment
	  
	System.out.println(i); // 11 
	System.out.println(j); // 10
	
-------------------------------------------------------

	int x = ++5; // C.E.
	System.out.println(x); //
	
===================================================================================		
7. Boolean logical operators:
------------------------------
	a) &, |, ^, !
	b) operands: <boolExpr>
		result : boolean

Example;
-----------
		int x =15;
		boolean b = (10 > x) & (x < 20); // false
				  => false & true
	
    c)	&&, ||
	
Example;
-----------
		int x =15;
		boolean b = (10 > x) && (x < 20); // false
				  => false && (Not evaluated)

===================================================================================	  
8. Ternary operators:
----------------------

	<boolExpr> ? <expr1> : <expr2>
  
   int a=10, b= 34;
   
   int max;
   
   if(a > b)
	{
		max = a;
	}
   else
	{
		max = b;
	}

System.out.println(max);

------------------------- OR ----------------
   int a=10, b= 34;
   
   int max = a > b ? a : b;
   System.out.println(max);

================================== 11 March 2022=================================

Methods:
-----------
It is a block/grpup of statements which can be called by aother java code again and again.
-> method may or may not return any value.
-> method can take some input parameters.

Syntax:
---------
<modifier> <returnType> <name>(<parameterList>) <throws>
	{
		//body
	}
	
Example:
------------
	void foo()
		{}
----------------
  int sum(int a, int b)
		{
		}

--------------------------------------------------------------
method overloading (Compile time | early | static polymorphism):
----------------------------------------------------------------
-> Within the Java class, we can have 2 or more than 2 methods having same name but different parameter list.
these methods are caled overloaded methods and this process is called methd overloading.

-> If method names are same:
	a) Number of parameters
	b) Data type of parameters
	c) Order of parameters.
	
*) There is no role of return type in method overloading

---------------------------------------------------------------------
Constructor:
=============
-> Constructors are specil members of a class.
-> Constructors are similar to the methods but not a method.

-> Constructor are used to construct initial state of an object.

-> Rules for creating constructor:
		a) Name of the constructor must be same as of the class.
		b) Only access modifier(public/protected/default/private) is permissible.
		c) No return type even void.

-> A construct without parameter called no-args or default constructor.
-> A construct with some parameters called parameterized constructor.

Example:
-----------
	public class A
	{
		public A(){} // created by compiler in this case.
	}
--------------------------	
 A v1 = new A();
 -------------------------------------------------
 public class Car {

	int h;
	int w;

	// no-args or default constructor
	public Car() {
		h = 5;
		w = 7;
	}

//Parameterized constructor
	public Car(int a, int b) {
		this.h = a;
		this.w = b;
	}

	void display() {
		System.out.println("Height = " + h + ", width = " + w);
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.display();

		Car c2 = new Car();
		c2.display();

		Car c3 = new Car(50, 100);
		c3.display();
//
//		c1.h = 10;
//		c1.w = 20;
//
//		c1.display();
	}

}

=============== 14 March 2022 ==============
1. Array is a linear Data Structure, which contains similar type of data.
2. In Java, arrays are object.
3. Arrays are fixed in size.
4. Arrays are indexed and index starts from 0.
5. If we use an invalid index, we will get an exception.(ArrayIndexOutOfBoundsException)
6. Valid indexes are 0 to (size-1).
7. Every array has an extra instance field named 'length' which stores the size of an array.

Syntax:
----------
a)  <type>[] <var> = new <type>[<size>]

Example:
---------
	int[] arr = new int[3];
	
	arr[0] = 13;
	arr[1] = 99;
	arr[2] = 68;
	

b)  <type>[] <var> = {<values>}

Example:
---------
	int[] arr = {13, 99, 68};


System.out.println("Size of array: " + arr.length);

		// How to print array
		System.out.println(arr); // [I@156643d4

		// How to print array elements
		System.out.println(Arrays.toString(arr)); // [13, 99, 68]

		// How to access array elements
		System.out.println("=============== Using For Loop ========================");

		for (int i = 0; i < arr.length; i++) {

			int x = arr[i];

			System.out.println(x);
		}
		
		System.out.println("=============== Using ForEach Loop (array/Collection) ========================");

		for (int x : arr) {	

			System.out.println(x);
		}

===================================================================================

2D- Array:
-------------
-> Array of arrays called 2D array.


Syntax:
--------

a)  <type>[][] <var> = new <type>[<size>][<size>]

b)  <type>[][] <var> ={ {<values>}, {<values>}, {<values>} }

Example:
---------
a) int[][] arr = new int[3][]; // It will store 3 array of different lengths

		int[] a1= {11, 99, 73, 49};
		int[] a2= {15, 67, 59};
		
		int[] a3= new int[8];
		a3[0] = 6;
		
		
		arr[0] = a1;
		arr[1] = a2;
		arr[2] = a3;
	
	
b) int[][] arr = {{11, 99, 73, 49}, {15, 67, 59}, {6,0,0,0,0,0,0}};

-----------------------------------
//	System.out.println(Arrays.toString(arr)); // [[I@1c4af82c, [I@379619aa, [I@cac736f]
		
		for (int i = 0; i < arr.length; i++) {		

			for (int j = 0; j < arr[i].length; j++) {
				
				int val = arr[i][j];
				
				System.out.print(val +", ");
				
			}
			
			System.out.println();
			
		}

	}
-------------------------------------------------------------
java.lang.String class:
-----------------------
-> String class object represents sequence of characters.
-> String objects are immutable/non-changable.

String S = "abc1234#@---...";

How to create String class objects:
---------------------------------------
a) Using String literal:
=========================
	
	String s1 = "Java";
	String s2 = "Java";
	
	boolean b11 = s1 == s2; //  reference equality  -> TRUE
	boolean b12 = s1.equals(s2); // object/content equality -> TRUE
	
b) Using new operator:
========================
	
	String s3 = new String("Python");
	String s4 = new String("Python");
	
	boolean b21 = s3 == s4;  //  reference equality  -> FALSE
	boolean b22 = s3.equals(s4); // object/content equality -> TRUE
	
----------------------------------------------------------
1) int length()
2) char charAt(int index)
3) int indexOf(char ch)
4) int lastIndexOf(char ch)
5) String concat(String)
6) boolean contains(String)
7) boolean startsWith(String)
8) boolean endsWith(String) 
9) String substring(int begin, int end) # end is excluded.
10) String substring(int begin) # end will consired as end of the string.
11) String replace(char oldChar, char newChar)
12) String trim()
13) String[] split(String delemeter)
14) boolean equals(Object str)
15) boolean equalsIgnoreCase(String str)

16) int compareTo(String str)
17) int compareToIgnoreCase(String str)

18) byte[] getBytes()

=============================================================

String name = "Shadab Ahmad Khan";

		System.out.println(name);
		System.out.println(name.length());// 17

		char ch = name.charAt(2);
		System.out.println(ch);// 'a'

		int index = name.indexOf('a');
		System.out.println(index); // 2

		int lastIndex = name.lastIndexOf('a');
		System.out.println(lastIndex); // 15

		System.out.println("-----------------------------------");
		String x = "I Love ";
		String y = "JAVA";

		String p = x + y;
		System.out.println(p);

		String q = x.concat(y);
		System.out.println(q);

		System.out.println("-----------------------------------");

		boolean b1 = name.contains("Khan");
		System.out.println(b1);// true

		boolean b2 = name.contains("Sharma");
		System.out.println(b2);// false

		boolean b3 = name.startsWith("Shad");
		System.out.println(b3);// true

		boolean b4 = name.endsWith("han");
		System.out.println(b4);// true

		System.out.println("-----------------------------------");

		String a = name.substring(7, 12);
		System.out.println(a);// Ahmad

		String b = name.substring(13);
		System.out.println(b);// Khan

		System.out.println("-----------------------------------");
		String str = name.replace('a', 'z');
		System.out.println(str);// Shzdzb Ahmzd Khzn

		String str1 = "  Papa Mummy     ";
		System.out.println(str1 + ", " + str1.length());// 17

		String str2 = str1.trim();
		System.out.println(str2 + ", " + str2.length());

		System.out.println("-----------------------------------");

		String[] words = name.split(" ");
		System.out.println(Arrays.toString(words));

		System.out.println("-----------------------------------");

		String s1 = "Java";
		String s2 = "Java";

		boolean b11 = s1 == s2; //  reference equality  -> TRUE
		boolean b12 = s1.equals(s2); // object/content equality -> TRUE

		String s3 = new String("Python");
		String s4 = new String("PYTHON");

		boolean b21 = s3 == s4;  //  reference equality  -> FALSE
		boolean b22 = s3.equals(s4); // object/content equality -> FALSE
		boolean b23 = s3.equalsIgnoreCase(s4); // object/content equality -> TRUE
		
------------------------------------ JUNIT ---------------------------------------
1. Its developer responsibity to test his code. So In Java we can use JUnit library/framework.
2. JUnit5 is the latest stable version.

---------------------------------- Think and model real world as Objects -------------------------
Object oriented programming:
------------------------------
1. class
2. objects
3. inheritance
4. polymorphism
5. encapsulation
6. abstraction

---------------------------- INHERITANCE -------------
Inheritance is a way of code reusability.

In Java, we have relationships between the classes.
	1. IS-A relationship (inheritance)
	2. HAS-A relationship (composition / aggregation)
	
*) Car HAS-A Engine and Car IS-A Vehicle.

class Vehicle 
	{
		//body
	}
--------------------------
class Engine 
	{
		//body
	}
--------------------------
class Car extends Vehicle
	{   
		-------
		------
		Engine e1;
		-----		
	}
-------------------------------------------------------------
-> In java, classes support single inheritance.
-> Every class must have a parent class. If a class doesnot use extends keyword then it will inherits 
	java.lang.Object class(Root class).
-> java.lang.Object is the only class which dont have parent.

-> A class can use 'extends' keyword to specify its parent class.



public class Person
	{
		private String name;
		
		void sleep(){}
		
		void eat(){}
	}
-------------------------------------
public class Employee extends Person
	{
		private int empId;
		
		void doWork(){}	

        void sleep(){}		
		
	}
---------------------------------------

 Employee e1 = new Employee();
		
		e1.doWork(); //OK of Employee class
		e1.eat(); // OK of Person class
		e1.sleep(); // OK of Employee class
		
-------------------------------------------------------------------
Method Overriding:
---------------------
-> Between the two classes having IS-A relationship. If both classes have same methods then it is called method overriding
-> When a child class re-define the same method as of its parent class then it is called method overriding.

Rules:
----------
	1. methods name and parameters must be same
	2. In case of Return type:
		a) if primitive, we cannot do any . must be same
		b) if reference, use same or any sub type.
		
	3. Accessibilty/Visibilty it can be widen (private -> default -> protected -> public)
	
	4. In case of throws, narrowing ..?????
	
*) private , static, final methods are not take participation method overriding.

public class Parent {

	public float foo() {

		System.out.println("Parent#foo");
		return 0;
	}

	protected Animal shad() {

		System.out.println("Parent#shad");
		return null;
	}

	final void hello() {

		System.out.println("Parent#hello");

	}

}

----------------------------------------------------
public class Child extends Parent {

	@Override
	public float foo() {
		System.out.println("Child#foo");
		return 0;
	}

	@Override
	protected Cow shad() {
		System.out.println("Child#shad");
		return null;
	}
	
	@Override
	final void hello() {

		System.out.println("Parent#hello");

	}
	
}

-----------------------------------------------------------------------------
Abstract Keyord:
------------------
abstract class:
-----------------
-> Abstract class restrict its intanciation means we cannot create objects for abstract class, it can be inherited only.

abstract method:
-----------------
-> A method without body is  called abstract method. And body will be provided by sub classes.

Example:
--------------

abstract public class A
{
	void method1(){---}  
	void method2(){---}
}
========================================
abstract public class B
{
	void method3(){---}
    abstract void method4();  //withoutbody
}

--------------------------------------------------------------------------
Final Keyword:
------------------
-> We can use final with class, method, variable (member and local both)
-> Final class cannot be inherited.
-> Final method cannot be overridden.
-> Final variable cannot be re-assigned

-====================================================
abstract class says, u can inherit but cannot create objects.
final class says, u cannot inherit but can create objects.
-----------------------------------------------------------------------
RUKE-1: Every Java class must have at least one constructor. 
	    If we didnot create, Compiler will create a default constructor in the class while compilation.

RUKE-2: Every constructor, must have either super() or this() as first statement.
	    If we didnot create, Compiler will insert super() by default.

super() -> is used to call immediate parent class constructor.
this() -> is used to call another constructor of the same class.
-------------------------------------------------------------------------------
public class SuperDemo {
	public static void main(String[] args) {

		C v1 = new C();

	}

}

class A {
	A() {
		super(); // It will call its Parent class constructor.
		System.out.println("Class A Constructor");
	}

}

class B extends A {
	B() {
		super(); // It will call its Parent class constructor.
		System.out.println("Class B Constructor");
	}

	int x;

}

class C extends B {
	C() {
		super(); // It will call its Parent class constructor.
		System.out.println("Class C Constructor");
	}

}

===============================================

public class ThisDemo {
	public static void main(String[] args) {

	//	Animal a1 = new Animal();
		 Animal a2 = new Animal(5);
		// Animal a3 = new Animal(5, 10);

	}

}

class Animal {

	Animal() {
		this(9);
		System.out.println("Default Constructor");
	}

	Animal(int x) {
		this(x, 88);
		System.out.println("1 parameter Constructor");
	}

	Animal(int x, int y) {
		System.out.println("2 parameter Constructor");
	}

}

--------------------------------------- INTERFACE -------------------------------------------
class A
{}

class B
{}


class C exends A, B   // C.E.
{}

-> In Java we have both Single and multiple inheritance.
-> Classes support only single inheritance.
-> Interface provides multiple inheritance.

=======================================================================
Like a class, Interface is an user defined data type.

Syntax:(Till Java 7)
----------------------
	<modifier> interface <name> <extends> 
			{
				// body -> members 
						1. variable(in reality CONSTANT) -> public static final
						2. method -> public abstract						
						
			}
Syntax:(From Java8)
------------------------
	<modifier> interface <name> <extends> 
			{
				// body -> members 
						1. variable(in reality CONSTANT) -> public static final
						2. method -> public abstract
						3. default method
						4. static method
						
			}
			
-> Like abstract class, we cannot create objects for interfaces.

-> Class -------extends---------> Class
   Interface -----extends-------> Interface
   
   Class -----implements-------> Interface
   Interface ------Error------> Class
   
-> If a class inherits one or more interaces, then class must have to implements methods of 
			those interfaces otherwise it will become abstract

Example:
---------
	interface A {

	int i = 10;
	public static final int j = 15;

	void m1();

	public abstract void m2();
	
	// From Java8

	default void m3() {
	}

	default void m4() {
	}

	static void m5() {
	}

	static void m6() {
	}

}

-----------------------------------------------------