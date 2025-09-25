package week3DSAQues;

/*
T.C : O(n) Using "Hare & tortoise technique"

S.C : O(1)
How i identify hare & tortoise algorithm
 1. Duplicacy
 2. traverse through indices
*/

public class FindDuplicateinArray {
    public FindDuplicateinArray(){
        System.out.println("constructor called");
    }
    public static int findDuplicate(int[] nums){

        int slow=nums[0];
        int fast=nums[0];

        slow=nums[slow];
        fast=nums[nums[fast]];

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }

        slow=nums[0];

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }


        return fast;

    }

    public static void main(String []args){

        int arr[]={1, 3, 4, 2, 2};
        int ans=FindDuplicateinArray.findDuplicate(arr);
        System.out.println(ans);

    }
}
