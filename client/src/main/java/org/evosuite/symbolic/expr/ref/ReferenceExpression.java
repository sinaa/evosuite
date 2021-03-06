/**
 * Copyright (C) 2010-2016 Gordon Fraser, Andrea Arcuri and EvoSuite
 * contributors
 *
 * This file is part of EvoSuite.
 *
 * EvoSuite is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3.0 of the License, or
 * (at your option) any later version.
 *
 * EvoSuite is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with EvoSuite. If not, see <http://www.gnu.org/licenses/>.
 */
package org.evosuite.symbolic.expr.ref;

import org.evosuite.symbolic.expr.Expression;
import org.evosuite.symbolic.expr.SymbolicValue;

/**
 * 
 * @author galeotti
 *
 */
public interface ReferenceExpression extends Expression<Object>, SymbolicValue{

	/**
	 * Returns the concrete object for this reference. The object is stored as a
	 * weak reference. A weak reference returns null if only weak references
	 * have access to the object
	 * 
	 * @return
	 */
	public Object getWeakConcreteObject();
}
