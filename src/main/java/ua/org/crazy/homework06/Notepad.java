package ua.org.crazy.homework06;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Notepad {
    private static Scanner scanner = new Scanner(System.in);

    public Notepad() {
    }

    static void run(){
        Record.fillMap();
        Record.print();
    }

    private static class Record {

        private static HashMap<Date, HashMap<Integer, Record>> notepads = new HashMap<>();

        private String name;
        private String description;

        Record(String name, String description) {
            this.name = name;
            this.description = description;
        }

        static void print() {
            for (Entry<Date, HashMap<Integer, Record>> el: notepads.entrySet()) {
                System.out.println("Date: " + el.getKey());
                for (Entry<Integer, Record> innerEl: el.getValue().entrySet()) {
                    System.out.println("id = " + innerEl.getKey() + ", Record: " + innerEl.getValue().toString());
                }
            }
        }

        static void fillMap() {
            Date currentDate = new Date();
            HashMap<Integer,Record> innerMap = fillInnerMap();
            notepads.put(currentDate, innerMap);
        }

        private static HashMap<Integer, Record> fillInnerMap() {
            HashMap<Integer, Record> innerMap = new HashMap<>();
            int numberOfRecords = getNumberOfRecords();
            for (int i = 0; i < numberOfRecords; i++) {
                innerMap.put(i, new Record(getNameFromConsole(), getDescriptionFromConsole()));
            }
            return innerMap;
        }

        private static String getDescriptionFromConsole() {
            System.out.println("Input description record: ");
            return scanner.next();
        }

        private static String getNameFromConsole() {
            System.out.println("Input name record: ");
            return scanner.next();
        }

        private static int getNumberOfRecords() {
            System.out.println("Input number of records: ");
            return scanner.nextInt();
        }

        @Override
        public String toString() {
            return "[name= " + name + ", description= " + description + "]";
        }
    }
}
