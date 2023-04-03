package Rest_Assignment_part2.Versioning;

public class PersonV1 {
    private String name;
    PersonV1(String name){
        super();
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "PersonV1 "+name;
    }
}
