package important_programs;

public class I2_CountCharatctersOfanString_WithoutLength
{
    public static void main(String[] args) {

        String data="hello";
        System.out.println(data.length());
        //convert to array
       char []chracters=data.toCharArray();
       //traverse an array
        int count=0;//result
        for(  char x: chracters)
        {
            count++;
        }
        System.out.println("length of an string is : "+count);
    }
}
