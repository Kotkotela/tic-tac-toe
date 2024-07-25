package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a1 = "-";
        String b1 = "-";
        String c1 = "-";
        String a2 = "-";
        String b2 = "-";
        String c2 = "-";
        String a3 = "-";
        String b3 = "-";
        String c3 = "-";
        String stroka;

        for(int i = 0; i<10; i++){
            System.out.println("  " + "a" + " " + "b" + " " + "c");
            System.out.println("1 " + a1 + " " + b1 + " " + c1);
            System.out.println("2 " + a2 + " " + b2 + " " + c2);
            System.out.println("3 " + a3 + " " + b3 + " " + c3);
            System.out.println("ходит игрок x");
            stroka = scanner.nextLine();
            if (stroka.equals("a1")){
                a1 = "x";
            }
            if (stroka.equals("a2")){
                a2 = "x";
            }
            if (stroka.equals("a3")){
                a3 = "x";
            }
            if (stroka.equals("b1")){
                b1 = "x";
            }
            if (stroka.equals("b2")){
                b2 = "x";
            }
            if (stroka.equals("b3")){
                b3 = "x";
            }
            if (stroka.equals("c1")){
                c1 = "x";
            }
            if (stroka.equals("c2")){
                c2 = "x";
            }
            if (stroka.equals("c3")){
                c3 = "x";
            }
            if (a1.equals(a2)){
                if(a1.equals("-")){

                }
                else{
                    if (a1.equals(a3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }
            }
            if (a1.equals(b2) ){
                if(a1.equals("-")){

                }
                else{
                    if (a1.equals(b3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }
            }
            if (a1.equals(b1)){
                if(a1.equals("-")){

                }
                else{
                    if (a1.equals(c1)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }
            }
            if (b1.equals(b2)){
                if(b1.equals("-")){

                }
                else{
                    if (b1.equals(b3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);

                    }
                }

            }
            if (c1.equals(c2)){
                if(c1.equals("-")){

                }
                else{
                    if (c1.equals(c3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);

                    }
                }
            }
            System.out.println("  " + "a" + " " + "b" + " " + "c");
            System.out.println("1 " + a1 + " " + b1 + " " + c1);
            System.out.println("2 " + a2 + " " + b2 + " " + c2);
            System.out.println("3 " + a3 + " " + b3 + " " + c3);
            System.out.println("ходит игрок O");
            stroka = scanner.nextLine();
            if (stroka.equals("a1")){
                a1 = "O";
            }
            if (stroka.equals("a2")){
                a2 = "O";
            }
            if (stroka.equals("a3")){
                a3 = "O";
            }
            if (stroka.equals("b1")){
                b1 = "O";
            }
            if (stroka.equals("b2")){
                b2 = "O";
            }
            if (stroka.equals("b3")){
                b3 = "O";
            }
            if (stroka.equals("c1")){
                c1 = "O";
            }
            if (stroka.equals("c2")){
                c2 = "O";
            }
            if (stroka.equals("c3")){
                c3 = "O";
            }
            if (a1.equals(a2)){
                if(a1.equals("-")){

                }
                else{
                    if (a1.equals(a3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }
            }
            if (a1.equals(b2) ){
                if(a1.equals("-")){

                }
                else{
                    if (a1.equals(b3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }
            }
            if (a1.equals(b1)){
                if(a1.equals("-")){

                }
                else{
                    if (a1.equals(c1)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }
            }
            if (b1.equals(b2)){
                if(b1.equals("-")){

                }
                else{
                    if (b1.equals(b3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }

            }
            if (c1.equals(c2)){
                if(c1.equals("-")){

                }
                else{
                    if (c1.equals(c3)){
                        i = 10;
                        System.out.println("выйграл");
                        System.exit(0);
                    }
                }
            }

        }
    }
}