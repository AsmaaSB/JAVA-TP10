/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemB;

/**
 *
 * @author PC
 */
import java.io.*;

public class AdditionBinaire {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputB.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputB.txt"));

            int N = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= N; i++) {
                String[] binaries = reader.readLine().split(" ");
                String result = addBinary(binaries[0], binaries[1]);
                writer.write(i + " " + result + "\n");
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Erreur de lecture/écriture du fichier.");
        }
    }

    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(num1 + num2);
    }
}