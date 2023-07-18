package Entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T14:11:31", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Integer> productId;
    public static volatile SingularAttribute<Orders, Integer> orderId;
    public static volatile SingularAttribute<Orders, Integer> qty;
    public static volatile SingularAttribute<Orders, Integer> userId;
    public static volatile SingularAttribute<Orders, String> trxId;
    public static volatile SingularAttribute<Orders, String> pStatus;

}