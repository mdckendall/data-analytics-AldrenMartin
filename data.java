import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class data {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    arrayList.add(fileScanner.nextLine());
		Scanner in = new Scanner(System.in);


        //do{
      while (true){
        System.out.println("Press 1 to learn about salary.");
        System.out.println("Press 2 to learn about the job.");
        System.out.println("Press 3 to learn about demand.");
        System.out.println("Press 4 to view current students.");
        System.out.println("Press 5 to quit.");
        int input = in.nextInt();

   switch(input){
     case 1:
            System.out.println("$98,345 average salary in South Florida!");
        break;

       case 2:
            System.out.println("US News - 100 Best Jobs!");
        break;

          case 3:
            System.out.println("Top 10 Forbes In-Demand Jobs!");
        break;
        
       case 4:
          System.out.println("Current Students:");
       //
    // for (String AL : arrayList);
    //    System.out.println(AL);
    //   }

       //int size = arrayList.size();
      // arrayList.add(fileScanner.nextLine());
     //  for (int i = 0; i <size; i++){
         //System.out.println(arrayList.get(i).toString());

       //}
        //for (String arrayLis : arrayList){ 
        //  arrayList.add(fileScanner.nextLine());
      //  System.out.println(arrayLis);
       // }
       
       while(fileScanner.hasNextLine()){ 
        arrayList.add(fileScanner.next());
      }
      fileScanner.close();
        System.out.println(arrayList); 


       
        break;
        
         
        case 5:
            System.exit(0);
        }
    //catch (FileNotFoundException f){
     // f.printStackTrace();
   // }
         //while (true);
      
      }
  }
}