package Fibonacci;

public class Fibonacci {
 public String findNthTerm(int n) {
   
    int[] lista = new int[n]; // array
    lista[0] = 1;
    lista[1] = 1;

    String output = lista[0] + " " + lista[1] + " ";


    for (int i = 2; i < n; i++) // for loop
    {
        int next = lista[i - 1] + lista[i - 2];
        
        lista[i] = next;
        output += next + " ";
    }

    return output;

 }
}







