package Main;

/**
 * Created by kristi on 03/10/15.
 */
public class Esimene {
    public static void main(String[] args) {
        double insuranceRate = 0.016;
        double secondPillarRate = 0.02;
        double incomeTaxRate = 0.2;
        int taxFreeRate = 15400;
        int grossSalary = 200000;
        int secondPillar = (int) (grossSalary*secondPillarRate);
        int insurancePayment = (int) (grossSalary*insuranceRate);
        int incomeTax = (int) ((grossSalary - secondPillar - insurancePayment - taxFreeRate)*incomeTaxRate);
        int netSalary = grossSalary - secondPillar - insurancePayment - incomeTax;
        int euros = (int) netSalary/100;
        String netSalaryValue = Integer.toString(netSalary);
        int length = netSalaryValue.length();
        System.out.println("Netopalk on " + euros + " eurot ja " + netSalaryValue.substring(length-2) + " senti.");
        System.out.println("Hurraa!");
    }
}
