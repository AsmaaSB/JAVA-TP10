/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemA;

/**
 *
 * @author PC
 */
import java.io.*;
import java.util.*;

public class NombresOpposes {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\PC\\Documents\\NetBeansProjects\\TP10\\inputA.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\PC\\Documents\\NetBeansProjects\\TP10\\outputA.txt"));

            int N = Integer.parseInt(reader.readLine().trim());
            Set<Integer> set = new HashSet<>();
            int count = 0;

            String[] numbers = reader.readLine().split(" ");
            for (String num : numbers) {
                int number = Integer.parseInt(num);
                if (set.contains(-number)) {
                    count++;
                }
                set.add(number);
            }

            writer.write(count + "\n");
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Erreur de lecture/écriture du fichier.");
        }
    }
}
