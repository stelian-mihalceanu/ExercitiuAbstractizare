package ro.java.ctrln;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> desire = new ArrayList<String>();
        desire.add("laptop");
        desire.add("webcam");
        User user1 = new User("felix.dan@hotmail.com", "KatPart1", "Yut1234%", "Avenue 1");
        user1.toString();

    }
}
