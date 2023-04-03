package Rest_Assignment_part2.filtering;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filteriing(){
        return new SomeBean("value1","value2","value3");
    }


    //DYNAMIC FILTERING
    @GetMapping("/dynamic")
    public MappingJacksonValue filter(){
        SomeBean sb=new SomeBean("value1","value2","value3");
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(sb);
        FilterProvider filters=new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;

    }

}
