package level1;


public class Reverse_Arr {
	 public static int[] solution(long n) {
	      String num = n +"";
	      int arr[] = new int[num.length()];
	      int index = num.length()-1;

	      for(int i=0; i<num.length(); i++){
	          arr[i] = num.charAt(index) -'0';
	          index--;
	      }

	      return arr;
	  }
	
	public static void main(String[] args) {
		
		int[] arr=solution(12345);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
