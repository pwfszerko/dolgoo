package models;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandler {
    
    public static ArrayList<Employee> readFile() {
        File file = new File('adat.txt');
        Scanner sc = new Scanner(file, Charset.forName("utf-8"))
        while(sc.hasNext(null))
    }
}
