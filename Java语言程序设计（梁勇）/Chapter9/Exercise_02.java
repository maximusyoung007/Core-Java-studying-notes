package Chapter9;
public class Exercise_02 {
    public static void main(String[] args){
        Stock s1 = new Stock("ORCL","Oracle Corporation");
        s1.previousClosingPrice = 34.5;
        s1.currentPrice = 34.35;
        System.out.println(s1.getChangePercent());
    }
}
class Stock{
    String symbol = " ",name = " ";
    double previousClosingPrice = 0,currentPrice = 0;
    Stock(String newSymbol,String newName){
        symbol = newSymbol;
        name = newName;
    }
    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) /
                previousClosingPrice;
    }
}
