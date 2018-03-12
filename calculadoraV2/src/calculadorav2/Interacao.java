    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */
package calculadorav2;
import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class Interacao extends Formulas{
    Scanner sc = new Scanner(System.in);
   private double tsao, f;
   private double PotReal, PotReatv;
   private double ff, ptcn, ffd;
  public double getF(){
      return this.f;
  }
  public void setF(double f){
      this.f = f;
  }
  public double getTsao(){
      return this.tsao;
  }
  public void setTsao(double tsao){
      this.tsao = tsao;
  }
  public double getffd(){
      return this.ffd;
  }
  public void setffd(double ffd){
      this.ffd = ffd;
  }
  public double getff(){
      return this.ff;
  }
  public void setff(double ff){
      this.ff = ff;
  } 
  public double getPtcn(){
      return this.ptcn;
  }
  public void setPtcn(double ptcn){
      this.ptcn = ptcn;
  }
  public double getPotReal(){
       return this.PotReal;   
  }
  public void setPotReal(double PotReal){
      this.PotReal = PotReal;
  }
  public double getPotReatv(){
      return PotReatv;
  }
  public void setPotReatv(double PotReatv){
      this.PotReatv = PotReatv;
  }
   public void InteragePotencias(){
       System.out.println("Potencia Real");
       setPotReal(sc.nextDouble());
       System.out.println("Potencia Reativa");
       setPotReatv(sc.nextDouble());
       this.CalcImpedancia(getPotReal(), getPotReatv());
       System.out.println("Impedância = "+ getZ());
   }
   public void InteragePoreatv(){
       System.out.println("Fator de Potencia atual");
       setff(sc.nextDouble());
       System.out.println("Potencia ativa");
       setPtcn(sc.nextDouble());
       System.out.println("Fator de Potencia desejada");
       setffd(sc.nextDouble());
       System.out.println("Tensão no sistema");
       setTsao(sc.nextDouble());
       System.out.println("Frequencia");
       setF(sc.nextDouble());
       this.CalcPotat(getff(), getPtcn());
       this.CalcPotdz(getffd(), getPtcn());
       this.CalcReacp(getTsao(), (getQd() - getQa()));
       this.CalcCapQ(getF());
       System.out.println("Potencia reativa: "+ getQa());
       System.out.println("Potencia reativa dezejada: "+ getQd());
       System.out.println("Diferença: "+ (getQd() - getQa()));
       System.out.println("Xcap: "+ getXcap());
       System.out.println("CapQ: "+ getCeQ()*1000000 + "\u00B5f");
       
       
   }
}
