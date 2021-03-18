package data;

import model.Node;

import java.util.*;

/**
 * TestData"Factory" for netzpläne
 * Do not use Arrays.asList() use .add() instead, if HELP_NODE is needed it can not add to Arrays.asList()
 */
public class TestDataFactory {

    // NP = Netzplan

    /**
     * use this method to create a Netzplan
     * example see below
     * @return
     */
    public List<Node> createNP0() {

        return null;
    }

    public List<Node> createWS2020NP() {
        Node n1 = new Node(1, "1", 1, Collections.EMPTY_LIST);
        Node n2 = new Node(2, "2", 25, Arrays.asList(n1));
        Node n3 = new Node(3, "3", 15, Arrays.asList(n1));
        Node n4 = new Node(4, "4", 20, Arrays.asList(n1));
        Node n5 = new Node(5, "5", 1, Arrays.asList(n2, n3, n4));
        Node n6 = new Node(6, "6", 10, Arrays.asList(n4));
        Node n7 = new Node(7, "7", 30, Arrays.asList(n5, n6));
        Node n8 = new Node(8, "8", 5, Arrays.asList(n7));

        List<Node> nodes = new ArrayList<>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        nodes.add(n8);

        return nodes;
    }

    /**
     * HELP_NODE not needed here
     * @return
     */
    public List<Node> createNP1() {
        Node n1 = new Node(1, "Baubeginn", 0, Collections.EMPTY_LIST);
        Node n2 = new Node(2, "Fundament", 5, Arrays.asList(n1));
        Node n3 = new Node(3, "Kanalisationsanschluss", 20, Arrays.asList(n1));
        Node n4 = new Node(4, "Wände", 25, Arrays.asList(n2));
        Node n5 = new Node(5, "Fenster", 12, Arrays.asList(n3, n4));
        Node n6 = new Node(6, "Dach", 15, Arrays.asList(n3, n4));
        Node n7 = new Node(7, "Türen", 10, Arrays.asList(n3, n4));
        Node n8 = new Node(8, "Türschloss", 1, Arrays.asList(n7));
        Node n9 = new Node(9, "Abschluss", 0, Arrays.asList(n5, n6, n8));

        List<Node> nodes = new ArrayList<>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        nodes.add(n8);
        nodes.add(n9);

        return nodes;
    }

    public List<Node> createNP2() {
        Node n1 = new Node(1, "A", 10, Collections.EMPTY_LIST);
        Node n2 = new Node(2, "B", 20, Arrays.asList(n1));
        Node n3 = new Node(3, "C", 4, Collections.EMPTY_LIST);
        Node n4 = new Node(4, "D", 2, Arrays.asList(n3));
        Node n5 = new Node(5, "E", 12, Arrays.asList(n1, n4));
        Node n6 = new Node(6, "F", 15, Arrays.asList(n1, n3));
        Node n7 = new Node(7, "G", 6, Arrays.asList(n2, n5, n6));
        Node n8 = new Node(8, "H", 1, Arrays.asList(n7));

        List<Node> nodes = new ArrayList<>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        nodes.add(n8);

        return nodes;
    }

    /**
     * HELP_NODE not needed here, use of Arrays.asList() OK
     * @return
     */
    public List<Node> createMusterloesungUebungsaufgabeNP() {

        Node n1 = new Node(1, "1", 0, Collections.EMPTY_LIST);
        Node n2 = new Node(2, "2", 15, Arrays.asList(n1));
        Node n3 = new Node(3, "3", 12, Arrays.asList(n1));
        Node n4 = new Node(4, "4", 8, Arrays.asList(n1));
        Node n5 = new Node(5, "5", 20, Arrays.asList(n1));
        Node n6 = new Node(6, "6", 4, Arrays.asList(n2, n3));
        Node n7 = new Node(7, "7", 7, Arrays.asList(n4));
        Node n8 = new Node(8, "8", 30, Arrays.asList(n5));
        Node n9 = new Node(9, "9", 12, Arrays.asList(n5));
        Node n10 = new Node(10, "10", 9, Arrays.asList(n6));
        Node n11 = new Node(11, "11", 21, Arrays.asList(n3, n7));
        Node n12 = new Node(12, "12", 13, Arrays.asList(n7));
        Node n13 = new Node(13, "13", 10, Arrays.asList(n8));
        Node n14 = new Node(14, "14", 11, Arrays.asList(n9));
        Node n15 = new Node(15, "15", 15, Arrays.asList(n9));
        Node n16 = new Node(16, "16", 8, Arrays.asList(n10, n11));
        Node n17 = new Node(17, "17", 20, Arrays.asList(n12,n13));
        Node n18 = new Node(18, "18", 9, Arrays.asList(n14, n15));
        Node n19 = new Node(19, "19", 20, Arrays.asList(n16, n17, n18));

        return Arrays.asList(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19);
    }


    /**
     * HELP_NODE will be created automatically, use of Arrays.asList() NOT OK
     * @return
     */
    public List<Node> createWS1516ABNP() {

        Node n1 = new Node(1, "A", 2, Collections.EMPTY_LIST);
        Node n2 = new Node(2, "B", 7, Collections.EMPTY_LIST);
        Node n3 = new Node(3, "C", 5, Arrays.asList(n1));
        Node n4 = new Node(4, "D", 2, Arrays.asList(n2));
        Node n5 = new Node(5, "E", 3, Arrays.asList(n2));
        Node n6 = new Node(6, "F", 3, Arrays.asList(n3));
        Node n7 = new Node(7, "G", 2, Arrays.asList(n4));
        Node n8 = new Node(8, "H", 3, Arrays.asList(n6));
        //Node n9 = new Node(9, HELP_NODE, 0, Arrays.asList(n7, n8));           // HELP_NODE

        List<Node> nodes = new ArrayList<>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        nodes.add(n8);
        return nodes;
    }

    /**
     * HELP_NODE will be created automatically
     * @return
     */
    public List<Node> createSS17NP() {
        Node n1 = new Node(1, "A", 20, Collections.EMPTY_LIST);
        Node n2 = new Node(2, "B", 12, Collections.EMPTY_LIST);
        Node n3 = new Node(3, "C", 3, Arrays.asList(n1));
        Node n4 = new Node(4, "D", 1, Arrays.asList(n3));
        Node n5 = new Node(5, "E", 2, Arrays.asList(n3));
        Node n6 = new Node(6, "F", 2, Arrays.asList(n3));
        Node n7 = new Node(7, "G", 8, Arrays.asList(n6));
        Node n8 = new Node(8, "H", 7, Arrays.asList(n4, n5));
        Node n9 = new Node(9, "I", 6, Arrays.asList(n4, n5));
        Node n10 = new Node(10, "J", 5, Arrays.asList(n8));
        Node n11 = new Node(11, "K", 2, Arrays.asList(n10));
        Node n12 = new Node(12, "L", 1, Arrays.asList(n9, n10));
        // Node n13 = new Node(12, "L", 1, Arrays.asList(n9, n10));                     // HELP_NODE

        List<Node> nodes = new ArrayList<>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        nodes.add(n8);
        nodes.add(n9);
        nodes.add(n10);
        nodes.add(n11);
        nodes.add(n12);
        return nodes;
    }

}
