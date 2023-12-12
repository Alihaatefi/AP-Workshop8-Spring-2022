import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Notebook notebook = new Notebook();
        ArrayList<Notes> notes = notebook.notes;
        System.out.println("***************\n1- add\n2- remove \n3- Notes\n***************");
        Scanner input = new Scanner(System.in);


            while (true){
            int in = Integer.parseInt(input.next());
            switch (in){
                case 1 :
                System.out.println("Input Your title");
                String title = input.next();
                System.out.println("Input Your text");
                String text = input.next();
                System.out.println("Input date");
                String date = input.next();
                Notes note = new Notes(title,text,date);

                try {
                    notes.add(note);
                }catch (Exception e) {
                    System.out.println("This Is Already Exist");

                }



                    System.out.println("***************\n1- add\n2- remove \n3- Notes\n***************");

//                catch (Exception e){
//                    throw new IsAlreadyMadeException("This Note Is Already Exist");
//                }

                    break;


                case 2 :
                int i = 1;
                    System.out.println(0 + "- " + "back");
                for (Notes notes1 : notes) {
                    System.out.println(i + "- " + notes1.title);
                    i++;
                }
                int num = Integer.parseInt(input.next());
                if(num == 0)
                    break;
                notes.remove(num - 1);
                System.out.println("***************\n1- add\n2- remove \n3- Notes\n***************");
                break;

                case 3 :
                    int j = 1;
                for (Notes notes1 : notes){
                    System.out.println("\n###################\n"+j + "- " + notes1.toString()+"\n###################\n");
                    j++;
                }
                System.out.println("***************\n1- add\n2- remove \n3- Notes\n***************");

        }}
    }
}
