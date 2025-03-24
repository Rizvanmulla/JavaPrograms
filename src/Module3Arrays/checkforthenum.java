package Module3Arrays;
//"WAP to check the array of the given numbers which are present in your array
//Ex:[2,4,6,8]
//Average=(2+4+6+8)/4"		
//match case
public class checkforthenum {
public static void main(String[] args) {
	
String input="Rijwan";
System.out.println(input.matches("......"));
System.out.println(input.matches("R(.*)"));
System.out.println(input.matches("(.*)n"));
System.out.println(input.matches("(.*)wan"));
System.out.println(input.matches("(.*)jw(.*)"));
System.out.println(input.matches("(.*)aj(.*)"));// false: as aj is not present in the given string
System.out.println(input.matches(".i(.*)"));//only dot used for skipping first letter and 
//after i (.*)used to skip further letters in the string

String input2="Salman Khan";
System.out.println(input2.matches("(.*)man(.*)"));//can identify man in between the string also
}
}