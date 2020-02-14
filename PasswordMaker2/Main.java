package PasswordMaker2;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del array");
        int arraylen = sc.nextInt();
        PassMaker[] ObjArray = new PassMaker[arraylen];
        System.out.println("Ingresa el tamaño de los passwords");
        int pwdLen = sc.nextInt();
        sc.close();
        for(int i = 0; i<ObjArray.length; i++){
            ObjArray[i]= new PassMaker(pwdLen);
        }
        for(int j = 0; j<ObjArray.length; j++){
            System.out.println(ObjArray[j].esFuerte(ObjArray[j].getPassword()));
            
        }
        
    }
}