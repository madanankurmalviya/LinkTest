package others;


import java.util.ArrayList;

public class pro {
	public static void main(String[] strings)
	{
		String str = "I am Ankur Malviya.";
		String[] strings1 = str.split(" ");
		int count = strings1.length;

    for(int i = 0; i < count;i++){
        String word = strings1[i];
        ArrayList<Integer> oddIndexes  = new ArrayList<>();
        for(int j= 0; j < word.length();j++){
            if(j % 2 == 0){
                System.out.print(word.charAt(j));
            }else{
                oddIndexes.add(j);
            }
        }
        System.out.print(" ");
        for(Integer index : oddIndexes){
            System.out.print(word.charAt(index));
        }
        System.out.println();
    }
 }
}