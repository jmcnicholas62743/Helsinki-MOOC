
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        String temp="";
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[i];j++){
                temp+="*";
            }
            System.out.println(temp);
            temp="";
        }
    }
}
