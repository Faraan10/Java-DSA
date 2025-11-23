package ImportantQuestions;

public class LengthOfConsecutiveOnes {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(String A) {
        
        int N=A.length();
        int ans=0;
        int count=0;

        for(int i=0; i<N; i++){
            if(A.charAt(i)=='1'){
                count++;
            }
        }
        if(count==N){
            return N;
        }else if(count==0){
            return 0;
        }

        for(int i=0; i<N; i++){
            char ch=A.charAt(i);
            if(ch=='0'){
                int left=0;
                int right=0;
                for(int j=i-1; j>=0; j--){
                    if(A.charAt(j)=='1'){
                        left++;
                    }else{
                        break;
                    }
                }
                for(int j=i+1; j<N; j++){
                    if(A.charAt(j)=='1'){
                        right++;
                    }else{
                        break;
                    }
                }
                if(count>left+right){
                    ans=Math.max(ans, left+right+1);
                }else{
                    ans=Math.max(ans, left+right);
                }
            }
        }
        return ans;
    }
}
