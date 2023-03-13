package examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Qualifier("MySQL")
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{4,5,2,6,1,0,9,3};
    }
}
