import java.util.ArrayList;

public class Notebook {


    ArrayList<Notes> notes = new ArrayList<>();

    public void add(Notes note) throws  IsAlreadyMadeException {
        for(Notes notes1:notes){
            if(notes.contains(notes1)){
                throw new IsAlreadyMadeException();

            }
        }
        notes.add(note);
    }


}
