/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player();
        player1.playerName = "George Elliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;

        System.out.println("Team 1 Players: ");
        for (Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }

        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];

        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Mpho John";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Gugu Mabaso";

        //player1.playerName = "Robert Service";
        System.out.println(" ");
        System.out.println("Team 2 Players: ");
        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }

    }
}
