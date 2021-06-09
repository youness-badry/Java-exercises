package com.test.testanything;

public class Main {

    public static int[][] initialiserMatrice(int n) {
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j] = 0;
            }
        }
        return mat;
    }
    public static void printMatrice(int[][] mat) {
        int i,j;
        int n = mat[0].length;
        System.out.println("Matrice = ");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println(System.lineSeparator());
        }
    }
    public static int[][] gloutonAlgorithm(int[][] mat,int k) { // k est un parametre
        int i=0,j=0;
        int n = mat[0].length;
        mat[i][k] = 1;
        for(i=1;i<n;i++) {
            if(j != k) {
                mat[i][j] = 1;
                j++;
            }else {
                j++;
                mat[i][j] = 1;
                j++;
            }
        }
        return mat;
    }

    public static void main(String[] args) {

        int[][] mat = initialiserMatrice(7);
        printMatrice(mat);
        int[][] matSolution = gloutonAlgorithm(mat,4);
        printMatrice(matSolution);


    }
}
