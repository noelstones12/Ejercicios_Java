
package calculatortestfinal;

public class CalculatorFinal {
    
    public int person1 = 10;
    public int person2 = 12;
    public int person3 = 9;
    public int person4 = 8;
    public int person5 = 7;
    public int person6 = 15;
    public int person7 = 11;
    public int person8 = 30;
    public int persons;
    
    public double finalPrice;
    public int totalBill;
    public double tax = 0.05;
    public double tip = 0.15;
        
    public double findTotal(){
        
        totalBill = (person1 + person2 + person3 + person4 + person5 + person6 + person7 + person8);
        finalPrice = totalBill * (1 + tax) * (1 + tip);
        System.out.println("Total sin impuesto: $" + totalBill + "\n"
                           + "Total unitario sin impuesto: $" + (totalBill/persons) + "\n"
                           + "Impuesto 5%: $" + String.format("%.2f", totalBill*tax) +"\n"
                           + "Propina sugerida 15%: $" + String.format("%.2f", totalBill*tip) +"\n"
                           + "Total a pagar: $" + String.format("%.2f", finalPrice)+ "\n"
                           + "Total a unitario a pagar: $" + String.format("%.2f", (finalPrice/persons)));
        return finalPrice;
    }
    
}
