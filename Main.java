import java.util.Scanner;
  public class Main{
    public static void main(String[]args){
Scanner scanner= new Scanner(System.in);
System.out.print("Enter your name:");
 String name =scanner.nextLine();
System.out.print("Enter your age: ");
int age =scanner.nextInt();
System.out.print("Enter your score:");
double gpa=scanner.nextDouble();
System.out.println("Hello my name is "+ name+" i like watching tv ");
System.out.println("I am "+ age+" years old "+" and now i am a teacher ");
System.out.println("And also the score i give for all of you for coming on the white board is:"+ gpa+"!!");
scanner.close();
    }
  }
