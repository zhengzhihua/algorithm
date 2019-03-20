package demo;

public class Sort {

	public static void main(String[] args) {
		
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quicksort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        dubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
		
	}
	/**
	 *  冒泡排序
	 * @param number
	 */
	private static void dubblesort(int[] number) {
		int size=number.length;
		int temp=0;
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(number[j]>number[j+1]){
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		
	}
	
	/**
	 * 快速排序
	 */
	private static void quicksort(int[] number,int start,int end) {
		int i,j,temp,t;
		if(start>end){
			return;
		}
		i=start;
		j=end;
		temp=number[start];   //基准数
		while(start<end){
			//满足条件就继续遍历
			while(temp<=number[j]&&i<j){
				j--;
			}
			//满足条件就继续遍历
			while(temp>number[i]&&i<j){
				i++;
			}
			//number[i]>temp 并且number[j]<temp 进行交换
			if(i<j){
				t=number[i];
				number[i]=number[j];
				number[j]=t;
			}
		}
		//使用基准数将数字分为两部分
		number[start]=number[i];
		number[i]=temp;
		quicksort(number,start,i-1);
		quicksort(number,i+1,end);
	}

}
