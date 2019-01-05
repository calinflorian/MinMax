public class curs05012019 {
    private int max;
    private int min;

    public void minmax(int[] numere) {
        max = numere[0];
        min = numere[0];

        for (int i = 0; i < numere.length; i++) {
            if (numere[i] > max) {
                max = numere[i];
            }
            if (numere[i] < min) {
                min = numere[i];
            }
        }
    }

    public int getmax() {
        return max;
    }

    public int getmin() {
        return min;
    }

    public void showMinandMax() {
        System.out.println("numar minim =" + min);
        System.out.println("numar maxim =" + max);
    }
}
