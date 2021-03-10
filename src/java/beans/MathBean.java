package beans;

public class MathBean implements java.io.Serializable {

    private long numbera, numberb;
    

    public MathBean() {
   
    }

    public long getNumbera() {
        return numbera;
    }

    public void setNumbera(long numbera) {
        this.numbera = numbera;
    }

    public long getNumberb() {
        return numberb;
    }

    public void setNumberb(long numberb) {
        this.numberb = numberb;
    }

    public long add() {
        return numbera + numberb;
    }

    public long sub() {
        return numbera - numberb;
    }

    public long mul() {
        return numbera * numberb;
    }

    public long divide() {
        if (numberb == 0) {
            return 0;
        }
        return numbera / numberb;
    }

    public long modulus() {
        if (numberb == 0) {
            return 0;
        } 
        return numbera % numberb;
    }
    
    public long expon() {
       return (long) Math.pow(numbera, numberb);
    }
    
    public long squareroota() {
       return (long) Math.sqrt(numbera);
    }
        
    public long squarerootb() {
       return (long) Math.sqrt(numberb);
    }
    
    public long cuberoota() {
       return (long) Math.cbrt(numbera);
    }
    
    public long cuberootb() {
       return (long) Math.cbrt(numberb);
    }
    
    public double sinea() {
       double radians1;
       radians1 = Math.toRadians(numbera);
       return (double) Math.round((Math.sin(radians1)) * 100) / 100;
    }
    
    public double sineb() {
       double radians2;
       radians2 = Math.toRadians(numberb);
       return (double) Math.round((Math.sin(radians2)) * 100) / 100;
    }
    
    public double cosinea() {
       double radians1;
       radians1 = Math.toRadians(numbera);
       return (double) Math.round((Math.cos(radians1)) * 100) / 100;
    }
    
    public double cosineb() {
       double radians2;
       radians2 = Math.toRadians(numberb);
       return (double) Math.round((Math.cos(radians2)) * 100) / 100;
    }
        
    public double tangenta() {
       double radians1;
       radians1 = Math.toRadians(numbera);
       return (double) Math.round((Math.tan(radians1)) * 100) / 100;
    }    
    
    public double tangentb() {
       double radians2;
       radians2 = Math.toRadians(numberb);
       return (double) Math.round((Math.tan(radians2)) * 100) / 100;
    }
    
}
