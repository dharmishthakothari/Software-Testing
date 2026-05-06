package com.basic;

public class ArrayExample3 {
    public static void main(String[] args) {
        float numbers[] = { 12.23f, 45.767f, 4545.765f, 90.23f, 22.34f };
        float sum_ans = 0.0f;
        for (int i = 0; i < numbers.length; i++) {
            // sum_ans=sum_ans+numbers[i]
            sum_ans += numbers[i];
        }

        System.out.println("Addition of Float number is " + sum_ans);

    }
}
