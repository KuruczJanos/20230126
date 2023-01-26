package javaapplication9;// Csigabiga program

public class JavaApplication9 {//Osztály kezdete

    static void feltolt(int[][] t) {
        for (int j = 0; j < t.length; j++) {
            for (int i = 0; i < t[0].length; i++) {
                t[j][i] = j * t.length + i;

            }
        }
    }

    static void kiirtomb(int[][] t) {
        for (int j = 0; j < t.length; j++) {
            for (int i = 0; i < t[0].length; i++) {
                System.out.print(t[j][i] + ",");

            }
        }
    }

    static void kiirspiralban(int[][] t) {
        do {
            int elemszam = 0, x = 0, y = 0, sor = 0, oszlop = 0;
            elemszam = t.length - 1;
            for (int i = 0; i < 4; i++) {
                switch (i % 4) {
                    case 0:
                        x = 0;
                        y = 1;
                        break;
                    case 1:
                        x = 1;
                        y = 0;
                        break;
                    case 2:
                        x = 0;
                        y = -1;
                        break;
                    case 3:
                        x = -1;
                        y = 0;
                        break;
                    default:
                        System.out.println("Nagyon béna vagyok!!!");
                }
                for (int j = 0; j < elemszam; j++) {
                    System.out.print(t[sor][oszlop] + ",");
                    sor = sor + x;
                    oszlop = oszlop + y;

                }

            }
            elemszam = 2;
            if (elemszam == 0) {
                elemszam = 1;
            }

        } while (elemszam > 0);
    }

    public static void main(String[] args) {//Forráskód eleje
        int n = 6;
        int[][] tomb = new int[n][n];
        feltolt(tomb);
        kiirtomb(tomb);
        kiirspiralban(tomb);

    }//Forráskód vége
}//Osztály vége
