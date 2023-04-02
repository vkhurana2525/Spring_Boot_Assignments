package Rest_Assignment_part2.Versioning;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    //10.VERSIONING RESTFUL APIS

    //1.By URL
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersion(){
        return new PersonV1("Bob");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersion(){
        return new PersonV2(new Name("Bob","Duke"));
    }

   //2.Request Parameter
    @GetMapping(path="/person",params="version=1")
    public PersonV2 getSecondVersionRequestParam(){
        return new PersonV2(new Name("Bob","Duke"));
    }

    //3.Request Header
    @GetMapping(path="/person/headerV1",headers="X-API-VERSION=1")
    public PersonV2 getSecondVersionRequestHeader(){
        return new PersonV2(new Name("Bob","Duke"));
    }

    //4.Media Type Versioning
    @GetMapping(path="/person/accept",produces="application/vnd.company.app-v1+json")
    public PersonV1 getSecondVersionRequestMediaType(){
        return new PersonV1("Bob Duke");
    }

}


