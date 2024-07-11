import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // BigInteger로 변환
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        // 두 BigInteger를 더함
        BigInteger sum = num1.add(num2);
        
        // 결과를 문자열로 반환
        return sum.toString();
    }
}
