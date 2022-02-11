package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int max=0;
        String name="";
        for(int i=0;i<str.length;i++){
            if(str[i].length()>max){
                name=str[i];
                max=str[i].length();
            }
        }
        System.out.println(name);
    }
}
