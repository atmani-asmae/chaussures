package pack;

public class Chaussures {

	public static void main(String[] args) {
    int monTableau[]= {10,20,20,10,10,30,50,10,90,16,50,77};
    		int nb=0 , count = 0;
    	
    		for(int i=0; i < monTableau.length-1; i++){
    		    
    			for(int j=i+1; j < monTableau.length; j++){
        		    if(monTableau[i]==monTableau[j])
        		    	count++;
        		}
    			if((count % 2) == 0) {
    				nb++;
    			}
    			
    			
    		}
    		count/=2;
    		
    		System.out.println("Le nombre des paires est :"+count);

    		System.out.println("Le nombre total de chaussures orphelines est :"+(nb-count));
	}

}
