package hakancemgercek.selectionsort;

import java.util.Scanner;

public class SelectionSort {
    
    private static int[] A = new int[6];    // Verilen dizi.
    
    public SelectionSort(){     // Yapıcı metot.
        System.out.println("### SELECTION SORT ALGORİTMASI ###");
    }
    private void selectionSort(){   // Selection Sort'un icra edildiği metot.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Lütfen 6 elemanlı bir dizi giriniz");
        
        for(int i=0; i<A.length; i++){
            System.out.print((i+1)+". eleman : ");
            A[i]=keyboard.nextInt();
        }
        
        System.out.println("========================================");
        for(int i=0; i<A.length-1; i++){    // Dizinin elemanlarını tek tek gezen for.
            int index=i;    // Dizinin o anki indisini tutan değişken.
            int temp;       // Swap için kullanılacak geçici değişken.
            for(int j=i+1; j<A.length; j++){ 
            //Her defasında dizinin o anki indisinden sonraki indise bakan for döngüsü.
                if(A[j]<A[index]){ 
                /**
                 * eğer dizinin o anki indisinden sonraki indisindeki eleman, 
                 * dizinin o anki indisindeki elemandan küçükse,   
                 * Yani bir sonraki eleman o anki elemandan küçükse.
                 **/ 
                
                    index=j;
                    /**
                     * O anki indisten sonraki indis (j), index değişkenine atılır
                     * Bunun nedeni, swap yaparken index indisli elemanı (A[index]), 
                     * dizimizin o anki indisindeki elemanla (A[i]) yer değiştirmektir 
                     * Yani küçük olan elemanı o anki elemanın yerine atmak istiyoruz 
                     * çünkü o anki indisteki eleman (A[i]), bir sonraki elemandan (A[j])
                     * daha büyük.
                     **/
                }
            }
            
            //Şu an dizinin o anki elemanı, bir sonraki elemandan büyük. [İstenmeyen durum]
            temp=A[i];      // Dizinin o anki elemanı geçici değişkende saklandı.
            A[i]=A[index];  // Küçük olan elemanı (A[index]), o anki elemana (A[i]) attık.
            A[index]=temp;  // O anki elemanı tutan geçici değişkeni de (temp), bir sonraki indise attık.
            //Sıralı olacak olan dizinin o anki elemanı bir sonraki elemanından küçük oldu.
            //[İstenen durum]
        }
    }
    public void getSelectionSort(){ //Selection Sort metodunun getter'ı
        selectionSort();
    }
    private void printSelectionSort(){  // Selection Sort'u ekrana basan metot.
        System.out.print("Girilen dizinin sıralanmış hali: " );
        for(int array:A){ //foreach yapısıyla dizinin ekrana basılması.
            System.out.print(array);
        }
        System.out.println("\n========================================");
    }
    public void getPrintSelectionSort(){  // Selection Sort'u ekrana basan metodunun getter'ı
        printSelectionSort();
    }
}
