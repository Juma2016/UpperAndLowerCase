package at.fhj.msd;

public class LowerCase {

    public String convertToLowerCase(String s){
        if(s==null||s.isBlank())
            throw new IllegalArgumentException();

        return s.toLowerCase();
    }
}