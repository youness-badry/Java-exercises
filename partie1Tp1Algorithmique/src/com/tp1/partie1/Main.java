package com.tp1.partie1;

public class Main {


    public static double calculSommeSerieHarmonique(int n) {

        double s=0;
        for(int i=1;i<=n;i++) {
            s+=(double) 1/i;
        }
        return s;
    }

    public static void triangleIsocele(int hauteur) {
        int k=0;
        for(int i=0;i<hauteur;i++) {
            String str="";
            for(int j=0;j<=k;j++) {
                str+="*";

            }
            System.out.println(str);
            k++;

        }
    }

    public static void  boite(int l,int h,int m) {

        for(int i=1;i<=(2*m+h);i++) {
            String str="";
            if( i<=m || i>h+m ) {
                for(int j=1;j<=(2*m+l);j++) {
                    str+="#";
                }
            }else {
                for(int j=1;j<=m;j++) {
                    str+="#";
                }
                for(int j=1;j<=l;j++) {
                    str+=" ";
                }
                for(int j=1;j<=m;j++) {
                    str+="#";
                }
            }
            System.out.println(str);
        }

    }

    public static void main(String[] args) {

        // On teste ci-dessous la methode qui calcule la somme de la serie harmonique
        /*int n=20;
        double s=calculSommeSerieHarmonique(n);
        System.out.println("H("+n+") = "+s);*/

        // On teste ci-dessous la methode qui affiche un triangle isocele
        /*triangleIsocele(5);*/

        boite(5,4,1);


    }
}
