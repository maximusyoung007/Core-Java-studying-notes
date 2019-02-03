package Chapter12;
public class Exercise_07 {
    public static void main(String[] args){
        try{
            System.out.println(bin2Dec("110"));
        }
        catch (NumberFormatException ex){
            System.out.println("Illegal character.");
        }
        try{
            System.out.println(bin2Dec("120"));
        }
        catch (NumberFormatException ex){
            System.out.println("Illegal character.");
        }
        try{
            System.out.println(bin2Dec("13"));
        }
        catch (NumberFormatException ex){
            System.out.println("Illegal character.");
        }
        try{
            System.out.println(bin2Dec("10"));
        }
        catch (NumberFormatException ex){
            System.out.println("Illegal character.");
        }
    }
    public static int bin2Dec(String bin){
        int decimalValue = 0;
        for(int i = 0;i < bin.length();i++){
            char binChar = bin.charAt(i);
            decimalValue = decimalValue * 2 + hexCharToDecimal(binChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch == '1' || ch == '0')
            return ch - '0';
        else
            throw new NumberFormatException();
    }
}


