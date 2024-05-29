package com.demo.nightcare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author virginia
 */
public class DataHandler {
    public static List<Child> children = new ArrayList<>();
    
    public DataHandler() {
        
    }
    
    public void loadData() {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("children.txt")));
            while(scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                Scanner innerScanner = new Scanner(inputLine);
                innerScanner.useDelimiter(",");
                String id = innerScanner.next();
                String name = innerScanner.next();
                int age = innerScanner.nextInt();
                Child child = new Child(id,name,age);
                
                children.add(child);
                
                innerScanner.close();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }  
    
}
