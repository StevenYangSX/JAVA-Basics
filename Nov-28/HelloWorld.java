class HelloChina {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // char
        char c1 = 'e';
        System.out.println(c1);

        // 自动类型提升
        /*
         * 当容量小的类型 与 容量大的变量做运算时，结果自动提升为容量大的类型
         */
        byte byte1 = 2;
        int int1 = 123;
        int int2 = byte1 + int1; // 这里如果用byte类型， 会报错

        // char + int / float / byte
        System.out.println(int2 + c1);
        // 强制类型转换
        // 需要使用强制转换符号 ： eg...
        short s2 = (short) int2;
        System.out.println(s2);

    }
}
// comments

/*
 * java基础 ： 最基础的， 定义类，语法，规则等等
 * 
 */
/**
 * @author
 * @version
 * @
 */

//////// JAVA关键字
/*
 * class interface enum byte short int long float double char boolean void......
 */
