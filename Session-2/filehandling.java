import java.util.Scanner;

import javax.lang.model.type.NullType;

import java.io.*;

class Warning {
    // --------------------------------------------------------------------
    // Reads student data (name, semester hours, quality points) from a
    // text file, computes the GPA, then writes data to another file
    // if the student is placed on academic warning.
    // --------------------------------------------------------------------
    public static void main(String[] args) {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String line, name;
        String inputName = "C:\\Users\\91801\\Desktop\\Core-java\\Session-2\\text1.txt";

        String outputName = "C:\\Users\\91801\\Desktop\\Core-java\\Session-2\\textdestination.txt";

        try {
            // Set up scanner to input file
            Scanner sc = new Scanner(new FileReader(inputName));
            // Set up the output file stream
            FileWriter fwrite = new FileWriter(outputName, true);
            // Print a header to the output file - "Students on Academic Warning"
            fwrite.write("Students on Academic Warning\n");
            // Process the input file, one token at a time
            String eachLine;
            while (sc.hasNextLine()) {
                // Get the credit hours and quality points and
                // determine if the student is on warning. If so,
                // write the student data to the output file.
                eachLine = sc.nextLine();
                String[] eachTokenOfLine = eachLine.split(" ");
                name = eachTokenOfLine[0];
                creditHrs = Integer.parseInt(eachTokenOfLine[1]);
                qualityPts = Double.parseDouble(eachTokenOfLine[2]);
                gpa = qualityPts / (double) creditHrs;
                if ((gpa < 1.5 && creditHrs < 30) || (gpa < 1.75 && creditHrs < 60) || (gpa < 2)) {
                    fwrite.write(eachLine + "\n");
                }
            }
            // Close output file
            fwrite.close();
            sc.close();
        } catch (FileNotFoundException exception) {
            System.out.println("The file " + inputName + " was not found.");
        } catch (IOException exception) {
            System.out.println(exception);
        } catch (NumberFormatException e) {
            System.out.println("Format error in input file: " + e);
        }
    }
}