import java.util.Scanner;

public class statement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Are you a student(true/false)");
        isStudent = scanner.nextBoolean();

 //GROUP 1 Name

        if(name.isEmpty()){
            System.out.println("You didnt enter your name");
        }
        else{
            System.out.println("Hello " + name + "!");
            }

//GROUP 2 Age

      if (age >= 50) {
            System.out.println("you are a senior");
        }else if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        }else if (age <= 0) {
            System.out.println("You are not born at");
        } else {
            System.out.println("You are a child");
        }   
//GROUP 3 Student

if(isStudent){
    System.out.println("You are a student");
} else{ 
   System.out.println("You are not a student");
 
}

      scanner.close();    
    }
  
}

