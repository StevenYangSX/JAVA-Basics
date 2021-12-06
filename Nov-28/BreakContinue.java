//break : 结束当前循环
//continue: 结束当次循环

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                break;
            }
            System.out.println(i);
            // 1 2 3
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
            // 1 2 3 5 6 7 9 10
        }

        // 带标签的break和continue, 结束指定标签的loop
        label: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (j % 4 == 0) {
                    break label;
                }
            }
        }
    }
}
