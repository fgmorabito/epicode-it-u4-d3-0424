import java.util.Scanner;

public class TestAutomobile {

    public static void main(String[] args) {

        Automobile pandaDiFrancesco = new Automobile("Panda",45,4);
        Automobile clioDiLorenzo = new Automobile("Clio","Nero","GB499XX",50,5);
        //voglio sapere la benzina presente nella panda di Francesco
        System.out.println("La macchina di Francesco ha questa benzina: " +pandaDiFrancesco.getBenzina());
        //come fa a far rifornimento Francesco?

        //SCANNER per chiedere quanti litri debbo rifornire

        Scanner mioScanner = new Scanner(System.in);
        System.out.println("Quanti litri di carburante vuoi mettere?");

        double litriDaRifornire = mioScanner.nextDouble();

        pandaDiFrancesco.setBenzina(litriDaRifornire);

        System.out.println("Livello benzina attuale: " +pandaDiFrancesco.getBenzina());

        mioScanner.close();
    }
}
