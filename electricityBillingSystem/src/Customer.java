
public abstract class Customer {
    //i.Encapsulation
    private String cName;
    private String cID;
    private String cLoc;
    public int nUnits;
    static double unitCost;

    public Customer(){

    }
    public Customer(String cName,String cID,String cLoc,int nUnits) {
        this.cName = cName;
        this.cID = cID;
        this.cLoc = cLoc;
        this.nUnits=nUnits;
    }

    public void setcName(String cName)throws IllegalArgumentException {
           if(cName.isBlank()) throw new IllegalArgumentException("Name field cannot be empty");


        this.cName = cName;
    }

    public void setcID(String cID) {
        if (cID.matches("[0-9]+")) this.cID = cID;
        else {
            throw new IllegalArgumentException("Enter valid ID");
        }

    }

    public void setcLoc(String cLoc) {
        this.cLoc = cLoc;
    }

    public void setnUnits(int nUnits) {
        this.nUnits = nUnits;
    }

    public String getcName() {
        return cName;
    }
    public String getcID() {
        return cID;
    }
    public String getcLoc() {
        return cLoc;
    }

    public abstract double getUnitCost();

    public abstract void setUnitCost();

    public void bill(){
        Pattern p = new Pattern("=");
//        System.out.println("===========================================================================================================================================================================================================================================================================================================");
       p.print();
        System.out.println();
        System.out.println("Customer Name: "+cName);
        System.out.println("Customer ID "+cID);
        System.out.println("Location: "+cLoc);
        System.out.println("Cost per Unit: "+getUnitCost());
        System.out.println("Total Units: "+nUnits);
        System.out.println("Total payable amount: "+getUnitCost()*nUnits);
//        System.out.println("=========================================================================================================================================================================================================================================================================================================================");
        p.print();
        System.out.println();
        System.out.println("THANK YOU");
//        System.out.println("===============================================================================================================================================================================================================================================================================================");
        p.print();
    }
}
