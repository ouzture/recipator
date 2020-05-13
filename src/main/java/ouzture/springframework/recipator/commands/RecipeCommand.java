package ouzture.springframework.recipator.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ouzture.springframework.recipator.domain.Difficulty;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Difficulty difficulty;
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();



    public static void main(String ... args){

        int[] a = new int[]{3,4,6,6,10};

        HashSet<Integer> set = new HashSet<>();
        set.add(a[0]);

        for (int i = 1 ; i < a.length;i++){

            if (set.contains(a[i])){
                boolean added = false;
                int currentVal = a[i];
                while(!added){
                    currentVal++;

                    if(!set.contains(currentVal)){
                      set.add(currentVal);
                      added=true;
                    }


                }
            }else{
                set.add(a[i]);
            }

        }

        System.out.println(set);

    }

}