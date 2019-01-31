import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Diana on 31.01.2019.
 */

@Entity
public class Employee {
    @PrimaryKey
    public long id;

    public String name;

    public int salary;
}
