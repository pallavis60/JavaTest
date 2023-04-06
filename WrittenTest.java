Q.1)Constructor is a Special method used to initiallize object.the constructor is called when object of the class is created.at the time of calling the constructor memory of the object 
will be allocated with the memory.
there are two ruels for Writing constructor1
1) The constructor name is should be same as its class name
2)The constructor dose't have any return type
And constructor should not be static,final,sycronysed,abstract bt we can use the access modifiers which controlles the object creation.


There are 3 types in constructors
1)Default constructor
2)non-args Constructor
3Parameterised Constructor

1)Default Constructor--->Whenver object is created using new keyword atleast one constructor will be called .there is no constructor avilable in class then the default constructorwill be called
in such caese JVM will provide the default constructor by default
     So Every class has a Constructor Which may be Default or Our Own constructor
	 In default constructor ;
	 1) the modifiersof the defaultconstructor is same as the class modifiers
	 2) Default constructoris no-args Constructor
	 3)The Default Constructor have only one line that is super() which is the no args call to the super class .
	 
2)Non-Args constructo-----> the constructor does not contain any parameter is called non aegs construtor;
   It is used to providedefault values to the object like null,0 ect depending upon the datatype


*default constructo is non args constructor bt every non args constructor is not a defaultconstructor;
3) 3Parameterised constructor ---->  A constructor have specific number of parameter is callrd parameterized constructor
which is used to provide the different values to the distinct object..however we can provide same values also.   
	 
Q2)
1)Java Is Simple--->*Java Is Simple&Easy to learn
* The java programms can write easily.
*To Learn Java no prior Knowledge is required
*Most complex & Confusing feauters in other lang (C++,c)like multipleInheritance,pointer concepts are removed from java
2)Java Is Object oriented programming langague;
3)ROBOUST----> *Java Is Strongly typed programming lang .ecah and every assignments and sytex are cheked bye compiler so we can know the any error wrt type find in compile time only
             *Java Provide garbage collector for automatic memory management hence no chance of memory prblms
			 *Java Provide Inbuilt exeption handling which prevent termination of the program.
			 *Java is platfor independent
			 *For these facilities in java chance of failure program at run time is very less hence java is ROBUST
4)PlatformIndependent----->Java programms can write once run in any platform ..that is it follows Write Once RUN Anywhere Principle so java is platform independent,JVM make the java as platform independent
              
			  
			  JavaApplication________ByteCode____JVMforWindowSotware---Window Software
											 ______Jvm For lenuxSoftware ---LenuxSofware
                                            
                                            ________JvmforWAC Software---WAC Sotware

                    Here the Java Program is coverted to the byte code by compiler the byte code is coverted Machine code by JVM For the differnt sotwares the diff JVM is there
hence the java programs can run in anyplatform	 here Java is Platform indepent bt JVM is platform dependent.				
											  
											  
5)DynamicImplementation
6)Multithreaded
7)Artichetur Nutral
8)Portable
9)Secured-----> In java ,Java Programs can not communicate diractly with the machines the code is first coverted to the byte code then it is convertd to machine code by jvm.
         If the byte code contains any prblms or not properly formmated the JVM wont't allow the code to run it give the runtime exeption The byte code verifier is resposible to verify the byte code
		 Hence Java Programs can not cause any prblm to the system hence java is secured langague.
10)High Perfomance
11)Distrubuted
12)Compiled and Interpreted


Q3)C++---->C++ is it gives support for pointer,multipleInheritance etc,The mistakes can't easily correctable,more time consumming.
Java-----> Java Is not give support for the Pointers,multiple Inheritance etc,the mistakescan easily correctable,less time consumin.

Q4)JDK---> Java Development kit------> JDk is used by developers it is creates environment for the Development and run It contains JRE and some development TOols
   JRE--->Java Runtime Environment--->It provides the environment for the java program running it contain Some library and JVM
   JVM---> Java Vertual Machine ---> It is present inside the JRE.It interprate the byte code line by line and execute machine code.JVM makes java as platformIndependent.
   

