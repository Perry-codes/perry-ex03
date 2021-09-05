/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Maggie Perry
 */
/*
Set scanner to accept keyboard input

Prompt user to enter a quote

Save quote as variable

Prompt user for author

Author variable

Concatenate quote and author into string

Output string

 */

package exercise03;

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the quote?");

        String quote = sc.nextLine();

        System.out.println("Who said this?");

        String author = sc.nextLine();
/*
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 */
        System.out.println(author + " says, \""  + quote + "\"");

    }
}
