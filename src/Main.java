public class Main {
    public static void main(String[] args) {
        String str = GetStringToPrint();
        PrintStringToConsole(str);
    }

    private static void PrintStringToConsole(String str) {
        System.out.println(str);
    }

    private static String GetStringToPrint() {
        return "This is my first Java Program";
    }
}
