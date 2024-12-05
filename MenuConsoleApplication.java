import java.util.*;
import java.math.*;
public class MenuConsoleApplication {
	public static final String RedBG = "\033[41m";
	public static final String Whitetxt = "\033[37m";
	public static final String Reset = "\033[0m";
    static Scanner sc = new Scanner(System.in);
    static int option;
    static double num1;
    static double num2;
    static double radius;
    static double side;
    static double Cm;
    static double result;
    static double result2;
    static boolean exit = false;

    public static void main(String[] args) throws InterruptedException {
        loading();
        Clearscreen();
        StartScreen();
        while (!exit) {
            // Check for valid numeric input
            try {
                option = sc.nextInt();
                if (option > 3|| option < 0) {
                	Clearscreen();
                	Dinosaur();
                }
            } catch (InputMismatchException e) {
                // Handle non-numeric input
                
            }
        }
    }

    public static void StartScreen() throws InterruptedException {
        System.out.println("             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "                                     [1] Start\r\n"
        		+ "                                     [2] About Us\r\n"
        		+ "                                     [3] Exit\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
        

        try {
            option = (int) getUserInput1();
            switch (option) {
                case 1:
                    Start();
                    break;
                case 2:
                    Aboutus();
                    break;
                case 3:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	
        }
    }

    public static void Start() throws InterruptedException {
    	Clearscreen();
    	System.out.println("             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                                   [1] Calculator\r\n"
    			+ "                                   [2] Area and Circumference\r\n"
    			+ "                                   [3] Area and Perimeter\r\n"
    			+ "                                   [4] Conversion\r\n"
    			+ "                                   [5] Back/Return\r\n"
    			+ "                                   [6] Exit\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                                    \r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "");


        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Calculator();
                    break;
                case 2:
                	Clearscreen();
                    AreaAndCircumference();
                    break;
                case 3:
                	Clearscreen();
                    AreaAndPerimeter();
                    break;
                case 4:
                	Clearscreen();
                    Conversion();
                    break;
                case 5:
                	Clearscreen();
                    StartScreen();
                    break;
                case 6:
                	Clearscreen();
                    Exit();
                    break;
                default:
                    Clearscreen();
                    Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void Aboutus() throws InterruptedException {
    	Clearscreen();
    	System.out.println("             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                     \r\n"
    			+ "                          __  __    ___   __  __    ___     ___     ___     ___   \r\n"
    			+ "                         |  \\/  |  | __| |  \\/  |  | _ )   | __|   | _ \\   / __|  \r\n"
    			+ "                         | |\\/| |  | _|  | |\\/| |  | _ \\   | _|    |   /   \\__ \\  \r\n"
    			+ "                         |_|__|_|  |___| |_|__|_|  |___/   |___|   |_|_\\   |___/  \r\n"
    			+ "                         _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+ "                         \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+ "\r\n"
    			+ "                                           -Lasanas\r\n"
    			+ "                                           -Erick\r\n"
    			+ "                                           -Villasis\r\n"
    			+ "                                           -Paragile\r\n"
    			+ "                                           -Althea\r\n"
    			+ "                                           -Convis\r\n"
    			+ "                                           -Guiwanon\r\n"
    			+ "                                           -Roa\r\n"
    			+ "                                           -Roxas\r\n"
    			+ "                                           -Pantanosa\r\n"
    			+ "\r\n"
    			+ "                  _____________________________________________________________________________\r\n"
    			+ "                 |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+ "                 |____________________________________________________________________________|");


        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    StartScreen();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void Calculator() throws InterruptedException {
    	Clearscreen();
        System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "\r\n"
        		+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
        		+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
        		+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
        		+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
        		+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
        		+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' \r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "                                               [1] Addition\r\n"
        		+ "                                               [2] Subtraction\r\n"
        		+ "                                               [3] Multiplication\r\n"
        		+ "                                               [4] Division\r\n"
        		+ "                                               [5] Back/Return\r\n"
        		+ "                                               [6] Exit\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
        
        

        try {
            option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    addition();
                    break;
                case 2:
                	Clearscreen();
                    subtraction();
                    break;
                case 3:
                	Clearscreen();
                    multiplication();
                    break;
                case 4:
                	Clearscreen();
                    division();
                    break;
                case 5:
                	Clearscreen();
                	Start();
                	break;
                case 6:
                	Clearscreen();
                	Exit();
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
           Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }


    public static void addition() throws InterruptedException {
    	System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                + "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                + "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                + "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                + "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                + "\r\n"
                + "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
                + "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
                + "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
                + "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
                + "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
                + "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
        
        // Ask for num1
         try {
             // Try to parse both numbers
            
        	 System.out.print("                                              num1: ");
             num1 = getUserInput();
             // Perform addition
             
         } catch (NumberFormatException e) {
             // If parsing fails, show error and call Dinosaur()
             Dinosaur();
         }// Read num1 input
         try {
             // Try to parse both numbers
            
        	 System.out.print("                                              num2: ");
             num2 = getUserInput();
             // Perform addition
             
         } catch (NumberFormatException e) {
             // If parsing fails, show error and call Dinosaur()
             Dinosaur();
         }
           result = num1+num2;
        
    
         
    	System.out.println("                                             Result:"+result
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                       _____________________________________________________________________________\r\n"
    			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+ "                      |____________________________________________________________________________|");
    	 try {
    		 option = (int) getUserInput1();
             switch (option) {
                 case 1:
                 	Clearscreen();
                     Start();
                     break;
                 case 2:
                     Exit();
                     break;
                 default:
                	 Clearscreen();
                 	Dinosaur();
                     break;
             }
         } catch (InputMismatchException e) {
        	 Clearscreen();
             sc.nextLine(); // Clear the invalid input from the buffer
             Dinosaur();
             
         }
     }
    	
    
   public static void subtraction() throws InterruptedException {
	   System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "\r\n"
   			+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
   			+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
   			+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
   			+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
   			+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
   			+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
	   try {
           // Try to parse both numbers
          
      	 System.out.print("                                             Enter num1: ");
           num1 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }// Read num1 input
       try {
           // Try to parse both numbers
          
      	 System.out.print("                                             Enter num2: ");
           num2 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }
         result = num1-num2;
   	System.out.println("                                             Result:"+result
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "                       _____________________________________________________________________________\r\n"
   			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   			+ "                      |____________________________________________________________________________|");
   	 try {
   		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
    
   public static void multiplication() throws InterruptedException {
	   System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "\r\n"
   			+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
   			+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
   			+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
   			+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
   			+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
   			+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
	   try {
           // Try to parse both numbers
          
      	 System.out.print("                                             Enter num1:");
           num1 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }// Read num1 input
       try {
           // Try to parse both numbers
          
      	 System.out.print("                                             Enter num2: ");
           num2 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }
         result = num1*num2;
   	System.out.println("                                             Result:"+result
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "                       _____________________________________________________________________________\r\n"
   			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   			+ "                      |____________________________________________________________________________|");
   	 try {
   		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
   
   public static void division() throws InterruptedException {
	   System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+ "\r\n"
   			+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
   			+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
   			+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
   			+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
   			+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
   			+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
	   try {
           // Try to parse both numbers
          
      	 System.out.print("                                             Enter num1: ");
           num1 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }// Read num1 input
       try {
           // Try to parse both numbers
          
      	 System.out.print("                                             Enter num2: ");
           num2 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }
   	if(num2==0) {
   		System.out.println("                                             Result: Cannot Divide By 0"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "                       _____________________________________________________________________________\r\n"
   	   			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   	   			+ "                      |____________________________________________________________________________|");
   	}
   	else if(num2>0) {
   		result = num1/num2;
   		System.out.println("                                             Result:"+result
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "\r\n"
   	   			+ "                       _____________________________________________________________________________\r\n"
   	   			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   	   			+ "                      |____________________________________________________________________________|");
   	}
   	 try {
   		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
   
    

    public static void AreaAndCircumference() throws InterruptedException {
    	System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|  \r\n"
    			+ "                                       ___                                _              ___   \r\n"
    			+ "                                      /   \\     o O O  __ _    _ _     __| |     o O O  / __|  \r\n"
    			+ "                                      | - |    o      / _` |  | ' \\   / _` |    o      | (__   \r\n"
    			+ "                                      |_|_|   TS__[O] \\__,_|  |_||_|  \\__,_|   TS__[O]  \\___|  \r\n"
    			+ "                                    _|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"| \r\n"
    			+ "                                    \"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'  \r\n"
    			+ "\r\n" 
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n");
    	try {
    	System.out.print("                                        Enter Radius:"); 
    	radius = getUserInput();
    	}
    	catch(NumberFormatException e) {
    		Dinosaur();
    	}
	       result = Math.PI*radius*2;
	       result2 = Math.PI*radius*radius;	
	    		   System.out.println("\r\n"
    			+ "                                        AREA:"+result2
    			+ "\r\n"
    			+ "                                        Circumference:"+result
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                       _____________________________________________________________________________\r\n"
    			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+ "                      |____________________________________________________________________________|");

        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                	break;
                    
            }
        } catch (InputMismatchException e) {
           Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void AreaAndPerimeter() throws InterruptedException {
        System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|  \r\n"
        		+ "                                    ___                                _               ___  \r\n"
        		+ "                                   /   \\     o O O  __ _    _ _     __| |     o O O   | _ \\ \r\n"
        		+ "                                   | - |    o      / _` |  | ' \\   / _` |    o        |  _/ \r\n"
        		+ "                                   |_|_|   TS__[O] \\__,_|  |_||_|  \\__,_|   TS__[O]  _|_|_  \r\n"
        		+ "                                 _|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_| \"\"\" | \r\n"
        		+ "                                 \"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-' \r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n");
        try {
        System.out.print("                                        Enter Sides:");
        side = getUserInput();
        }
        catch(NumberFormatException e) {
        	Dinosaur();
        }
	       result = side*side;
	       result2 = side*4;	
        		System.out.println("\r\n"
        		+ "\r\n"
        		+ "                                        AREA:"+result
        		+ "\r\n"
        		+ "                                        PERIMETER:"+result2
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "                       _____________________________________________________________________________\r\n"
        		+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
        		+ "                      |____________________________________________________________________________|");

        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                    Clearscreen();
                    Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void Conversion() throws InterruptedException {
    	System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                          ___                                                      _                    \r\n"
    			+ "                         / __|    ___    _ _     __ __    ___      _ _    ___     (_)     ___    _ _    \r\n"
    			+ "                        | (__    / _ \\  | ' \\    \\ V /   / -_)    | '_|  (_-<     | |    / _ \\  | ' \\   \r\n"
    			+ "                         \\___|   \\___/  |_||_|   _\\_/_   \\___|   _|_|_   /__/_   _|_|_   \\___/  |_||_|  \r\n"
    			+ "                       _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+ "                       \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                                               [1] cm-mm\r\n"
    			+ "                                               [2] cm-m\r\n"
    			+ "                                               [3] Back/Return\r\n"
    			+ "                                               [4] Exit\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
    	
    	
    	

        try {
        	option = (int) getUserInput1();
            sc.nextLine();
            switch (option) {
                case 1:
                	Clearscreen();
                    mm();
                    break;
                case 2:
                	Clearscreen();
                    m();
                    break;
                case 3:
                	Clearscreen();
                	StartScreen();
                	break;
                case 4:
                	Clearscreen();
                	Exit();
                	break;
                default:
                	Clearscreen();
                    Dinosaur();
                    break;
                    
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
    public static void m() throws InterruptedException {
    	System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                          ___                                                      _                    \r\n"
    			+ "                         / __|    ___    _ _     __ __    ___      _ _    ___     (_)     ___    _ _    \r\n"
    			+ "                        | (__    / _ \\  | ' \\    \\ V /   / -_)    | '_|  (_-<     | |    / _ \\  | ' \\   \r\n"
    			+ "                         \\___|   \\___/  |_||_|   _\\_/_   \\___|   _|_|_   /__/_   _|_|_   \\___/  |_||_|  \r\n"
    			+ "                       _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+ "                       \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+"\r\n");
	        try {
	        	System.out.print("                                            Enter Cm:\r\n");
	       	 Cm = getUserInput();
	            
	        } catch (InputMismatchException e) {
	           Dinosaur();
	        }
	       result = Cm/100;
    	System.out.println("\r\n"
    			+ "                                            m:\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                       _____________________________________________________________________________\r\n"
    			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+ "                      |____________________________________________________________________________|");
    	try {
    		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	System.out.println(Reset);
                	Clearscreen();
                    StartScreen();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Dinosaur();
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine();
             Dinosaur();
        }
    }
    public static void mm() throws InterruptedException {
    	System.out.println("                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+ "                          ___                                                      _                    \r\n"
    			+ "                         / __|    ___    _ _     __ __    ___      _ _    ___     (_)     ___    _ _    \r\n"
    			+ "                        | (__    / _ \\  | ' \\    \\ V /   / -_)    | '_|  (_-<     | |    / _ \\  | ' \\   \r\n"
    			+ "                         \\___|   \\___/  |_||_|   _\\_/_   \\___|   _|_|_   /__/_   _|_|_   \\___/  |_||_|  \r\n"
    			+ "                       _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+ "                       \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n");
    	try {
    		System.out.print("                                            Enter Cm:\r\n");
    	   	 Cm = getUserInput();
    	}
    	catch(NumberFormatException e) {
    		Dinosaur();
    	}
   	
	       result =  Cm*10;
    	System.out.println("\r\n"
    			+ "                                            mm:\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "                       _____________________________________________________________________________\r\n"
    			+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+ "                      |____________________________________________________________________________|");
    	try {
    		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    StartScreen();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Dinosaur();
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine();
             Dinosaur();
        }
    }

    public static void Exit() throws InterruptedException {
    	Clearscreen();
    	System.out.println("                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                            .++++=.                                                                          \r\n"
    			+ "                                                                           .=@@@@@.                                                                          \r\n"
    			+ "                                                                           .#@@@@%                                                                           \r\n"
    			+ "                                                                             :@@@#  ..:::..                                                                  \r\n"
    			+ "                                                          .=+*##:@@@@@@+.    -@@@* .-@@@@+.           ...                                                    \r\n"
    			+ "                                               ....:#@@+  .@@@@@+@@@@@@@@:   =@@@+.*@@@@.           .:@@@@@:                                                 \r\n"
    			+ "                                            .-%@@@@@@@@@: =@@@@@+::::#@@@%.  *@@@=*@@@@:            -@@@@@*.   :%%#-.                                        \r\n"
    			+ "                        .:.               .-@@@@@@@@@@@@+   =@@@#    :@@@%:  #@@@@@@@@.              .@@@@.    =@@@%.                                        \r\n"
    			+ "                  .. .+@@@%.     ..       -@@@@#.  -@@@@@.  -@@@%.   .%@@@- .%@@@-#@@@@.            .%@@@=    .%@@@:  ...:--:...                             \r\n"
    			+ "                .=%: .%@@@@#...+%@@@%-.  .@@@@:     .*@@@#  :@@@@:   .%@@@-..@@@@-.%@@@#.           -@@@%:   .+@@@*. .#@@@@@@@@@-.                           \r\n"
    			+ "              .-@@@#. =*@@@@++@@@@@@@@%. .@@@@.      :@@@@-..%@@@=    +@@@@@.@@@@: .%@@@%.          =@@@@=.  .@@@@-.+@@@@@@@@@@@@#.                          \r\n"
    			+ "           ..=@@@@@@-   .%@@@%@@%**%@@@%..*@@@@:.  ..:#@@@@@.#@@@=    .@@@@%.@@@@:  :%@@@*.         .%@@@@@@@%@@@#.-@@@@=.   .%@@@#.  .:-.                   \r\n"
    			+ "         .-@@@@@@@#..   .-@@@@-.   .#@@@#..#@@@@@@@@@@*@@@@@.+@@@*    ............  .......          .-@@@@@*%@@@-.#@@@=.     :@@@@: :%@@@%.                 \r\n"
    			+ "        :@@@@@@@@%.       -@@@@-    .@@@@*---%@@@@@@@@+=*=-.                                      .:%+.. .::=@@@#..*@@@*.    .-@@@@. :@@@@@:                 \r\n"
    			+ "         +@@%*@@@@@:       =@@@@:    .%@@@@#  .:+**=.                                            .+@@@@@%+=#@@@@:  :@@@@#:..:*@@@@=..%@@@%:    .-:.          \r\n"
    			+ "         :=.  :@@@@@=.     .*@@@@.    :@@@@@.                                                     .=@@@@@@@@@@@*.   :@@@@@@@@@@@@= -@@@@*.    :@@@@+         \r\n"
    			+ "               .#@@@@*.     .*@@@%.   .:*-..                                                         .:-+%@@#=..     .:#@@@@@@%-..-@@@@+.   .:@@@@#.         \r\n"
    			+ "                .*@@@@%.     .#@@@#.                  .:-==-:.                           ...                              ...    .@@@@+    .=@@@@+.          \r\n"
    			+ "                  -@@@@@..    .%%-.                   .@+.....         ..            ... .+: ....                                .@@@@@:...*@@@@=.           \r\n"
    			+ "                  .:@@@@@=.                           .@+=+=. .*%#. +*#@%    .*. #*.+%@@..#..%+%@- .*%%+.                         .%@@@@@##@@@%:             \r\n"
    			+ "                    .#@@@@=                           .@*.....@-.-@.##.:+    =*..%*:@*=. :@..@*.+@:@:.:%.                          .-#@@*@@@@%..             \r\n"
    			+ "                     .+%=.                            .@=    .@:.-@.#*       :*..%*...:@.:@..%:.+@=@..=@.                             .:%@@@@@+.             \r\n"
    			+ "                      ..                              .@=     :#@*. *+       .+@#%*-%@@-..=..%: :@.:++=%.                               ..=@=.               \r\n"
    			+ "                                                                                                 ..-:-#=                                                     \r\n"
    			+ "                                                                                                  ..::.                                                      \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             \r\n"
    			+ "                                                                                                                                                             ");
    	Thread.sleep(5000);
        System.out.println("                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                            .%@@@@.                                                                                     \r\n"
        		+ "                                            .:::@@-                                                                                     \r\n"
        		+ "                                             ...@@-.                                                                                    \r\n"
        		+ "                            .......::...       .@@-.      ...::....     ....::...       ..::...     ....::...                           \r\n"
        		+ "                           .%@-:%@%%@@@@=.     .@@-.    .=@@@%%@@@+.. ..+@@@%%@@@-   ..#@@%%%@@#.  .:@@@%%@@@*.                         \r\n"
        		+ "                           .%@-*......:%@#.    .@@-.   .%@*......*@%...%@*.....:%@=. .*@#.....*@%..+@%:.....=@@..                       \r\n"
        		+ "                           .%@*..     ..%@=    .@@-.  .=@#..     .#@-.:**.   ...=@@. .:@@#:.  ....:@@..    ..*@#.                       \r\n"
        		+ "                           .%@-.       .*@#.   .@@-.  .+@@@@@@@@@@@@=...*@@@@@@@@@@. ...:*@@@@#:..-@@@@@@@@@@@@%.                       \r\n"
        		+ "                           .%@+.       .#@=.   .@@-.  .=@%.........:..:@@=......+@@...--.....:#@@.:@@:........::.                       \r\n"
        		+ "                           .%@+=..    .#@%..   .@@-.  ..%@*.     .%@=.:@@:   ..++%@. .@@+.. ...%@-.+@%.     .#@#.                       \r\n"
        		+ "                           .%@--@@##%@@@+...#@@@@@@@@@:..+@@@###@@%:...+@@%##@@+:@@@%.:%@@#**#@@#...-@@@###@@@=..                       \r\n"
        		+ "                           .%@-...----:... .::::::::::. ....--=-:.... ...:-=-:....:::....:-==-:... ....:-=--...                         \r\n"
        		+ "                           .%@-.........   ............   ........      ........ ..... .........     .........                          \r\n"
        		+ "                           .%@-.                                                                                                        \r\n"
        		+ "                           .....                                                                                                        \r\n"
        		+ "                                                      .....                                                                             \r\n"
        		+ "                                                     .*%@@:                                                                             \r\n"
        		+ "                       .         .    .  . ...    .  :@@@@-.       ...                                 .     .                          \r\n"
        		+ "                      .@@@@@@@@@@@-.:#@@@@@@@@+.  *@@@@@@@@@@@#. .:%@@@@@@@%-..       .*@@@#.     =@@@@..:#@@@@@@@@*..                  \r\n"
        		+ "                      -@@@@@@@@@@@-+@@@@@%@@@@@@-.*@@@@@@@@@@@#..#@@@@@%@@@@@%.       .*@@@#.     =@@@@..@@@@%##@@@@@:                  \r\n"
        		+ "                      -@@@@:.......@@@@:....*@@@%....:@@@@-.....*@@@+.....=@@@#.      .*@@@#.     =@@@@..@@@@%=..+***-                  \r\n"
        		+ "                      -@@@@:.    ...-#@@@@@@@@@@@. ..:@@@@:.   .@@@@@@@@@@@@@@%.      .*@@@#.    .+@@@@...*@@@@@@@%+..                  \r\n"
        		+ "                      -@@@@:.    ..@@@@*:...*@@@@.  .:@@@@:    .%@@@=...........      .*@@@%.   ..%@@@@.......=%@@@@@+.                 \r\n"
        		+ "                      -@@@@:.    .-@@@@*==#@@=#@@**..:@@@@=-==+:.@@@@#-::-%@@@@.       -@@@@@+-=#@-#@@@.#@@@@-...*@@@%..                \r\n"
        		+ "                      -@@@@:.    ..%@@@@@@@@+.@@@@@..:@@@@@@@@@-..#@@@@@@@@@@*..       .=@@@@@@@@==@@@@..#@@@@@@@@@@@=.                 \r\n"
        		+ "                      .=++=..     ..:=*##+-...:=++=...-#%##***+:....-+*##*=:...         ..-+##+-..:+++=....-=*###*=:..                  \r\n"
        		+ "                      ......        ........ .......  ..........   ..........           ......... ......  ...........                   \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                     ...          ..                                                    \r\n"
        		+ "                                         .....         ...         .....         ....          ....                                     \r\n"
        		+ "                                         .:=...       ..+.         ..=-.         .:=..         .+...                                    \r\n"
        		+ "                                     .....++-..........-+=..........:++...........++:..........=+=.....                                 \r\n"
        		+ "                                    ..=+++++++++-..-+++++++++-..:=++++++++=...=+++++++++:..-+++++++++-..                                \r\n"
        		+ "                                     ...-+++++........+++++:.......=++++-.......-++++=........+++++:....                                \r\n"
        		+ "                                       .=+=-++:..  ..-+=:=+-...  .:++-=+=.    ..=+=-++..    .-+=:=+-..                                  \r\n"
        		+ "                                       -:.....=..  ..-.....-...  .-.....:-    .-:.....=.    .-.....-..                                  \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        \r\n"
        		+ "                                                                                                                                        ");
        exit = true;
        System.exit(0);
    }

    public static void Clearscreen() {
        for (int i = 0; i < 40; i++) {
            System.out.println("\n");
        }
    }
    public static void Dinosaur() throws InterruptedException {
    	Clearscreen();
    	System.out.println(Whitetxt+RedBG+"                                           _______________________                                                                                      \r\n"
    			+Whitetxt+RedBG+ "                                         __|  __                 |__                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+ "                                         |   |0_|                  |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+ "                                         |                         |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+ "                                         |                         |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+ "                                         |                         |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+ "                                         |         ________________|                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+ "                                         |         |                                                                                                                                                                                                                       \r\n"
    			+Whitetxt+RedBG+ "               ___                       |         |________                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "               | |                     __|      ___________|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "               | |                  ___|        |                                                                                                                                                                                                                       \r\n"
    			+Whitetxt+RedBG+ "               | |___           ____|           |_______                                                                                                                                                                              \r\n"
    			+Whitetxt+RedBG+ "               |    |__       __|                 ___  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "               |      |_______|                   | |  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "               |                                  | |__|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "               |                                  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "               |                                  |                                                                                                                                                                                                                                                                  \r\n"
    			+Whitetxt+RedBG+ "               |__                              __|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                 |__                            |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                   |__                       ___|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                     |__                   __|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                       |__       _____    |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                         |     __|   |__  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                         |  ___|       |  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                         | |           |  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                         | |__         |  |__                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+ "                         |____|        |_____|                                                                                                                                                                            \r\n");
    	System.out.println(Reset+"                  _____________________________________________________________________________\r\n"
    			+ "                 |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+ "                 |____________________________________________________________________________|");
    	try {
    		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    StartScreen();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Dinosaur();
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine();
             Dinosaur();
        }
    }
    public static void loading() throws InterruptedException {
    	String[] loading = {"\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%########%######%#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "","\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%########%######%#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "","\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "","\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##**###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********###*******#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********#**********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******#%#*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "","\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*******#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%********##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****##**###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%#*********###*******#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********#**********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******#%#*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "","\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****##*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%********#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*******####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*******#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%********##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****##**###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%#*********###*******#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********#**********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******#%#*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ ""}; 
    	for (int i = 0; i<loading.length;i++) {
    		Clearscreen();
    		System.out.println(loading[i]);
    		Thread.sleep(1000);
    	}
    	System.out.println("......................................................................................................................................\r\n"
    			+ "................................................:=*******+-:.............:=*******+-:............................................ ....\r\n"
    			+ "...........................................:+**+===*%@@%#*+***=:.....-**++=+*%@@%#++****-:....................................... ....\r\n"
    			+ ".......................................:=**=+#@@%*+======+#%@@%#*-:-***%@@#*======+*#@@%*+**-.................................... ....\r\n"
    			+ "....................................-+**=#@@*+==----::::*----=#@@#**@@%*==-*=-:::::::--=*@@%***=:.....................................\r\n"
    			+ "............::...................=***+%@@+===--::.......=#=:::-*@@@@@%*+=-**+::.........::-=#@@%**+:...................:..............\r\n"
    			+ "............-**=............:+***+*@@@+===-::...........=@##***+@%##@@%%#*+@#--.............:-=%@@%***+=............:+**::............\r\n"
    			+ "............:@@#************+-+@@@%+===-::...............:%@@@@@+====%@@@@@==-:................:-=%@@@#+**************@@#-:...........\r\n"
    			+ "..............*@@@@@%%%@@@@@@%*====--::...................::-=----:..::-=----:....................:--=*%@@@@@@%%%@@@@@%+=-:...........\r\n"
    			+ "...............:-============---:::...................................................................::-----==========--:............\r\n"
    			+ "............:.....::::::::::................................................................................::::::::::-...............\r\n"
    			+ "...........=*-:............................:@%...............+%@@@*:.................................................=*-:.............\r\n"
    			+ "...........-@*=-.......:-+*-.......+........%@--:... ......*@::-----:................................................*@#-:............\r\n"
    			+ "............@@+=:..+%-::@@--:....*@%::......@*--:.........*@#--::...................................................:#@*+-:...........\r\n"
    			+ "............@@*+--%.:::@@==-:..:@*@#=-:....@+--:.........:@@-=-.....................................................:@@*+-............\r\n"
    			+ "...........:@@*+:@+:::@@*=-:..**:@@#=-...:@-:-::#%%@@-...%@+=-:...+@@@@@:...-%%%@@*:...+@@#.:%@@%.=@@@*:....=%%@@#:..%@*+-............\r\n"
    			+ "...........+@@++:*#-::@@*=-.:@-:-@@+=:..+%::-:#@:::@@=-:-@@==-..+@:::----:=@=:::-@@#:*:.@@##-:@@%*--@@+-:.=@-::*@#-::+@#+-............\r\n"
    			+ "..........=#@*+=:.::::@@*=:+%.::-@@==:-%-::::%@:=#%+-=-:#@+=-:.#@--::..::*@#--::.@@%=-:+@@+=-*@%=+-#@#==:*@+-+@*-=-:.:@@+=:...........\r\n"
    			+ ".........-*@%+=-......@@*=%=:::::@@=-%*::::.%@%*=--:::.-@@==-.#@%--:.....@@-=-...@@+=-.%@==--@@==-+@@==-=@@*+--:-::...=@%+-:..........\r\n"
    			+ "........=*@@==-:......%@@%=-::..:@@*%--::..:@@#+=::#=..#@#=-*:%@%=-:..-..@@*=-..#@===:+@#==:+@*==:%@===:#@%==-:+*......+@#+-..........\r\n"
    			+ ".......+*@%==-:.......+@+==-:...-@@+=-::....@@@@@%-:::.@@%@+::#@@@%@%::::*@@#=+@=:--::@@==-:@@==-.@@%%-:+@@@@@+:::......+@#+-.........\r\n"
    			+ "......**@%==-:.........:--:.....:.---:.......:===--::...:==-::.:-==--:::..:-==-::::....:--:..:--:..:==-:::-===--:........=@%*-:.......\r\n"
    			+ "....:*#@%+=-:......................:..........::::.......::......::::.......::::....................::.....:::............=@@#=:......\r\n"
    			+ "...:*%@#+=-:...............................................................................................................-@@#=:.....\r\n"
    			+ "...=%@*+=-:...................................:-=+**************++**************+==-:.......................................:@@*=:....\r\n"
    			+ "...*@@%%#*+:............................:=+***==+*#%%@@@@@@@@@@@%%%@@@@@@@@@@@%%#**+****=-............................:=+***+*@%+-:...\r\n"
    			+ "..=%@%%@%%#**-:.....................:+***+*%@@@%#++=========-##@@@@@%*+=====-===++#@@@@%#***+-.......................**=*%%%%#@@*=:...\r\n"
    			+ "..+@@%*++=+@@*-:.................=***=%@@@#+====----:::::.:.:.@++**#@*=-:::::::::::---=+%@@@%***+:..................:*@@+====%@@*+-...\r\n"
    			+ "..#@##+=-:::#@=-............:+***-+@@@#====--::..............*::--::-=-:...............::--=#@@@****+:..............:@===--:+##@#+-...\r\n"
    			+ "..:@@%##*+-:::::......:=****+-*@@@*====--::................................................::--=#@@@******=::........::-+****#@@+=-...\r\n"
    			+ "...:=%@@%**+********++===#@@@#+===--:::........................................................:::--+%@@@*++++*******+++=+%@@%++=-:...\r\n"
    			+ ".....:--=*#%@@@@@@@@@@%#*===----::..................................................................::---=*#%@@@@@@@@@@%#*====--:.....\r\n"
    			+ "........:::------=-=------:::............................................................................:::------====-----:::........\r\n"
    			+ "................:::::.............................................................................................::::................\r\n"
    			+ "......................................................................................................................................");
    	Thread.sleep(3000);
    }
    public static double getUserInput() throws InterruptedException {
        double value = 0;
        boolean validInput = false;
        
        while (!validInput) {
            String input = sc.nextLine();  // Read the entire line as a string
            
            if (input.isEmpty()) {  // Check if the input is empty
                Dinosaur();
                break; // Skip the rest of the loop and prompt again
            }
            
            try {
                value = Double.parseDouble(input);  // Try to parse the input as a number
                validInput = true;  // If successful, mark it as valid input
            } catch (NumberFormatException e) {
                Dinosaur();
            }
        }
        return value;
    }
    public static double getUserInput1() throws InterruptedException {
        int value = 0;
        boolean validInput = false;
        
        while (!validInput) {
        	
        	String input = sc.nextLine();  // Read the entire line as a string
            
            if (input.isEmpty()) {  // Check if the input is empty
                Dinosaur();
                break; // Skip the rest of the loop and prompt again
            }
            
            try {
                value = Integer.parseInt(input);  // Try to parse the input as a number
                validInput = true;  // If successful, mark it as valid input
            } catch (NumberFormatException e) {
                Dinosaur();
            }
        }
        return value;
    }
}
