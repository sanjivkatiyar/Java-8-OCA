package org.enthuware.oca.test1;
// String, StringBuilder, and StringBuffer - all are final classes.
// 1. Remember that wrapper classes (java.lang.Boolean, java.lang.Integer, java.lang.Long, java.lang.Short etc.)
// are also final and so they cannot be extended.
// 2. java.lang.Number, however, is not final. Integer, Long, Double etc. extend Number.
// 3. java.lang.System is final as well.
// 4. Don't get confused between final and immutable, StringBuilder and StringBuffer are mutable
public class Q49 {
    public static void main(String args []){
        String s = "MINIMUM";
        System.out.println(s.substring(4, 7)); //1
        System.out.println(s.substring(5)); //2
        System.out.println(s.indexOf('I', 3));
        System.out.println(s.indexOf('I', 4));

        System.out.println(s.substring(s.indexOf('I', 3))); //3
        System.out.println(s.substring(s.indexOf('I', 4))); //4
        StringBuilder sb = new StringBuilder();
        }
}
