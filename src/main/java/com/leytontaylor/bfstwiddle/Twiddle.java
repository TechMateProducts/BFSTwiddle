/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leytontaylor.bfstwiddle;

import java.util.Scanner;

/**
 *
 * @author leyto
 */
public class Twiddle {
    
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial state: ");
        String initialState = input.next();
        Solver puzzleSolver = new Solver(initialState, "123456789");
        System.out.println(puzzleSolver.BFS());
 
    }
    
    public String search(String initialState){
        Solver puzzleSolver = new Solver(initialState, "123456789");
        return puzzleSolver.BFS();
    }
}