Q5)JVM contains Stack Memory which is created after loading the class by class loader jvm looks for the main method after finding the main method JVM will create the Stack Inside the Stcak
It will create the StackFrame also In stack frame which will load the name of the method,variables and after the execution it delete the stack frame ..Here the primitive variables are stored in the stack frame
but non primitive variabls are created in the HEAP POOl..In Heap pool Instanec Pool and Constance pool is presented the variables of String which is created using literals are stored in the constance /String pool ,,the address of the value is pointed to the 
Datatype And the Object created using new keyword is stored in the instnec memory if value is defined already but it is once agin created in the instanec pool...after the execution all memory locations are deleted by JVM

Q6)Methods are the block of code ,when it is called it do  some specific function mentioned in it
  In methods main method is important because...the main method is declared or not or it is properly defined or not it is not checked by the compiler bt the JVM is resopnsible for the checking these thing
  If JVM wont find the main method then it is give error like noSuchMethodError.main
  
  so  main method should be declare like:
  
  public static void main(String[] args){
	  
  }
  
  
  Here public is access modifier--->> The main method should be public becs to call the JVM from anywhere.
  
  static ---> the static is non accesmodifier  ...Main method should be static becasuse JVM can acces without creating an object..the main method no where realted to the any object
  void---Void is a return type---Main method wont give anyreturn vakue to the jvm hence the main method shoukd be void
  main ---> which is the method name it is confugured inside the Jvm we can chage the method name bt we have to change the jvm configaration also
  String[] args --->parameters
  
  The above main method is Stricktly read by JVM but also some changes can be acceptable
  *We can alter the modifers public static astatic public
  *WE cam right the arguments as a any valuable type
  like String[] args
        []String args
		String [] args
		String args[]
*We can use non access modifer , final,synchronized,AbstractAction
*We can use variables any valid syntax
*We can use non-varg variables
like String...args
  
  In methods if we want to return anything then we can use return keyword
 This gives the return value from the method 
 
 
 
 Q7)Using the same method name but different parameter is known as method overloading
 There are 3 ways isthere do methodOverloading::
 1)By Using different parameter
 2)By Using different data type
 3)Chabging the order of the parameter
 
 
 eg;
public class Method{
	public static void main(String[] args){
		call("Pallavi");
	//	call("Pallavi",77676767888L);
		//call(6768798L,"Pallavi");
	}
	
	
	public static void call(String name){
		System.out.println("DO Call");
	}
	public static void call(String name,long no){
		System.out.println("DOing Call");
	}
	public static void call(long no,String name){
		System.out.println("Doing This call");
	}
	
}

Q8)Method--->* It is block of code when we call it do some specific task mentioned in it
             *the class name and method name should be diff
			 *method has return type
			 *Method is called without creating the object
			 *There is no default  method 
			 
Constructor----> *It is a special method used to intiallize the object.A constructo is called when the object of the class is created.
                *The constructor name is shoukd be same as class name   
                 * The constructor dosenot have any return type
                *Construtor is called whn the object is created	
               * The deafult constructor present in every class .

Q9) Static Variables---> Static variables are declared using the help of static keyword,which is independent of object ,,we can access anywhere by its calss name
    Static Block---> Static block is a block of code of static modifiers,used to initiallize the static members.the static block is executed before the main method members. 
    Static method---> Static method is method of class which is instance of class these are access without crating the object ..so These ,methods are independ of the object.

Q10)Constructor overloading is the ability to call the construtor inside the anouther constructor
the constructo chaining can be used in same class and the diffrent class also,fir latter the object of constructor is inherited from the super class constructorthe.
the constructor cgaining is achived bye supe()& this( )	constructo calls
super()---> this is sepecifys the the constructo from the parant class
this()---> this is specify the constructo form own class.


public class Constructor{
	
	public Constructor(){
		this("Pallavi");
		System.out.println("Default consConstructor");
	}
	
	public Constructor(String name){
		this("pallavi",76554);
		System.out.println("Construct");
	}
	
	public Constructor(String name,int value){
		this("Pallavi",787676,9.8F);
		System.out.println("Crate Constructor");
	}
	
	public Constructor(String name,int value,float per){
		System.out.println("Crating Constructor");
		
		public static void main(String[] args){
			Constructor obj = new Constructor()
		}
	}
}
 

   
   


	 