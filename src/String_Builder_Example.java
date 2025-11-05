public class String_Builder_Example {
    public static void main(String args[]){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");

        String result = stringBuilder.toString();

        System.out.println("Result String Builder :  "+result);
    }
}
