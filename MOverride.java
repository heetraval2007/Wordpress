class Vehicle{
	void run(){
		System.out.println("Vehicle class ");
	}
}
class Bike{
	void run(){
		System.out.println("Bike is started");
	}
}
class MOverride{
	public static void main(String[] args){
		Vehicle vh=new Vehicle();
		vh.run();
		Bike bk=new Bike();
		bk.run();
	}
}