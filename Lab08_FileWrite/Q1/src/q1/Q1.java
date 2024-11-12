/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Q1 {

    //Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    //--VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    ArrayList<String> inputLines = new ArrayList<>();
    String result = "";
    ArrayList<Product> Products = new ArrayList<>();
    //ArrayList<Book> book = new ArrayList<>();

    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART--------------------------    
    String fi, fo;

    /**
     * Set input and output file for automatic rating
     *
     * @param args path of input file and path of output file
     */
    public void setFile(String[] args) {
        fi = args.length >= 2 ? args[0] : inputFile;
        fo = args.length >= 2 ? args[1] : outputFile;
    }

    /**
     * Reads data from input file
     */
    public void read() {
        try (Scanner sc = new Scanner(new File(fi))) {
            //--END FIXED PART----------------------------

            //INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:
            int no_of_line = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= no_of_line; i++) {
                String line = sc.nextLine();
                inputLines.add(line);
            }

            //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
            //--START FIXED PART--------------------------    
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Input Exception # " + ex);
        }
    }
    //--END FIXED PART----------------------------

    //ALGORITHM - @STUDENT: ADD YOUR OWN METHODS HERE (IF NEED):
    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART--------------------------    
    /**
     * Main algorithm
     */
    public void solve() {
        //--END FIXED PART----------------------------

        //ALGORITHM - @STUDENT: ADD YOUR CODE HERE:
        for (int i = 0; i < inputLines.size(); i++) {
            String line = inputLines.get(i);

            String[] token = line.trim().split(" ");

            switch (token[0]) {
                case "F":
                    String producId = token[1];
                    String name = token[2];
                    double price = Double.parseDouble(token[3]);
                    int quantity = Integer.parseInt(token[4]);
                    boolean isExpired = Boolean.parseBoolean(token[5]);
                    Food newFood = new Food(producId, name, price, quantity, isExpired);
                    Products.add(newFood);
                    //result += newFood.info() + "\n";
                    break;

                case "E":
                    producId = token[1];
                    name = token[2];
                    price = Double.parseDouble(token[3]);
                    quantity = Integer.parseInt(token[4]);
                    double discount = Double.parseDouble(token[5]);
                    Electronic newElectronic = new Electronic(producId, name, price, quantity, discount);
                    Products.add(newElectronic);
                    //result += newElectronic.info() + "\n";
                    break;

                case "Clear":
                    Products.clear();
                    result += "* Remove all products\n";
                    break;

                case "Total":
                    double total = 0;
                    for (Product p : Products) {
                        total += p.subTotal();
                    }
                    result += "Inv: " + String.format("%.2f", total) + "\n";
                    break;

                case "Print":
                default:
                    if (Products.isEmpty()) {
                        result += "Empty\n";
                    } else {
                        for (Product p : Products) {
                            result += p.info() + "\n";
                        }
                    }
                    break;
            }
        }
        System.out.println(result);
        //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
        //--START FIXED PART-------------------------- 
    }

    /**
     * Write result into output file
     */
    public void printResult() {
        try {
            FileWriter fw = new FileWriter(fo);
            //--END FIXED PART----------------------------

            //OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
            fw.write(result);

            //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
            //--START FIXED PART-------------------------- 
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Output Exception # " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q1 q = new Q1();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    //--END FIXED PART----------------------------    
}
