
package calculatortestfinal;

import java.util.Scanner;

public class CalculatorTestFinal {

    public static void main(String[] args) {
        CalculatorFinal calc = new CalculatorFinal();
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner
        
        System.out.print("Personas a Pagar: "); 
        calc.persons = scanner.nextInt();
        calc.findTotal();
    }
    
}
