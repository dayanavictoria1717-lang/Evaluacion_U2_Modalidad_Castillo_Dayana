package evaluacion_u2_modularidad_castillo_dayana_;

public class Ejercicio1_SalidaExacta {

    static int f(int x) {
        return x * x;
    }

    static int g(int x) {
        return f(x) + f(x + 1);
    }
    public static void main(String[] a) {
        int x = 2;
        System.out.println(g(x) + " " + f(g(1)));
        System.out.println(x);
    }
}
//La salida exacta del programa es: 13, 5, 25 , 2