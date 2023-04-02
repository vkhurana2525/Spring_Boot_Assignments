package Rest_Assignment_part2.Versioning;

public class Name {
    private String fname;
    private String lname;
    Name(String fname, String lname){
        super();
        this.fname=fname;
        this.lname=lname;
    }

    public String getName(){
        return fname+ " " + lname;
    }

    @Override
    public String toString(){
        return "PersonV2 "+fname+" "+lname;
    }
}
