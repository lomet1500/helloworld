package HelloWorld;

public class HelloWorld {
    public static void main(String [] args) {
    	String name = "30";//"Hong Kildong";
    	name = "홍길동" ;
    	System.out.println(" My name is " + name);
    	int age = 20 ;
    	double height = 170.8 ;
    	System.out.println(" 홍길동 키는 " + height + " 입니다. ");
    	System.out.println(name + " 키는 " + height + " 입니다. ");
    	
    	String name1 = "이혜빈";
    	int age1 = 22;
    	double height1 = 175.3 ;
    	System.out.println(name1 + "의 키는 " + height1 + " 이고 나이는 " + age1 + " 입니다. ");
        
    	System.out.println(" 두 사람 나이의 합은 " + (age + age1) + " 입니다. ");
    }
}
