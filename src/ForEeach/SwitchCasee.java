package ForEeach;

import java.util.Scanner;

public class SwitchCasee {


    public static void main(String[] args) {

        System.out.println("/");
        Scanner  sc = new Scanner(System.in);
        while(true){
            String textInput = sc.nextLine();
            switch (textInput){

                case "A":
                  show("A");
                  break;
                case "B":
                    show("B");
                    break;
                case "C":
                    show("C");
                    break;
                default: show("Random");
            }
        }
    }


    private static void show(String caseInput){
        System.out.println("Case input:" +caseInput);
    }
}
