import java.util.Arrays;

public class Demo2 {
	//二维数组
	public static void main(String args[]) {
		
		//静态初始化
		
		int arr[][] = {{1,2},{3,4}};
		String[][] strs = {{"i","love","u"},{"hello"},{"world"}};
		char[][] chs = {{'o','c'},{'c'},{'l','i','v','e'}};
		
		//使用
		int result = arr[1][1]-arr[0][1];
		System.out.println(result);
		
		//遍历
		for(int i = 0;i<strs.length;i++) {
			for(int j = 0;j <strs[i].length;j++){
				System.out.print(strs[i][j]+" ");
			}
			System.out.println();
		}
		
		//打印内存地址
		System.out.println(arr);
		//打印单个数组内存地址
		System.out.println(Arrays.toString(arr));
		//打印值
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(strs));
		System.out.println(Arrays.deepToString(chs));
		
		System.out.println("---------------------------------");
		
		//动态初始化
		int[] arr2[] = new int[2][3];
		//String分配空间后值默认为null
		String[][] strs2 = new String[2][3];
		long arr3[][] = new long[4][4];
		//char分配空间后 值默认为空字符
		char chs2[][] = new char[2][3];
		//遍历
		for(int i = 0;i<2;i++) {
			for(int j = 0;j <3;j++){
				System.out.print(chs2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int i = 0;i<2;i++) {
			for(int j = 0;j <3;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		for(String[] str:strs2) {
			for(String s:str) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
		
		
	}
}
