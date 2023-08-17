import java.lang.reflect.Array;
import java.util.Arrays;

public class Movies {

    public static void main(String[] args) {
        String[] films={"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade "};
        String[][] actors={{ "Harrison Ford", "Karen Allen", "Paul Freeman"}, {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"}, {"Harrison Ford", "Denholm Elliott", "Alison Doody"}};

        for (int i = 0; i < films.length; i++) {
            System.out.print("In the movie: "+ films[i]+" the main actors are: ");
            for (int j=0;j<actors[i].length;j++){
                System.out.print( actors[i][j]+", ");
            }
                System.out.println();
        }
    
    }
}
