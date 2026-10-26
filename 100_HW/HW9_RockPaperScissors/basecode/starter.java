/*
 *	Author: Karen Avagyan
 *  Date: 10/25
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
        int r = (int)(Math.random() * 3) + 1;
        if( r == 1){
            return "rock";
        }
        else if(r == 2){
            return "paper";
        }
        else{
            return "scissors";
        }
    }

    public static int compare2(String x, String y){
        if(x.equals(y)){
            return 0;
        }
        else if((x.equals("rock") && y.equals("scissors")) || (x.equals("scissors") && y.equals("paper")) || (x.equals("paper") && y.equals("rock"))){
            return 1;
        }
        else{
            return 2;
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        String b = "";
        String yes = "";
        int result;
        int g = 0;

        while(true){
            System.out.println("");
            System.out.println("Would you like to play ? (yes/no/done)");
            a = sc.nextLine();
      
            if(a.equals("done")){
                System.out.println("");
                System.out.println("Thanks!");
                break;
            }
            else if(a.equals("yes")){
                System.out.println("");
                System.out.println("Please enter rock/paper/scissors");
                yes = sc.nextLine();

                while(!yes.equals("rock") && !yes.equals("paper") && !yes.equals("scissors")){
                    System.out.println("");
                    System.out.println("Invalid input, please type in rock/paper/scissors:");
                    yes = sc.nextLine();
                }

                b = getObject();
                result = compare2(yes, b);

                if(result == 0){
                    System.out.println("");
                    System.out.println("You tied!");
                }
                else if(result == 1){
                    System.out.println("");
                    System.out.println("You won!");
                }
                else{
                    System.out.println("");
                    System.out.println("You lost!");
                }

            }
            else if(a.equals("no")){
                System.out.println("How many times would you like the computer to play itself?");
                g = sc.nextInt();
                sc.nextLine();

                int p1w = 0;
                int p2w = 0;
                int ties = 0;
                int i = 0;

                while( i < g) {
                    String p1 = getObject();
                    String p2 = getObject();
                    result = compare2(p1, p2);

                    if (result == 0) {
                        ties++;
                    } else if (result == 1) {
                        p1w++;
                    } else {
                        p2w++;
                    }
                    i++;
                }

                System.out.println("");
                System.out.println("Player 1 wins: " + p1w);
                System.out.println("Player 2 wins: " + p2w);
                System.out.println("Ties: " + ties);
            }
            else{
                System.out.println("");
                System.out.println("You typed an invalid input!");
                break;
            }

        }
    }

}