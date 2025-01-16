package mastermind_package;

import java.util.Scanner;

public class MasterMind
{

    public static void main(String[] args)
    {
	MastermindFunctions fn = new MastermindFunctions();
	String[] code = fn.mastermindcodegenerator();

	Scanner sc = new Scanner(System.in);

	final String[] codeEvaluatie =
	{ code[0], code[1], code[2], code[3] };

	for (int i = 0; i <= 9; i++)
	{

	    System.out.println("attempt " + (i + 1));

	    String[] playerCode = new String[4];
	    for (int x = 0; x < playerCode.length; x++)
	    {
		playerCode[x] = sc.next();
	    }

	    if (playerCode[0].equals(code[0]))
	    {
		codeEvaluatie[0] = fn.cbColors[8];
	    }

	    else if (playerCode[0].equals(code[1]) || playerCode[0].equals(code[2]) || playerCode[0].equals(code[3]))
	    {

		codeEvaluatie[0] = fn.cbColors[7];
	    }

	    else
	    {
		codeEvaluatie[0] = fn.cbColors[6];

	    }

	    System.out.println(codeEvaluatie[0]);

	    if (playerCode[1].equals(code[1]))
	    {
		codeEvaluatie[1] = fn.cbColors[8];
	    }

	    else if (playerCode[1].equals(code[0]) || playerCode[1].equals(code[2]) || playerCode[1].equals(code[3]))
	    {

		codeEvaluatie[1] = fn.cbColors[7];
	    }

	    else
	    {
		codeEvaluatie[1] = fn.cbColors[6];

	    }

	    System.out.println(codeEvaluatie[1]);

	    if (playerCode[2].equals(code[2]))
	    {
		codeEvaluatie[2] = fn.cbColors[	8];
	    }

	    else if (playerCode[2].equals(code[0]) || playerCode[2].equals(code[1]) || playerCode[2].equals(code[3]))
	    {

		codeEvaluatie[2] = fn.cbColors[7];
	    }

	    else
	    {
		codeEvaluatie[2] = fn.cbColors[6];

	    }

	    System.out.println(codeEvaluatie[2]);

	    if (playerCode[3].equals(code[3]))
	    {
		codeEvaluatie[3] = fn.cbColors[8];
	    }

	    else if (playerCode[3].equals(code[0]) || playerCode[3].equals(code[1]) || playerCode[3].equals(code[2]))
	    {

		codeEvaluatie[3] = fn.cbColors[7];
	    }

	    else
	    {
		codeEvaluatie[3] = fn.cbColors[6];

	    }

	    System.out.println(codeEvaluatie[3]);

	    if (playerCode[0].equals(code[0]) && playerCode[1].equals(code[1]) && playerCode[2].equals(code[2]) && playerCode[3].equals(code[3]))
	    {

		System.out.println("Gefeliciteerd je hebt gewonnen!");
		break;
	    }

	    if (i == 9)
	    {
		System.out.println("Je hebt verloren");

		break;
	    }

	}

	sc.close();

    }

}