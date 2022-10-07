import java.util.Scanner;

//Daten einlesen
//Eine externe Funktion ausführen

public class ElectricityCalculator {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie an, wie viel Quadratmeter Wohnfläche Ihre Wohnung/Ihr Haus hat:");
        int sqm = scanner.nextInt();
        System.out.println("Bitte geben Sie an, wieviele Personen in Ihrem Haushalt leben:");
        int persons = scanner.nextInt();
        System.out.println("Bitte geben Sie an, wie viele Elektrogeräte Sie besitzen.");
        System.out.println("Dazu zählen unter anderem Herd, Waschmaschine und Geschirrspüler.");
        int machines = scanner.nextInt();
        System.out.printf("Der durchschnittliche Energieverbrauch beträgt %d kwh/Jahr.", getElectricityUsage(persons,sqm,machines));
    }

    public static int getElectricityUsage (int persons, int sqm, int machines) {
        return ((sqm*9)+(persons*200)+(machines*200));

    }
}
