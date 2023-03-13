package examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessLogicExample {
    @Autowired @Qualifier("MySQL")
    private DataService dataService;
    public int max(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
