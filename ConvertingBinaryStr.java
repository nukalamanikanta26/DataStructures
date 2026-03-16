import java.util.*;

public class ConvertingBinaryStr{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
//input: 10

//Convert Int to String

String str = Integer.toBinaryString(n);
// ex: 10 --> 1010

//Create sb to store toggled binary num

StringBuilder sb = new StringBuilder();

//ex: sb="1010"

for(int i =0;i<str.length();i++){
//ex: intechanghe digits 1->0 & 0->1
if(str.charAt(i)=='1'){
sb.append('0');
} else {
sb.append('1');
}
}
int result = Integer.parseInt(sb.toString(),2);
System.out.println(result);
}
}