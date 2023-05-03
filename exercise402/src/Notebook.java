import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes;


    public Notebook(){
        notes = new ArrayList<>();

    }
    public int getNumberOfNotes (){
        return notes.size();
    }
    public Note getNote(int index){
        return notes.get(index);
    }
    public void addNote(Note note){
        notes.add(note);
    }
}
