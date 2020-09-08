
package Matrices;
public class Suma {
    int [][]numeros ;
    public Suma(int i, int j){
    numeros = new int[i][j];
    
    }
    public void LlenarMatriz(){
    int l=1;
    for(int i=0; i<numeros.length; i++){
        for(int j=0; j<numeros[i].length; j++){
            numeros [i][j] = l;
            l++;
        }
    
    }
    }
    
    public void ImprimirMatriz(){
    
    for(int i=0; i<numeros.length; i++){
        for(int j=0; j<numeros[i].length; j++){
            System.out.print(numeros[i][j]+" ");
            
        }
        System.out.println(" ");
    
    }
    }
    public void SumarMatriz(){
        int suma;
        for(int i=0; i<numeros.length; i++){
        suma =0;
        for(int j=0; j<numeros[i].length; j++){
            suma +=numeros [i][j];
        
        }
            System.out.println("la suma es: "+suma);
        }
    }
}
