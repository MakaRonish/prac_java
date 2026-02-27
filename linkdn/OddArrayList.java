package linkdn;

import java.util.ArrayList;

public class OddArrayList extends ArrayList<Integer>{

    @Override
    public void add(int index, Integer element){
        if(Math.abs(element)%2==1){
            super.add(index, element);
        }
    }

    
}
