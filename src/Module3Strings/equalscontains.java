package Module3Strings;
//to match the strings
public class equalscontains {
    public static void main(String[] args) {
        String a = "Rijwan Mulla";
        boolean answer=a.equals("Rijwan");
               System.out.println(answer);//it will be false as it does not equals with full string
               
        boolean ans=a.contains("Rij");
        		System.out.println(ans);
        		
       		boolean a1=a.equalsIgnoreCase("rijwan mulla");
       		System.out.println(a1);
          }
}
