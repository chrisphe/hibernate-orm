/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.jpa.event.spi;

import org.hibernate.jpa.event.internal.core.HibernateEntityManagerEventListener;

/**
 * Contract for injecting the registry of Callbacks into event listeners.
 *
 * @author Emmanuel Bernard
 * @author Steve Ebersole
 */
public interface CallbackRegistryConsumer extends HibernateEntityManagerEventListener {
	/**
	 * Injection of the CallbackRegistry
	 *
	 * @param callbackRegistry The CallbackRegistry
	 */
	void injectCallbackRegistry(CallbackRegistry callbackRegistry);
}
