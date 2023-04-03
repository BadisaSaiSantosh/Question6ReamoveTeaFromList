
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Question6{
    public static void main(String[] args) {
        List<String> Item=Arrays.asList("Suger","salt","coffee","oil","tea");
        ArrayList<String> myItems=new ArrayList<>();
        myItems.addAll(Item);
        String Target="tea";
        for(String str: myItems)
        if(str.contains(Target) || str.equals(Target));
        myItems.remove(Target);

        System.out.println(Item+"---------->"+myItems);
        
    }
    
}