package karavay.vistar;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}

