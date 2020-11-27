package grop.homework7_3;

public class MAin {
    public static void main(String[] args) {
        Methode methode = new Methode();
        Metrs metrs = new Metrs();
        Inch inch = new Inch();
        CM cm = new CM();
        metrs.setMetrs(275590.5509);
        double metre = methode.MetrsforMils(metrs);
        System.out.println("Metr To MIls " + metre);
        mile mils1 = new mile();
        mils1.setMils(7);
        double mils = methode.MilsforMetrs(mils1);
        System.out.println("mils To metr " + mils);
        inch.setInch(564);
        double inch1 = methode.CmForInch(inch);
        System.out.println("Inch for Cm" + inch1);
        cm.setCm(654);
        double cm1 = methode.InchForCM(cm);
        System.out.println("Cm for Inch"+ cm1);
    }


}
