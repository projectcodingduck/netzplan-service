import data.TestDataFactory;
import manager.NodeManager;
import model.Node;

import java.util.*;

import static manager.NodeManager.HELP_NODE;

public class Start {
    public static void main(String[] args) {
        NodeManager nodeManager = new NodeManager();
        TestDataFactory data = new TestDataFactory();

        // <--> do here <-->
        // create operation list
        List<Node> nodes = data.createNP0();
        // </--> do here <-->



        // <-->do nothing<-->
        // start netzplan
        nodeManager.runNetzplan(nodes);

        // printing
        for (Node n : nodes) {
            if (!n.getName().equals(HELP_NODE)) {
                n.drawNode();
            }
        }
        //</-->do nothing<-->
    }
}
