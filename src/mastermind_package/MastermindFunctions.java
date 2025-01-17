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

}
