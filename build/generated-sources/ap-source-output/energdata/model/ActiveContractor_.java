package energdata.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ActiveContractor.class)
public abstract class ActiveContractor_ {

	public static volatile SingularAttribute<ActiveContractor, SimpleObjectProperty> end_date;
	public static volatile SingularAttribute<ActiveContractor, StringProperty> natureOfContract;
	public static volatile SingularAttribute<ActiveContractor, LongProperty> id;
	public static volatile SingularAttribute<ActiveContractor, StringProperty> contrator;
	public static volatile SingularAttribute<ActiveContractor, StringProperty> user_dept;
	public static volatile SingularAttribute<ActiveContractor, IntegerProperty> value;
	public static volatile SingularAttribute<ActiveContractor, StringProperty> remarks;
	public static volatile SingularAttribute<ActiveContractor, SimpleObjectProperty> start_date;

}

