import java.util.Arrays;

public class Demo {

	// 一维数组
	public static void main(String args[]) {

		// 静态初始化

		// Error
		// 静态不可指定长度
//		int arr[5] = {1,2,3,4,5};
		// 静态声明和初始化必须一起
		/*
		 * int[] arr1; arr1 = {1,2,3};
		 */

		// 声明并初始化
		int[] arr2 = { 1, 2, 3 };
		String strs[] = { "hello", "world", "!" };
		// 增强型for遍历数组
		for (int i : arr2) {
			System.out.println(i);
		}

		System.out.println("---------------------------------");

		// 动态初始化

		// int类型分配后值默认为0
		int[] arr3 = new int[5];
		// 增强型for遍历数组
		for (int i : arr3) {
			System.out.println(i);
		}

		// 动态可先声明、后初始化
		int arr4[];
		arr4 = new int[3];
		for (int i=0;i<arr4.length;i++) {
			arr4[i] = i+1;
		}
		//获取arr4的内存地址
		System.out.println(arr4.toString());
		//获取arr4的值,Arrays的用法
		System.out.println(Arrays.toString(arr4));

	}
}
