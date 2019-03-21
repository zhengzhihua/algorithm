package demo;

/**
 * 递归
 * @author Lenovo
 *
 */
public class DiGui {
	
	public static void main(String[] args) {
//		System.out.println("兔子第个月的总数为:" );
		Sort sort=new Sort();
		for (int i = 1; i <= 20; i++) {
			System.out.println("兔子第" + i + "个月的总数为:" + fadd(i));
		}
		 

	}
	//递归实现斐波那契数列
	private static int fadd(int a){
	     if(a<=2){
	    	 return 1;
	     }else{
	    	 return fadd(a-2)+fadd(a-1);
	     }
		
	}
}
