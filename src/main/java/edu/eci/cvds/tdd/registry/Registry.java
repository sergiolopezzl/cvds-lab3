package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;

public class Registry {
    private ArrayList<Integer> idsPerson = new ArrayList<Integer>(); 
    public RegisterResult registerVoter(Person p) {
        RegisterResult resultado = null;
       
        if(!p.isAlive()){
            resultado = RegisterResult.DEAD;
        }else if(p.getAge()>0 && p.getAge()<18){
            resultado = RegisterResult.UNDERAGE;
        }else if(p.getAge()<=0){
            resultado = RegisterResult.INVALID_AGE;
        }else if(idsPerson.contains(p.getId())){
            resultado = RegisterResult.DUPLICATED;
        }else{
            idsPerson.add(p.getId());
            resultado = RegisterResult.VALID;
        }
        return resultado;
    }
}