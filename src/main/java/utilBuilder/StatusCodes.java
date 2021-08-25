package utilBuilder;

public enum StatusCodes {

    SUCCESS("200");

    private  String s;
    StatusCodes(String s) {
        this.s=s;
    }

    @Override
    public String toString(){
       return s.toString();
    }
}
