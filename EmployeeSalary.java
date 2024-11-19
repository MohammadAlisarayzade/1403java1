import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = new String[10];
        double[] salaries = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("لطفاً نام کارمند " + (i + 1) + " را وارد کنید: ");
            names[i] = scanner.nextLine();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print("لطفاً حقوق کارمند " + (i + 1) + " را وارد کنید: ");
            salaries[i] = scanner.nextDouble();
        }
        
        System.out.println("\nکارمندانی با حقوق بالای 5 میلیون و 700 هزار تومان:");
        System.out.println("ردیف\tنام\tحقوق نهایی");
        
        for (int i = 0; i < 10; i++) {
            if (salaries[i] > 5700000) {
                // محاسبه حقوق نهایی
                double insuranceDeduction = salaries[i] * 0.05;
                double allowanceAddition = salaries[i] * 0.07;
                double finalSalary = salaries[i] - insuranceDeduction + allowanceAddition;
                
                // نمایش اطلاعات
                System.out.println((i + 1) + "\t" + names[i] + "\t" + finalSalary);
            }
        }
        
        scanner.close();
    }
}