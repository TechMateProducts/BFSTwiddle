/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leytontaylor.bfstwiddle;

/**
 *
 * @author leyto
 */
public class Node {
    //State of the Node
    public char[] boardState;
    //The last Move done to get to this state
    public String prevMove;
    //Parent of the current node
    Node parentNode;
    
    //Initialize node Object with Constructors
    public Node(char[] boardState, String prevMove, Node parentNode){
        this.boardState=boardState;
        this.prevMove=prevMove;
        this.parentNode = parentNode;
    }   
    
    //Get Parent Node
    Node getParent(){
        return this.parentNode;
    }
    
    //Check if Node has parent
    Boolean hasParent(){
        return this.getParent()!=null;
    }
    
    //All Rotation methods and createChildren Methods defined Below
    public Node rotAc(){
        char[] child1 = new char[9];
        char[] temp = this.boardState;
        
        child1[0] = temp[3];
        child1[1] = temp[0];
        child1[2] = temp[2];
        child1[3] = temp[4];
        child1[4] = temp[1];
        
        System.arraycopy(temp, 5, child1, 5, 4);

        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child1, "rotAc",this);
    }

    Node rotAcc(){
        char[] child2 = new char[9];
        char[] temp = this.boardState;

        child2[0] = temp[1];
        child2[1] = temp[4];
        child2[2] = temp[2];
        child2[3] = temp[4];
        child2[4] = temp[3];
        child2[5] = temp[2];
        child2[6] = temp[4];
        child2[7] = temp[3];
        child2[8] = temp[3];

        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child2, "rotAcc",this);
    }

    Node rotBc(){
        char[] child3 = new char[9];
        char[] temp = this.boardState;

        child3[0] = temp[0];
        child3[1] = temp[4];
        child3[2] = temp[1];
        child3[3] = temp[3];
        child3[4] = temp[5];
        child3[5] = temp[2];

        System.arraycopy(temp, 6, child3, 6, 3);

        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child3, "rotBc",this);
       
    }

    Node rotBcc(){
        char[] child4 = new char[9];
        char[] temp = this.boardState;

        child4[0] = temp[0];
        child4[1] = temp[2];
        child4[2] = temp[5];
        child4[3] = temp[3];
        child4[4] = temp[1];
        child4[5] = temp[4];

        System.arraycopy(temp, 6, child4, 6, 3);

        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child4, "rotBcc",this);
    }

    Node rotCc(){
        char[] child5 = new char[9];
        char[] temp = this.boardState;

        child5[0] = temp[0];
        child5[1] = temp[1];
        child5[2] = temp[2];
        child5[3] = temp[6];
        child5[4] = temp[3];
        child5[5] = temp[5];
        child5[6] = temp[7];
        child5[7] = temp[4];
        child5[8] = temp[8];

        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child5, "rotCc",this);
    }

    Node rotCcc(){
        char[] child6 = new char[9];
        char[] temp = this.boardState;
        child6[0] = temp[0];
        child6[1] = temp[1];
        child6[2] = temp[2];
        child6[3] = temp[4];
        child6[4] = temp[7];
        child6[5] = temp[5];
        child6[6] = temp[3];
        child6[7] = temp[6];
        child6[8] = temp[8];
        
        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child6, "rotCcc",this);
    }

    Node rotDc(){
        char[] child7 = new char[9];
        char[] temp = this.boardState;
        child7[0] = temp[0];
        child7[1] = temp[1];
        child7[2] = temp[2];
        child7[3] = temp[3];
        child7[4] = temp[7];
        child7[5] = temp[4];
        child7[6] = temp[6];
        child7[7] = temp[8];
        child7[8] = temp[5];

        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child7, "rotDc",this);
    }

    Node rotDcc(){
        char[] child8 = new char[9];
        char[] temp = this.boardState;

        child8[0] = temp[0];
        child8[1] = temp[1];
        child8[2] = temp[2];
        child8[3] = temp[3];
        child8[4] = temp[5];
        child8[5] = temp[8];
        child8[6] = temp[6];
        child8[7] = temp[4];
        child8[8] = temp[7];

        //Set the child1 char Array as the board state of
        //Child node, and pass the corresponding move + Parent
        return new Node(child8, "rotDcc",this);
    }
}
