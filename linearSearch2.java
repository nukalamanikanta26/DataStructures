public class linearSearch2 {
    public static void main(String[] args) {
        String name = "manikanta";
        char target = 'm';
        System.out.println(searchChar(name,target));
    }
    static boolean searchChar(String s, char target){
        if(s.length() == 0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(target == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
