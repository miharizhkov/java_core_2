package Homework;

public class homework1 {
    public static void main(String[] args) {
        // Задача 1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String helloWorld = hi + world + newLine;
        String A = (hi.trim()+world.toLowerCase());
        System.out.println(A+newLine+A+newLine+A);
        // Задача 2
        double Rost = 1.85;
        double Ves = 85.3;
        double Imt = Ves / (Rost * Rost);
        System.out.println(Imt);
        // Задача 3


    }
}