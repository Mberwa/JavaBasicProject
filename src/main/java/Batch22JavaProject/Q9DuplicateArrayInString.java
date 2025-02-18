package Batch22JavaProject;

public class Q9DuplicateArrayInString {
    public static void main(String[] args) {
        String[] names = {"java","c++", "java", "python", "javascript"};
        for(int i = 0; i < names.length; i++){
            for(int j = i + 1; j < names.length; j++){
                if(names[i] == names[j]){
                    System.out.println("Duplicate found " + names[i]);
                }
                else {
                    System.out.println("No Duplicate found");
                }
            }
        }
    }
}
