package ru.Eltex.kitosina;

abstract class User implements CSV {
    private Byte Id;
    private String FIO;
    private String Email;
    private String Phone;
    User(Byte Id,String FIO, String Email, String Phone) {
        setFIO(FIO);
        setEmail(Email);
        setId(Id);
        setPhone(Phone);
    }
    User(){

    }
    protected String getFIO() {
        return FIO;
    }
    protected String getEmail() {

        return Email;
    }
    protected String getPhone() {
        return Phone;
    }
    protected Byte getId() {
        return Id;
    }
    protected void setId(Byte Id) {
        this.Id = Id;
    }
    protected void setFIO(String FIO) {
        this.FIO = FIO;
    }
    protected void setEmail(String Email) {
        this.Email = Email;
    }
    protected void setPhone(String Phone) {
        this.Phone = Phone;
    }
}

