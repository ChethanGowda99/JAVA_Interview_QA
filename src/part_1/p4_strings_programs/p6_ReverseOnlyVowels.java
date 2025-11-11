package part_1.p4_strings_programs;

public class p6_ReverseOnlyVowels
{
    public static void main(String[] args)
    {
        String input="Hello";
        String vowels="aeiouAEIOU";
        char inputarray[]=input.toCharArray();
        int left=0;
        int right=inputarray.length-1;
        char temp;
        while(left<right)
        {
            if(vowels.indexOf(inputarray[left])==-1)
            {
                left++;
            }
            else if ( vowels.indexOf(inputarray[right])==-1)
            {
                right++;

            }
            else{
            //swap
            temp=inputarray[left];
            inputarray[left]=inputarray[right];
            inputarray[right]=temp;
            left++;
            right--;

        }
        }
        System.out.println("OutPut: "+ new String(inputarray));



    }
}
