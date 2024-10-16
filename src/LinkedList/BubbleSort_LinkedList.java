package LinkedList;//Bubble Sort (Iterative) Linked List
//Moderate
//Score:
//        80/160
//Average time to solve is 40m
//Problem statement
//Send feedback
//Given a singly linked list of integers, sort it using 'Bubble Sort.'
//
//Note :
//No need to print the list, it has already been taken care. Only return the new head to the list.
//Detailed explanation ( Input/output format, Notes, Images )
//Input format :
//The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
//        Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
//Output format :
//For each test case/query, print the elements of the sorted singly linked list.
//
//        Output for every test case will be printed in a seperate line.
//        Constraints :
//        0 <= M <= 10^3
//Where M is the size of the singly linked list.
//
//Time Limit: 1sec
//Sample Input 1 :
//        10 9 8 7 6 5 4 3 -1
//Sample Output 1 :
//        3 4 5 6 7 8 9 10
//Sample Input 2 :
//        10 -5 9 90 5 67 1 89 -1
//Sample Output 2 :
//        -5 1 5 9 10 67 89 90

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class BubbleSort_LinkedList {
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        // Edge case: If the list is empty or has only one element, return the head
        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped;
        Node<Integer> end = null; // This will be the end marker for each pass

        do {
            swapped = false;
            Node<Integer> current = head;

            // Traverse the list until the 'end' marker
            while (current.next != end) {
                // If the current node's data is greater than the next node's data, swap them
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true; // Mark that a swap happened
                }
                current = current.next; // Move to the next node
            }
            end = current; // Move the end marker one step back
        } while (swapped); // Keep iterating until no swaps are needed

        return head; // Return the sorted list
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Method to take input from the user to build the linked list
    public static Node<Integer> takeInput() throws IOException {
        Node<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while (i < datas.length && !datas[i].equals("-1")) { // -1 indicates the end of the list
            int data = Integer.parseInt(datas[i]);
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode; // Initialize the head
                tail = newNode; // Initialize the tail
            } else {
                tail.next = newNode; // Add the new node at the end of the list
                tail = newNode; // Update the tail
            }
            i += 1;
        }

        return head;
    }

    // Method to print the linked list
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " "); // Print each node's data
            head = head.next; // Move to the next node
        }

        System.out.println();
    }

    // Main method to execute the program
    public static void main(String[] args) throws NumberFormatException, IOException {
        Node<Integer> head = takeInput(); // Take input to form the linked list

        head = bubbleSort(head); // Sort the linked list using bubble sort
        print(head); // Print the sorted linked list
    }
}
