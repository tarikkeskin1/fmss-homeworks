import java.util.Random;
import java.util.Scanner;

/*public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
          numberUtil11.getDigitsCount(sayi);

    }
}
class numberUtil11 {
    public static void getDigitsCount(int a){

        int basamak=0;
        for(int i=0;0<a;i++){
            a=a/10;
            basamak++;
        }
        System.out.println("Girdiğiniz sayı "+basamak+" basamaklıdır.");

    }
}*/

//---------------------------------------------------------------------------------------------------------
//*****************/2.SORU  /******************************************************************************
//---------------------------------------------------------------------------------------------------------

/*public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        reverse.getReverse(sayi);

    }
}
class reverse{
    public static void getReverse(int a){

        int tersi=0;
        while(a>0){
            tersi=tersi*10;
            tersi=tersi+(a%10);
            a=a/10;
        }
        System.out.println("Girdiğiniz sayının tersi: " + tersi);


    }
}*/

//-------------------------------------------------------------------------------------------------------------
//*********************/3.SORU /*******************************************************************************
//-------------------------------------------------------------------------------------------------------------

/*public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("a sayısını girin:");
        int a=scan.nextInt();
        Scanner scan1=new Scanner(System.in);
        System.out.println("b sayısını girin:");
        int b=scan1.nextInt();
      System.out.println(numberUtill2.pow(a,b));

    }
}
class numberUtill2{
    public static int pow(int x,int y) {
        int carpim=1;
        if(y>0){

            for(int i=0;i<y;i++){
             carpim=carpim*x;

            }

        }

        else if (y <= 0) {

           carpim = -1;
        }
        return carpim;
    }
}*/

//---------------------------------------------------------------------------------------------------------------
//**************4.SORU*******************************************************************************************
//---------------------------------------------------------------------------------------------------------------

/*public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayı Girin:");
        int sayi= scan.nextInt();
        Armstrong.isArmstrong(sayi);

    }
}

class Armstrong{
    public static void isArmstrong(int a){

         int k=a;
        int c=a;
        double basamak = 0;
        double toplam=0;
        for(int i=0;a>0;i++){
            basamak++;
            a=a/10;


        }

        for(int i=0;i<basamak;i++){
           int x=k%10;


            toplam=toplam+ Math.pow(x, basamak);

            k=k/10;

        }
        if(toplam==c){
            System.out.println(c +" armstrong bir sayıdır");

        }
        if(toplam!=c){
            System.out.println(c +" armstrong bir sayı değildir");
        }

    }
}*/

//-----------------------------------------------------------------------------------------------------------------
//***********5.SORU************************************************************************************************
//-----------------------------------------------------------------------------------------------------------------

/*public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayı Girin:");
        int sayi= scan.nextInt();
        Factorial.factorial(sayi);

    }
}
class Factorial{
    public static void factorial(int a){

        if(a<=0){
            System.out.println("-1");
        }
        else if (a>0){
            int fact=1;
            for(int i=a;i>0;i--){

                fact=fact*i;

            }

            System.out.println(a+"!: "+ fact);

        }


    }
}*/

//------------------------------------------------------------------------------------------------------------------
//***************/6.SORU /*********************************************************************************************
//-----------------------------------------------------------------------------------------------------------------

/*
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Yıl Girin:");
        int sayi = scan.nextInt();
        İsLeapYear.isLeapYear(sayi);
    }
}
class İsLeapYear{
    public static void isLeapYear(int a){

        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println(a+" artık yıldır");
        }
        else{
            System.out.println(a+" artık yıl değldir");
        }
    }
}*/

//---------------------------------------------------------------------------------------------------------------
//*****************/7. SORU//***********************************************************************************
//----------------------------------------------------------------------------------------------------------------


/*
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Gün Girin:");
        int sayi1 = scan.nextInt();
        System.out.println("Bir Ay Girin:");
        int sayi2 = scan.nextInt();
        System.out.println("Bir Yıl Girin:");
        int sayi3 = scan.nextInt();
        İsValidDate.isValidDate(sayi1,sayi2,sayi3);
    }
}

class İsValidDate{
    public static void isValidDate(int a,int b,int c){
        if(a>30 || a<0){
            System.out.println("Geçersiz Tarih girdiniz");
        }
        if(b>12 || b<0){
            System.out.println("Geçersiz Tarih girdiniz");
        }
        if(c>2022 || c<0){
            System.out.println("Geçersiz Tarih girdiniz");
        }
        else{
            System.out.println(a+"/"+b+"/"+c+ " Geçerli Tarih girdiniz");
        }
    }
}
*/

