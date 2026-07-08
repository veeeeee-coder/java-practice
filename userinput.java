import java.util.Scanner;
public class userinput {
    //Scanner is a object that allows us to get user input
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your name ");
        String name=scanner.nextLine();
        System.out.println("hello "+name);
        
        //nextline() reads string of characters including spaces
        //next reads string without spaces
        String name1=scanner.next();
        System.out.println(name1);
        

        //to read an integer
        System.out.println("Enter ur age");
        int age=scanner.nextInt();
        System.out.println("ur age is " +age);

        //to read a decimal number
        System.out.println("wats ur salary");
        double salary=scanner.nextDouble();
        System.out.println("ur salary is "+salary);

        //to read a boolean 
        System.out.println("are you student ");
        boolean isStudent=scanner.nextBoolean();
        System.out.println("Student : "+isStudent);

        //area of rectangle
        System.out.println("Enter length of rectangle");
        double length=scanner.nextDouble();
        System.out.println("Enter width of rectangle");
        double width=scanner.nextDouble();
        double area=length*width;
        System.out.println("Area of rectangle is "+area);

        scanner.close();





    }

}
