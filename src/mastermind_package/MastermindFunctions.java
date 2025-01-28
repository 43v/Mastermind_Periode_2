package mastermind_package;

import java.util.Random;

public class MastermindFunctions
{

    public final String[] kleuren =
    { "geel", "paars", "groen", "blauw", "oranje", "rood" };

    public final String[] altkleuren =
    { "leeg", "wit", "zwart" };

    public String[] mastermindcodegenerator()
    {

	String[] code =
	{ "geen", "geen", "geen", "geen" };
	Random rnd = new Random();

	for (int i = 0; i < 4; i++)
	{
	    code[i] = kleuren[rnd.nextInt(5)];
	}

	return code;
    }

    public static String evaluatePosition(String[] playerCode, String[] code, int pos, String[] altkleuren)
    {

	if (playerCode[pos].equals(code[pos]))
	{
	    return altkleuren[2];  // zwart 
	}
	
	else if (playerCode[pos].equals(code[0]) || playerCode[pos].equals(code[1]) || 
	         playerCode[pos].equals(code[2]) || playerCode[pos].equals(code[3])) {
	    return altkleuren[1]; // wit 
	}
	
	else {
	    
	   return altkleuren[0];  // leeg 
	}
	
    }
    
public static boolean wincheck (String[] playerCode, String[] code) {
   
    for (int i = 0; i < playerCode.length; i++) {
       
        if (!playerCode[i].equals(code[i])) {
            return false;  
        }
    }
  
    return true;  
}
}
