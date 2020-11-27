package grop.homework7_3;

public class Methode {
    Metrs metrs = new Metrs();
    Inch inch = new Inch();
    mile mile =new mile();
    public double MetrsforMils(Metrs metrs){
        return  metrs.getMetrs() * 0.0000254;
    }
    public double MilsforMetrs(mile mile){
        return mile.getMils()/0.0000254;
    }
    public double InchForCM(CM cm){
        return cm.getCm()* 0.393701;
    }
    public double CmForInch(Inch inch){
        return inch.getInch()/ 0.393701;
    }

}
