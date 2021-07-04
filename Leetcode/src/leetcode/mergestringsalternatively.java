package leetcode;

class mergestringsalternatively {
    public String mergeAlternately(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        char[] res = new char[word1.length()+word2.length()];
        int i=0,j=0,k=0;
        if(word1.length()==0)
            return word2;
        if(word2.length()==0)
            return word1;
        while(i<c1.length&&j<c2.length){
            
                    res[k]= c1[i];
                    ++k;
                    i=i+1;
                    res[k] =c2[j];
                    j=j+1;
                    ++k;
                   // System.out.println(res[k]);
        }
       // System.out.println(k+" "+j);

            while(i<c1.length){
            res[k]= c1[i];
            
                    k=k+1;
                    i=i+1;                
            }
     
            while(j<c2.length){
            res[k]= c2[j];
                    ++k;
                    j=j+1;
            }
      
        String sfinal = new String(res);
        return sfinal;
    }
    
    public static void main(String args[]) {
    	mergestringsalternatively ms = new mergestringsalternatively();
    	String word1 = "abc";
    	String word2 = "pqrstu";
    	String res = ms.mergeAlternately(word1, word2);
    	System.out.println(res);
    }
}