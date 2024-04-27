package org.example.Class11_StringClass;

public class E5_String {
    public static void main(String[] args) {

        //String str=new String("    Java is easy"); is same as
        String st= "Matt likes watermelon. He is again in the kitchen";

        /*
        .contains method is case-sensitive
         */
        System.out.println(st.contains("Viet"));
        System.out.println(st.contains("Matt Likes Watermelon"));

        /*
        you can also chain method. using multiple methods together
         */
        System.out.println(st.toLowerCase().contains("matt likes watermelon"));

        System.out.println(st.startsWith("Matt"));

        //works with single character but have to pass as string
        System.out.println(st.startsWith("M"));

        System.out.println(st.endsWith("kitchen"));
        boolean end = st.endsWith("again");
        System.out.println(end);

    }//end of main
}//end of class