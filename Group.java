import javax.swing.JOptionPane;
import java.util.Scanner;
public class Group
{
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    static double j = 0.0;

    public static double itemPrice(int item) {
        if (item == 1) {
            itemPrice = 850.00;
        }
        if (item == 2) {
            itemPrice = 900.00;
        }
        if (item == 3) {
            itemPrice = 700.00;
        }
        if (item == 4) {
            itemPrice = 500.00;
        }
        if (item == 5) {
            itemPrice = 450.00;
        }
        if (item == 6) {
            itemPrice = 600.00;
        }
        if (item == 7) {
            itemPrice = 350.00;
        }
        if (item == 8) {
            itemPrice = 250.00;
        }
        if (item == 9) {
            itemPrice = 100.00;
        }
        if (item == 10) {
            itemPrice = 250.00;
        }
        if (item == 11) {
            itemPrice = 80.00;
        }
        if (item == 12) {
            itemPrice = 10.00;
        }
        if (item == 13) {
            itemPrice = 250.00;
        }
        if (item == 14) {
            itemPrice = 80.00;
        }
        if (item == 15) {
            itemPrice = 10.00;
        }
        if (item == 16) {
            itemPrice = 250.00;
        }
        if (item == 17) {
            itemPrice = 80.00;
        }
        if (item == 18) {
            itemPrice = 85.00;
        }
        if (item == 19) {
            itemPrice = 400.00;
        }
        if (item == 20) {
            itemPrice = 850.00;
        }
        if (item == 21) {
            itemPrice = 340.00;
        }
        if (item == 22) {
            itemPrice = 60.00;
        }
        if (item == 23) {
            itemPrice = 50.00;
        }
        if (item == 24) {
            itemPrice = 120.00;
        }
        if (item == 25) {
            itemPrice = 3000.00;
        }
        if (item == 26) {
            itemPrice = 2500.00;
        }
        if (item == 27) {
            itemPrice = 7800.00;
        }
        quantity();
        return j;
    }
    

    public static double quantity() {

        double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity:"));
        subTotal(quantity, itemPrice);
        return quantity;
    }

    
    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        JOptionPane.showMessageDialog(null,"\nSubtotal: " + subTotal + "\n");
        j=subTotal;
        return subTotal;
    }
    
    public static void done(double runningTotal) {
        ordering = false;
        JOptionPane.showMessageDialog(null,"\nTotal amount: " + runningTotal);
    }
    
	public static void main(String[] args) {
		int a,b;
		int item = 0;
		input = new Scanner(System.in);
		double runningTotal = 0;
		do{
             
            int menuOption = Integer.parseInt(JOptionPane.showInputDialog("     XYZ BookStore\n**********Menu**********\n1. Books  \n2. Stationary \n3. Workstation\n4. Checkout\nChoose [1-4]:"));
            switch (menuOption){
                case 1:
                    a =Integer.parseInt(JOptionPane.showInputDialog("\n**********Books**********\n1. Fantasy  \n2. Romance \n3. Fiction\nChoose [1-3]:"));
                    switch(a)
                    {
                        case 1:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n**********Fantasy**********\n1. Harry Potter - P850\n2. Game Of Thrones - P900\n3. Lord of the Rings - P700\nChoose [1-3]:"));
                            switch(b)
                            {
                                case 1:
                                   item = 1;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 2;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 3;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        break;    
                        case 2:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n**********Romance**********\n1. The fault in our hands - P500 \n2. To all the boys I loved before - P450 \n3. My life next door - P600\nChoose [1-3]"));
                            switch(b)
                            {
                                case 1:
                                   item = 4;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 5;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 6;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        break;    
                        case 3:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n**********Fiction**********\n1. Geronimo Stilton - P350 \n2. Diary of a Wimpy Kid - P250 \n3. The Cat in a Hat - P100'\nChoose [1-3]: "));                            
                            switch(b)
                            {
                                case 1:
                                   item = 7;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 8;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 9;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        break;
                        default:
                        JOptionPane.showMessageDialog(null,"Invalid option\n");
                    }
                break;    
                case 2:
                    a = Integer.parseInt(JOptionPane.showInputDialog("\n**********Stationary**********\n1. Art & Crafts  \n2. Coloring Supplies \n3. School and Office Essentials\nChoose [1-3]:"));    
                    switch(a)
                    {
                        case 1:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n**********Art & Crafts**********\n1. Paint - P250 \n2. Ballpen - P80 \n3. Pencil - P10\nChoose [1-3]:"));
                            switch(b)
                            {
                                case 1:
                                   item = 10;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 11;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 12;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        break;    
                        case 2:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n**********Coloring Supplies**********\n1. Crayons - P120 \n2. Oil Pastel - P180 \n3. Coloring Pens - P445\nChoose [1-3]:"));
                            switch(b)
                            {
                                case 1:
                                   item = 13;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 14;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 15;
                                   runningTotal += itemPrice(item);
                                break; 
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        break;    
                        case 3:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n**********School and Office Essentials**********\n1. Sharpener - P25 \n2. Stapler - P250 \n3. Compass - P85\nChoose [1-3]:"));
                            switch(b)
                            {
                                case 1:
                                   item = 16;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 17;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 18;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        break;
                        default:
                        JOptionPane.showMessageDialog(null,"Invalid option\n");
                    }
                break;    
                case 3:
                    a = Integer.parseInt(JOptionPane.showInputDialog("\n*********Workstation**********\n1. Audio/Video Accessories \n2. Home Essentials \n3. Computer Accessories\nChoose [1-3]:"));                 
                    switch(a)
                    {
                        case 1:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\nAudio/Video Accessories\n1. Headphones - P400 \n2. Speakers - P850 \n3. Microphone - P340\nChoose [1-3]:"));
                            switch(b)
                            {
                                case 1:
                                   item = 19;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 20;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 21;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        case 2:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\nHome Essentials\n1. Bond Paper - P60 \n2. Notebooks - P50 \n3. White Boards - P120\nChoose [1-3]"));
                            switch(b)
                            {
                                case 1:
                                   item = 22;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 23;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 24;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                        case 3:
                            b = Integer.parseInt(JOptionPane.showInputDialog("\nComputer Accessories\n1. Keyboard - P3000 \n2. Mouse - P2500 \n3. Printer - P7800\nChoose [1-3]:"));
                            switch(b)
                            {
                                case 1:
                                   item = 25;
                                   runningTotal += itemPrice(item);
                                break;   
                                case 2:
                                   item = 26;
                                   runningTotal += itemPrice(item);
                                break;    
                                case 3: 
                                   item = 27;
                                   runningTotal += itemPrice(item);
                                break;
                                default:
                                JOptionPane.showMessageDialog(null,"Invalid option\n");
                            }
                    }
                break;
                case 4:
                    done(runningTotal);
                    int currency = Integer.parseInt(JOptionPane.showInputDialog("Input currency: "));

                    if (currency >= runningTotal)
                    {
                        double change = currency - runningTotal;
                        JOptionPane.showMessageDialog(null,"Payment Successful\nChange :" + change);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Sorry, your transaction cannot be processed!.");
                    }
                break;    
                default:
                JOptionPane.showMessageDialog(null,"Invalid option");
            }
        }while(ordering);
        
	}
}
