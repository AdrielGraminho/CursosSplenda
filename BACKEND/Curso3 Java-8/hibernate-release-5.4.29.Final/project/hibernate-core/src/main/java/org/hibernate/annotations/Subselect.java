<<<<<<< HEAD
/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Map an immutable and read-only entity to a given SQL select expression.
 *
 * @see Synchronize
 *
 * @author Sharath Reddy
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface Subselect {
	/**
	 * The query.
	 */
	String value();
}
=======
/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Map an immutable and read-only entity to a given SQL select expression.
 *
 * @see Synchronize
 *
 * @author Sharath Reddy
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface Subselect {
	/**
	 * The query.
	 */
	String value();
}
>>>>>>> dce80c1d07a056dedcbdb24b5d712aacd1c4bafc
