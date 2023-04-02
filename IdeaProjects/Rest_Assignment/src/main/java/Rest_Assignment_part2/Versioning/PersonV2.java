package Rest_Assignment_part2.Versioning;

public class PersonV2 {
    private Name name;
    PersonV2(Name name){
        super();
        this.name=name;
    }

    public Name getName(){
        return name;
    }

    @Override
    public String toString(){
        return "PersonV1 "+name;
    }
}
