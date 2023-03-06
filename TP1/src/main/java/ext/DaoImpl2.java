package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version 2");
        double temp = 60;
        return temp;
    }
}
