public class MathFunctions {
    private static double PI;
    private static double E;



    public MathFunctions(double p,double e){
        PI = p;
        E = e;
    }

    public double doiraYuzi(double radiusi){
        return PI * radiusi*radiusi;
    }

    public double daraja(double a){
        return Math.pow(E,a);
    }

    public double formulaGeron(double a,double b,double c){
        double s = (a + b + c)/2;

        return Math.sqrt(s*(s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions(2.71828182846,3.14159265359);


        System.out.println("Doira yuzi; " + mathFunctions.doiraYuzi(5));

        System.out.println("e^a; " + mathFunctions.daraja(3));

        System.out.println("uchburchak yuzi; " + mathFunctions.formulaGeron(2,3,4));
    }
}
