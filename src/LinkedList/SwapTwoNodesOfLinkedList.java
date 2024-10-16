//Swap Two Nodes of Linked List
//Moderate
//Score:
//        80/160
//Average time to solve is 40m
//Problem statement
//Send feedback
//You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions and return the new head to the list.
//
//Note :
//        1. Remember, You need to swap the nodes, not only the data.
//2. Indexing starts from 0.
//        3. No need to print the list, it has already been taken care.
//        Detailed explanation ( Input/output format, Notes, Images )
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first line of each test case or query contains the elements of the singly linked list separated by a single space.
//
//The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.
//Remember/consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
//Output format :
//For each test case/query, print the elements of the updated singly linked list.
//
//        Output for every test case will be printed in a seperate line.
//        Constraints :
//        1 <= t <= 10^2
//        0 <= M <= 10^5
//Where M is the size of the singly linked list.
//        0 <= i < M
//0 <= j < M
//
//Time Limit: 1sec
//Sample Input 1 :
//        1
//        3 4 5 2 6 1 9 -1
//        3 4
//Sample Output 1 :
//        3 4 5 6 2 1 9
//Sample Input 2 :
//        2
//        10 20 30 40 -1
//        1 2
//        70 80 90 25 65 85 90 -1
//        0 6
//Sample Output 2 :
//        10 30 20 40
//        90 80 90 25 65 85 70

package LinkedList;

public class SwapTwoNodesOfLinkedList {
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        //Your code goes here
        if(i == j){
            return head;
        }

        Node<Integer> prevNodeI = null, currNodeI = head;
        Node<Integer> preNodeJ = null, currNodeJ = head;

        for(int index = 0; currNodeI != null && index < i; index++){
            prevNodeI = currNodeI;
            currNodeI = currNodeI.next;
        }

        for(int index = 0; currNodeJ != null && index < j; index++){
            preNodeJ = currNodeJ;
            currNodeJ = currNodeJ.next;
        }

        if(currNodeI == null || currNodeJ == null){
            return head;
        }

        if(prevNodeI != null){
            prevNodeI.next = currNodeJ;
        } else {
            head = currNodeJ;
        }

        if(preNodeJ != null){
            preNodeJ.next =currNodeI;
        } else {
            head = currNodeI;
        }

        Node<Integer> temp = currNodeI.next;
        currNodeI.next = currNodeJ.next;
        currNodeJ.next = temp;

        return head;
    }
}
