package TreinamentoJavaGFT;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private List<String> bucho = new ArrayList<>();

    public void comer(String comida) {
        if (bucho.size() == 3) {
            System.out.println("Bucho cheio!");
        } else {
            bucho.add(comida);
        }
        System.out.println(bucho);
    }
    public void digerir(){
        if (bucho.isEmpty()){
            System.out.println("Bucho vazio...");
        }
        else
            bucho.remove(bucho.get(0));
        System.out.println(bucho);
    }
}