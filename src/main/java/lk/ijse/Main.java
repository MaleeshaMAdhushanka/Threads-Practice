package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main extends Thread {
//    public static void main(String[] args) {
//            Main thread = new Main();
//            thread.start();
//        System.out.println("This code is outside of The Thread");
//    }
//    public void run() {
//        System.out.println("This code is running in Thread");
//
//    }
//}

//  If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:

//public  class Main implements  Runnable {
//    public static void main(String[] args) {
//             Main obj = new Main();
//            Thread thread = new Thread();
//            thread.start();
//
//         System.out.println("This code is outside of the Thread");
//
//    }
//
//    public void  run () {
//
//        System.out.println("This code is running in a Thread");
//    }
//}

//Exmaple
// public  class Main extends Thread{
//    public static int amount = 0;
//
//    public static void main(String[] args) {
//             Main thread =  new Main();
//             thread.start();
//           System.out.println(amount);
//           amount++;
//        System.out.println(amount);
//
//
//    }
//    public void  run(){
//        amount++;
//
//
//    }
//}


public class Main extends Thread{
    public static  int amount = 0;


    public static void main(String[] args) {
              Main thread = new Main();
              thread.start();
              //Wait for the Thread to finish
        while (thread.isAlive()){
            System.out.println("Waiting...");
        }
//        The use of isAlive() ensures that the main method waits for the thread to finish before proceeding.

//        Update amount and print its value
        System.out.println("Main : " + amount);
        amount++;
        System.out.println("Main : " + amount);
    }

    public void run(){
        amount++;

    }
}
