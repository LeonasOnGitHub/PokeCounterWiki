package gui;

import javax.swing.*;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

public class GUI {

    private static final String FILENAME = "C:\\Users\\adobe\\Documents\\GitHub\\SpellTimer\\drawable\\";
    private static HashMap<String, String[]> PokeToElement = new HashMap<>();
    private static GridLayout layout = new GridLayout(6, 3);
    private static String[] elements;
    private static JTextField jSearchBar = new JTextField();
    public static JButton jSearch = new JButton("Search");

    public static void main(String args[]) {
        JFrame frame = new JFrame("Pokemon Counter Wiki GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 650);
        frame.setLayout(layout);

        frame.add(jSearchBar);
        frame.add(jSearch);


    }




}
