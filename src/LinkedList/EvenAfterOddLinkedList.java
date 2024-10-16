//Even after Odd Linked List
//        Moderate
//Score:
//        80/160
//Average time to solve is 40m
//Problem statement
//Send feedback
//For a given singly linked list of integers, arrange the nodes such that all the even number nodes are placed after the all odd number nodes. The relative order of the odd and even terms should remain unchanged.
//
//Note :
//        1. No need to print the linked list, it has already been taken care. Only return the new head to the list.
//        2. Don't create a new linked list.
//        3.  Just change the data, instead rearrange the provided list.
//Detailed explanation ( Input/output format, Notes, Images )
//Input format:
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first line of each test case or query contains the elements of the singly linked list separated by a single space.
//        Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
//Output format:
//For each test case/query, print the elements of the updated singly linked list.
//
//        Output for every test case will be printed in a seperate line.
//        Constraints :
//        1 <= t <= 10^2
//        0 <= M <= 10^5
//Where M is the size of the singly linked list.
//
//Time Limit: 1sec
//Sample Input 1 :
//        1
//        1 4 5 2 -1
//Sample Output 1 :
//        1 5 4 2
//Sample Input 2 :
//        2
//        1 11 3 6 8 0 9 -1
//        10 20 30 40 -1
//Sample Output 2 :
//        1 11 3 9 6 8 0
//        10 20 30 40

package LinkedList;

public class EvenAfterOddLinkedList {
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null) return head;

        Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;
        Node<Integer> current = head;

        while(current != null){
            if(current.data % 2 != 0){
                if (oddHead == null){
                    oddHead = oddTail = current;
                } else {
                    oddTail = oddTail.next = current;
                }
            } else {
                if(evenHead == null){
                    evenHead = evenTail = current;
                } else {
                    evenTail = evenTail.next = current;
                }
            }
            current = current.next;
        }
        if (oddTail != null) oddTail.next = evenHead;
        if(evenTail != null) evenTail.next = null;

        return oddHead != null ? oddHead : evenHead;
    }
}
