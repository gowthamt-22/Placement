package Day10;

public class gowtham10 {
	public static void main(String[] args) {
		/*Animal a=new Animal();
		a.speak();
		dog d=new dog();
		d.speak();*/
		Animal[] arr=new Animal[3];
		arr[0]=new Animal("leo");
		arr[1]=new dog("haries");
		arr[2]=new cat("subra");
		for(Animal jolly:arr) {//enhanced for loop
			jolly.speak();
		
	
	
	}
	}
}

class Animal{
	String name;
	public Animal(String name){
		this.name=name;
	}
	void speak() {
		
		System.out.println("animal make a sound");
	}final void eat(){
		System.out.println("saapudu");
	}
}
	class dog extends Animal {
		dog(String name) {
			super(name);////parent class la irukkira method aa call panradhukku dhan super use panrom
			// TODO Auto-generated constructor stub
		}

		void speak() {
			super.speak();
			System.out.println("bow bow");
		}final void eat(){
			System.out.println("saapudu");
		}
	}
	class  cat extends Animal {
		cat(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		void speak() {
			super.speak();
			System.out.println("bow bow");
		}
	}





