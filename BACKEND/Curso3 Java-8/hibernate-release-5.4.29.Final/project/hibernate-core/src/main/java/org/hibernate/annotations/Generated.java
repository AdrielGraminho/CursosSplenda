<<<<<<< HEAD
/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.hibernate.tuple.GeneratedValueGeneration;

/**
 * The annotated property is generated by the database.
 *
 * @author Emmanuel Bernard
 */
@ValueGenerationType( generatedBy = GeneratedValueGeneration.class )
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Generated {

	/**
	 * The enum value representing when the value is generated.
	 */
	GenerationTime value();
}
=======
/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.hibernate.tuple.GeneratedValueGeneration;

/**
 * The annotated property is generated by the database.
 *
 * @author Emmanuel Bernard
 */
@ValueGenerationType( generatedBy = GeneratedValueGeneration.class )
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Generated {

	/**
	 * The enum value representing when the value is generated.
	 */
	GenerationTime value();
}
>>>>>>> dce80c1d07a056dedcbdb24b5d712aacd1c4bafc
