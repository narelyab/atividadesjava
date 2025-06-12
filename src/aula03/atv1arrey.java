package aula03;

public class atv1arrey {

	public static void main(String[] args) {
		int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = 10 - i;
        }

        // b) 1 4 9 16
        int[] b = new int[4];
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * (i + 1);
        }

        // c) 1 2 3 4
        int[] c = new int[4];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
        }

        // d) 3 4 7 12
        int[] d = new int[4];
        d[0] = 3;
        d[1] = 4;
        d[2] = d[0] + d[1];           // 3 + 4 = 7
        d[3] = d[1] + d[2] + 1;       // 4 + 7 + 1 = 12

        // Impressão dos arrays
        System.out.print("a) ");
        imprimirArray(a);

        System.out.print("b) ");
        imprimirArray(b);

        System.out.print("c) ");
        imprimirArray(c);

        System.out.print("d) ");
        imprimirArray(d);
    }

    public static void imprimirArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();

	}

}
