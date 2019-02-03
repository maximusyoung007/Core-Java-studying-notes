package Chapter12;
public class Exercise_08 {
    public static void main(String[] args) throws HexFormatException {
        try{
            System.out.println(parseHex("A5"));
        }catch (HexFormatException ex){
            System.out.print("Illegal character");
        }
        try {
            System.out.println(parseHex("FAA"));
        }catch (HexFormatException ex) {
            System.out.print("Illegal character");
        }
        try {
            System.out.println(parseHex("T10"));
        }catch (HexFormatException ex){
            System.out.print("Illegal character");
        }
        try {
            System.out.println(parseHex("ABC"));
        }catch (HexFormatException ex) {
            System.out.print("Illegal character");
        }
        try{
            System.out.println(parseHex("10A"));
        }catch (HexFormatException ex) {
            System.out.print("Illegal character");
        }
    }
    public static int parseHex(String hexString) throws HexFormatException {
        int value = convertHexToDec(hexString.charAt(0));
        for (int i = 1; i < hexString.length(); i++) {
            value = value * 16 + hexString.charAt(i) - '0';
        }
        return value;
    }
    static int convertHexToDec(char ch) throws HexFormatException {
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if(ch <= '9' && ch >= '0')
            return ch - '0';
        else
            throw new HexFormatException("Illegal hex character: " + ch);
    }
}

class HexFormatException extends Exception {
    HexFormatException() {
        super("Illegal hex character");
    }
    HexFormatException(String message) {
        super(message);
    }
}
