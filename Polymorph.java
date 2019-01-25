import java.util.Scanner;

class Polymorph {
   public static void main(String argv[]) {

   int choice;
   Scanner keyboard = new Scanner(System.in);
   // create some shape instances
   Shape shapeO[] = new Shape[2];
   shapeO[0] = new Rectangle(10, 20, 5, 6);
   shapeO[1] = new Circle(15, 25, 8);

   while(true){
      System.out.println("==Select shape==");
      System.out.println("1.rectangle");
      System.out.println("2.circle");
      System.out.println("3.Exit");
      choice = keyboard.nextInt();

      if(choice == 1){
         shapeO[0].draw();
      }else if(choice ==2){
         shapeO[1].draw();
      }else if(choice == 3){
         System.exit(0);
      }else{
         System.out.println("Please type number 1 or 2.");
      }
   }
 }
}
