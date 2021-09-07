import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{
    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead()
    {
        Node node = new Node("viktor");
        Node node1 = new Node("christian");


        assertEquals("viktor", liste.insertFromHead(node).navn);
        assertEquals("christian", liste.insertFromHead(node1).navn);


    }

    @org.junit.jupiter.api.Test
    void insertFromTail()
    {
        Node node1 = new Node("1");
        Node node2 = new Node("2");

        assertEquals("1", liste.insertFromTail(node1).navn);
        assertEquals("2", liste.insertFromTail(node2).navn);

    }

    @Test
    void printFromHead()
    {
        liste.insertFromHead(new Node("1"));
        liste.insertFromHead(new Node("2"));
        liste.insertFromHead(new Node("3"));
        liste.insertFromHead(new Node("4"));

        assertEquals("4321", liste.printFromHead());

    }

    @Test
    void printFromTail()
    {
        liste.insertFromTail(new Node("1"));
        liste.insertFromTail(new Node("2"));
        liste.insertFromTail(new Node("3"));
        liste.insertFromTail(new Node("4"));

        assertEquals("4321", liste.printFromTail());

    }

    @Test
    void removeFromHead()
    {
        assertEquals(null, liste.removeFromHead());

        Node node1 = new Node ("1");

        liste.insertFromHead(node1);
        assertEquals(node1, liste.removeFromHead());

        Node node = new Node("Christian");
        Node node2 = new Node("Jonas");
        Node node3 = new Node("Victor");
        Node node4 = new Node("Jantie");

        liste.insertFromHead(node);
        liste.insertFromHead(node2);
        liste.insertFromHead(node3);
        liste.insertFromHead(node4);

        assertEquals(node4, liste.removeFromHead());
    }

    @Test
    void removeFromTail()
    {
        assertEquals(null, liste.removeFromTail());

//        Node node1 = new Node ("1");
//
//        liste.insertFromTail(node1);
//        assertEquals(node1, liste.removeFromTail());

        Node node = new Node("Christian");
        Node node2 = new Node("Jonas");
        Node node3 = new Node("Victor");
        Node node4 = new Node("Jantie");

        liste.insertFromTail(node);
        liste.insertFromTail(node2);
        liste.insertFromTail(node3);
        liste.insertFromTail(node4);

        assertEquals(node3, liste.removeFromTail());
    }

}