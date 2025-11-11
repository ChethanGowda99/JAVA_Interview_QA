package part_1.p4_strings_programs;

public class p7_ReplaceVowelsWithX
{
    public static void main(String[] args)
    {
        String input="Name";
       input= input.toLowerCase();
       char []inputarray=input.toCharArray();
       StringBuilder result=new StringBuilder();
       for(char currentchar:inputarray)
       {
           if( currentchar=='a'||currentchar=='e'||currentchar=='i'||
               currentchar=='o'||currentchar=='u'||currentchar=='A'||currentchar=='E'||currentchar=='I'||
               currentchar=='O'||currentchar=='U')
           {
           result.append('x');
       }
           else
       {
           result.append(currentchar);


           }


       }
        System.out.println(result.toString());
    }
}
