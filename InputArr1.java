import Scanner.util.java;

public class InputArr {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine().trim();  //[1,2,3,4,5]
input = input.replace("["," ").replace("]"," ");  // 1,2,3,4,5

String parts = input.split(",");
int[] arr = new arr[parts.length];
for(int i =0; i<parts.length;i++){
arr[i] = Integer.parseInt(parts[i].trim());
}
for(int num : arr){
System.out.print(num + " " );
}
}
}