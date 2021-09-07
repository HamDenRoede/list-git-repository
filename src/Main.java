import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Node node = new Node("mie");
        Node node1 = new Node("viktor");

        node1.next = node;

        System.out.println("det var: " + node1.next.navn);

    }

//    int [] ints = new int[10];
//
//    String s = new String("palle");
//
//    Integer [] integers = {1,2,33,4,5,56,7,4,53,6,7};
//
//    Set<Integer> integerSet = new HashSet<>(Arrays.asList(integers));
//    for (Integer integer ; integerSet)
//    {
//        System.out.println(integer);
//    }
}
