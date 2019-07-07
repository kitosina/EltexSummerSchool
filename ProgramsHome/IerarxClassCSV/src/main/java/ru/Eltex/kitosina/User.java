package ru.Eltex.kitosina;

public abstract class User implements CSV{
    private Byte Id;
    private String FIO;
    private String Email;
    private String Phone;
    User (String FIO,String Email, String Phone,Byte Id){
        setFIO(FIO);
        setEmail(Email);
        setId(Id);
        setPhone(Phone);
    }
    public String getFIO(){
        return FIO;
    }
    public String getEmail() {
        return Email;
    }
    public String getPhone(){
        return Phone;
    }
    public Byte getId(){
        return Id;
    }
    private void setId(Byte Id){

        this.Id=Id;
    }
    private void setFIO(String FIO){
        this.FIO=FIO;
    }
    private void setEmail(String Email){

        this.Email=Email;
    }
    private void setPhone(String Phone){

        this.Phone=Phone;
    }
}