//---------------------------------------------------------------------------------------------------------------
//*****************/8. SORU//***********************************************************************************
//----------------------------------------------------------------------------------------------------------------

/*public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Gün Girin:");
        int sayi1 = scan.nextInt();
        System.out.println("Bir Ay Girin:");
        int sayi2 = scan.nextInt();
        System.out.println("Bir Yıl Girin:");
        int sayi3 = scan.nextInt();
        System.out.println("Girdiğiniz Tarih Yılın "+GetDayOfYear.getDayOfYear(sayi1,sayi2,sayi3)+". günü");
    }
}
class GetDayOfYear{
    public static int getDayOfYear(int a,int b,int c){

        if(a>30 || a<0){
            return -1;
        }
       if(b>12 || b<0){
            return -1;
        }
        if(c>2022 || c<0){
            return -1;
        }

        int day=0;
        day=a+(b*30);
      return day;

    }
}*/

//---------------------------------------------------------------------------------------------------------------
//*****************/9. SORU//***********************************************************************************
//----------------------------------------------------------------------------------------------------------------

/*public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Gün Girin:");
        int sayi1 = scan.nextInt();
        System.out.println("Bir Ay Girin:");
        int sayi2 = scan.nextInt();
        System.out.println("Bir Yıl Girin:");
        int sayi3 = scan.nextInt();

        if(GetDayOfWeek.getDayOfWeek(sayi1,sayi2,sayi3)==-1) {
            System.out.println(GetDayOfWeek.getDayOfWeek(sayi1, sayi2, sayi3));
        }
        else{

            switch(GetDayOfWeek.getDayOfWeek(sayi1, sayi2, sayi3)){
                case 0:
                    System.out.println("Bugün Pazar");
                    break;
                case 1:
                    System.out.println("Bugün Pazartasi");
                    break;
                case 2:
                    System.out.println("Bugün Salı");
                    break;
                case 3:
                    System.out.println("Bugün Çarşamba");
                    break;
                case 4:
                    System.out.println("Bugün Perşembe");
                    break;
                case 5:
                    System.out.println("Bugün Cuma");
                    break;
                case 6:
                    System.out.println("Bugün Cumartesi");
                    break;
              }
           }
          }
         }

class GetDayOfWeek{
    public static int getDayOfWeek(int a,int b,int c){

        if(a>30 || a<0){
            return -1;
        }
        if(b>12 || b<0){
            return -1;
        }
        if(c<1990 ){
            return -1;
        }

        int day=0;
        day=a+(b*30);
        int dayOfWeek=day%7;


        return dayOfWeek;
    }
}*/


//---------------------------------------------------------------------------------------------------------------
//*****************/10. SORU//***********************************************************************************
//----------------------------------------------------------------------------------------------------------------


/*
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String name="tarık";
        int password=1234;



            for(int i=0;i<3;i++) {
                System.out.println("Kullanıcı Adınızı Girin:");
                String n = scan.next();
                System.out.println("Şifrenizi Girin:");
                int p = scan.nextInt();
                if(n.equals(name) && p==password){
                    System.out.println("Giriş Başarılı");
                    return;
                }
                else{
                    System.out.println("Giriş Başarısız.");
                }

       }
        System.out.println("Deneme Hakınız Bitti");


    }
}

*/


//---------------------------------------------------------------------------------------------------------------
//*****************/11. SORU//***********************************************************************************
//----------------------------------------------------------------------------------------------------------------


/*public class Main {
    public static void main(String[] args){

        Random z1=new Random();
        Random z2=new Random();
         double sayac=0;
         double tekrar=100;
         double sonuc;
        for(int i=0;i<tekrar;i++) {
            int zar1 = z1.nextInt(6); //{0,1,2,3,4,5,} sayılarını random seçecek ama önemli olan
            int zar2 = z2.nextInt(6);  //zar1 ve zar2 nin aynı olması değerlerin bir önemi yok
            if(zar1==zar2 && zar1%2==0){    //çift ve eşit olan zarlar
                sayac++;
            }
            System.out.println(zar1);
            System.out.println("-");
            System.out.println(zar2);

        }
        System.out.println("Zarların çişt ve eşit gelme sayısı: "+sayac);
          sonuc=sayac/tekrar;
        System.out.println(sonuc);
  }
}*/

//---------------------------------------------------------------------------------------------------------------
//*****************/12. SORU//***********************************************************************************
//----------------------------------------------------------------------------------------------------------------

/*
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
         String complex="";
        for(;;){
            System.out.print("Bir kelime yazın: ");
            String kelime=scan.next();
            complex = complex.concat("-"+kelime);

            if(kelime.equals("quit")){
                break ;
            }
        }
            System.out.println(complex);

        }
}

*/
















