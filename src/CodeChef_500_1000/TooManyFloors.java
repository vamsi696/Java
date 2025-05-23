//Too many Floors
//Chef and Chefina are residing in a hotel.
//
//There are
//10
//        10 floors in the hotel and each floor consists of
//10
//        10 rooms.
//
//        Floor
//1
//        1 consists of room numbers
//1
//        1 to
//10
//        10.
//Floor
//2
//        2 consists of room numbers
//11
//        11 to
//20
//        20.
//        …
//        …
//Floor
//        i
//i consists of room numbers
//10
//        ⋅
//        (
//i
//−
//        1
//        )
//        +
//        1
//        10⋅(i−1)+1 to
//10
//        ⋅
//i
//10⋅i.
//You know that Chef's room number is
//X
//X while Chefina's Room number is
//Y
//Y.
//If Chef starts from his room, find the number of floors he needs to travel to reach Chefina's room.
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single line of input, two integers
//X
//,
//Y
//X,Y, the room numbers of Chef and Chefina respectively.
//Output Format
//For each test case, output the number of floors Chef needs to travel to reach Chefina's room.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1
//        ≤
//X
//,
//Y
//≤
//        100
//        1≤X,Y≤100
//X
//≠
//Y
//X=Y
//Sample 1:
//Input
//        Output
//4
//        1 100
//        42 50
//        53 30
//        81 80
//        9
//        0
//        3
//        1
//Explanation:
//Test Case
//1
//        1: Since Room
//1
//        1 is on
//1
//s
//        t
//1
//st
//floor and Room
//100
//        100 is on
//1
//        0
//t
//        h
//10
//th
//floor, Chef needs to climb
//9
//        9 floors to reach Chefina's Room.
//
//Test Case
//2
//        2: Since Room
//42
//        42 is on
//5
//t
//        h
//5
//th
//floor and Room
//50
//        50 is also on
//5
//t
//        h
//5
//th
//floor, Chef does not need to climb any floor.
//
//Test Case
//3
//        3: Since Room
//53
//        53 is on
//6
//t
//        h
//6
//th
//floor and Room
//30
//        30 is on
//3
//r
//        d
//3
//rd
//floor, Chef needs to go down
//3
//        3 floors to reach Chefina's Room.
//
//Test Case
//4
//        4: Since Room
//81
//        81 is on
//9
//t
//        h
//9
//th
//floor and Room
//80
//        80 is on
//8
//t
//        h
//8
//th
//floor, Chef needs to go down
//1
//        1 floors to reach Chefina's Room.

package CodeChef_500_1000;

import java.util.Scanner;

public class TooManyFloors {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            int floorForX = ((x - 1)/10)+1;
            int floorForY = ((y - 1)/10)+1;

            int floordiff = floorForX - floorForY;

            System.out.println(Math.abs(floordiff));
        }
    }
}
