/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
<<<<<<< HEAD
 * Copyright (c) 2012, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
=======
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
>>>>>>> upstream/master
 */
package org.hibernate.test.annotations.embeddables;

import java.io.Serializable;
<<<<<<< HEAD
import java.math.BigDecimal;
=======
>>>>>>> upstream/master
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
<<<<<<< HEAD
import org.hibernate.engine.spi.SessionImplementor;
=======
import org.hibernate.engine.spi.SharedSessionContractImplementor;
>>>>>>> upstream/master
import org.hibernate.usertype.UserType;

/**
 * @author Chris Pheby
 */
public class DollarValueUserType implements UserType {

	@Override
	public int[] sqlTypes() {
		return new int[] {Types.BIGINT};
	}

	@Override
	public Class<DollarValue> returnedClass() {
		return DollarValue.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		if (!(x instanceof DollarValue) || !(y instanceof DollarValue)) {
			throw new HibernateException("Expected DollarValue");
		}
		return ((DollarValue)x).getAmount().equals(((DollarValue)y).getAmount());
	}

	@Override
	public int hashCode(Object x) throws HibernateException {
		if (!(x instanceof DollarValue)) {
			throw new HibernateException("Expected DollarValue");
		}
		return ((DollarValue)x).getAmount().hashCode();
	}

	@Override
<<<<<<< HEAD
	public DollarValue nullSafeGet(ResultSet rs, String[] names,
			SessionImplementor session, Object owner)
			throws HibernateException, SQLException {
		
		DollarValue result = new DollarValue(rs.getBigDecimal(rs.findColumn(names[0])));
		return result;
	}

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index,
			SessionImplementor session) throws HibernateException, SQLException {
		
=======
	public DollarValue nullSafeGet(
			ResultSet rs,
			String[] names,
			SharedSessionContractImplementor session,
			Object owner) throws HibernateException, SQLException {
		return new DollarValue( rs.getBigDecimal( rs.findColumn( names[0])));
	}

	@Override
	public void nullSafeSet(
			PreparedStatement st,
			Object value,
			int index,
			SharedSessionContractImplementor session) throws HibernateException, SQLException {
>>>>>>> upstream/master
		st.setBigDecimal(index, ((DollarValue)value).getAmount());
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
<<<<<<< HEAD
		DollarValue result = new DollarValue();

		return result;
=======
		return new DollarValue();
>>>>>>> upstream/master
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		return null;
	}

	@Override
	public Object assemble(Serializable cached, Object owner)
			throws HibernateException {
		return null;
	}

	@Override
	public Object replace(Object original, Object target, Object owner)
			throws HibernateException {
		return null;
	}
}
