import java.util.Scanner;

public class CalculadorSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Puestos de la empresa: \n- repositor\n- cajero\n- supervisor");
        System.out.print("Ingresa tu puesto: ");
        String companyPosition = sc.nextLine();
        double totalSalary = 0, salaryBonus = 0, retirementDiscount = 0, salary = 0;

        switch(companyPosition){
            case "repositor":
                salary = 15.890;
                salaryBonus = 0.10;
                break;
            case "cajero":
                salary = 25630.89;
                break;
            case "supervisor":
                salary = 35560.20;
                retirementDiscount = 0.11;
                break;
        }

        totalSalary = salary + (salaryBonus * salary) - (retirementDiscount * salary);
        System.out.println("The total salary for this person is: " + String.format("%.2f", totalSalary));
    }
}
