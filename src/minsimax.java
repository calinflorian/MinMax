import java.util.Scanner;

public class minsimax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente al array-ului: ");
        int n = sc.nextInt();
        int numere[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("numere[" + i + "] = ");
            numere[i] = sc.nextInt();
        }
        curs05012019 calc = new curs05012019();
        calc.minmax(numere);
        calc.showMinandMax();
    }
}
