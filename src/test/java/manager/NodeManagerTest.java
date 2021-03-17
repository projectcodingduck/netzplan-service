package manager;

import data.TestDataFactory;
import model.Node;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class NodeManagerTest {
    private NodeManager nodeManager = new NodeManager();

    private TestDataFactory data = new TestDataFactory();

    @Test
    void testCalcNextNodesFor() {
        //given
        List<Node> localNode = data.createNP1();
        List<Node> NextWaendeNodes = Arrays.asList(localNode.get(4), localNode.get(5), localNode.get(6));

        //when
        nodeManager.getNextNodesFor(localNode);

        Node Waende = localNode.get(3);
        Node fensterNode = localNode.get(4);

        //then
        assertThat(Waende.getNextNodes().size(), is(NextWaendeNodes.size()));
        assertThat(fensterNode.getNextNodes().size(), is(Collections.singleton(localNode.get(8)).size()));
    }

    @Test
    void testCalcFazAndFezWithRandomNP() {
        //given
        List<Node> localNode = data.createNP1();
        nodeManager.getNextNodesFor(localNode);

        //when
        nodeManager.calcFazAndFez(localNode);

        //then
        assertThat(localNode.get(0).getFaz(), is(0));
        assertThat(localNode.get(0).getFez(), is(0));

        assertThat(localNode.get(1).getFaz(), is(0));
        assertThat(localNode.get(1).getFez(), is(5));

        assertThat(localNode.get(2).getFaz(), is(0));
        assertThat(localNode.get(2).getFez(), is(20));

        assertThat(localNode.get(3).getFaz(), is(5));
        assertThat(localNode.get(3).getFez(), is(30));

        assertThat(localNode.get(4).getFaz(), is(30));
        assertThat(localNode.get(4).getFez(), is(42));

        assertThat(localNode.get(5).getFaz(), is(30));
        assertThat(localNode.get(5).getFez(), is(45));

        assertThat(localNode.get(6).getFaz(), is(30));
        assertThat(localNode.get(6).getFez(), is(40));

        assertThat(localNode.get(7).getFaz(), is(40));
        assertThat(localNode.get(7).getFez(), is(41));

        assertThat(localNode.get(8).getFaz(), is(45));
        assertThat(localNode.get(8).getFez(), is(45));
    }


    @Test
    @Disabled("no results avaiable")
    void testCalcFazAndFezWithWS1516ABNP() {
        List<Node> localNode = data.createWS1516ABNP();
        nodeManager.getNextNodesFor(localNode);

        //when
        nodeManager.calcFazAndFez(localNode);

        //then
    }

    @Test
    void testCalcFazAndFezWithMusterloesungUebungsaufgabeNP() {
        //given
        List<Node> localNode = data.createMusterloesungUebungsaufgabeNP();
        nodeManager.getNextNodesFor(localNode);

        //when

        nodeManager.calcFazAndFez(localNode);

        //then
        assertThat(localNode.get(0).getFaz(), is(0));
        assertThat(localNode.get(0).getFez(), is(0));

        assertThat(localNode.get(1).getFaz(), is(0));
        assertThat(localNode.get(1).getFez(), is(15));

        assertThat(localNode.get(2).getFaz(), is(0));
        assertThat(localNode.get(2).getFez(), is(12));

        assertThat(localNode.get(3).getFaz(), is(0));
        assertThat(localNode.get(3).getFez(), is(8));

        assertThat(localNode.get(4).getFaz(), is(0));
        assertThat(localNode.get(4).getFez(), is(20));

        assertThat(localNode.get(5).getFaz(), is(15));
        assertThat(localNode.get(5).getFez(), is(19));

        assertThat(localNode.get(6).getFaz(), is(8));
        assertThat(localNode.get(6).getFez(), is(15));

        assertThat(localNode.get(7).getFaz(), is(20));
        assertThat(localNode.get(7).getFez(), is(50));

        assertThat(localNode.get(8).getFaz(), is(20));
        assertThat(localNode.get(8).getFez(), is(32));

        assertThat(localNode.get(9).getFaz(), is(19));
        assertThat(localNode.get(9).getFez(), is(28));

        assertThat(localNode.get(10).getFaz(), is(15));
        assertThat(localNode.get(10).getFez(), is(36));

        assertThat(localNode.get(11).getFaz(), is(15));
        assertThat(localNode.get(11).getFez(), is(28));

        assertThat(localNode.get(12).getFaz(), is(50));
        assertThat(localNode.get(12).getFez(), is(60));

        assertThat(localNode.get(13).getFaz(), is(32));
        assertThat(localNode.get(13).getFez(), is(43));

        assertThat(localNode.get(14).getFaz(), is(32));
        assertThat(localNode.get(14).getFez(), is(47));

        assertThat(localNode.get(15).getFaz(), is(36));
        assertThat(localNode.get(15).getFez(), is(44));

        assertThat(localNode.get(16).getFaz(), is(60));
        assertThat(localNode.get(16).getFez(), is(80));

        assertThat(localNode.get(17).getFaz(), is(47));
        assertThat(localNode.get(17).getFez(), is(56));

        assertThat(localNode.get(18).getFaz(), is(80));
        assertThat(localNode.get(18).getFez(), is(100));
    }

    @Test
    void testCalcSazAndSezWithRandomNP() {
        //given
        List<Node> localNode = data.createNP1();
        nodeManager.getNextNodesFor(localNode);
        nodeManager.calcFazAndFez(localNode);

        //when
        nodeManager.calcSazAndSez(localNode);

        //then
        assertThat(localNode.get(8).getSaz(), is(45));
        assertThat(localNode.get(8).getSez(), is(45));

        assertThat(localNode.get(7).getSaz(), is(44));
        assertThat(localNode.get(7).getSez(), is(45));

        assertThat(localNode.get(6).getSaz(), is(34));
        assertThat(localNode.get(6).getSez(), is(44));

        assertThat(localNode.get(5).getSaz(), is(30));
        assertThat(localNode.get(5).getSez(), is(45));

        assertThat(localNode.get(4).getSaz(), is(33));
        assertThat(localNode.get(4).getSez(), is(45));

        assertThat(localNode.get(3).getSaz(), is(5));
        assertThat(localNode.get(3).getSez(), is(30));

        assertThat(localNode.get(2).getSaz(), is(10));
        assertThat(localNode.get(2).getSez(), is(30));

        assertThat(localNode.get(1).getSaz(), is(0));
        assertThat(localNode.get(1).getSez(), is(5));

        assertThat(localNode.get(0).getSaz(), is(0));
        assertThat(localNode.get(0).getSez(), is(0));
    }

    @Test
    @Disabled("no results avaiable")
    void testCalcSazAndSezWithWithWS1516ABNP() {
        List<Node> localNode = data.createWS1516ABNP();
        nodeManager.getNextNodesFor(localNode);
        nodeManager.calcFazAndFez(localNode);

        //when
        nodeManager.calcSazAndSez(localNode);

        //then
    }

    @Test
    void testCalcSazAndSezWithMusterloesungUebungsaufgabeNP() {
        //given
        List<Node> localNode = data.createMusterloesungUebungsaufgabeNP();
        nodeManager.getNextNodesFor(localNode);
        nodeManager.calcFazAndFez(localNode);

        //when
        nodeManager.calcSazAndSez(localNode);

        //then
        assertThat(localNode.get(0).getSaz(), is(0));
        assertThat(localNode.get(0).getSez(), is(0));

        assertThat(localNode.get(1).getSaz(), is(44));
        assertThat(localNode.get(1).getSez(), is(59));

        assertThat(localNode.get(2).getSaz(), is(39));
        assertThat(localNode.get(2).getSez(), is(51));

        assertThat(localNode.get(3).getSaz(), is(32));
        assertThat(localNode.get(3).getSez(), is(40));

        assertThat(localNode.get(4).getSaz(), is(0));
        assertThat(localNode.get(4).getSez(), is(20));

        assertThat(localNode.get(5).getSaz(), is(59));
        assertThat(localNode.get(5).getSez(), is(63));

        assertThat(localNode.get(6).getSaz(), is(40));
        assertThat(localNode.get(6).getSez(), is(47));

        assertThat(localNode.get(7).getSaz(), is(20));
        assertThat(localNode.get(7).getSez(), is(50));

        assertThat(localNode.get(8).getSaz(), is(44));
        assertThat(localNode.get(8).getSez(), is(56));

        assertThat(localNode.get(9).getSaz(), is(63));
        assertThat(localNode.get(9).getSez(), is(72));

        assertThat(localNode.get(10).getSaz(), is(51));
        assertThat(localNode.get(10).getSez(), is(72));

        assertThat(localNode.get(11).getSaz(), is(47));
        assertThat(localNode.get(11).getSez(), is(60));

        assertThat(localNode.get(12).getSaz(), is(50));
        assertThat(localNode.get(12).getSez(), is(60));

        assertThat(localNode.get(13).getSaz(), is(60));
        assertThat(localNode.get(13).getSez(), is(71));

        assertThat(localNode.get(14).getSaz(), is(56));
        assertThat(localNode.get(14).getSez(), is(71));

        assertThat(localNode.get(15).getSaz(), is(72));
        assertThat(localNode.get(15).getSez(), is(80));

        assertThat(localNode.get(16).getSaz(), is(60));
        assertThat(localNode.get(16).getSez(), is(80));

        assertThat(localNode.get(17).getSaz(), is(71));
        assertThat(localNode.get(17).getSez(), is(80));

        assertThat(localNode.get(18).getSaz(), is(80));
        assertThat(localNode.get(18).getSez(), is(100));
    }


    @Test
    @Disabled("no results avaiable")
    void testCalcGpAndFpWithWithWS1516ABNP() {
        List<Node> localNode = data.createWS1516ABNP();
        nodeManager.getNextNodesFor(localNode);
        nodeManager.calcFazAndFez(localNode);
        nodeManager.calcSazAndSez(localNode);

        //when
        nodeManager.calcGpAndFp(localNode);

        //then
    }

    @Test
    void testCalcGpAndFpWithWithMusterloesungUebungsaufgabeNP() {
        //given
        List<Node> localNode = data.createMusterloesungUebungsaufgabeNP();
        nodeManager.getNextNodesFor(localNode);
        nodeManager.calcFazAndFez(localNode);
        nodeManager.calcSazAndSez(localNode);

        //when
        nodeManager.calcGpAndFp(localNode);

        //then
        assertThat(localNode.get(0).getGp(), is(0));
        assertThat(localNode.get(0).getFp(), is(0));

        assertThat(localNode.get(1).getGp(), is(44));
        assertThat(localNode.get(1).getFp(), is(0));

        assertThat(localNode.get(2).getGp(), is(39));
        assertThat(localNode.get(2).getFp(), is(3));

        assertThat(localNode.get(3).getGp(), is(32));
        assertThat(localNode.get(3).getFp(), is(0));

        assertThat(localNode.get(4).getGp(), is(0));
        assertThat(localNode.get(4).getFp(), is(0));

        assertThat(localNode.get(5).getGp(), is(44));
        assertThat(localNode.get(5).getFp(), is(0));

        assertThat(localNode.get(6).getGp(), is(32));
        assertThat(localNode.get(6).getFp(), is(0));

        assertThat(localNode.get(7).getGp(), is(0));
        assertThat(localNode.get(7).getFp(), is(0));

        assertThat(localNode.get(8).getGp(), is(24));
        assertThat(localNode.get(8).getFp(), is(0));

        assertThat(localNode.get(9).getGp(), is(44));
        assertThat(localNode.get(9).getFp(), is(8));

        assertThat(localNode.get(10).getGp(), is(36));
        assertThat(localNode.get(10).getFp(), is(0));

        assertThat(localNode.get(11).getGp(), is(32));
        assertThat(localNode.get(11).getFp(), is(32));

        assertThat(localNode.get(12).getGp(), is(0));
        assertThat(localNode.get(12).getFp(), is(0));

        assertThat(localNode.get(13).getGp(), is(28));
        assertThat(localNode.get(13).getFp(), is(4));

        assertThat(localNode.get(14).getGp(), is(24));
        assertThat(localNode.get(14).getFp(), is(0));

        assertThat(localNode.get(15).getGp(), is(36));
        assertThat(localNode.get(15).getFp(), is(36));

        assertThat(localNode.get(16).getGp(), is(0));
        assertThat(localNode.get(16).getFp(), is(0));

        assertThat(localNode.get(17).getGp(), is(24));
        assertThat(localNode.get(17).getFp(), is(24));

        assertThat(localNode.get(18).getGp(), is(0));
        assertThat(localNode.get(18).getFp(), is(0));
    }

    @Test
    void testCriticalPathWithWithMusterloesungUebungsaufgabeNP() {
        //given
        List<Node> localNode = data.createMusterloesungUebungsaufgabeNP();
        nodeManager.getNextNodesFor(localNode);
        nodeManager.calcFazAndFez(localNode);
        nodeManager.calcSazAndSez(localNode);
        nodeManager.calcGpAndFp(localNode);

        String criticalPathResult =  "[1, 5, 8, 13, 17, 19]";

        //when
        List<Node> criticalPathNodes = nodeManager.getCriticalPath(localNode);
        List<Integer> criticalPathNumbers = criticalPathNodes.stream().map(node -> node.getNumber()).collect(Collectors.toList());

        //then
        assertThat(criticalPathNumbers.toString(), is(criticalPathResult));
    }

    @Test
    void testCriticalPathWithNP1() {
        //given
        List<Node> localNode = data.createNP1();
        nodeManager.getNextNodesFor(localNode);
        nodeManager.calcFazAndFez(localNode);
        nodeManager.calcSazAndSez(localNode);
        nodeManager.calcGpAndFp(localNode);

        String criticalPathResult =  "[1, 2, 4, 6, 9]";

        //when
        List<Node> criticalPathNodes = nodeManager.getCriticalPath(localNode);
        List<Integer> criticalPathNumbers = criticalPathNodes.stream().map(node -> node.getNumber()).collect(Collectors.toList());

        //then
        assertThat(criticalPathNumbers.toString(), is(criticalPathResult));
    }

    @Test
    void testCreateHelpNodWithNP1() {
        List<Node> localNode = data.createNP1();
        nodeManager.getNextNodesFor(localNode);

        //when
        Node helpNode = nodeManager.createHelpNode(localNode);

        //then
        assertThat(helpNode, nullValue());
    }

    @Test
    void testCreateHelpNodeWithWS1516ABNP() {
        List<Node> localNode = data.createWS1516ABNP();
        nodeManager.getNextNodesFor(localNode);

        //when
        Node helpNode = nodeManager.createHelpNode(localNode);

        //then
        assertThat(helpNode, notNullValue());
        assertThat(helpNode.getNumber(), is(9));
        assertThat(helpNode.getDuration(), is(0));
        assertThat(helpNode.getPrevNodes().size(), is(2));
        assertThat(helpNode.getNextNodes(), nullValue());
    }
}