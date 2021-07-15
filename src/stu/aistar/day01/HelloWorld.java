package stu.aistar.day01;
//编程语言中，只要出现符号，一定必须都是英文输入法下的
//整体的结构
//java是以类作为基础的单位的 - 定义类
//关键是class
//类的名称要和文件的名称保持高度一致
//{} - block - 块 - 代码块
public class HelloWorld{// 1.类
	//规范 - 缩进4个空格
	//定义一个main方法 - 程序的“大门”
	//运行该程序的时候，jvm就会自动寻找main方法，然后进入到这个main
	//方法中去执行
	//
	public static void main(String[] args){// 2.方法
		//方法体，现阶段代码一定是放在方法体内部的
		//jdk中提供了内置的对象[拥有一些功能]，提供好了，开发者就可以直接使用
		//java.lang.System类 - 向控制台输出一句话
		System.out.println("HelloWorld");//3.具体的程序

		// System.out.println(args[0]);//访问数组中的第一个元素
	}
}

/**
 * 文档注释
 *
 * 		一个类文件中是否可以声明多个类
 * 		一个类文件中可以声明多个非公开的类[不能使用public来进行修饰]
 * 		public - 公共的，公开的
 */
class Test01{
	/**
	 *
	 *main方法 - ”主入口程序“
	 * psvm - 快速生成main方法
	 * @param args	虚拟机参数
	 */
	public static void main(String[] args) {
		//打桩 - 可以用来帮助程序员来简单测试我们的代码
		//未来的程序中绝对不允许出现输出语句的
		//println - 线程安全方法
		System.out.println("success");

	}
}