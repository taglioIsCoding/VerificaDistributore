/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica.dsitributore;

/**
 *
 * @author 72873486
 */
public class Distributore {
    private double costo1;
    private double costo2;
    private int bottiglie1;
    private int bottiglie2;
    private double importo;
    
    public Distributore(double costo1,double costo2, int bottiglie1,int bottiglie2,double importo )
    {
     this.costo1=costo1;
     this.costo2=costo2;
     this.bottiglie1=bottiglie1;
     this.bottiglie2=bottiglie2;
     this.importo=importo;
    }

    public double getCosto1()
    {
        return costo1;
    }

    public double getCosto2() 
    {
        return costo2;
    }

    public int getBottiglie1()
    {
        return bottiglie1;
    }

    public int getBottiglie2()
    {
        return bottiglie2;
    }

    public double getImporto() 
    {
        return importo;
    }

    public void setCosto1(double costo1)
    {
        this.costo1 = costo1;
    }

    public void setCosto2(double costo2)
    {
        this.costo2 = costo2;
    }

    public void setBottiglie1(int bottiglie1) 
    {
        this.bottiglie1 = bottiglie1;
    }

    public void setBottiglie2(int bottiglie2)
    {
        this.bottiglie2 = bottiglie2;
    }

    public void setImporto(double importo) 
    {
        this.importo = importo;
    }
    
    public void ricaricaDistributore(int n1, int  n2)
    {
        this.setBottiglie1(this.getBottiglie1()+ n1);
        this.setBottiglie2(this.getBottiglie2()+ n2);
        System.out.println("Ricarica effettuata");
        System.out.println("n. bottiglie bevanda 1= "+this.getBottiglie1());
        System.out.println("n. bottiglie bevanda 2= "+this.getBottiglie2());
    }
    
    public void inserrisciMonete(double valore)
    {
        if (valore==0.05||valore==0.10||valore==0.20||valore==0.50||valore==1.00)
        {
            this.setImporto(this.getImporto()+valore);
            System.out.println("il tuo credito ammonta a = "+this.getImporto());
        }
        else 
        {
            System.out.println("moneta non valida");
        }
    }
    
    public void scegliBevanda(int b)
    {
        if (b==1)
        {
         if (this.getImporto()>=this.getCosto1())
         {
         System.out.println("erogazione in corso");    
         this.setImporto(this.getImporto()-this.getCosto1());
         System.out.println("ritira il resto di "+this.getImporto()); 
         }
         else
         {
          System.out.println("credito insufficiente");
         }
        }
         if (b==2)
        {
         if (this.getImporto()>=this.getCosto2())
         {
         System.out.println("erogazione in corso"); 
         this.setImporto(this.getImporto()-this.getCosto1());
         System.out.println("ritira il resto di "+this.getImporto()); 
         }
         else
         {
          System.out.println("credito insufficiente");
         }
        } 
    }  
    
    public void ritiraResto()
    {
        System.out.println("ritira il resto di "+this.getImporto());
        this.setImporto(0);
    }
    
    public void visualizzaStato()
    {
        System.out.println("*************");
        System.out.println("numero bottiglie 1= "+this.getBottiglie1());
        System.out.println("numero bottiglie 2= "+this.getBottiglie2());
        System.out.println("costo 1= "+this.getCosto1());
        System.out.println("costo 2= "+this.getCosto2());
        System.out.println("*************");      
    }
           
}

