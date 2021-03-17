package model;

import manager.NodeManager;

import java.util.List;

public class Node extends NodeManager {

    private int number;

    private String name;

    private int duration;

    private int faz;

    private int fez;

    private int saz;

    private int sez;

    private int gp;

    private int fp;

    List<Node> prevNodes;

    List<Node> nextNodes;

    public Node(int number, String name, int duration, List<Node> prevNodes) {
        this.number = number;
        this.name = name;
        this.duration = duration;
        this.prevNodes = prevNodes;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFaz() {
        return faz;
    }

    public void setFaz(int faz) {
        this.faz = faz;
    }

    public int getFez() {
        return fez;
    }

    public void setFez(int fez) {
        this.fez = fez;
    }

    public int getSaz() {
        return saz;
    }

    public void setSaz(int saz) {
        this.saz = saz;
    }

    public int getSez() {
        return sez;
    }

    public void setSez(int sez) {
        this.sez = sez;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public int getFp() {
        return fp;
    }

    public void setFp(int fp) {
        this.fp = fp;
    }

    public List<Node> getPrevNodes() {
        return prevNodes;
    }

    public void setPrevNodes(List<Node> prevNodes) {
        this.prevNodes = prevNodes;
    }

    public List<Node> getNextNodes() {
        return nextNodes;
    }

    public void setNextNodes(List<Node> nextNodes) {
        this.nextNodes = nextNodes;
    }

    public void drawNode() {
        System.out.println("------------");
        System.out.printf("%1s  %2s  %3s \n", getNumber(), " ", getDuration());
        System.out.printf("%1s  %2s  %3s \n", " ", getName(), " ");
        System.out.printf("%1s  %2s  %3s \n", getFaz(), getGp(), getFez());
        System.out.printf("%1s  %2s  %3s \n", getSaz(), getFp(), getSez());
    }
}
