/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorav2;


/**
 *
 * @author wesley
 */
// Qa = potencia reativa
public class Formulas {
    private double Qd;
    private double Qa;
    private double Z;
    private double AngFase;
    private double Xcap;
    private double ceQ;
   public double getCeQ(){
       return this.ceQ;
   }
   public void setCeQ(double ceQ){
       this.ceQ = ceQ;
   }
   public double getXcap(){
        return this.Xcap;
    }
   public void setXcap(double Xcap){
       this.Xcap = Xcap;
   } 
   public double getQd(){
       return this.Qd;
   }
   public void setQd(double Qd){
       this.Qd = Qd;
   }
   public double getQa(){
       return this.Qa;
   }
   public void setQa(double Qa){
       this.Qa = Qa;
   }
   public double getZ(){
       return this.Z;
   }
   public void setZ(double Z){
       this.Z = Z;
   }
   public double getAngFase(){
       return this.AngFase; 
   }
   public void setAngFase(double AngFase){
       this.AngFase = AngFase;
   }
    public void CalcImpedancia(double PotReal, double PotReatv){   
      setZ(Math.sqrt(Math.pow(PotReal,2) + Math.pow(PotReatv,2)));   
    }
    public void CalcAngFase(double PotReal, double PotReatv){
        double tang;
        tang = PotReal/PotReatv; 
    }
    // potencia reativa atual; variaveis: ff = Fator de potencia atual, ptat = potencia consumda 
    public void CalcPotat(double ff, double ptcn){
      setQa(ptcn*(Math.tan(Math.acos(ff))));
    }
    // potencia reativa de desejada
    public void CalcPotdz(double ff, double ptcn){
        setQd(ptcn*(Math.tan(Math.acos(ff))));
    }
    // reatancia capacitiva; Variaveis: tsao = tensão 
    public void CalcReacp(double tsao, double Qcap){
        setXcap(-(Math.pow(tsao,2))/Qcap);
    }
    // Capacitância equivalente; variaveis: f = frequencia
    public void CalcCapQ(double f){
        setCeQ(1/(2*Math.PI*f*getXcap()));
    }
}
