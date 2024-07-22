import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        String path = "c:\\temp\\TempoBubble.txt";
        Ordena ordena = new Ordena();
        
        for (int i = 0; i < Item.vect.length; i++){
            System.out.println(Item.vect[i]);
        }
        System.out.println("-------------------------------------------------------");
        long startTime = System.nanoTime();
        ordena.bubbleSort(Item.vect);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        for (int i = 0; i < Item.vect.length; i++){
            System.out.println(Item.vect[i]);
        }
        String duracao = Long.toString(duration);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(duracao);
            bw.newLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Tempo: " + duration);

    }
}