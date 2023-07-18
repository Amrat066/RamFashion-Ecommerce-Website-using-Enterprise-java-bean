package Entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T14:11:31", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Logs.class)
public class Logs_ { 

    public static volatile SingularAttribute<Logs, Date> date;
    public static volatile SingularAttribute<Logs, String> action;
    public static volatile SingularAttribute<Logs, Integer> id;
    public static volatile SingularAttribute<Logs, String> userId;

}