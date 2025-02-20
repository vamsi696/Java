//Mario and Bullet
//Mario's bullet moves at
//X
//X pixels per frame. He wishes to shoot a goomba standing
//        Y
//Y pixels away from him. The goomba does not move.
//
//Find the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least
//Z
//Z seconds from now.
//
//Input Format
//The first line of input will contain an integer
//        T
//T, the number of test cases. Then the test cases follow.
//Each test case consists of a single line of input, containing three space-separated integers
//X
//,
//Y
//,
//X,Y, and
//        Z
//Z.
//        Output Format
//For each test case, output in a single line the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least
//Z
//Z seconds from now.
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        1
//        ≤
//X
//,
//Y
//,
//Z
//≤
//        100
//        1≤X,Y,Z≤100
//X
//X divides
//Y
//        Y
//Sample 1:
//Input
//        Output
//3
//        3 3 5
//        2 4 1
//        3 12 8
//        4
//        0
//        4
//Explanation:
//Test case
//        1
//        1: The speed of the bullet is
//3
//        3 pixels per frame and the goomba is
//3
//        3 pixels away from Mario. Thus, it would take
//1
//        1 second for the bullet to reach the goomba. Mario wants the bullet to reach goomba after at least
//5
//        5 seconds. So, he should fire the bullet after
//4
//        4 seconds.
//
//        Test case
//        2
//        2: The speed of the bullet is
//2
//        2 pixels per frame and the goomba is
//4
//        4 pixels away from Mario. Thus, it would take
//2
//        2 seconds for the bullet to reach the goomba. Mario wants the bullet to reach the goomba after at least
//1
//        1 second. So, he should fire the bullet after
//0
//        0 seconds. Note that, this is the minimum time after which he can shoot a bullet.
//
//        Test case
//        3
//        3: The speed of the bullet is
//3
//        3 pixels per frame and the goomba is
//12
//        12 pixels away from Mario. Thus, it would take
//4
//        4 seconds for the bullet to reach the goomba. Mario wants the bullet to reach goomba after at least
//8
//        8 seconds. So, he should fire the bullet after
//4
//        4 seconds.

package CodeChef_500_1000;

import java.util.Scanner;

public class MarioAndBullet {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();

            int speedOfBullet = y/x;
            int bulletHitsGoomba = z - speedOfBullet;

            if (bulletHitsGoomba <= 0){
                System.out.println("0");
            } else {
                System.out.println(bulletHitsGoomba);
            }
        }
    }
}
