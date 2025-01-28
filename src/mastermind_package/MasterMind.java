package mastermind_package;

import java.util.Scanner;

public class MasterMind
{
    public static void main(String[] args)
    {
        MastermindFunctions mcg = new MastermindFunctions();
        String[] code = mcg.mastermindcodegenerator(); // Genereer de code

        Scanner sc = new Scanner(System.in); // scanner voor userinput
        // WAAROMB WETKEKR RTIDT NIET DIT NIET 
        final String[] codeEvaluatie = new String[4]; // code array voor evaluatie

        for (int i = 0; i < 10; i++) //   10 pogingen loop 
        {
            System.out.println("Poging " + (i + 1) + "/10");

            String[] playerCode = new String[4];
            for (int x = 0; x < playerCode.length; x++)
            {
                playerCode[x] = sc.next(); // user inpit 
            }

            // Evalueer de gok van de speler voor elke positie
            for (int pos = 0; pos < 4; pos++) {
                codeEvaluatie[pos] = MastermindFunctions.evaluatePosition(playerCode, code, pos, mcg.altkleuren);
                System.out.println(codeEvaluatie[pos]);
            }

           
            if (MastermindFunctions.wincheck(playerCode, code)) {
                System.out.println("Gefeliciteerd! Je hebt gewonnen");
                break; // eindigt het spel
            }

            System.out.println();
        }

        sc.close();
    }
}
