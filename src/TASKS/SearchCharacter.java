package TASKS;
public class SearchCharacter {
    public static void main(String[] args) {
        String str = "TRAINING";
        char target ='I';
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

    }
}
