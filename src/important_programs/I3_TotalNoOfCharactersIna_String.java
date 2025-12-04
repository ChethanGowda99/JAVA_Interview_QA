package important_programs;

public class I3_TotalNoOfCharactersIna_String
{
    public static void main(String[] args)
    {
        //soln 3
        String data ="hello";
        System.out.println(data.length());
       int count=0;
       while(true){

           try{
          data.charAt(count);
           count++;} catch (StringIndexOutOfBoundsException e) {
               System.out.println(count);
               break;
           }


       }

    }
}
