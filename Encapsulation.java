class eEncapsulation{
	int a,b;
	public int GetData(int a,int b){
		System.out.println(a*b);
	}
}
class Encapsulation{
	public static void main(String[] args){
		eEncapsulation ee=new eEncapsulation();
		ee.length=21;
		ee.breadth=21;
		ee.GetData(length,breadth);
	}
}