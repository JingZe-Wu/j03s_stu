package stu.aistar.day01;

public class TypeChangeDemo {
    public static void main(String[] args) {
        //定义一个byte类型的数据[-128~127]

        //127 - 字面量，数字常量 - 不可改变的量
        byte b = 127; //编译为什么可以通过

        System.out.println(b);

        byte x = 126;

        //变量 - 允许多次进行赋值
        //大的数据类型和小的数据类型进行计算的时候，计算得到的结果时偏向类型大的一方
        //java中看到一个整数，默认就是int类型

        //强制类型转换
        //MaxType 变量1 = 值1;
        //MinType 变量2 = (MinType)变量1;

        //alt+enter
        x = (byte) (x+1);//不进行数据类型转换的话，编译不能通过

        //JVM区别看待字面量和变量

        //byte b = 127;//为什么可以通过？
        byte b2 = 127;//JVM判断出127是字面量，数字常量，JVM认为它是不可改变的
                    //那么JVM再次判断出127正好在byte类型的范围之内，所以精准判断出
                    //127可以存储在byte类型定义的变量中

        //x = x + 1;//不能编译
        //因为jvm对待变量的方式 - 不关心这个变量中具体存在的数据到底有多大
        //只能够识别出x是byte类型，得出一个结论byte类型+int类型 = int类型

        //定义一个布尔类型
        boolean flag = true;
        int m = 10;
        while (m>5){
            System.out.println("死循环");
        }
        System.out.println();
    }
}
