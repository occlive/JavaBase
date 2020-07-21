import java.util.Arrays;

public class ArrraysDemo {
	//Arrays类
	public static void main(String args[]) {
		
		
		//copyOf	数组的复制
		int arr[] = {1,2,3};
		int arr2[] = new int[3];
		arr2 = Arrays.copyOf(arr, 3);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("---------------------------------");
		
		//fill  数组元素初始化
		int arr3[] = new int[5];
		Arrays.fill(arr3, 5);
		System.out.println(Arrays.toString(arr3));
		
		String strs[] = new String[5];
		Arrays.fill(strs,"hello");
		System.out.println(Arrays.toString(strs));
		
		
		System.out.println("---------------------------------");
		//sort  数组排序
		int arr4[] = {1,3,6,1,3,9,3,1,6,7};
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
		//按照ascii排序
		char ch[] = {'q','D','c','e','A','e','E','t','Y'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		
		System.out.println("---------------------------------");
		
		//binarySearch 排序后数组元素的查找
		//二分法
		int index = Arrays.binarySearch(arr4, 1);
		System.out.println(index);
		int index2 = Arrays.binarySearch(arr4, 7);
		System.out.println(index2);
		int index3 = Arrays.binarySearch(arr4, 3);
		System.out.println(index3);
		
		System.out.println("---------------------------------");
		//toString 一维数组打印
		System.out.println(Arrays.toString(arr));
		
		System.out.println("---------------------------------");
		//deepToString 二维数组打印
		int arr5[][] = new int[3][3];
		System.out.println(Arrays.deepToString(arr5));
		
		System.out.println("---------------------------------");
		
	}

}
