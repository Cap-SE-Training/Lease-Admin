package com.capsetrack.leaseadmin;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public static void save(String path, ArrayList objects) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(objects);
        oos.close();
    }

    public static ArrayList load(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList objects = (ArrayList) ois.readObject();
        ois.close();
        return objects;
    }
}
