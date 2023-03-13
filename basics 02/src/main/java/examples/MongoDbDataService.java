package examples;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Primary
@Component
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {1,4,2,6,3,5,8,0};
    }
}
