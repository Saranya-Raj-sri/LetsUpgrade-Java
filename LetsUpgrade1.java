class Employee{
    String name;
    int age;
    String city;
    void empl(String n,int a,String c){
    	name=n;
    	age=a;
    	city=c;
    }
    void display(){
    	System.out.println("The name is: "+name);
    	System.out.println("The age is: "+age);
    	System.out.println("The city is: "+city);
    }
}
public class LetsUpgrade1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e1 = new Employee();
          Employee e2 = new Employee();
          e1.empl("saranya", 21, "salem");
          e2.empl("sara",20 , "chennai");
          e1.display();
          e2.display();
          
	}

}
