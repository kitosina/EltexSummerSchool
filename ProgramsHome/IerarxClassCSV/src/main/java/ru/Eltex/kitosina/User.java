package ru.Eltex.kitosina;

abstract class User{
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
    public void getFIO(){
        System.out.println("FIO: "+this.FIO);
    }
    public void getEmail(){
        System.out.println("Email: "+this.Email);
    }
    public void getPhone(){
        System.out.println("Phone: "+this.Phone);
    }
    public void getId(){
        System.out.println("Id: "+this.Id);
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
