public class Generics {
    public static void main(String[] args) {
        Integer numArray [] = {12, 324, 6, 7900};
        String textArray [] = {"I", "am", "a", "Robot!"};

        printArrayContent(numArray);
        printArrayContent(textArray);

        GenericClass<String> stringInstance = new GenericClass<String>();
        stringInstance.setType("Test");
        GenericClass<Integer> integerInstance = new GenericClass<Integer>();
        integerInstance.setType(1000);

        System.out.println(stringInstance.getType());   //print out Test
        System.out.println(integerInstance.getType());  //print out 1000


    }

    public static <T> void printArrayContent(T [] intStringArray){
        for (int i = 0; i < intStringArray.length; i++) {
            System.out.println(intStringArray[i] + " ");
        }
        System.out.println();
    }
}
