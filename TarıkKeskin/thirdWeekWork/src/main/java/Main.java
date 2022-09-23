import java.util.Random;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Bir Kelime Yazın:");
//        String kelime =scan.nextLine();
//
//       // IsPangramTR.isPangramTR(kelime);   // hangi methodun çağırılacağını seçme işi bir base sınıf yada
//        IsPangramEN.isPangramEN(kelime);     // interface ile daha sağlıklı yapılabilir ilerleyen konularda
//    }
//}
//class IsPangramTR{
//   public static void isPangramTR(String tr){
//
//       String lows=tr.toLowerCase();
//
//       String trPangram="abcçdefgğhiıjklmnoöprsştuüvyz";  //bir charArray i ilede yapılabilirdi
//
//       for(int i=0;i<29;i++){
//           char ch=trPangram.charAt(i); //alfabedeki tüm indislerdeki karakterleri for gezerken tutmak için
//           int index = lows.indexOf(ch); //tutulan karakterleri lows da ki indexini bulmak için
//           if(index!=-1){                 //indexOf -1 dönerse yok demektir
//               System.out.println("trpangramdır");
//           }
//           else{
//
//               System.out.println("trpangram değil");
//           }
//           break;
//
//       }
//   }
//}
//class IsPangramEN {
//    public static void isPangramEN(String en) {
//
//        String lows=en.toLowerCase();
//
//        String enAlfabet="abcdefghijklmnoprstuqwxvyz";
//
//        for(int i=0;i<26;i++){
//            char ch=enAlfabet.charAt(i);
//            int index = lows.indexOf(ch);
//            if(index!=-1){
//                System.out.println("Enpangramdır");
//            }
//            else{
//
//                System.out.println("Enpangram değil");
//            }
//            break;
//
//        }
//             //Kod ilgili alfabenin tüm karakterlerini içerip içermediğini kontrol ediyor sadece
//             //yazılan metin tüm karakterleri içerip extra başka alfabelerden de karakterler içerebilir
//    }        //bunu  engelleyen bir ister yoktu soruda
//}

//---------------------------------------------------------------------------------------------------------
//**********************************2.SORU*****************************************************************
//---------------------------------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Bir Kelime Girin:");
//        String word = scan.nextLine();
//        isPalindrome(word);
//
//    }
//
//    public static void isPalindrome(String palin) {
//
//        String palindromeClone = "";
//        for (int i = palin.length() - 1; i >= 0; i--) {
//            palindromeClone = palindromeClone + palin.charAt(i);
//
//        }
//
//        if (palin.equals(palindromeClone)) {
//            System.out.println("Girdiğiniz kelime palindrom bir kelimedir.");
//        } else {
//            System.out.println("Girdiğiniz kelime palindrom bir kelime değildir.");
//
//
//        }
//    }
//}


//---------------------------------------------------------------------------------------------------------
//**********************************3.SORU*****************************************************************
//---------------------------------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Bir Gün Girin:");
//        int sayi1 = scan.nextInt();
//        System.out.println("Bir Ay Girin:");
//        int sayi2 = scan.nextInt();
//        System.out.println("Bir Yıl Girin:");
//        int sayi3 = scan.nextInt();
//
//        if(GetDayOfWeek.getDayOfWeek(sayi1,sayi2,sayi3)==-1) {
//            System.out.println(GetDayOfWeek.getDayOfWeek(sayi1, sayi2, sayi3));
//        }
//        else{
//
//            switch(GetDayOfWeek.getDayOfWeek(sayi1, sayi2, sayi3)){
//                case 0:
//                    System.out.println("Bugün Pazar");
//                    break;
//                case 1:
//                    System.out.println("Bugün Pazartasi");
//                    break;
//                case 2:
//                    System.out.println("Bugün Salı");
//                    break;
//                case 3:
//                    System.out.println("Bugün Çarşamba");
//                    break;
//                case 4:
//                    System.out.println("Bugün Perşembe");
//                    break;
//                case 5:
//                    System.out.println("Bugün Cuma");
//                    break;
//                case 6:
//                    System.out.println("Bugün Cumartesi");
//                    break;
//              }
//           }
//          }
//         }
//
//class GetDayOfWeek{
//    public static int getDayOfWeek(int a,int b,int c){
//
//        if(a>30 || a<0){
//            return -1;
//        }
//        if(b>12 || b<0){
//            return -1;
//        }
//        if(c<1990 ){
//            return -1;
//        }
//
//        int day=0;
//        day=a+(b*30);
//        int dayOfWeek=day%7;
//
//
//        return dayOfWeek;
//    }
//}



