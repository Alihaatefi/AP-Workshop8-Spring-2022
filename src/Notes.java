import java.util.Scanner;

public class Notes  {
    public String title;
    public String text;
    public String date;

    public Notes(String title, String text, String date) {
        this.title = title;
        this.text = text;
        this.date = date;
    }
    public static void add(String title , String text , String date){
        Notes note = new Notes(title,text,date);
    }

    @Override
    public String toString(){
        return title+ " " + date +"\n" + text;
    }
}
