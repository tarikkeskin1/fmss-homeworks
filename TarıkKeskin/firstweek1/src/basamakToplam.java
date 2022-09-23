public class basamakToplam {
    public static void main(String[] args) {
        int a,b,c;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());
        a=val/100;
        b=(val%100)/10;
        c=(val%100)%10;
        System.out.printf("%d + %d +%d = %d%n", a, b, c,a+b+c);

    }
}
