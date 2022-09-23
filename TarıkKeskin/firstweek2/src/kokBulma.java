public class kokBulma {
    public static void main(String[] args) {


        System.out.println("ax²+bx+c denkleminin katsayılarını sırayla girin:");

        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("a:");
        Double a = Double.parseDouble(kb.nextLine());

        java.util.Scanner kbb = new java.util.Scanner(System.in);
        System.out.print("b:");
        double b = Double.parseDouble(kbb.nextLine());

        java.util.Scanner kb2 = new java.util.Scanner(System.in);
        System.out.print("c:");
        double c = Double.parseDouble(kb2.nextLine());

        double t=(b*b)-(4*a*c);
        if(t>0){
            double x1 = ((-1 * b) - Math.sqrt(t)) / (2 * a);
            double x2 = ((-1 * b) + Math.sqrt(t)) / (2 * a);
            System.out.println("x1= " + x1 + " x2= " + x2);
        }

        if (t< 0){
            System.out.println("Denklemin Gerçel Kökü Yoktur.");
        }
        if (t == 0){
            double x = (-1 * b) / (2 * a);
            System.out.println("Çakışık kökü var x1= x2= " + x);
        }




    }
}
