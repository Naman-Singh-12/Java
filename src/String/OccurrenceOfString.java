package String;

public class OccurrenceOfString {

    public static void main(String[] args){
        System.out.println("Occurrence of char in String");
        String[] arr = {"aa aAa","abc123","&*()","Aa","abc"};

        for(String i : arr){
            System.out.println("\n"+i+" ");
            checkOccurrence(i.replace(" ", "").toLowerCase());
        }


    }

    private static void checkOccurrence(String str) {

        int[] frequency = new int[256];
        boolean[] visited = new boolean[256];

        for(char i :str.toCharArray()){
            frequency[i]++;
        }

        for(char s: str.toCharArray()){
            if(!visited[s]){
                System.out.print(s+": "+frequency[s]+", ");
                visited[s] = true;
            }
        }


    }
}
