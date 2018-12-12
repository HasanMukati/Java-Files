
public class Address {

    private int houseNo;
    private String street;
    private int apartmentNum;
    private String city;
    private String state;
    private int postalCode;
    
    public Address(int hNo,String st,int aNo,String cty,String State,int pCode){
        houseNo=hNo;
        street=st;
        apartmentNum=aNo;
        city=cty;
        state=State;
        postalCode=pCode;
    }
    public Address(int hNo,String st,String cty,String State,int pCode){
        houseNo=hNo;
        street=st;
        city=cty;
        state=State;
        postalCode=pCode;
    }
    public void print(){
        System.out.println(houseNo+" "+street);
        System.out.println(city+" "+state+" "+postalCode);
    }
    public boolean comesBefore(Address other){
        if(this.postalCode<other.postalCode)
            return true;
        else
            return false;
    }
}