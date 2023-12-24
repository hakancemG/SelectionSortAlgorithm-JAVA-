/** 
 * Project : Selection Sort Algorithm
 * Project author : Hakan Cem GERÇEK.
 **/
package hakancemgercek.selectionsort;

import java.util.InputMismatchException;

public class Main{   
    
    public static void main(String[] args) {
        
        SelectionSort selection_sort = new SelectionSort();
        try{
            selection_sort.getSelectionSort();
            selection_sort.getPrintSelectionSort();
        }
        catch(InputMismatchException e){
            System.out.println("Yanlış giriş!");
        }
    }
}
