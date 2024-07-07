
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetMain {
    public static void main(String[] args) {
        
        
        /*Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();
        
        //hashset
        set1.add("PHP");
        set1.add("java");
        set1.add("C++");
        set1.add("JavaScript");
        //linkhashset
        set2.add("PHP");
        set2.add("java");
        set2.add("C++");
        set2.add("JavaScript");
        //treeset
        set3.add("PHP");
        set3.add("java");
        set3.add("C++");
        set3.add("JavaScript");
        
        
        System.out.println("HashSet-------------------");
        for(String s:set1){
            System.out.println(s);
        }
        
        System.out.println("LinkedSet-------------------");
        for(String s:set2){
            System.out.println(s);
        }
        
        System.out.println("TreeSet-------------------");
        for(String s:set3){
            System.out.println(s);
        }*/
        
        //Containste arama yapıyor listenin içinde
        /*System.out.println(set1.contains("Java"));//false
        System.out.println(set1.contains("C++"));//true
        
        
        //içi boş olup olmadğıını bakıyor.
        System.out.println(set1.isEmpty());*/
        
        
        Set<String> set1= new HashSet<String>();
        Set<String> set2= new HashSet<String>();
        
        set1.add("PHP");
        set1.add("java");
        set1.add("C++");
        set1.add("JavaScript");
        
        set2.add("PHP");
        set2.add("java");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("GO");
        
        Set<String> fark= new HashSet<String>(set2);
        
        //FARK KÜMESİNİ KOTNROL EDLİYOR
        System.out.println(fark.removeAll(set1));//boş küme ise false doğru ise true
        System.out.println(fark);
        
        Set<String> kesisim = new HashSet<String>(set2);
        
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
        
        
        
    }
    
    
    
    
    //Aynı değeri bir daha depolayamıyor yani php ekledik bir şey değişmz zaten var ekstra
    //bir tane daha eklenmiş olmuyor.
}
