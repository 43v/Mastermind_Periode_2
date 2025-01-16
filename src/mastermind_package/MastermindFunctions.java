package mastermind_package;

import java.util.Random;

public class MastermindFunctions
{

    public final String[] cbColors =
    { "geel", "paars", "groen", "blauw", "oranje", "rood", "leeg", "wit", "zwart" };

    public String[] mastermindcodegenerator()
    {

	String[] code =
	{ "geen", "geen", "geen", "geen" };
	Random rnd = new Random();

	for (int i = 0; i < 4; i++)
	{
	    code[i] = cbColors[rnd.nextInt(5)];
	}

	return code;
    }

}
