public class NewClass2 {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass2 instance2 = new NewClass2();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance2.sayHelloFromNewClass());

  public String sayHelloFromNewClass(){
    return "Hello from New Class 2";
  }
import java.util.Scanner;

public class NameCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];

        // گرفتن ۱۰ اسم از کاربر
        System.out.println("لطفاً ۱۰ اسم وارد کنید:");
        for (int i = 0; i < 10; i++) {
            System.out.print("اسم " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // نمایش اسم و تعداد کاراکترهای آن
        System.out.println("\nتعداد کاراکترهای هر اسم:");
        for (String name : names) {
            System.out.println(name + ": " + name.length() + " کاراکتر");
        }

        scanner.close();
    }
}
}