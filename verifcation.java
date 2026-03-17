import java.util.Scanner;

// My Simple Age Verifcation in Java

void main() {
    Scanner myObj = new Scanner(System.in);
    int age;

    System.out.println("Enter your Age:");
    age = myObj.nextInt();

    if (age < 18) {
        System.out.println("Access Denied");
    } else {
        System.out.println("Access Accepted");
    }
}