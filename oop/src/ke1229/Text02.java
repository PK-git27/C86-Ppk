package ke1229;

public class Text02 {
	public static void main(String[] args) {
		Zhan yc=new Zhan();
		yc.push("a01");
		yc.push("a05");
		yc.push("a02");
		yc.push("a04");
		yc.push("a03");
		
		System.out.println("栈中实际存储的元素个数："+yc.size());
		yc.push("a06");
		System.out.println("栈中实际存储的元素个数："+yc.size());
		System.out.println("移除栈顶元素："+yc.pop());
		System.out.println("移除栈顶元素："+yc.pop());
		System.out.println("栈中实际存储的元素个数："+yc.size());
		//清空栈
		yc.clear();
		System.out.println("栈中实际存储的元素个数："+yc.size());
	}
}
