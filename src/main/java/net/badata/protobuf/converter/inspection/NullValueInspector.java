/*
 * Copyright (C) 2016  BAData Creative Studio
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package net.badata.protobuf.converter.inspection;

/**
 * Interface for examine protobuf fields for null(default) values.
 *
 * @author jsjem
 */
public interface NullValueInspector {

	/**
	 * Check whether some value satisfy conditions held by this inspector.
	 *
	 * @param value Value for test.
	 * @return True if inspection is successful.
	 */
	boolean isNull(final Object value);
}
