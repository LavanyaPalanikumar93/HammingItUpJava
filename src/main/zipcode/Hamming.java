package zipcode;

public class Hamming {
    String s;
    String s1;
    public Hamming(String s, String s1) {
        this.s=s;
        this.s1=s1;
        if(s.length()!=s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        String[] a=s.split("");
        String[] b=s1.split("");
        int count=0;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])){
                count++;
            }
        }return count;




    }
}
