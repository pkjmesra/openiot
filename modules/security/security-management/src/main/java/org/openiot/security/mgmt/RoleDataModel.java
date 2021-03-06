/**
 * Copyright (c) 2011-2014, OpenIoT
 *
 * This library is free software; you can redistribute it and/or
 * modify it either under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation
 * (the "LGPL"). If you do not alter this
 * notice, a recipient may use your version of this file under the LGPL.
 *
 * You should have received a copy of the LGPL along with this library
 * in the file COPYING-LGPL-2.1; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY
 * OF ANY KIND, either express or implied. See the LGPL  for
 * the specific language governing rights and limitations.
 *
 * Contact: OpenIoT mailto: info@openiot.eu
 */

package org.openiot.security.mgmt;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.openiot.lsm.security.oauth.mgmt.Role;
import org.primefaces.model.SelectableDataModel;

/**
 * @author Mehdi Riahi
 *
 */
public class RoleDataModel extends ListDataModel<Role> implements SelectableDataModel<Role> {

	public RoleDataModel() {
	}

	public RoleDataModel(List<Role> list) {
		super(list);
	}

	@Override
	public Role getRowData(String rowKey) {
		@SuppressWarnings("unchecked")
		List<Role> roles = (List<Role>) getWrappedData();

		for (Role role : roles) {
			if (role.getName().equals(rowKey))
				return role;
		}

		return null;
	}

	@Override
	public Object getRowKey(Role role) {
		return role.getName();
	}

}
