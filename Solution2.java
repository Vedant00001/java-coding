package Experiment5;
import java.util.Scanner;

class Player {
    public void get(String n, int a) {
        System.out.println("Name " + n);
        System.out.println("Age " + a);
    }
}

class Cricket_Player extends Player {
    String game = "cricket";
    int salary = 10000;
    public void print(){
        System.out.println("your game is "+game);
        System.out.println("your salary is "+salary);
    }
}

class Football_Player extends Player {
    String game = "football";
    int salary = 200000;
    public void print(){
        System.out.println("your game is "+game);
        System.out.println("your salary is "+salary);
    }
}

class Hockey_Player extends Player {
    String game = "hockey";
    int salary = 30000;
    public void print(){
        System.out.println("your game is "+game);
        System.out.println("your salary is "+salary);
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pradumb Dhyani \n Sapid=500122361");
        System.out.println("enter 1 if you are a cricket player, 2 if football player, or 3 if hockey player");
        int ch = sc.nextInt();
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        sc.close();

        Player p=new Player();
        p.get(name, age);
        if (ch == 1) {
            Cricket_Player c = new Cricket_Player();
            c.print();
        } else if (ch == 2) {
            Football_Player f = new Football_Player();
            f.print();
        } else if (ch == 3) {
            Hockey_Player h = new Hockey_Player();
            h.print();
        }
    }
}
