package at.fhj.msd;

public class UpperCase {

    public String convertToUpperCase(String s){
        if(s==null||s.isBlank())
            throw new IllegalArgumentException();

        return s.toUpperCase();
    }
}