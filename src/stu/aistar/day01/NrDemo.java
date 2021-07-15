package stu.aistar.day01;

public class NrDemo {
    public static void main(String[] args) {
        //相当于是System.out.println("hello");
        System.out.print("hello\n");//输出之后不换行
        System.out.println("world");

        // \n - 当输出完毕之后，光标停在下一行的起始位置 - 换行

        // \r - 当输出完毕之后，光标停在当前的起始位置 回车

        // \n\r 诞生的场景就是早期的打字机

        //外面的终端执行的结果是 - veyy

        //伪终端显示的结果是 - ve
        System.out.println("Loyy\rve");
    }
}
