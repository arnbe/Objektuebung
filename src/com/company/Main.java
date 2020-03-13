package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
         anzahlFenster();

    }


    public static void anzahlFenster() {
        boolean zimmer8 = true;
        boolean fenster10 = true;
        boolean farbe = true;
        boolean bauJahr1990 = true;
        String beSitzer = "Hans Wurst";

        if (fenster10) {
            System.out.println("Das Haus gehört dem Hans!");
        } else {
            System.out.println("Wem gehört das Haus?");
        }

        if (zimmer8) {
            System.out.println("Das Haus gehört dem Hans!");
        } else {
            System.out.println("Wem gehört das Haus?");
        }

        boolean blau = true;
        if (blau) {
            System.out.println("das Haus geh....");
        } else {
            System.out.println("Wem geh......");
        }

        boolean jahr1990 = true;
        if (jahr1990) {
            System.out.println("das Haus gehört...");
        } else {
            System.out.println("Wem gehört das Ha...");
        }

        boolean hansWurst = true;
        if (hansWurst) {
            System.out.println("das Haus gehört...");
        } else {
            System.out.println("Wem gehört...");
        }
    }
 }


