package Day11;
import java.util.*;

//import Day10.Animal;
//import Day10.cat;
//import Day10.dog;
public class problems {
	//7.//static final int MAX_USERS=100;
	public static void main(String[] args) {

		//		A o=new A();
//		B n=new B();
//		o.method(9);
//		n.method(900.0);
//		n.method(100);
//		A m=new B();
//		m.method(0);
//		2.
//		Animal[] arr=new Animal[3];
//		arr[0]=new Animal("leo");
//		arr[1]=new dog("haries");
//		arr[2]=new cat("subra");
//		for(int i=0;i<3;i++) {
//			if(arr[i] instanceof dog){
//				System.out.println("type: Dog");//enhanced for loop
//			
//		
//		
//			}else if(arr[i] instanceof cat) {
//				System.out.println("type: cat");
//				
//			}else {
//				System.out.println("type: animal");
//				
//			}arr[i].speak();
//		
//	}
//		//3. 
//		//Dog a = new Dog();
//		Animal a=new Dog("sorry");
//		a.fetch();
//		if (a instanceof Dog) {
//        Dog d = (Dog) a;
//        d.fetch(); // Dog-specific method
       
   // }
		//4.
		//new B();
		//5.
		//new B().test();//.test vanthu thius aa kudukkum
		//6.
//		List<Integer> list=new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		System.out.println(list);
//		list=new ArrayList<>();//final vecha error varudhu
		//7.
		//System.out.println(MAX_USERS);
		//8.
//		A a=new A();
//		a.myMethod();
		//9.
//		user u1=user.createAdmin("Alice");
//		u1.display();
		//10.
//		Singleton s1=Singleton.getInstance();
//		
//		Singleton s2=Singleton.getInstance();
//		System.out.println(s1==s2);
		//11.
		
		
		
	}	
		
	
}
//class A{
//	void method(int i) {
//		System.out.println("hi:"+i);
//	}
//}class B extends A{
//	void method(double d) {
//		System.out.println("hello:"+d);
//	}void method(int i){
//		System.out.println("maths kali:"+i );
//	}
//}
//2.
//class Animal{
//	String name;
//	public Animal(String name){
//		this.name=name;
//	}
//	void speak() {
//		
//		System.out.println("animal make a sound");
//	}
//}
//	class dog extends Animal {
//		dog(String name) {
//			super(name);
//			// TODO Auto-generated constructor stub
//		}
//
//		void speak() {
//			
//			System.out.println("bow bow");
//		}
//	}
//	class  cat extends Animal {
//		cat(String name) {
//			super(name);
//			// TODO Auto-generated constructor stub
//		}
//
//		void speak() {
//			//super.speak();//parent class la irukkira method aa call panradhukku dhan super use panrom
//			System.out.println("meow meow");
//		}
//	}
//3.
//class Animal {
//    void makeSound() {
//        System.out.println("Animal makes a sound");
//    }
//
//	public void fetch() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//
//class Dog extends Animal {
//    public Dog(String string) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void fetch() {
//        System.out.println("Dog fetches the ball!");
//    }
//}
//4.
//class A{
//	A(){
//		System.out.println("A");
//	}
//}
//class B extends A{
//	B(){
//		this(10);
//	}B(int i){
//		super();
//		System.out.println("B");
//	}
//}
////5.
//class A{
//	void who() {
//		System.out.println("parent");
//	}
//}
//class B extends A{
//	void who() {
//		System.out.println("child");
//	}void test(){
//		this.who();
//		super.who();
//	}
//}
//8.
//class A{
//	 int instanceVar=10;
//
//		static void myMethod() {//without static it gives error
//			System.out.println(new A().instanceVar);
//		}
//	}
//9.
//class user{
//	private String name;
//	private String role;
//	private user(String name,String role) {
//		this.name=name;
//		this.role=role;
//		
//	}
//
//public static user createAdmin(String name) {
//	return new user(name,"Aerostress");
//	
//}void display(){
//	System.out.println("name:"+name+"\nrole:"+role);
//}
//}
//10.
//class Singleton{
//	private static Singleton instance;
//	private Singleton() {
//		System.out.println("obito");
//		
//	}
//	public static Singleton getInstance() {
//		if(instance==null) {
//			instance =new Singleton();
//			
//		}return instance;
//		
//		
//	}
//	
//}
//11.




