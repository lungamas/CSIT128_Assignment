/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csit128_assignment;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class CSIT128_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Pcode;
        String Pname;
        int catagory;
        int warranty;
        int menu1;
        int menu2;

        ArrayList<String> Desktop = new ArrayList<String>();
        ArrayList<String> Laptop = new ArrayList<String>();
        ArrayList<String> Tablet = new ArrayList<String>();
        ArrayList<String> Printer = new ArrayList<String>();
        ArrayList<String> GameConsole = new ArrayList<String>();
        ArrayList<String> Sixmonths = new ArrayList<String>();
        ArrayList<String> TwoYears = new ArrayList<String>();
        Scanner st = new Scanner(System.in);

        menu1 = Integer.parseInt(JOptionPane.showInputDialog("BRIGHT FUTURE TECHNOLOGIES APPLICATION "
                + "\n**********************************************"
                + "\nEnter (1) to launch menu or any other key to exit "));

        if (menu1 == 1) {
            menu2 = Integer.parseInt(JOptionPane.showInputDialog("(1) Capture new project"
                    + "\n (2) Search for product"
                    + "\n (3) Update a product"
                    + "\n(4) Delete product "
                    + "\n(5) Print report "
                    + "\n(6) Exit application"));

            switch (menu2) {
                case 1:

                    System.out.println("Enter product code");
                    Pcode = st.nextLine();

                    System.out.println("Enter product name");
                    Pname = st.nextLine();

                    catagory = Integer.parseInt(JOptionPane.showInputDialog("(1)Desktop computer "
                            + "\n(2)Laptop "
                            + "\n(3)Tablet"
                            + "\n(4)Printer"
                            + "\n(5) Gaming console"));
                    switch (catagory) {
                        case 1:
                            Desktop.add(Pcode + " - " + Pname);
                            break;
                        case 2:
                            Laptop.add(Pcode + " - " + Pname);
                            break;
                        case 3:
                            Tablet.add(Pcode + " - " + Pname);
                            break;
                        case 4:
                            Printer.add(Pcode + " - " + Pname);
                            break;
                        case 5:
                            GameConsole.add(Pcode + " - " + Pname);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Please choose a valid option");
                            break;
                    }

                    warranty = Integer.parseInt(JOptionPane.showInputDialog("Please select warranty"
                            + "\n(1) Six Months"
                            + "\n(2) Two year warranty"));
                    switch (warranty) {
                        case 1:
                            Sixmonths.add(Pcode + " - " + Pname);
                            break;
                        case 2:
                            TwoYears.add(Pcode + " - " + Pname);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Please select a valid warranty");
                            break;
                    }
                    System.out.println("Product added successfully");
                    break;

                // Add cases for other menu options (2 to 6) if needed
                // ...

                default:
                    JOptionPane.showMessageDialog(null, "Invalid menu option");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "User has exited the application");
        }
    }
}
        // TODO code application logic here
       


