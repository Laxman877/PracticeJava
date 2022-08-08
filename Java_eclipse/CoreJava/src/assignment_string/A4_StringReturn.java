package assignment_string;
//W.A.J.P to return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'.

class Main{
	public String wordReplaceBy(String stng) 
	{
	  String newstring = "";
	  int l = stng.length();
	  for(int i = 0; i < l; i++)
	  {
	    if(i-1 >= 0 && Character.isLetter(stng.charAt(i-1))|| i+2 < l && Character.isLetter(stng.charAt(i+2))) 
		{
	      newstring += stng.charAt(i);
	    }
	    else if(i+1 < l && stng.substring(i, i+2).equals("is")) 
		{
	      newstring += "is not";
	      i++;
	    }
	    else newstring += stng.charAt(i);
	  }
	  return newstring;
	}
}
public class A4_StringReturn {
	public static void main(String[] args) {
		Main m= new Main();
	      String str1 =  "it is a string";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The new string is: "+m.wordReplaceBy(str1));
	}
}
