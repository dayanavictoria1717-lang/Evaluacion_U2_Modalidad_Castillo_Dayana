
package evaluacion_u2_modularidad_castillo_dayana_;
public class Ejercicio2_Traza {
    static int pot(int b, int e) { if (e == 0) return 1; return b * pot(b, e - 1); }
    public static void main(String[]args){
        int b=3;
        int e=4;
        System.out.println(pot(3,4));
    
    }
}
