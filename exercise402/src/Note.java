public class Note {
    private String message;
    private boolean highPriority;

    public Note ( String message){
        this.message = message;
    }
     public String getMessage(){
        return message;
     }
     public void setMessage(String message){
        this.message = message;
     }
     public boolean isHighPriority(){
        return highPriority;
     }
}
