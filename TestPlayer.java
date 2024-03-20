class player {
    String name;
    int age;
    void set(String n, int a) {
        name = n;
        age = a;
    }
}

class Cricket_Player extends player {
    String Gametype = "Cricket";
    public Cricket_Player(String n, int a) {
        set(n, a);
    }

    public void getData() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Age: " + age);
        System.out.println("Player Game Type: " + Gametype);
        System.out.println();
    }
}

class Football_Player extends player {
    String Gametype = "Football";
    public Football_Player(String n, int a) {
        set(n, a);
    }

    public void getData() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Age: " + age);
        System.out.println("Player Game Type: " + Gametype);
        System.out.println();
    }
}

class Hockey_Player extends player {
    String Gametype = "Hockey";
    public Hockey_Player(String n, int a) {
        set(n, a);
    }

    public void getData() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Age: " + age);
        System.out.println("Player Game Type: " + Gametype);
        System.out.println();
    }
}

class TestPlayer {
    public static void main(String[] args) {
        Football_Player f1 = new Football_Player("Alpha", 18);
        Cricket_Player c1 = new Cricket_Player("Tushar", 22);
        Hockey_Player h1 = new Hockey_Player("Sam", 21);
        f1.getData();
        c1.getData();
        h1.getData();

        System.out.println("Vedant Solanki\nSapID: 500121550\nRoll. No. : R271223004");
    }
}
