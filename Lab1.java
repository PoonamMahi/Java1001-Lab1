/**Name : Poonam mahi
 Student number: A00218307
 Program name: JAV-1001 App development for Android
 */

import java.util.Scanner; // Import the Scanner class

public class Lab1
{
	
  public static void main(String[] args){
	  String[] unitsArr = {"km", "mi", "cm", "in","kg","lb"};
	  String[] optionsArr = {"KM To MI","MI to KM","CM to IN","IN to CM","KG to LB","LB to KG"};
	  
	  Scanner inputObj = new Scanner(System.in);                  // Create a Scanner object
	  System.out.println("1."+optionsArr[0] + "\n"
    		+ "2."+ optionsArr[1] + "\n"
    		+ "3."+ optionsArr[2] + "\n"
    		+ "4."+ optionsArr[3] + "\n" 
    		+ "5."+ optionsArr[4] + "\n"
    		+ "6."+ optionsArr[5] + "\n"
    		+ "Select one of the following operation:\n");
	  
	  int operationInput = inputObj.nextInt();                    // Read user operation input
	  System.out.println("User selected operation is: " + optionsArr[operationInput-1]);  // Outputs User chosen operation
	  System.out.println("Enter the value you want to convert:"); 
	  double userInput= inputObj.nextDouble();                    //read user value input
	  System.out.println("User entered value is:"+ userInput + unitsArr[operationInput-1]);
	  inputObj.close();                                           //Scanner is always closed, guaranteeing proper resource cleanup
	  
	  double result = 0.0;                                        //declared result variable
	  String resultedUnit="";
	  switch(operationInput) {
	  case 1: 
		  result= userInput * 0.621371; //km to mi
		  resultedUnit="mi";
		  break;
	  case 2:
		  result= userInput * 1.60934; //mi to km
		  resultedUnit="km";
		  break;
	  case 3:
		  result= userInput * 0.393701; //cm to inch
		  resultedUnit="inch";
		  break;
	  case 4:
		  result= userInput * 2.54; //inch to cm
		  resultedUnit="cm";
		  break;
	  case 5:
		  result= userInput * 2.20462; //kg to lb
		  resultedUnit="lb";
		  break;
	  case 6:
		  result= userInput * 0.453592; //lb to kg
		  resultedUnit="kg";
		  break;
	  default:
		  System.out.println(" To select a conversion operation, enter an integer number between 1 and 6.");
	
	  }
	  System.out.println(userInput + " " + unitsArr[operationInput-1]+ " is equals to " + result + " "+ resultedUnit);
    }
}  