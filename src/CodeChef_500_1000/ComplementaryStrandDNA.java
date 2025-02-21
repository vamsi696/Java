//Complementary Strand in a DNA
//You are given the sequence of Nucleotides of one strand of DNA through a string
//        S
//S of length
//        N
//N.
//        S
//S contains the character
//A
//,
//T
//,
//C
//,
//A,T,C, and
//        G
//G only.
//
//Chef knows that:
//
//A
//A is complementary to
//T
//T.
//        T
//T is complementary to
//A
//A.
//        C
//C is complementary to
//G
//G.
//        G
//G is complementary to
//C
//C.
//Using the string
//        S
//S, determine the sequence of the complementary strand of the DNA.
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//First line of each test case contains an integer
//        N
//N - denoting the length of string
//        S
//S.
//Second line contains
//        N
//N characters denoting the string
//        S
//S.
//        Output Format
//For each test case, output the string containing
//N
//N characters - sequence of nucleotides of the complementary strand.
//
//        Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        1
//        ≤
//N
//≤
//        100
//        1≤N≤100
//S
//S contains A, T, C, and G only
//Sample 1:
//Input
//        Output
//4
//        4
//ATCG
//4
//GTCC
//5
//AAAAA
//3
//TAC
//        TAGC
//CAGG
//        TTTTT
//ATG
//Explanation:
//Test case
//        1
//        1: Based on the rules, the complements of A, T, C, and G are T, A, G, and C respectively. Thus, the complementary string of the given string ATCG is TAGC.
//
//Test case
//        2
//        2: Based on the rules, the complements of G, T, and C are C, A, and G respectively. Thus, the complementary string of the given string GTCC is CAGG.
//
//Test case
//        3
//        3: Based on the rules, the complement of A is T. Thus, the complementary string of the given string AAAAA is TTTTT.
//
//Test case
//        4
//        4: Based on the rules, the complements of T, A, and C are A, T, and G respectively. Thus, the complementary string of the given string TAC is ATG.

package CodeChef_500_1000;

import java.util.Scanner;

public class ComplementaryStrandDNA {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0){
            int n = read.nextInt();
            String s = read.next();
            String p = "";

            for (int i = 0; i< n; i++){
                if (s.charAt(i)=='A'){
                    p+='T';
                } else if (s.charAt(i)=='T'){
                    p+='A';
                } else if (s.charAt(i)=='C'){
                    p+='G';
                } else {
                    p+='C';
                }
            }
            System.out.println(p);
        }
    }
}
