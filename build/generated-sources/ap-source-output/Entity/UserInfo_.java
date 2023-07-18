package Entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T14:11:31", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(UserInfo.class)
public class UserInfo_ { 

    public static volatile SingularAttribute<UserInfo, String> firstName;
    public static volatile SingularAttribute<UserInfo, String> lastName;
    public static volatile SingularAttribute<UserInfo, String> password;
    public static volatile SingularAttribute<UserInfo, String> address2;
    public static volatile SingularAttribute<UserInfo, String> address1;
    public static volatile SingularAttribute<UserInfo, String> mobile;
    public static volatile SingularAttribute<UserInfo, Integer> userId;
    public static volatile SingularAttribute<UserInfo, String> email;

}