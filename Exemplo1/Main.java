package Exercicio1;

public class Main {

public static void main(String[] args) {
    	
        Generics<String> d1 = new Generics<>("Oi");
        String str1 = d1.getDado();
        System.out.println(str1);

        Generics<Integer> d2 = new Generics<>(123);
        Integer int1 = d2.getDado();
        System.out.println(int1);

        Nome objeto = new Nome("Teste");
        Generics<Nome> d3 = new Generics<>(objeto);
        Nome obj1 = d3.getDado();
        System.out.println(obj1);
    }
}
