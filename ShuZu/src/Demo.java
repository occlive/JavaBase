import java.util.Arrays;

public class Demo {

	// һά����
	public static void main(String args[]) {

		// ��̬��ʼ��

		// Error
		// ��̬����ָ������
//		int arr[5] = {1,2,3,4,5};
		// ��̬�����ͳ�ʼ������һ��
		/*
		 * int[] arr1; arr1 = {1,2,3};
		 */

		// ��������ʼ��
		int[] arr2 = { 1, 2, 3 };
		String strs[] = { "hello", "world", "!" };
		// ��ǿ��for��������
		for (int i : arr2) {
			System.out.println(i);
		}

		System.out.println("---------------------------------");

		// ��̬��ʼ��

		// int���ͷ����ֵĬ��Ϊ0
		int[] arr3 = new int[5];
		// ��ǿ��for��������
		for (int i : arr3) {
			System.out.println(i);
		}

		// ��̬�������������ʼ��
		int arr4[];
		arr4 = new int[3];
		for (int i=0;i<arr4.length;i++) {
			arr4[i] = i+1;
		}
		//��ȡarr4���ڴ��ַ
		System.out.println(arr4.toString());
		//��ȡarr4��ֵ,Arrays���÷�
		System.out.println(Arrays.toString(arr4));

	}
}
