package important_programs.strings_problems;

import java.util.HashMap;
import java.util.Map;

public class I20_MaxQuantityingiven_stringarray

{
    public static void main(String[] args)
    {
        String a[]={"xyz 19","abc 9","xyz 21","fgh 99"};
        HashMap<String,Integer>hashMap=new HashMap<>();

        for( String s:a)
        {
            String data[]=s.split(" ");
            String name=data[0];
            int value =Integer.parseInt(data[1]);
            hashMap.put(name, hashMap.getOrDefault(name,0)+value);


        }
        String Result="product";
        int maxquantity=0;
       for (Map.Entry<String,Integer> entryset :hashMap.entrySet())
               {
                   if( entryset.getValue()>maxquantity)
                   {
                       maxquantity=entryset.getValue();
                       Result= entryset.getKey();
                   }
               }
        System.out.println(Result+" "+maxquantity);

    }
}
