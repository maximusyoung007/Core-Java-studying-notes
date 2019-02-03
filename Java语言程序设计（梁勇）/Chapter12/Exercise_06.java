package Chapter12;
public class Exercise_06 {
    public static void main(String[] args){
        try {
            System.out.println(hexToDecimal("A5"));
        }
        catch(NumberFormatException ex){
            System.out.println("Illegal characters");
        }
        try {
            System.out.println(hexToDecimal("FAA"));
        }
        catch(NumberFormatException ex){
            System.out.println("Illegal characters");
        }
        try {
            System.out.println(hexToDecimal("T10"));
        }
        catch(NumberFormatException ex){
            System.out.println("Illegal characters");
        }
        try {
            System.out.println(hexToDecimal("ABC"));
        }
        catch(NumberFormatException ex){
            System.out.println("Illegal characters");
        }
        try {
            System.out.println(hexToDecimal("10A"));
        }
        catch(NumberFormatException ex){
            System.out.println("Illegal characters");
        }
    }
    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for(int i = 0;i < hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if(ch <= '9' && ch >= '0')
            return ch - '0';
        else
            throw new NumberFormatException();
    }
}