//---------------------------------------------------------------------------------------------------------
//**********************************4.SORU*****************************************************************
//---------------------------------------------------------------------------------------------------------


//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//       Scanner scan=new Scanner(System.in);
//       System.out.println("Bir Sayı Girin");
//       int  number= scan.nextInt();
//        String []array=new String[number];
//        String alfabe="abcçdefgğhiıjklmnoöprsştuüvyz";
//        String emptyTrim="";
//        for(int i=0;i<array.length;i++){
//            String empty="";
//            int wordLength= random.nextInt(25)+1; //dizi elemanına random uzunluk belirlemek için,
//                                                            // +1 random 0 olmaması için
//            for(int j=0;j<wordLength;j++){
//                int indis=random.nextInt(29);          //alfabeden random bir indis seçmek için
//                empty+=alfabe.charAt(indis);   //dizi elemanın karakterlerini alfabeden random doldurmak için
//
//          }
//
//            array[i]=empty;               //random ürettiğim string i arrayin indislerine doldurmak için
//          }
//        for(int i=0;i<array.length;i++){
//            emptyTrim+="-"+array[i];
//
//        }
//           System.out.println(emptyTrim);
//     }
//}


//---------------------------------------------------------------------------------------------------------
//**********************************5.SORU*****************************************************************
//---------------------------------------------------------------------------------------------------------


//public class Main {
//    public static void main(String[] args) {
//
//          Scanner scan =new Scanner(System.in);
//          System.out.println("İsminizi,Doğum tarihinizi,Dersin adını,Vize Ve Final notunuzu aşağıdaki formatta Girin: ");
//          System.out.println("<isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>");
//
//          String input=scan.nextLine();
//
//
//          String name;
//          String dateOfBird;
//          String nameOfLesson;
//          String midtermExam;
//          String finalExam;
//
//          char ch=':';
//          int firstIndex=input.indexOf(ch);
//          name=input.substring(0,firstIndex);
//          System.out.println("İsim: "+name);
//
//          int secondIndex = input.indexOf(ch,firstIndex+1);
//          dateOfBird=input.substring(firstIndex+1,secondIndex);
//          System.out.println("Doğum Tarihi: "+dateOfBird);
//
//          int thirdIndex=input.indexOf(ch,secondIndex+1);
//          nameOfLesson=input.substring(secondIndex+1,thirdIndex);
//          System.out.println("Ders: "+nameOfLesson);
//
//          int fourIndex=input.indexOf(ch,thirdIndex+1);
//          midtermExam=input.substring(thirdIndex+1,fourIndex);
//          System.out.println("Vize: "+midtermExam);
//
//
//          finalExam=input.substring(fourIndex+1);
//          System.out.println("Final: "+finalExam);
//
//           calculator(midtermExam,finalExam);
//           getBirthDay(dateOfBird);
//
//    }
//    public static void calculator(String a,String b){
//
//          int vize=Integer.parseInt(a);
//
//          int finall=Integer.parseInt(b);
//                  double gecmeNotu=(vize*0.4)+(finall*0.6);
//                  System.out.println("Ortalama Notunuz: "+ gecmeNotu);
//
//
//    }
//
//    public static void getBirthDay(String date){
//
//              char k='/';
//
//              int ind1 =date.indexOf(k);
//              String sDay=date.substring(0,ind1);  // aldığımız ../../.. tarih formatını ayrıştırıp int e dönüştürüyoruz
//              int day=Integer.parseInt(sDay);      //doğum tarihinin hangi güne denk geldiğini hesaplamak için
//                                                           //ay ve gün yeterli
//              int ind2=date.indexOf(k,ind1+1);
//              String sMonth=date.substring(ind1+1,ind2);
//              int month=Integer.parseInt(sMonth);
//
//              int birthDay=month*30+day;
//              int remain=birthDay%7;
//
//
//
//              switch(remain){
//                case 0:
//                      System.out.println("Doğduğunuz gün: Pazar");
//                      break;
//                case 1:
//                      System.out.println("Doğduğunuz gün: Pazartasi");
//                      break;
//                case 2:
//                      System.out.println("Doğduğunuz gün: Salı");
//                      break;
//                case 3:
//                      System.out.println("Doğduğunuz gün: Çarşamba");
//                      break;
//                case 4:
//                      System.out.println("Doğduğunuz gün: Perşembe");
//                      break;
//                case 5:
//                      System.out.println("Doğduğunuz gün: Cuma");
//                      break;
//                case 6:
//                      System.out.println("Doğduğunuz gün: Cumartesi");
//                      break;
//          }
//
//
//
//    }
//
//}























