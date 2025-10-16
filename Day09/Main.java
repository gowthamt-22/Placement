package Day09;

 class Car {
	String model;
	String color;
	int speed;
	void start() {
		System.out.println(color);
		
	}void speed(int n){
		speed=speed+n;
		System.out.println(speed);
	}

}
 public class Main{
	public static void main(String[] args) {
		Car obj=new Car();
		obj.color="black";
		obj.model="bmw";
		obj.speed=90;
		System.out.println(obj.model);
		
		obj.start();
		obj.speed(5);
	}
}
