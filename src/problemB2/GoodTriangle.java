/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemB2;

/**
 *
 * @author PC
 */
import java.io.*;

public class GoodTriangle {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputB2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputB2.txt"));

            int N = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= N; i++) {
                int n = Integer.parseInt(reader.readLine());
                long result = weightedSum(n);
                writer.write(i + " " + n + " " + result + "\n");
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Erreur de lecture/écriture du fichier.");
        }
    }

    public static long weightedSum(int n) {
        long sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k * (k + 1) * (k + 2) / 2;
        }
        return sum;
    }
}