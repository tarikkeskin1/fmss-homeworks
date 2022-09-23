import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Match {
    public static void main(String[] args) {

        ArrayList<String> teams = new ArrayList<String>();
        Scanner team = new Scanner(System.in);
        System.out.println("Takım Sayısını Girin:");
        int  numberOfTeams= team.nextInt();
        System.out.println("Takımları girin:");

        for(int i=0;i<numberOfTeams;i++){
            System.out.println((i+1)+". Takımı girin") ;
            String teamName = team.next();
            teams.add(teamName);

        }
        System.out.println(teams);
        System.out.println(teams.size());
        Random random=new Random();
        ArrayList<String> newTeams = new ArrayList<String>();

        for(int i=0;i<numberOfTeams;i++){
            int indis= random.nextInt(teams.size());

            newTeams.add(i,teams.get(indis));
            System.out.println(newTeams.get(i));
            teams.remove(indis);
        }

        for(int i=0;i<newTeams.size()-1;i++){
            System.out.println("Eşleşen takımlar");
            System.out.println(newTeams.get(i)+" - "+newTeams.get(i+1));
            i++;
        }














    }
}

