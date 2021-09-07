public class Liste
{
    Node head = null;
    Node tail = null;

    public Node insertFromHead(Node n)
    {
        if(head == null)
        {
            //her ved jeg at listen er tom
            head = n;
            tail = n;

            return head;

        }

        //her ved jeg at listen IKKE er tom

        head.previous = n;
        n.next = head;
        head = n;

        return head;

    }

    public Node insertFromTail(Node node)
    {
        if (tail == null)
        {
            //her ved jeg at listen er tom
            head = node;
            tail = node;

            return tail;

        }
        tail.next = node;
        node.previous = tail;
        tail = node;

        return tail;

    }

    public String printFromHead()
    {
        Node n = head;

        String res=""; //result string

        while(n != null)
        {
            res = res + n.navn;
            n = n.next;

        }
        return res;

    }

    public String printFromTail()
    {
        Node n = tail;

        String res=""; //result string

        while (n != null)
        {
            res = res + n.navn;
            n = n.previous;

        }
        return res;

    }

    public Node removeFromHead()
    {
        if (head == null)
        {
            //i dette tilfælde er der 0 elementer i listen
            return null;

        }

        if (head == tail)
        {
            //i dette tilfælde er der 1 element i listen
            return head;
        }

        //her fjernes head, dvs. første element i node listen
        Node n = head;
        head.next.previous = null;
        head =  head.next;

        return head;
    }
}
