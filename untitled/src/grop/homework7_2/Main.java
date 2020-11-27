package grop.homework7_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] user = new User[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Please Enter username");
            String username = scanner.nextLine();
            System.out.println("Enter passwored");
            String password = scanner.nextLine();
            if (pasvordisvalid(password)) {
                System.out.println("username" +username + "Passvord"+ password);
            } else {
                System.out.println("this is a not valeu passwrd");
            }
        }
    }

    public static boolean lestthecharacter(String password) {
        String AlfabetBig = "ABSDIFGHIGKLMNOPQRCTUVWXYZ";
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < AlfabetBig.length(); j++) {
                if (password.charAt(j) == AlfabetBig.charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count >= 1;

    }

    public static boolean howMucheNumber(String password) {
        String numbers = "1234567890";
        int num = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < numbers.length(); j++) {
                if (password.charAt(i) == numbers.charAt(j)) {
                    num++;
                    break;
                }
            }
        }
        return num >= 3;
    }

    public static boolean howMucheSimvole(String password) {
        String simvole = "#!%";
        int sim = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < simvole.length(); j++) {
                if (password.charAt(i) == simvole.charAt(j)) {
                    sim++;
                    break;
                }
            }
        }
        return sim >= 1;
    }

    public static boolean pasvordisvalid(String password) {
        if (howMucheNumber(password) && lestthecharacter(password) && howMucheSimvole(password)) {
            return true;
        }
        return false;
    }
}