package LinkedList;
//kReverse
//        Hard
//Score:
//        120/240
//Average time to solve is 60m
//Problem statement
//Send feedback
//Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
//
// 'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
//
//Example :
//Given this linked list: 1 -> 2 -> 3 -> 4 -> 5
//
//        For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5
//
//        For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4
//Note :
//No need to print the list, it has already been taken care. Only return the new head to the list.
//Detailed explanation ( Input/output format, Notes, Images )
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first line of each test case or query contains the elements of the singly linked list separated by a single space.
//
//The second line of input contains a single integer depicting the value of 'k'.
//Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
//Output format :
//For each test case/query, print the elements of the updated singly linked list.
//
//        Output for every test case will be printed in a separate line.
//        Constraints :
//        1 <= t <= 10^2
//        0 <= M <= 10^5
//Where M is the size of the singly linked list.
//        0 <= k <= M
//
//Time Limit:  1sec
//Sample Input 1 :
//        1
//        1 2 3 4 5 6 7 8 9 10 -1
//        4
//
//
//Sample Output 1 :
//        4 3 2 1 8 7 6 5 10 9
//Sample Input 2 :
//        2
//        1 2 3 4 5 -1
//        0
//        10 20 30 40 -1
//        4
//Sample Output 2 :
//        1 2 3 4 5
//        40 30 20 10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Node class for the linked list
class node<T> {
    T data;
    Node<T> next;

    public node(T data) {
        this.data = data;
    }
}

public class KReverse {
    // Method to reverse every 'k' nodes in the linked list
    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> prev = null;
        Node<Integer> next = null;
        int count = 0;

        // Reverse first 'k' nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Recur for the remaining list
        if (next != null) {
            head.next = kReverse(next, k);
        }

        return prev; // New head of the reversed list
    }
}

class Runner {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Method to take input for the linked list
    public static Node<Integer> takeInput() throws IOException {
        Node<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while (i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            i++;
        }

        return head;
    }

    // Method to print the linked list
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim()); // Read number of test cases

        while (t > 0) {
            Node<Integer> head = takeInput(); // Take input for the linked list
            int k = Integer.parseInt(br.readLine().trim()); // Read value of k

            Node<Integer> newHead = KReverse.kReverse(head, k); // Call kReverse method
            print(newHead); // Print the reversed linked list

            t--; // Decrement the number of test cases
        }
    }
}
