package ke1229;

public class Zhan {

	private String [] elementData;
	private int top;//指针
	private int size;//实际存储的元素个数
	private int initSize=5;//默认容量
	
	public Zhan(){
		elementData = new String[initSize];
	}
	public Zhan(int initSize){
		if(initSize<0){
			System.out.println("容量长度不能为："+initSize+",即将使用默认值5");
			this.initSize=5;
		}else{
			this.initSize=initSize;
		}
		elementData = new String[initSize];
	}
	/**
	 * 入栈
	 * @param str
	 * @return
	 */
	public boolean push(String str){
		//判断栈是否已满
		if(top>=elementData.length){
			System.out.println("栈已满，无法继续存储");
			return false;
		}
		//top作为数组的索引号
		elementData[top++]=str;//elementData[top]=str; top++;
		//实际存储的元素个数+1
		size++;
		return true;
	}
	/**
	 * 出栈
	 * @return
	 */
	public String pop(){
		//判断栈是否已空
		if(top<=0){
			System.out.println("栈已空，无法继续删除元素。。。");
			return null;
		}
		String str = elementData[--top];
		elementData[top]=null;//清空当前位置的
		//实际存储的元素个数-1
		size--;
		return str;
	}
	//清空栈
	public void clear(){
		//将栈中所有元素清空 设置字符串的默认值null
		for(int i=0;i<size;i++){
			elementData[i]=null;
		}
		//栈的指针指向栈底
		top=0;
		//实际存储的元素个数为0
		size=0;
	}
	//获取实际元素个数
	public int size(){
		return this.size;
	}
}
