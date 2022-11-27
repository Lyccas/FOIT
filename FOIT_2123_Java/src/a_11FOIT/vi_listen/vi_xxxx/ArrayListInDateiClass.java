package a_11FOIT.vi_listen.vi_xxxx;

import java.io.*;
import java.util.*;

public class ArrayListInDateiClass {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Willi");
        al.add("Paul");
        al.add("Karl");
        al.add("Heinz");
        listInDatei(al, new File("/list.txt"));
    }

    private static void listInDatei(List list, File datei) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(datei));
            Iterator iter = list.iterator();
            while(iter.hasNext() ) {
                Object o = iter.next();
                printWriter.println(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(printWriter != null) printWriter.close();
        }
    }
}
