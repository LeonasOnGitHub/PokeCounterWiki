package gui;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.HashMap;

public class GUI {

    private static final String FILENAME = "C:\\Users\\adobe\\Documents\\GitHub\\SpellTimer\\drawable\\";
    private static HashMap<String, String[]> PokeToElement = new HashMap<>();
    private static GridLayout layout = new GridLayout(6, 3);
    private static String[] elements;
    private static JTextField jSearchBar = new JTextField();
    public static JButton jSearch = new JButton("Search");

    public static void main(String args[]) throws IOException {
        JFrame frame = new JFrame("Pokemon Counter Wiki GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 650);
        frame.setLayout(layout);

        frame.add(jSearchBar);
        frame.add(jSearch);

        GUI gui = new GUI();
        gui.restoreFromFile("Elements.txt");
    }

    public void restoreFromFile(String filename) throws IOException {

        InputStream in = new FileInputStream(filename);
        DataInputStream din = new DataInputStream(in);
        for (int i = 0; i < 18; i++) {
            elements[i]= din.readLine();
        }

    }


}
