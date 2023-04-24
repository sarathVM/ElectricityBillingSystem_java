public class Punjab extends Customer{

    public Punjab()
    {
        super();
    }

    public Punjab(String cName, String cID, String cLoc, int nUnits) {
        super(cName, cID, cLoc, nUnits);
    }

    public void setnUnits(int nUnits) {
            this.nUnits = nUnits;
            setUnitCost();
        }
        @Override
        public void setUnitCost()
        {
            if(nUnits<=500)unitCost=7;
            else if (nUnits>500&&nUnits<=600)unitCost=8;
            else if (nUnits>600&&nUnits<=700)unitCost=9;
            else unitCost=10;


        }
        @Override
        public double getUnitCost()
        {
                return unitCost;
        }


}
