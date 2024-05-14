import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        System.out.println("Bitte warten, CSV Dateien werden eingelesen");
        // Pfade zu den CSV-Dateien
        String csvFile1 = "C:\\Users\\PSchmidt\\Downloads\\palmon.csv";
        String csvFile2 = "C:\\Users\\PSchmidt\\Downloads\\moves.csv";
        String csvFile3 = "C:\\Users\\PSchmidt\\Downloads\\effectivity.csv";
        String csvFile4 = "C:\\Users\\PSchmidt\\Downloads\\palmon_move.csv";

        List<String[]> CSVPalmon = new ArrayList<>();
        List<String[]> CSVMoves = new ArrayList<>();
        List<String[]> CSVEffect = new ArrayList<>();
        List<String[]> CSVPMoves = new ArrayList<>();

        // Separate BufferedReader für jede Datei
        try (BufferedReader brPalmon = new BufferedReader(new FileReader(csvFile1));
             BufferedReader brMoves = new BufferedReader(new FileReader(csvFile2));
             BufferedReader brEffect = new BufferedReader(new FileReader(csvFile3));
             BufferedReader brPMoves = new BufferedReader(new FileReader(csvFile4))) {

            // Hier können Sie die Daten aus jedem BufferedReader lesen und verarbeiten
            // Beispiel: Lesen der ersten Zeile aus jeder Datei
            String line1 = brPalmon.readLine();
            while ((line1 = brPalmon.readLine()) != null) {
                // Zeilen aufteilen und zur Liste hinzufügen
                String[] values = line1.split(",");
                CSVPalmon.add(values);
            }

            String line2 = brMoves.readLine();
            while ((line2 = brMoves.readLine()) != null) {
                // Zeilen aufteilen und zur Liste hinzufügen
                String[] values = line2.split(",");
                CSVMoves.add(values);
            }

            String line3 = brEffect.readLine();
            while ((line3 = brEffect.readLine()) != null) {
                // Zeilen aufteilen und zur Liste hinzufügen
                String[] values = line3.split(",");
                CSVEffect.add(values);
            }

            String line4 = brPMoves.readLine();
            while ((line4 = brPMoves.readLine()) != null) {
                // Zeilen aufteilen und zur Liste hinzufügen
                String[] values = line4.split(",");
                CSVPMoves.add(values);
            }

        } catch (IOException e) {
            System.out.println("Fehler beim Einlesen. Bitte checke ob du alle CSV Dateien in den richtigen Ordner gepackt hast!");
        }

        System.out.println("Alle CSV Dateien wurden erfolgreich eingelesen");

        System.out.println("Bitte füge deinem Team Palmons hinzu");
        ArrayList<String[]> team1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean willhinzufügen = true;
        System.out.println("Willst du dein Team selbst zusammenstellen oder möchtest du dass dir ein Random Team gegeben wird? (selfmade/random)");
        String choice_team = sc.next().toLowerCase();

        if (choice_team.equals("selfmade")) {
            while (willhinzufügen) {
                int palmonid;

                while (true) {
                    System.out.print("ID eingeben: ");
                    if (sc.hasNextInt()) {
                        palmonid = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Ungültige Eingabe! Bitte geben Sie eine ganze Zahl ein.");
                        sc.next(); // Leert den Scanner-Puffer, um die Schleife nicht endlos zu machen
                    }
                }
                try {
                    if (palmonid >= 0 && palmonid < CSVPalmon.size()) {
                        String[] foundPalmon = CSVPalmon.get(palmonid - 1);
                        team1.add(foundPalmon);
                        System.out.println("Hinzugefügt: " + Arrays.toString(foundPalmon));
                    } else {
                        System.out.println("ID ungültig");
                    }
                } catch (Exception e) {
                    System.out.println("Ungültige Eingabe");
                }

                while (true) {
                    System.out.print("Weitere Palmons hinzufügen? (ja/nein): ");
                    String antwort = sc.next().toLowerCase();
                    if (antwort.equals("ja")) {
                        break;
                    } else if (antwort.equals("nein")) {
                        willhinzufügen = false;
                        break;
                    } else {
                        System.out.println("Ungültige Antwort! Bitte geben Sie 'ja' oder 'nein' ein.");
                    }
                }
            }
        } else if (choice_team.equals("random")) {
            Random ran = new Random();
            String[] foundPalmon = CSVPalmon.get(ran.nextInt(1194));
            team1.add(foundPalmon);
            System.out.println("Hinzugefügt: " + Arrays.toString(foundPalmon));
        }
        int length = team1.size();
        if(length == 0){System.out.println("Ohne Pokemon bist du selbst kampfunfähig, GAME OVER");}
        else{
        for (int i = 0; i < length; i++) {

        }
    }
}}
