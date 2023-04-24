public class Jammu extends Customer{
    public Jammu()
{
    super();
}
    public Jammu(String cName,String cID, String cLoc, int nUnits)
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
        if(nUnits<=500)unitCost=10;
        else if (nUnits>500&&nUnits<=600)unitCost=11;
        else if (nUnits>600&&nUnits<=700)unitCost=12;
        else unitCost=13;


    }
    @Override
    public double getUnitCost()
    {
        return unitCost;
    }


}
