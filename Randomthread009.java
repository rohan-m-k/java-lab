import java.util.Random;

class SquareThread extends Thread {
    int num;

    SquareThread(int x) {
        num = x;
    }

    public void run() {
        int square = num * num;
        try {
            sleep(1000);
            System.out.println("Square is " + square);
        } catch (Exception e) {
            
        }
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int n) {
        num = n;
    }

    public void run() {
        int cube = num * num * num;
        try {
            sleep(2000);
            System.out.println("Cube: " + cube);
        } catch (Exception e) {
         
        }
    }
}

public class Randomthread009 {
    public static void main(String[] args) {
        Random R1 = new Random();
        int x = R1.nextInt(100); 
        System.out.println("Random number is " + x);
        SquareThread squareThread = new SquareThread(x);
        CubeThread cubeThread = new CubeThread(x);
        squareThread.start();
        cubeThread.start();
    }
}
