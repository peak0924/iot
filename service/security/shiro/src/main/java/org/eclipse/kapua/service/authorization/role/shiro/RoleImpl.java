/*******************************************************************************
 * Copyright (c) 2016, 2019 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.authorization.role.shiro;

import org.eclipse.kapua.KapuaException;
import org.eclipse.kapua.commons.model.AbstractKapuaNamedEntity;
import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.service.authorization.role.Role;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * {@link Role} implementation.
 *
 * @since 1.0.0
 */
@Entity(name = "Role")
@Table(name = "athz_role")
public class RoleImpl extends AbstractKapuaNamedEntity implements Role {

    private static final long serialVersionUID = -3760818776351242930L;

    protected RoleImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param scopeId The scope {@link KapuaId}
     * @since 1.0.0
     */
    public RoleImpl(KapuaId scopeId) {
        super(scopeId);
    }

    /**
     * Constructor.
     * <p>
     * Creates a soft clone.
     *
     * @param role The {@link Role} to clone
     * @throws KapuaException
     */
    public RoleImpl(Role role) throws KapuaException {
        super(role);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RoleImpl other = (RoleImpl) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}
