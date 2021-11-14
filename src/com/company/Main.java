package com.company;


import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            ///Zad.1

            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj imię: ");
            String imię = sc.nextLine();
            System.out.println("Podaj nazwisko: ");
            String nazwisko = sc.nextLine();
            System.out.println("Podaj plec (kobieta/mężczyzna): ");
            String płeć = sc.nextLine();
            wypisz(płeć, imię, nazwisko);}

        public static void wypisz(String płeć, String imię, String nazwisko) {
            String napis = " ";
            if (płeć.equals("mężczyzna")){
                napis += "Student: ";}
            else if(płeć.equals("kobieta")){
                napis += "Studentka: ";}
            napis = napis + imię + " " + nazwisko;
            System.out.println(napis);}

        ///Zad.2

    public static void zad2(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj miesiąc: ");
        String miesiąc=sc.nextLine();
        System.out.println("Podaj rok: ");
        String rok=sc.nextLine();
        wypisz2(miesiąc,rok);
    }
        public static void wypisz2(String miesiąc, String rok){
            String napis= miesiąc +"."+ rok + " to ";
            int mies=Integer.parseInt(miesiąc);
            if(mies<=3){
                napis+="I";}
            else if(mies<=6){
                napis+="II";}
            else if(mies<=9){
                napis+="III";}
            else if(mies<=12){
                napis+="IV";}
            System.out.println(napis+" kwartał "+rok+" roku");}

        ///Zad.3
        public static void zadanie3(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Podaj rok do sprawdzenia przestępności: ");
            int rok=sc.nextInt();
            if(czyPrzestepny(rok)==true){
                System.out.println("Podany rok: "+rok+" jest przestępny");}
            else if(czyPrzestepny(rok)==false){
                System.out.println("Podany rok: "+rok+" nie jest przestępny");}}

        public static boolean czyPrzestepny(int rok){
            boolean przestepnosc= true;
            if((rok%4==0 && rok%100!=0 ) || rok%400==0){
                przestepnosc = true;}
            else {
                przestepnosc= false;}
            return przestepnosc;}

        ///Zad.4
        public static void zadanie4(String[] args) {
            Scanner sc = new Scanner(System.in);
            double cena = 10;
            System.out.println("Podaj liczbę sztuk towaru: ");
            int ileSztuk = sc.nextInt();
            System.out.println("Czy na dany produkt jest promocja?: ");
            String odp=sc.next();

            if(odp.equals("tak")){
                Sztuki(ileSztuk, cena);}
            else if(odp.equals("nie")){
                double procent=cena*0.1;
                double sum=cena+procent;
                System.out.println("cena za produkt wynosi= "+ileSztuk*sum);}}

        public static void Sztuki(int ileSztuk, double cena){
            if(ileSztuk>10){
                cena/= 2.0;
                System.out.println("Cena za produkty wynosi: "+ileSztuk*cena+"zł");}
            else if(ileSztuk<=10){
                System.out.println("cena za produkty wynosi: "+ileSztuk*cena+"zł");}}

        ///Zad.5

        public static void zad5(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Podaj tytuł pierwszego utworu: ");
            String nazwautworu=sc.nextLine();
            System.out.println("Podaj czas trwania pierwszego utworu(minuty): ");
            short min=sc.nextShort();
            System.out.println("Podaj czas trwania pierwszego utworu(sekundy): ");
            short sek=sc.nextShort();

            System.out.println("Podaj tytuł drugiego utworu: ");
            String nazwa2=sc.next();
            System.out.println("Podaj czas trwania drugiego utworu(minuty): ");
            short min2=sc.nextShort();
            System.out.println("Podaj czas trwania drugiego utworu(sekundy): ");
            short sek2=sc.nextShort();
            short sumamin= (short)(min+min2);
            short sumasek=(short)(sek+sek2);
            System.out.println("---------------------------------------------");
            System.out.println("UTWORY: ");
            wypisac(min, sek, nazwautworu, min2, sek2, nazwa2);
            System.out.println("ŁĄCZNY CZAS TRWANIA: "+sumamin+":"+sumasek);
            System.out.println("---------------------------------------------");
        }


        public static void wypisac (short min,short sek,String nazwautworu, short min2, short sek2, String nazwa2){
            if ((min > min2) || min == min2 && sek > sek2) {
                System.out.println("1. " +nazwa2+" "+min2 + ":"+sek2);
                System.out.println("2. " +nazwautworu+" "+min + ":"+sek);}
            else {
                System.out.println("1. "+nazwautworu+" "+min+":"+sek);
                System.out.println("2. "+nazwa2+" "+min2+":"+sek2);}}}


