package Classe;
/**
 *
 * @author alefr
 */
public class Calculadora {

   public int soma(String pUm, String pDois){
                int valorUm = Integer.parseInt(pUm);
                int valorDois = Integer.parseInt(pDois);
                return valorUm + valorDois;
    }

    public double dividir(String pUm, String pDois){
                double valorUm = Double.parseDouble(pUm);
                double valorDois = Double.parseDouble(pDois);
                return valorUm / valorDois;
    } 

    public double raizQuadrada(String pUm){
                double valorUm = Double.parseDouble(pUm);
                return valorUm * valorUm;
    }
 }
