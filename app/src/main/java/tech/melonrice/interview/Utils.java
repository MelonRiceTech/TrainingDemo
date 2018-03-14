package tech.melonrice.interview;

/**
 * 实现以下三个method的功能
 * 在method内完成所有代码，不可添加额外的class或者method进行调试
 */

public class Utils {
    /**
     * 检查用户输入的字符串，是否满足为一个合法的投资金额数字字符串。
     * 返回true表示可以继续输入，返回false表示不可继续输入
     * 输入最多只能保留小数点后两位
     * 合法的串例如：123.01   123.0    123   0.1  0.12
     * <p>
     * 不合法的串:  0    01    0..1     10.123     1.2.3     a1b2
     * <p>
     * 注意：输入为以下结构的字符串时，为合法的，应该返回true，因为此时可以继续让用户输入其他字符，以构成合法字符串：
     * 0.        10.
     */
    public static Boolean checkInvest(String str) {
        //todo
        return false;
    }

    /**
     * 使用任何一种排序算法，从小到大排列输入的整数数组，不可使用java sort api
     */
    public static int[] customSort(int[] sort) {
        //todo
        return sort;
    }

    /**
     * 输入一个整数数组，输出其子数组(数组中的几个连续元素构成的一个新数组)的和的最大值
     * 例如{-3, 2, 8, -7, 1, 6}，其中和最大的子数组为{2, 8},返回结果为10
     * {1,2,-3},返回结果为3
     * 注意：如果数组元素全部小于0，则直接返回0
     */
    public static int maxSubSeqSum(int[] a) {
        int MaxSum = 0;
        //todo
        return MaxSum;
    }
}
