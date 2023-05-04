/*
의사코드
재귀문 하나씩 계산하여 결과 계산

(21,34)  => 87
(34,21) + 34                        = 87
(21,13) + 21                    = 53
(13,8) + 13                 =32
(8,5) + 8               = 19
(5,3) + 5           = 11
(3,2) + 3       = 6
(2,1) + 2   = 3
(1,0) + 1 = 1

(123,12) => 15
(12,3) + 12     = 15
(3,0) + 3   = 3

(2021,4) => 5
(4,1) + 4       = 5
(1,0) + 1   = 1

(107,36) => 72
(36, 35) + 36       = 72
(35, 1) + 35    = 36
(1, 0) + 1  = 1

(66,60) => 66 
(60,6) + 60     = 66
(6,0) + 6   = 6
*/
public class PrintResult27 {
    private static int f(int a, int b) {
        return b > 0 ? f(b, a % b) + b : 0;
    }

    public static void main(String[] args) {
        System.out.println(f(21, 34));
    }
}
