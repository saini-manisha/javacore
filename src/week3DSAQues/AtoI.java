package week3DSAQues;

public class AtoI {
    public int myAtoi(String s) {

        int sign=1; // for checking the number is positive or negative
        int i=0; // for tracking the string s
        int len=s.length();
        int ans=0; //storing ans

        while(i<len && s.charAt(i)==' '){ // for leading space
            i=i+1;
        }

        if(i<len){ // for sign checking
            if(s.charAt(i)=='-'){
                sign=-1;
                i=i+1;
            }
            else if(s.charAt(i)=='+'){
                i=i+1;
            }

        }

        while(i<len && Character.isDigit(s.charAt(i))){ // traversing the string s
            int digit=s.charAt(i)-'0'; // get the digit

            //4. rounding off
            // .. Im .......0 ....... IM...
            //2,147,483,647,  (2,147,483,64)
            //-2,147,483,648 (-2,147,483,64) digit=6

            if(ans==(Integer.MAX_VALUE)/10){

                if(sign==1){
                    if(digit>=7){
                        return Integer.MAX_VALUE;
                    }

                }
                else if(sign==-1){
                    if(digit>=8)
                    {
                        return Integer.MIN_VALUE;
                    }

                }
            }

            if(ans>(Integer.MAX_VALUE)/10){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }

            ans=ans*10+digit;
            i++;

        }

        return sign*ans;

    }

    public static void main(String[] args){
        AtoI obj=new AtoI();

        System.out.println(obj.myAtoi("42"));
        System.out.println(obj.myAtoi(" -042"));
        System.out.println(obj.myAtoi("1337c0d3"));
        System.out.println(obj.myAtoi("0-1"));
        System.out.println(obj.myAtoi("words and 987"));

    }
}
