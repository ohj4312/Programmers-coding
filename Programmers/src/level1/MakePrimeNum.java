package level1;

public class MakePrimeNum {
    public static int solution(int[] nums) {
        int answer = 0;
        int i,j,k,tempsum=0;
        boolean primeCk=false;
        for(i=0;i<nums.length-2;i++){
            for(j=i+1;j<nums.length-1;j++){
                for(k=j+1;k<nums.length;k++){
                    tempsum=nums[i]+nums[j]+nums[k];
                    for(int a=2;a<tempsum;a++){
                        if(tempsum%a==0){
                            primeCk=false;
                            break;
                        }else{
                            primeCk=true;
                        }
                    }
                    if(primeCk){
                        answer++;
                    }
                }
                
            }
            
            
        }
        return answer;
    }
    
    public static void main(String[] args) {
		int[] nums1= {1,2,3,4};
		int[] nums2= {1,2,7,6,4};
		System.out.println(solution(nums1));
		System.out.println(solution(nums2));
	}
}
