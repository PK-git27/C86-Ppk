package ke0212;
import java.util.Random;
import java.util.Scanner;
public class LinkGame {
	
	/**
	 * 开始游戏===》 展示界面  ===》 用户输入===》 判断是否连通===》 判断是否结束===》 结束游戏 
	 * 
	 */
	// 常量==》 不变的量 final 终结
	private static final int SIZE = 10;
	static String player;
	private Random rd=new Random();
	private Scanner sc=new Scanner(System.in);
	private int[][] board = new int [SIZE][SIZE];
	/**
	 * 开始游戏
	 */
	public void start(){
		System.out.println("+++++++++++++++++++++欢迎来到连连看+++++++++++++++++++++++++++");
		System.out.println("请输入游戏昵称：");
		player=sc.nextLine();
		
		init();
		
		while(true){
			showBoard();
			
			System.out.println(player+"请您输入第一个坐标(x y)：");
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			System.out.println(player+"请您输入第二个坐标(x y)：");
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			boolean result= check(x1,y1,x2,y2);
			if(result==true){
				board[x1][y1]=0;
				board[x2][y2]=0;
			}
		}
	}
	
	public void showBoard(){
		/**
		 * 增强for循环
		 */
		for(int[]a:board){
			for(int b : a){
				System.out.print(b+"\t");
			}
			System.out.println();
		}
		
	}
	/**
	 * 初始化界面
	 */
	public void init(){
		//计算循环的次数
		int count = SIZE*SIZE/2;
		for(int i=0;i<count;i++){
			//计算2个点的编号（一维数组）
			int p1=i * 2;
			int p2=p1+1;
			//计算两个点在二位数组中的坐标
			int x1=p1/SIZE;
			int y1=p1%SIZE;
			int x2=p2/SIZE;
			int y2=p2%SIZE;
			//取随机值 同时给两个点赋值
			int rInt=rd.nextInt(9)+1;
			board[x1][y1]=rInt;
			board[x2][y2]=rInt;
		}
		//打乱棋盘
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int newi=rd.nextInt(SIZE);
				int newj=rd.nextInt(SIZE);
				//交换值
				int temp=0;
				temp=board[i][j];
				board[i][j]=board[newi][newj];
				board[newi][newj]=temp;
			}
		}
		
		
	}
	
	public boolean check(int x1,int y1,int x2,int y2){
		//board[x1][y1];  board[x2][y2]
		if(board[x1][y1]!=board[x2][y2]){
			return false;
		}
		//判断是否平行
		if(x1==x2){
			//判断是否是紧贴在一起的元素
			if(y1==y2+1||y1==y2-1){
				return true;
			}
			int offset = y1<y2? 1 : -1;
			for(int i=y1+offset;i!=y2;i+=offset){
				if(board[x1][i]!=0){
					return false;
				}
			}
			return true;
		}
		
		//判断是否垂直
		if(y1==y2){
			if(x1==x2+1||x1==x2-1){
				return true;
			}
			int offset = x1<x2? 1 : -1;
			for(int i=x1+offset;i!=x2;i+=offset){
				if(board[i][y1]!=0){
					return false;
				}
			}
			return true;
		}
		
		//直角转弯！！！
		
		if(x1!=x2&&y1!=y2){
			int x=x1;
			int y=y2;
			if(board[x][y]!=0){
				x=x2;
				y=y1;
				if(board[x][y]!=0){
					return false;
				}else{
					//竖邻
					if(x1==x+1||x1==x-1){
						//横邻
						if(y==y2+1||y==y2-1){
							return true;
						}
						//横长
						int offset = y<y2? 1 : -1;
						for(int i=y+offset;i!=y2;i+=offset){
							if(board[x][i]!=0){
								return false;
							}
						}
						return true;
					}else{
						//竖长
						int offset = x1<x? 1 : -1;
						for(int i=x1+offset;i!=x;i+=offset){
							if(board[i][y]!=0){
								return false;
							}
						}
						if(y==y2+1||y==y2-1){
							return true;
						}
						int offset1 = y<y2? 1 : -1;
						for(int i=y+offset1;i!=y2;i+=offset1){
							if(board[x][i]!=0){
								return false;
							}
						}
						return true;
					}
					
				}
			}else{
				//横邻
				if(y1==y+1||y1==y-1){
					//竖邻
					if(x2==x+1||x2==x-1){
						 return true;
					}
					//竖长
					int offset = x2<x? 1 : -1;
					for(int i=x2+offset;i!=x;i+=offset){
						if(board[i][y]!=0){
							return false;
						}
					}
					return true;
				}else{
					//横长
					int offset = y1<y? 1 : -1;
					for(int i=y1+offset;i!=y;i+=offset){
						if(board[x][i]!=0){
							return false;
						}
					}
					//竖邻
					if(x2==x+1||x2==x-1){
						 return true;
					}
					//竖长
					int offset1 = x2<x? 1 : -1;
					for(int i=x2+offset1;i!=x;i+=offset1){
						if(board[i][y]!=0){
							return false;
						}
					}
					return true;
				}
				
			}
			
		}
		
		
		
		
		return false;
	}
	/**
	 * 判断有一个拐点的连线是否连通
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public boolean check1(int x1, int y1, int x2, int y2) {
		// 判断2个图形（数字）是否一致
		if (board[x1][y1] != board[x2][y2]) {
			return false;
		}
		// 同行或同列的请求，直接调用 check
		if(x1== x2 || y1 == y2) {
			return check(x1, y1, x2, y2);
		}
		// 判断两个点与其中一个拐点（必须是0）是否同时连通
		if(board[y1][x2] == 0) {
			// 临时将拐点的值设置为当前的图形值
			board[y1][x2] = board[y1][x1];
			boolean b1 = check(x1, y1, x1, y2);
			boolean b2 = check(x2, y2, x1, y2);
			board[y1][x2] = 0;
			if( b1 && b2) {
				return true;
			}
		}

		// 判断两个点与另一个拐点（必须是0）是否同时连通
		if(board[y2][x1] == 0) {
			// 临时将拐点的值设置为当前的图形值
			board[y2][x1] = board[y1][x1];
			boolean b1 = check(x1, y1, x2, y1);
			boolean b2 = check(x2, y2, x2, y1);
			board[y2][x1] = 0;
			if( b1 && b2) {
				return true;
			}
		}

		return false;
	}
}
