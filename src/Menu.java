import java.util.Scanner;

public class Menu {
    Registiration rg=new Registiration();
    Listing list=new Listing();
void eingang(){

    System.out.println("Geben Sie die Aktion ein, die Sie wünschen!!\n"+
            "1. Namens Eintrag\n" +
            "2. Die Liste der Namen der Leute, die glücklich sind\n" +
            "3. Abmelden");
    Scanner scan=new Scanner(System.in);
    while (true){
        if (scan.hasNextInt()){
            int wahl=scan.nextInt();
            switch (wahl){
                case 1 : {rg.register();
                eingang();}
                case 2 : {list.listele(rg.benutzerList);
                eingang();}
                case 3 : {
                    System.out.println("Tschüss !!!");
                    System.exit(0);
                }
                default: {
                    System.out.println("Bitte geben Sie eine gültige Zahl");
                    eingang();
                }
            }
        }else {
            System.out.println("Bitte geben Sie eine gültige Zahl");
        eingang();
        }

    }
}


}
