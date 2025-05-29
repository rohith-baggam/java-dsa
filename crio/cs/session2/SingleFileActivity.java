package crio.cs.session2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleFileActivity {
    static String[][] hotel = new String[10][26]; // 10 floors, 26 rooms A-Z
    static Map<String, String> bookings = new HashMap<>(); // room -> customer
    static int totalCoins = 0;

    // Convert room like 1B -> hotel[1][1]
    private static int getRoomIndex(char roomChar) {
        return roomChar - 'A';
    }

    // Print all hotel rooms
    public static void printAllRooms() {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.print(i + "" + (char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    // Book a room
    public static void bookRoom(String room, String customerName) {
        bookings.put(room, customerName);
        totalCoins++;
        System.out.println("Room " + room + " booked for " + customerName);
    }

    // Checkout a room by room number
    public static void checkoutByRoom(String room) {
        if (bookings.containsKey(room)) {
            System.out.println(bookings.get(room) + " checked out from " + room);
            bookings.remove(room);
        } else {
            System.out.println("Room " + room + " is not booked.");
        }
    }

    // Checkout by customer name
    public static void checkoutByCustomerName(String customerName) {
        String roomToRemove = null;
        for (Map.Entry<String, String> entry : bookings.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(customerName)) {
                roomToRemove = entry.getKey();
                break;
            }
        }
        if (roomToRemove != null) {
            bookings.remove(roomToRemove);
            System.out.println(customerName + " checked out from " + roomToRemove);
        } else {
            System.out.println("No booking found for " + customerName);
        }
    }

    // Get total coins collected
    public static int getTotalCoins() {
        return totalCoins;
    }

    // Get total active bookings
    public static int getActiveBookings() {
        return bookings.size();
    }

    // Print all current bookings
    public static void printBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No current bookings.");
            return;
        }
        for (Map.Entry<String, String> entry : bookings.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    // Get room by customer name
    public static String getRoomByCustomerName(String customerName) {
        for (Map.Entry<String, String> entry : bookings.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(customerName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Get customer by room
    public static String getCustomerByRoom(String room) {
        return bookings.getOrDefault(room, null);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample operations for testing
        bookRoom("1B", "Ram");
        bookRoom("2A", "Shyam");
        bookRoom("3D", "Kavita");
        bookRoom("4A", "Preeti");

        System.out.println("\nAll Rooms:");
        printAllRooms();

        System.out.println("\nCurrent Bookings:");
        printBookings();

        System.out.println("\nTotal coins collected: " + getTotalCoins());
        System.out.println("Total active bookings: " + getActiveBookings());

        System.out.println("\nCheckout by customer name: Preeti");
        checkoutByCustomerName("Preeti");

        System.out.println("\nCurrent Bookings after checkout:");
        printBookings();

        System.out.println("\nGet room by customer name 'Ram': " + getRoomByCustomerName("Ram"));
        System.out.println("Get customer by room '3D': " + getCustomerByRoom("3D"));
    }

}
