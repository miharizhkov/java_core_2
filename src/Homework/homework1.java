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
        double rost = 1.85;
        double ves = 85.3;
        double imt = ves / (rost * rost);
        System.out.println(imt);
        // Задача 3
        char[] a = {'a','b', 'c','d', 'e'};
        System.out.println(a);
        a[3] = 'h';
        System.out.println(a);
    }
}