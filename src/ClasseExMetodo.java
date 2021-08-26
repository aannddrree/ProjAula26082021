public class ClasseExMetodo {


    public static void main(String[] args) {

       /*
        int a = 5;
        int b = 4;

        int r1 = a + b;

        int c = 6;
        int d = 7;

        int r2 = c + d;

        int e = 7;
        int f = 9;

        int r3 = e + f;

        System.out.println("Resultado: " + r1);
        System.out.println("Resultado: " + r2);
        System.out.println("Resultado: " + r3);*/

        System.out.println(somar(4,5));
        System.out.println(somar(6,7));
        System.out.println(somar(7,9));

        imprimir();

    }

    public static String somar(int a, int b){
        return "Resultado: " + (a + b);
    }

    public static void imprimir(){
        System.out.println("Papini");
    }
}
