package com.mycompany.app;

//import java.util.Scanner;

public class NumeroRomano {

    /*public static String decToRomano(int i) {
        String numeroromano = "";

        if (i == 1){
            numeroromano="I";
        }else  if (i == 2){
            numeroromano="II";
        }
        return numeroromano;
    }*/
    /*public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N;
            do {
                   System.out.print("Introduce un número entre 1 y 3999: ");
                   N = sc.nextInt();
            } while (N < 1 || N > 3999);
            System.out.println(N + " en numeros romanos -> " + decToRomano(N));
        }                            
    }*/

     //método para pasar a números romanos
  /*public static String decToRomano(int numero) {
    int i, miles, centenas, decenas, unidades;
    String romano = "";
    
    //obtenemos cada cifra del número
    miles = numero / 1000;
    centenas = numero / 100 % 10;
    decenas = numero / 10 % 10;
    unidades = numero % 10;

    //millar
    for (i = 1; i <= miles; i++) {
           romano = romano + "M";
    }

    //centenas
    if (centenas == 9) {
        romano = romano + "CM";
    } else if (centenas >= 5) {
               romano = romano + "D";
               for (i = 6; i <= centenas; i++) {
                    romano = romano + "C";
               }
    } else if (centenas == 4) {
               romano = romano + "CD";
    } else {
               for (i = 1; i <= centenas; i++) {
                    romano = romano + "C";
           }
    }

    //decenas
    if (decenas == 9) {
        romano = romano + "XC";
    } else if (decenas >= 5) {
               romano = romano + "L";
               for (i = 6; i <= decenas; i++) {
                    romano = romano + "X";
               }
    } else if (decenas == 4) {
               romano = romano + "XL";
    } else {
               for (i = 1; i <= decenas; i++) {
                    romano = romano + "X";
               }
    }

    //unidades
    if (unidades == 9) {
        romano = romano + "IX";
    } else if (unidades >= 5) {
               romano = romano + "V";
               for (i = 6; i <= unidades; i++) {                                                           
                    romano = romano + "I";
               }
    } else if (unidades == 4) {
               romano = romano + "IV";
    } else {
               for (i = 1; i <= unidades; i++) {
                    romano = romano + "I";
               }
    }
    return romano;
}*/

public static String decToRomano(int numero) {
    int miles, centenas, decenas, unidades;
    
    String romano = "";
    

    //obtenemos cada cifra del número
    miles = numero / 1000;
    centenas = numero / 100 % 10;
    decenas = numero / 10 % 10;
    unidades = numero % 10;

    //millar
    if (miles > 0){
        romano = miles(miles, romano);
    }

    if (centenas > 0){
    //centenas
        romano = centenas(centenas, romano);
    }

    //decenas
    if (decenas > 0){
        romano = decenas(decenas, romano);
    }

    //unidades
    romano = unidades(unidades, romano);
    return romano;
}

private static String unidades(int unidades, String romano) {
    int i;
    if (unidades > 0){
        if (unidades == 9) {
            romano = romano + "IX";
        } else if (unidades >= 5) {
                romano = romano + "V";
                for (i = 6; i <= unidades; i++) {                                                           
                        romano = romano + "I";
                }
        } else if (unidades == 4) {
                romano = romano + "IV";
        } else {
                for (i = 1; i <= unidades; i++) {
                        romano = romano + "I";
                }
        }
    }
    return romano;
}

private static String decenas(int decenas, String romano) {
    int i;
    if (decenas == 9) {
        romano = romano + "XC";
    } else if (decenas >= 5) {
            romano = romano + "L";
            for (i = 6; i <= decenas; i++) {
                    romano = romano + "X";
            }
    } else if (decenas == 4) {
            romano = romano + "XL";
    } else {
            for (i = 1; i <= decenas; i++) {
                    romano = romano + "X";
            }
    }
    return romano;
}

private static String centenas(int centenas, String romano) {
    int i;
    if (centenas == 9) {
        romano = romano + "CM";
    } else if (centenas >= 5) {
            romano = romano + "D";
            for (i = 6; i <= centenas; i++) {
                    romano = romano + "C";
            }
    } else if (centenas == 4) {
            romano = romano + "CD";
    } else {
            for (i = 1; i <= centenas; i++) {
                    romano = romano + "C";
        }
    }
    return romano;
}

private static String miles(int miles, String romano) {
    int i;
    for (i = 1; i <= miles; i++) {
            romano = romano + "M";
    }
    return romano;
}

}
