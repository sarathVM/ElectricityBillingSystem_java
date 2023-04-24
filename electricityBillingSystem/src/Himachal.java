public class Himachal extends Customer{
    public Himachal()
    {
        super();
    }
    public Himachal(String cName, String cID, String cLoc, int nUnits)
    {
        super(cName, cID, cLoc,nUnits);
    }
    public void setnUnits(int nUnits) {
        this.nUnits = nUnits;
        setUnitCost();
    }
    @Override
    public void setUnitCost()
    {
        if(nUnits<=500)unitCost=11;
        else if (nUnits>500&&nUnits<=600)unitCost=12;
        else if (nUnits>600&&nUnits<=700)unitCost=13;
        else unitCost=14;


    }
    @Override
    public double getUnitCost()
    {
        return unitCost;
    }


}
